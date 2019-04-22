package com.ryh.bean;

import java.util.HashMap;
import java.util.Map;

public class Result {
	 
	private Integer code;//״̬��
	private String messege;//��Ϣ
	private Map<String, Object> data = new HashMap<>();//���ݶ���
	
	/**
	 * �޲ι�����
	 */
	public Result(){
		super();
	}
	
	/**
	 * ֻ����״̬�룬��Ϣ
	 * @param code
	 * @param messege
	 */
	public Result(Integer code, String messege){
		super();
		this.code=code;
		this.messege=messege;
	}
	
	/**
	 * ֻ����״̬�룬���ݶ���
	 * @param code
	 * @param object
	 */
	public Result(Integer code, Map<String, Object> data){
		super();
		this.code=code;
		this.data=data;
	}
	
	/**
	 * ����ȫ����Ϣ��״̬�룬��Ϣ�����ݶ���
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
