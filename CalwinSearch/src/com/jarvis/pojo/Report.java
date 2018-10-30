package com.jarvis.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Report {

	String reportid;
	String reportname;
	String category;
	Date rundate;
	Date reportdate;
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
	public Date getRundate() {
		return rundate;
	}
	public void setRundate(Date rundate) {
		this.rundate = rundate;
	}
	public Date getReportdate() {
		return reportdate;
	}
	public void setReportdate(Date reportdate) {
		this.reportdate = reportdate;
	}
	public String getReportkeyword() {
		return reportkeyword;
	}
	public void setReportkeyword(String reportkeyword) {
		this.reportkeyword = reportkeyword;
	}
	
	
}
