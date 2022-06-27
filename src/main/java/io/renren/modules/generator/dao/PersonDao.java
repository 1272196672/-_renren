package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.PersonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-24 20:06:52
 */
@Mapper
public interface PersonDao extends BaseMapper<PersonEntity> {
	
}
