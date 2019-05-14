package edu.sustech.dbproject;

import edu.sustech.dbproject.dao.GoodsDao;
import edu.sustech.dbproject.entity.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class hello {

    @Autowired
    GoodsDao goodsDao;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public List<Good> Hello(){
        return goodsDao.findByKeyword("testGood");
    }
}
