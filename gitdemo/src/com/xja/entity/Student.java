package com.xja.entity;
/** 
* @author 作者 :lixiaosheng 
* @date 创建时间：2019年11月29日 下午2:43:26 
* @version 1.0 
*/
public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

 
	
}
