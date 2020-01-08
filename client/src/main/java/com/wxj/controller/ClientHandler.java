package com.wxj.controller;

import com.wxj.entity.Menu;
import com.wxj.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author：wxj
 * Date：2020-01-04 20:53
 * Description：<描述>
 */
@RestController
@RequestMapping("/client")
public class ClientHandler {

    @Resource
    private MenuFeign menuFeign;

    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu>   getAll(@PathVariable("index")int page, @PathVariable("limit") int limit){
        List<Menu> menus = menuFeign.getAll(page, limit);
        return menus;
    }


}
