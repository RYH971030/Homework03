package com.ryh.bean;

import java.util.HashMap;
import java.util.Map;

public class Result {
	 
	private Integer code;//状态码
	private String messege;//消息
	private Map<String, Object> data = new HashMap<>();//数据对象
	
	/**
	 * 无参构造器
	 */
	public Result(){
		super();
	}
	
	/**
	 * 只返回状态码，消息
	 * @param code
	 * @param messege
	 */
	public Result(Integer code, String messege){
		super();
		this.code=code;
		this.messege=messege;
	}
	
	/**
	 * 只返回状态码，数据对象
	 * @param code
	 * @param object
	 */
	public Result(Integer code, Map<String, Object> data){
		super();
		this.code=code;
		this.data=data;
	}
	
	/**
	 * 返回全部信息即状态码，消息，数据对象
	 * @param code
	 * @param messege
	 * @param result
	 */
	public Result(Integer code, String messege, Map<String, Object> data){
		super();
		this.code=code;
		this.messege=messege;
		this.data=data;
	}
 
	public Integer getCode() {
		return code;
	}
 
	public void setCode(Integer code) {
		this.code = code;
	}
 
	public String getMassege() {
		return messege;
	}
 
	public void setMassege(String messege) {
		this.messege = messege;
	}
 
	public Map<String, Object> getData() {
		return data;
	}
 
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	
}
