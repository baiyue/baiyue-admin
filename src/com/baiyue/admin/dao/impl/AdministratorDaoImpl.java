package com.baiyue.admin.dao.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.baiyue.admin.dao.AdministratorDao;
import com.baiyue.admin.dao.base.BaseDao;

@Repository
public class AdministratorDaoImpl<Administrator> extends BaseDao implements AdministratorDao{
	
	@Override
	public List<com.baiyue.admin.entity.Administrator> getAdministrators(){
		return getHibernateTemplate().find("from Administrator");
	}
}
