package com.wxj.repository;

import com.wxj.entity.Menu;

import java.util.List;

/**
 * Author：wxj
 * Date：2020-01-04 18:19
 * Description：<描述>
 */
public interface MenuRepository {
     List<Menu> findAll(int index,int size);
     int count();
     Menu findById(long id);
     void save(Menu menu);
     void update(Menu menu);
     void deleteById(long id);
}
