package com.jarvis.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.jarvis.entity.Report;

public class SearchService{

	
	
	public List<Report> searchByID(String reportid) throws FilloException {
		Fillo fillo=new Fillo();
		Connection connection=fillo.getConnection("C:\\Users\\plambhate\\eclipse-workspace\\CalwinSearch\\src\\example.xls");
		String strQuery="Select * from Sheet1";
		Recordset recordset=connection.executeQuery(strQuery).where("ReportID="+reportid);
		List<Report> list=new ArrayList();
		
		while(recordset.next()){
		System.out.println(recordset.getField("RunDate")+recordset.getField("ReportKeyword"));
		Report report=new Report();
		report.setReportid(recordset.getField("ReportID"));
		report.setReportname(recordset.getField("ReportName"));
		report.setCategory(recordset.getField("ReportCategory"));
		report.setReportdate(recordset.getField("ReportDate"));
		report.setRundate(recordset.getField("RunDate"));
		report.setReportkeyword(recordset.getField("ReportKeyword"));
		list.add(report);
		}
		 
		
		connection.close();
		return list;	
	}
	
	public List<Report> searchByName(String reportname) throws FilloException {
		Fillo fillo=new Fillo();
		Connection connection=fillo.getConnection("C:\\Users\\plambhate\\eclipse-workspace\\CalwinSearch\\src\\example.xls");
		String strQuery="Select * from Sheet1";
		Recordset recordset=connection.executeQuery(strQuery);
		List<Report> list=new ArrayList();
		
		while(recordset.next()){
		System.out.println(recordset.getField("RunDate")+recordset.getField("ReportKeyword"));
		Report report=new Report();
		report.setReportid(recordset.getField("ReportID"));
		report.setReportname(recordset.getField("ReportName"));
		report.setCategory(recordset.getField("ReportCategory"));
		report.setReportdate(recordset.getField("ReportDate"));
		report.setRundate(recordset.getField("RunDate"));
		report.setReportkeyword(recordset.getField("ReportKeyword"));
		list.add(report);
		}
		 
		
		connection.close();
		return list;	
	}
}
