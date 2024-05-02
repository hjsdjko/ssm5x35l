package com.entity.view;

import com.entity.JiyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 寄养
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 20:04:19
 */
@TableName("jiyang")
public class JiyangView  extends JiyangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiyangView(){
	}
 
 	public JiyangView(JiyangEntity jiyangEntity){
 	try {
			BeanUtils.copyProperties(this, jiyangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
