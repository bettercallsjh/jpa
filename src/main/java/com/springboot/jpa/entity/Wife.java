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
@Table(name = "t_wife")
public class Wife {
    @Id
    @GeneratedValue
    private Integer wid;
    private String wname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "h_id")
    private Husband husband;

}
