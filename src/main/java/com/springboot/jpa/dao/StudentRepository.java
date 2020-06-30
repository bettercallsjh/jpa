package com.springboot.jpa.dao;

import com.springboot.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author sjh
 * @creat 2020/6/28 12:02
 */
public interface StudentRepository extends JpaRepository<Student,String> {

}
