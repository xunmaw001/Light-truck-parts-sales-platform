package com.entity.view;

import com.entity.JianxiuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 检修信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-22 14:53:31
 */
@TableName("jianxiuxinxi")
public class JianxiuxinxiView  extends JianxiuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianxiuxinxiView(){
	}
 
 	public JianxiuxinxiView(JianxiuxinxiEntity jianxiuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jianxiuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
