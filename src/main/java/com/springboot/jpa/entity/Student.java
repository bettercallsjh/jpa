package com.springboot.jpa.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;


/**
 * @Author sjh
 * @creat 2020/6/28 11:36
 */
@Entity
@Data
@ToString
@Table(name="t_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stuid;

    @Column(name = "stu_name",length = 60)
    private String sname;

    @Column
    @Temporal(TemporalType.DATE)
    private Date birthday;
    private int age;
    private  double score;
    private String sex;



}
