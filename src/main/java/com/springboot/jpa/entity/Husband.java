package com.springboot.jpa.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * @Author sjh
 * @creat 2020/6/28 16:37
 */
@Data
@ToString
@Entity
@Table(name = "t_husband")
public class Husband {
    @Id
    @GeneratedValue
    private Integer hid;
    private String hname;
    @OneToOne(mappedBy = "husband")
    private Wife wife;
}
