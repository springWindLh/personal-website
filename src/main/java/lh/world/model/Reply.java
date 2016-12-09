package lh.world.model;

import javax.persistence.*;

/**
 * Created by lh on 2016/12/9.
 */
@Entity
@Table(name = "reply")
public class Reply extends BaseDomain {
    @Column(name = "nick_name")
    private String nickName;
    @Column(name = "content", length = 500)
    private String content;

    @Column(name = "ip")
    private String ip;

    @ManyToOne
    @JoinColumn(name = "message_id")
    private Message message;

    public Reply() {
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
