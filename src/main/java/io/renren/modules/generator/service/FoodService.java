package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.FoodEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-27 17:07:10
 */
public interface FoodService extends IService<FoodEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

