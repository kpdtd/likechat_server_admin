package com.likechat.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * <p>
 * 标签管理模块
 * </p>
 * 作者 lianzhifei
 * 日期 2016 2016年9月20日
 */
@Controller
@RequestMapping("/index")
public class IndexController extends BaseAction {
	
	@RequestMapping("index")
	public String index() throws Exception{
		request.setAttribute("menu", "index");
		return "index";
	}
}
