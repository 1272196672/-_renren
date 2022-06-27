package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.generator.entity.FoodEntity;
import io.renren.modules.generator.service.FoodService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-27 17:07:10
 */
@RestController
@RequestMapping("generator/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:food:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = foodService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:food:info")
    public R info(@PathVariable("id") Integer id){
		FoodEntity food = foodService.getById(id);

        return R.ok().put("food", food);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:food:save")
    public R save(@RequestBody FoodEntity food){
		foodService.save(food);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:food:update")
    public R update(@RequestBody FoodEntity food){
		foodService.updateById(food);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:food:delete")
    public R delete(@RequestBody Integer[] ids){
		foodService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
