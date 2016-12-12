package lh.world.ws;

import lh.world.form.ReplyForm;
import lh.world.model.Message;
import lh.world.model.Reply;
import lh.world.repository.MessageRepository;
import lh.world.repository.ReplyRepository;
import lh.world.util.AjaxResponse;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by lh on 2016/12/12.
 */
@Path("/reply")
@Component
public class ReplyResource {
    @Resource
    ReplyRepository replyRepository;
    @Resource
    MessageRepository messageRepository;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/add")
    public AjaxResponse add(ReplyForm form, HttpServletRequest request) {
        Message message = messageRepository.findOne(form.getMessageId());
        if (message == null) {
            return AjaxResponse.fail().msg("资源不存在");
        }
        Reply reply = form.asReply();
        reply.setMessage(message);
        reply.setIp(request.getRemoteHost());
        reply = replyRepository.save(reply);
        return AjaxResponse.ok().msg("回复成功").data(reply);
    }
}
