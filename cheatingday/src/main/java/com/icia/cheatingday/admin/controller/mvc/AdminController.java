package com.icia.cheatingday.admin.controller.mvc;

import java.util.*;

import javax.validation.constraints.*;

import org.apache.commons.lang3.math.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.icia.cheatingday.admin.service.mvc.*;

@Controller
public class AdminController {
	private AdminService service;
	
/*	@GetMapping("/admin")
	public ModelAndView main() {
		return new ModelAndView("main").addObject("viewName", "admin/adminpage.jsp");
	}
	
	
	@GetMapping("/admin/report_list")
	public ModelAndView list(@RequestParam(defaultValue = "1") int pageno) {
		return new ModelAndView("main").addObject("viewName", "admin/report_list.jsp").addObject("page", service.list(pageno));
	}
	
	@GetMapping("/admin/user_list")
	public ModelAndView ulist(@RequestParam(defaultValue = "user_list") String job) {
		if(job.equals("block_list"))
			return new ModelAndView("main").addObject("list", service.blockList()).addObject("viewName", "admin/userlist.jsp").addObject("title","블록유저 목록");
		else
			return new ModelAndView("main").addObject("list", service.ulist()).addObject("viewName", "admin/userlist.jsp").addObject("title","유저 목록");
	}
	
	*/
}
