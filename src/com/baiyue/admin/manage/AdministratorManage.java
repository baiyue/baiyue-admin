package com.baiyue.admin.manage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baiyue.admin.dao.AdministratorDao;
import com.baiyue.admin.entity.Administrator;

@Service
public class AdministratorManage {
	@Autowired
	private AdministratorDao administratorDao;
	
	public Administrator getAdministrator(String id){
		/*return administratorDao.queryById(id);*/
		return null;
	}
	public List<Administrator> getAdministrators(){
		return administratorDao.getAdministrators();
	}
	
	public AdministratorDao getAdministratorDao() {
		return administratorDao;
	}
	public void setAdministratorDao(AdministratorDao administratorDao) {
		this.administratorDao = administratorDao;
	}
}
