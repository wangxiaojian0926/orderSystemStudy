package com.wxj.feign;

import com.wxj.entity.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Author：wxj
 * Date：2020-01-04 20:57
 * Description：<描述>
 */
@FeignClient(value = "menu")
public interface MenuFeign {

    @RequestMapping("/menu/findAll/{index}/{limit}")
    List<Menu> getAll(@PathVariable("index")int page, @PathVariable("limit") int limit);


}
