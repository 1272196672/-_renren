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

import io.renren.modules.generator.entity.PersonEntity;
import io.renren.modules.generator.service.PersonService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 *
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-24 20:06:52
 */
@RestController
@RequestMapping("generator/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:person:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = personService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:person:info")
    public R info(@PathVariable("id") Integer id){
		PersonEntity person = personService.getById(id);

        return R.ok().put("person", person);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:person:save")
    public R save(@RequestBody PersonEntity person){
		personService.save(person);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:person:update")
    public R update(@RequestBody PersonEntity person){
		personService.updateById(person);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:person:delete")
    public R delete(@RequestBody Integer[] ids){
		personService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
