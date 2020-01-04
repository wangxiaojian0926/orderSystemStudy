package com.wxj.Controller;

import com.wxj.entity.Menu;
import com.wxj.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author：wxj
 * Date：2020-01-04 17:59
 * Description：<描述>
 */
@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Value("${server.port}")
    private String port;

    @Resource
    private MenuRepository menuRepository;

    @GetMapping("/index")
    public String getPort(){
        return port;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int
                                      index, @PathVariable("limit") int limit){
        return menuRepository.findAll(index, limit);
    }


}
