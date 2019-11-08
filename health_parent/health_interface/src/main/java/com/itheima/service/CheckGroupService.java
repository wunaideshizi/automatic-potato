package com.itheima.service;

import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.CheckGroup;

public interface CheckGroupService {

    boolean add(CheckGroup checkGroup, Integer[] checkGroups);

    PageResult pageQuery(QueryPageBean queryPageBean);
}
