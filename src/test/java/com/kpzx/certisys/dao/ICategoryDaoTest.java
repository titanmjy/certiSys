package com.kpzx.certisys.dao;

import com.kpzx.certisys.dao.entity.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.main.web-application-type=reactive")
public class ICategoryDaoTest {

    @Autowired
    private ICategoryDao iCategoryDao;

    @Test
    public void getTest(){
//        Category one = this.iCategoryDao.getOne(2);
        List<Category> all = iCategoryDao.findAll();
        System.out.println(all.get(1).getId()+" "+all.get(1).getName());
    }
}
