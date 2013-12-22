package com.baiyue.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baiyue.admin.entity.Administrator;
import com.baiyue.admin.manage.AdministratorManage;

@Controller
public class TestController {
	@Autowired
	private AdministratorManage administratorManage;
	@RequestMapping("test.do")
	public ModelAndView doTest(HttpServletRequest request,
							   HttpServletResponse response){
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "ttttttttttO>OTTTTTTTTTTT");
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping("getAdmin.do")
	public ModelAndView getAdmin(HttpServletRequest request,
			HttpServletResponse response){
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", administratorManage.getAdministrators().toString());
		mv.setViewName("login");
		return mv;
	}
	public AdministratorManage getAdministratorManage() {
		return administratorManage;
	}
	public void setAdministratorManage(AdministratorManage administratorManage) {
		this.administratorManage = administratorManage;
	}
}
