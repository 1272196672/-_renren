package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.PersonEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-24 20:06:52
 */
public interface PersonService extends IService<PersonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

