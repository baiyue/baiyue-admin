package com.baiyue.admin.dao.base;

public interface BaseDaoOperation<T> {
	public void save(T entity);
	public void delete(T entity);
	public void update(T entity);
}
