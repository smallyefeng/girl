package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.respository.GirlRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by yefeng on 17/3/29.
 * Time: 下午9:53
 */
@Service
public class GirlService {

    @Autowired
    private GirlRespository girlRespository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRespository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("C");
        girlB.setAge(21);
        girlRespository.save(girlB);

    }
}
