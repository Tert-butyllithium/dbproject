package edu.sustech.dbproject.service;

import edu.sustech.dbproject.entity.Good;

import java.util.HashMap;
import java.util.List;

public class SearchResult {
    public List<Good> goodsList;
    public HashMap<Good,Integer> priority;

    public List<Good> getResultGood(Integer page){
        if(page==null) page=1;
        int offset=(page-1)*10;
        try {
            return goodsList.subList(offset + 1, offset + 11);
        }catch (Exception e){
            return null;
        }
    }
}
