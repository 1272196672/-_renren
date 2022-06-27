package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.PersonDao;
import io.renren.modules.generator.entity.PersonEntity;
import io.renren.modules.generator.service.PersonService;


@Service("personService")
public class PersonServiceImpl extends ServiceImpl<PersonDao, PersonEntity> implements PersonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PersonEntity> page = this.page(
                new Query<PersonEntity>().getPage(params),
                new QueryWrapper<PersonEntity>()
        );

        return new PageUtils(page);
    }

}