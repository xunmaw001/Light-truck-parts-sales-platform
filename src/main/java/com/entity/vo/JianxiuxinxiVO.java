package com.entity.vo;

import com.entity.JianxiuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 检修信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-22 14:53:31
 */
public class JianxiuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 汽车名称
	 */
	
	private String qichemingcheng;
		
	/**
	 * 检查情况
	 */
	
	private String jianchaqingkuang;
		
	/**
	 * 检修时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianxiushijian;
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：汽车名称
	 */
	 
	public void setQichemingcheng(String qichemingcheng) {
		this.qichemingcheng = qichemingcheng;
	}
	
	/**
	 * 获取：汽车名称
	 */
	public String getQichemingcheng() {
		return qichemingcheng;
	}
				
	
	/**
	 * 设置：检查情况
	 */
	 
	public void setJianchaqingkuang(String jianchaqingkuang) {
		this.jianchaqingkuang = jianchaqingkuang;
	}
	
	/**
	 * 获取：检查情况
	 */
	public String getJianchaqingkuang() {
		return jianchaqingkuang;
	}
				
	
	/**
	 * 设置：检修时间
	 */
	 
	public void setJianxiushijian(Date jianxiushijian) {
		this.jianxiushijian = jianxiushijian;
	}
	
	/**
	 * 获取：检修时间
	 */
	public Date getJianxiushijian() {
		return jianxiushijian;
	}
			
}
