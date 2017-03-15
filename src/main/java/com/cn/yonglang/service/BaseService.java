package com.cn.yonglang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cn.yonglang.dao.BaseDao;

public abstract class BaseService<T> {
	
	@Autowired
	private BaseDao<T> dao;
	
	public int add(T model){
		return dao.add(model);
	}
	
	public int del(T model){
		return dao.del(model);
	}
	
	public int update(T model){
		return dao.update(model);
	}
	
	public T getModel(T model){
		return dao.getModel(model);
	}
	
	public List<T> getAll(T model){
		return dao.getAll(model);
	}
	
	public int getCount(){
		return dao.getCount();
	}
}
