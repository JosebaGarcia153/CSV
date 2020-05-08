package com.ipartek.formacion.csv;

public class CSVApp {
	
	static CSVReader csvreader = new CSVReader();
	static CSVReader2 csvreader2 = new CSVReader2();
	
	public static void main(String[] args) {
		
//		csvreader.removeDuplicates();
//
//		
//		for (int i = 0; i < csvreader.getAll().size(); i++) {
//			
//			System.out.println(csvreader.getAll().get(i));
//		}
		
		for (int i = 0; i < csvreader2.getAll().size(); i++) {
			
			System.out.println(csvreader2.getAll().get(i));
		}
	}
}
