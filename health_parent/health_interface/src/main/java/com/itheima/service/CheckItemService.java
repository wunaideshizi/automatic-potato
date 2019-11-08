package com.itheima.service;

import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.CheckItem;

public interface CheckItemService {

    public boolean add(CheckItem checkItem);

    PageResult pageQuery(QueryPageBean queryPageBean);

    void delete(Integer id);

    void edit(CheckItem checkItem);

    CheckItem findById(Integer id);
}
