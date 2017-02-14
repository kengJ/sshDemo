package com.dao;

import java.util.List;

public interface BaseDao<T> {
	/**
	 * 保存一个对象
	 * @param oaUser
	 * @return
	 */
	public void Save(T t);
	
	/**
	 * 删除一个对象
	 * @param o
	 */
	public void Delete(T t);
	
	/**
	 * 更新一个对象
	 * @param o
	 */
	public void Update(T t);
	
	/**
	 * 保存或更新一个对象
	 * @param o
	 */
	//public void SaveOrUpdate(T o);
	
	/**
	 * 查询
	 * @param hql
	 * @return
	 */
	public List<T> find(String hql);
	
	/**
	 * 查询集合
	 * @param hql
	 * @param params
	 * @return
	 */
	public List<T> find(String hql , Object[] params);
	
	/**
	 * 查询集合
	 * @param hql
	 * @param params
	 * @return
	 */
	public List<T> find(String hql , List<Object> params);
	
	/**
	 * 分页查询集合
	 * @param hql
	 * @param params
	 * @param page
	 * @param rows
	 * @return
	 */
	List<T> find(String hql , List<Object> params ,int page , int rows);
	
	/**
	 * 分页查询集合
	 * @param hql
	 * @param params
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<T> find(String hql , Object[] params , Integer page , Integer rows);
	
	/**
	 * 获取对象
	 * @param c
	 * @param id
	 * @return
	 */
	public T get(long id );
	
	/**
	 * 获取对象
	 * @param hql
	 * @param params
	 * @return
	 */
	public List<T> get(String hql , Object[] params);
	
	/**
	 * 获取对象
	 * @param hql
	 * @param params
	 * @return
	 */
	public List<T> get(String hql , List<Object> params);
	
	/**
	 * 查询数据总行数
	 * @param hql
	 * @return
	 */
	public int count(String hql);
	
	/**
	 * 查询数据总行数
	 * @param hql
	 * @param params
	 * @return
	 */
	public int count(String hql , Object[] params);
	
	/**
	 * 查询数据总行数
	 * @param hql
	 * @param params
	 * @return
	 */
	public int count(String hql , List<Object> params);
	
	public List<T> findALL();
	
	public List<T> find(String hql  , Integer page , Integer rows);
}
