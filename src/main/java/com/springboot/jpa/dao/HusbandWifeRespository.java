package com.springboot.jpa.dao;


import com.springboot.jpa.entity.Wife;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author sjh
 * @creat 2020/6/28 16:47
 */
public interface HusbandWifeRespository extends JpaRepository<Wife,Integer> {
    Wife findByHusband_Hid(Integer hid);
}
