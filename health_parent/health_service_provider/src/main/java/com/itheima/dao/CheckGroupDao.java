package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckGroup;

import java.util.Map;

public interface CheckGroupDao {

    Integer add(CheckGroup checkGroup);

    void setCheckGroupAndCheckItem(Map<String, Integer> map);

    Integer findByCode(String code);

    Integer findByName(String name);

    Page<CheckGroup> selectByCondition(String queryString);
}
