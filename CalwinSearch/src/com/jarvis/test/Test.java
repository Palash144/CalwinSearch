package com.jarvis.test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import com.jarvis.service.SearchService;

public class Test {

	public static void main(String[] args) throws FilloException {
		SearchService search=new SearchService();
		/*Recordset recordset=search.searchByID("5");
		while(recordset.next()){
			System.out.println(recordset.getField("RunDate")+"sadnkjsa");
			}*/
	}

}
