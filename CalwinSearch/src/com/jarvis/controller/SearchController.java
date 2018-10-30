package com.jarvis.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codoid.products.exception.FilloException;
import com.jarvis.pojo.Report;
import com.jarvis.service.SearchService;

@Controller
public class SearchController {

	SearchService service=new SearchService();
	
	@RequestMapping("/getdata")
	public String getData(Report report, HttpSession session,HttpServletResponse res) {
		System.out.println("REPORT ID"+report.getReportid()+"report name "+report.getReportname());
		session.removeAttribute("report");
		if(!report.getReportid().isEmpty()) {
			try {
				List<com.jarvis.entity.Report> list=service.searchByID(report.getReportid());
				for(com.jarvis.entity.Report rep: list) {
					System.out.println(rep.getReportid());
				}
				session.removeAttribute("report");
				session.setAttribute("report", list);
			} catch (FilloException e) {
				e.printStackTrace();
				session.setAttribute("error", e);
			}
			return "next";
		}else if(!report.getReportname().isEmpty())
		{
			try {
				List<com.jarvis.entity.Report> list=service.searchByName(report.getReportname());
				for(com.jarvis.entity.Report rep: list) {
					System.out.println(rep.getReportid());
				}
				session.removeAttribute("report");
				session.setAttribute("report", list);
			} catch (FilloException e) {
				e.printStackTrace();
				session.setAttribute("error", e);
			}
			return "next";
		}
		else {
			session.setAttribute("report", null);
			return "next";
		}
		
	}
	
}
