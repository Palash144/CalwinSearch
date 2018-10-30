package com.jarvis.entity;

import java.util.Date;

public class Report {

	String reportid;
	String reportname;
	String category;
	String rundate;
	String reportdate;
	String reportkeyword;
	
	public String getReportid() {
		return reportid;
	}
	public void setReportid(String reportid) {
		this.reportid = reportid;
	}
	public String getReportname() {
		return reportname;
	}
	public void setReportname(String reportname) {
		this.reportname = reportname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getRundate() {
		return rundate;
	}
	public void setRundate(String rundate) {
		this.rundate = rundate;
	}
	public String getReportdate() {
		return reportdate;
	}
	public void setReportdate(String reportdate) {
		this.reportdate = reportdate;
	}
	public String getReportkeyword() {
		return reportkeyword;
	}
	public void setReportkeyword(String reportkeyword) {
		this.reportkeyword = reportkeyword;
	}
	

}
