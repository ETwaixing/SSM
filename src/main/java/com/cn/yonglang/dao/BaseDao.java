package com.cn.yonglang.dao;

import java.util.List;

/**
 * 抽象接口dao 基础的方法集合
 * @author waixing
 *
 */
public interface BaseDao<T>{
	
	int add(T model);
	
	int del(T model);
	
	int update(T model);
	
	T getModel(T model);
	
	List<T> getAll(T model);
	
	int getCount();
	
}
