package com.imooc.controller;

import com.imooc.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class HelloController {

    private final GirlProperties girlProperties;

    @Autowired
    public HelloController(GirlProperties girlProperties) {
        this.girlProperties = girlProperties;
    }

//    @RequestMapping(value = "/say",method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return "id: "+id;
    }
}
