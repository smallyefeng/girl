package com.imooc.respository;

import com.imooc.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface GirlRespository extends JpaRepository<Girl,Integer>{

    //通过年龄来查询
    public List<Girl> findByAge(Integer id);
}
