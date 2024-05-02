package com.entity.model;

import com.entity.JiyangjieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 寄养结果
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-15 20:04:19
 */
public class JiyangjieguoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 宠物名称
	 */
	
	private String chongwumingcheng;
		
	/**
	 * 领养日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date lingyangriqi;
		
	/**
	 * 寄养结果
	 */
	
	private String jiyangjieguo;
		
	/**
	 * 领养人姓名
	 */
	
	private String lingyangrenxingming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
				
	
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
	 * 设置：宠物名称
	 */
	 
	public void setChongwumingcheng(String chongwumingcheng) {
		this.chongwumingcheng = chongwumingcheng;
	}
	
	/**
	 * 获取：宠物名称
	 */
	public String getChongwumingcheng() {
		return chongwumingcheng;
	}
				
	
	/**
	 * 设置：领养日期
	 */
	 
	public void setLingyangriqi(Date lingyangriqi) {
		this.lingyangriqi = lingyangriqi;
	}
	
	/**
	 * 获取：领养日期
	 */
	public Date getLingyangriqi() {
		return lingyangriqi;
	}
				
	
	/**
	 * 设置：寄养结果
	 */
	 
	public void setJiyangjieguo(String jiyangjieguo) {
		this.jiyangjieguo = jiyangjieguo;
	}
	
	/**
	 * 获取：寄养结果
	 */
	public String getJiyangjieguo() {
		return jiyangjieguo;
	}
				
	
	/**
	 * 设置：领养人姓名
	 */
	 
	public void setLingyangrenxingming(String lingyangrenxingming) {
		this.lingyangrenxingming = lingyangrenxingming;
	}
	
	/**
	 * 获取：领养人姓名
	 */
	public String getLingyangrenxingming() {
		return lingyangrenxingming;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
			
}
