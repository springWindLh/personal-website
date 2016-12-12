package lh.world.ws;

import lh.world.form.MessageForm;
import lh.world.model.Message;
import lh.world.repository.MessageRepository;
import lh.world.util.AjaxResponse;
import lh.world.util.Query;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by lh on 2016/12/9.
 */
@Path("/message")
@Component
public class MessageResource {

    @Resource
    MessageRepository messageRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/list")
    public AjaxResponse list(Query query) {
        Page<Message> messages = messageRepository.findAll(query.getPageable());
        return AjaxResponse.ok().data(messages);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/add")
    public AjaxResponse add(MessageForm form, HttpServletRequest request) {
        Message message = form.asMessage();
        message.setIp(request.getRemoteHost());
        message = messageRepository.save(message);
        return AjaxResponse.ok().msg("留言成功").data(message);
    }

}
