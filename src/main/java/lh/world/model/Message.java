package lh.world.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lh on 2016/12/9.
 */
@Entity
@Table(name = "message")
public class Message extends BaseDomain {
    @Column(name = "nick_name")
    private String nickName;
    @Column(name = "content", length = 500)
    private String content;

    @Column(name = "ip")
    private String ip;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "message")
    private List<Reply> replies = new ArrayList<>(0);

    public Message() {
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
}