package lh.world.form;

import lh.world.model.Reply;

import java.util.Date;

/**
 * Created by lh on 2016/12/12.
 */
public class ReplyForm {
    private String nickName;
    private String content;
    private Long messageId;

    public Reply asReply() {
        Reply reply = new Reply();
        reply.setNickName(this.getNickName());
        reply.setContent(this.getContent());
        reply.setCreatedTime(new Date());
        return reply;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }
}
