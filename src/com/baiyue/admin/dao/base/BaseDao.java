package com.baiyue.admin.dao.base;

/*import org.apache.log4j.Logger;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;


public class BaseDao<T> implements BaseDaoOperation<T>{
	/*private static final Logger LOGGER = Logger.getLogger(BaseDao.class);*/
	@Autowired
	protected HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void save(T entity) {
		if(entity == null){
			/*LOGGER.warn("null entity is use in Hibernate-Save");*/
			return;
		}
		try{
			this.hibernateTemplate.save(entity);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
	}

	@Override
	public void delete(T entity) {
		if(entity == null){
			/*LOGGER.warn("null entity is use in Hibernate-Delete");*/
			return;
		}
		this.hibernateTemplate.delete(entity);
	}

	@Override
	public void update(T entity) {
		if(entity == null){
			/*LOGGER.warn("null entity is use in Hibernate-update");*/
			return;
		}
		this.hibernateTemplate.update(entity);
	}
}
