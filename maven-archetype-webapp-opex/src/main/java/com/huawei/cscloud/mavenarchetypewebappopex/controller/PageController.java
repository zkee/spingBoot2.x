package com.huawei.cscloud.mavenarchetypewebappopex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

	/**
	 * page demo
	 * @return
	 */
	@RequestMapping("index")
	public String index()
	{
		return "html/index";
	}
}
