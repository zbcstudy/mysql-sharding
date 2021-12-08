package com.lagou.sharding.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *  CREATE TABLE `user_detail` (
 *  `id`  bigint(11) NOT NULL ,
 *  `u_id`  bigint(11) NULL ,
 *  `detail`  varchar(255) NULL ,
 *  PRIMARY KEY (`id`)
 *  );
 *
 * @author aaron
 * @since 2021/12/8
 */
@Entity
@Table(name = "user_detail")
public class UserDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long uId;

    private String detail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
