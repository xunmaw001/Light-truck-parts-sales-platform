package com.entity.model;

import com.entity.PeijianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 配件信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-22 14:53:31
 */
public class PeijianxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 配件编号
	 */
	
	private String peijianbianhao;
		
	/**
	 * 配件名称
	 */
	
	private String peijianmingcheng;
		
	/**
	 * 配件类型
	 */
	
	private String peijianleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 站点地址
	 */
	
	private String zhandiandizhi;
		
	/**
	 * 配件简介
	 */
	
	private String peijianjianjie;
				
	
	/**
	 * 设置：配件编号
	 */
	 
	public void setPeijianbianhao(String peijianbianhao) {
		this.peijianbianhao = peijianbianhao;
	}
	
	/**
	 * 获取：配件编号
	 */
	public String getPeijianbianhao() {
		return peijianbianhao;
	}
				
	
	/**
	 * 设置：配件名称
	 */
	 
	public void setPeijianmingcheng(String peijianmingcheng) {
		this.peijianmingcheng = peijianmingcheng;
	}
	
	/**
	 * 获取：配件名称
	 */
	public String getPeijianmingcheng() {
		return peijianmingcheng;
	}
				
	
	/**
	 * 设置：配件类型
	 */
	 
	public void setPeijianleixing(String peijianleixing) {
		this.peijianleixing = peijianleixing;
	}
	
	/**
	 * 获取：配件类型
	 */
	public String getPeijianleixing() {
		return peijianleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：站点地址
	 */
	 
	public void setZhandiandizhi(String zhandiandizhi) {
		this.zhandiandizhi = zhandiandizhi;
	}
	
	/**
	 * 获取：站点地址
	 */
	public String getZhandiandizhi() {
		return zhandiandizhi;
	}
				
	
	/**
	 * 设置：配件简介
	 */
	 
	public void setPeijianjianjie(String peijianjianjie) {
		this.peijianjianjie = peijianjianjie;
	}
	
	/**
	 * 获取：配件简介
	 */
	public String getPeijianjianjie() {
		return peijianjianjie;
	}
			
}
