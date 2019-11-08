package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.CheckItem;
import org.apache.ibatis.annotations.Insert;

public interface CheckItemDao {

    //@Insert("insert into t_checkitem(code,name,sex,age,price,type,remark,attention) values (#{code},#{name},#{sex},#{age},#{price},#{type},#{remark},#{attention})")
    public Integer add(CheckItem checkItem);

    public Page<CheckItem> selectByCondition(String queryString);

    long findCountByCheckItemId(Integer id);

    void deleteById(Integer id);

    public void edit(CheckItem checkItem);

    public CheckItem findById(Integer id);

    Integer findByCode(String code);

    Integer findByName(String name);
}
