package edu.sustech.dbproject.service.Impl;

import edu.sustech.dbproject.dao.GoodsDao;
import edu.sustech.dbproject.entity.Good;
import edu.sustech.dbproject.service.SearchResult;
import edu.sustech.dbproject.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class SearchServiceImpl implements SearchService {
    @Autowired
    private GoodsDao goodsDao;
    private static final int BUFFER_SIZE=1024;
    Map<List<String>, SearchResult> resultMap;

    SearchServiceImpl(){
        resultMap=new HashMap<>();
    }

    private void maintain(){
        if(resultMap.size()>BUFFER_SIZE){
            resultMap=new HashMap<>();
        }
    }

    private void search(List<String> keywords){
        Map<Good,Integer> resultMap=new HashMap<>();
    }

    @Override
    public List<Good> search(List<String> keywords, Integer page) {
        return null;
    }
}
