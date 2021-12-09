package com.lagou.sharding.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author aaron
 * @since 2021/12/9
 */
@Entity
@Table(name = "t_crypt")
public class Crypt implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String pwd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
