package com.supervise.commons.config.servlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;


@WebServlet(urlPatterns = { "/druid/*" }, initParams = { @WebInitParam(name = "loginUsername", value = "supervise"), @WebInitParam(name = "loginPassword", value = "supervise") })
public class DruidStatViewServlet extends StatViewServlet {

	private static final long serialVersionUID = 1L;

	public void init(){
		System.out.println("init DruidStatViewServlet...");
	}
}

