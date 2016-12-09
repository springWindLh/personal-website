package lh.world.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by lh on 2016/12/9.
 */
@MappedSuperclass
public class BaseDomain implements Serializable, Cloneable {
    @Column(name = "created_time")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdTime = new Date();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
