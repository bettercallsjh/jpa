package com.springboot.jpa.service;

import com.springboot.jpa.dao.HusbandWifeRespository;
import com.springboot.jpa.entity.Wife;

import javax.annotation.Resource;

/**
 * @Author sjh
 * @creat 2020/6/28 16:50
 */
public class WifeService {
    @Resource
    HusbandWifeRespository husbandWifeRespository;
    public void find(){
        Wife wife=husbandWifeRespository.findByHusband_Hid(1);
        System.out.println(wife.toString());
    }
}
