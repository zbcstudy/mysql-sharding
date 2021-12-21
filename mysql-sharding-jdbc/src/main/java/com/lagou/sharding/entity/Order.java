package com.lagou.sharding.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author aaron
 * @since 2021/12/9
 */
@Entity
@Table(name = "t_order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean isDel;

    private Integer companyId;

    private Long positionId;

    private Long userId;

    private Long publishUserId;

    private Integer status;

    private Date created;

    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPublishUserId() {
        return publishUserId;
    }

    public void setPublishUserId(Long publishUserId) {
        this.publishUserId = publishUserId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", isDel=" + isDel +
                ", companyId=" + companyId +
                ", positionId=" + positionId +
                ", userId=" + userId +
                ", publishUserId=" + publishUserId +
                ", status=" + status +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
