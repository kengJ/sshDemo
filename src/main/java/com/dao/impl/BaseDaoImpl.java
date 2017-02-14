package com.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.common.DataHelp;
import com.dao.BaseDao;


@Repository("baseDao")
@SuppressWarnings("all")
public class BaseDaoImpl<T> implements BaseDao<T>{
	@Resource
	protected SessionFactory sessionFactory;
//	@Resource
//	protected HibernateTemplate hibernateTemplate;
	
	protected Class<T> Clazz;
	
	@SuppressWarnings("unchecked")  
    public BaseDaoImpl() {  
        Type type = getClass().getGenericSuperclass();  
        if (type instanceof ParameterizedType) {  
            this.Clazz = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[0];  
        } else {  
            this.Clazz = null;  
        }  
    } 
	
	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void Save(T t) {
		getCurrentSession().save(t);
	}

	public void Delete(T t) {
		getCurrentSession().delete(t);
	}

	public void Update(T t) {
		getCurrentSession().update(t);
	}

	@Override
	public T get(long id) {
		return (T)getCurrentSession().get(Clazz, id);
	}

	@Override
	public List<T> findALL() {
		String hql = "from "+Clazz.getSimpleName();
		return find(hql);
	}

	@Override
	public List<T> find(String hql) {
		return (List<T>) getCurrentSession().createQuery(hql).list();
	}

	@Override
	public List<T> find(String hql, Object[] params) {
		return find(DataHelp.ArrayToHql(params, hql));
	}

	@Override
	public List<T> find(String hql, List<Object> params) {
		return find(DataHelp.ListToHql(params, hql));
	}

	@Override
	public List<T> find(String hql, Object[] params, Integer page, Integer rows) {
		return find(DataHelp.ArrayToHql(params, hql), page, rows);
	}

	@Override
	public List<T> get(String hql, Object[] params) {
		return find(DataHelp.ArrayToHql(params, hql));
	}

	@Override
	public List<T> get(String hql, List<Object> params) {
		return find(DataHelp.ListToHql(params, hql));
	}

	@Override
	public int count(String hql) {
		return find(hql).size();
	}

	@Override
	public int count(String hql, Object[] params) {
		return count(DataHelp.ArrayToHql(params, hql));
	}

	@Override
	public int count(String hql, List<Object> params) {
		return count(DataHelp.ListToHql(params, hql));
	}

	public List<T> find(String hql, List<Object> params,int page,int rows) {
		return find(DataHelp.ListToHql(params, hql),page, rows);
	}

	@Override
	public List<T> find(String hql, Integer page, Integer rows) {
		Query query = getCurrentSession().createQuery(hql);
		query.setFirstResult(page);
		query.setMaxResults(rows);
		return query.list();
	}

}
