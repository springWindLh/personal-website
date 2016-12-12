package lh.world.form;

import lh.world.model.Message;

import java.util.Date;

/**
 * Created by lh on 2016/12/12.
 */
public class MessageForm {
    private String nickName;
    private String content;

    public Message asMessage() {
        Message message = new Message();
        message.setNickName(this.getNickName());
        message.setContent(this.getContent());
        message.setCreatedTime(new Date());
        return message;
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
}
