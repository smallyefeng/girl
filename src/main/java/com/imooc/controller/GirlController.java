package com.imooc.controller;


import com.imooc.domain.Girl;
import com.imooc.respository.GirlRespository;
import com.imooc.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlService girlService;

    @Autowired
    private GirlRespository girlRespository;

    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        System.out.println("girlList");
        return girlRespository.findAll();
    }

    //添加一个女生
    @PostMapping(value = "/girls")
    public Girl girlAdd(@Valid Girl girl, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());
        return girlRespository.save(girl);

    }

    //查询一个女生
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRespository.findOne(id);
    }

    //更新
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(3);
        girl.setCupSize(cupSize);
        girl.setAge(age);
         return girlRespository.save(girl);
    }

    @DeleteMapping(value = "/girls/{id}")
    public void firlDelete(@PathVariable("id") Integer id){
        girlRespository.delete(id);
    }

    //通过年龄查询女生列表
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRespository.findByAge(age);
    }

    @PostMapping(value = "/girls/age")
    public void insertTwo(){
        girlService.insertTwo();
    }
}
