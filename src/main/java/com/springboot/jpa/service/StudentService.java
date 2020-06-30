package com.springboot.jpa.service;

import com.springboot.jpa.dao.StudentRepository;
import com.springboot.jpa.entity.Student;

import javax.annotation.Resource;

/**
 * @Author sjh
 * @creat 2020/6/28 12:08
 */
public class StudentService {
    @Resource
    private StudentRepository studentRepository;

}
