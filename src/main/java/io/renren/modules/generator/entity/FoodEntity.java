package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-27 17:07:10
 */
@Data
@TableName("food")
public class FoodEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id号
	 */
	@TableId
	private Integer id;
	/**
	 * 食物名
	 */
	private String name;

}
