package edu.sustech.dbproject.service;

import edu.sustech.dbproject.entity.Good;

import java.util.List;

public interface SearchService {

    /**
     * return all goods name contains these keyword
     * if there is an keywords equals the keywords
     * then it will have a higher priority
     * @param page
     * @param keywords
     * @return
     */
    List<Good> search(List<String> keywords, Integer page);

}
