package com.java.day5.employee.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class EmployeMain {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void addEmploye () throws EmployeException, ParseException {
		
		Employe employe = new Employe ();
		System.out.println("Enter Employe leaveid");
		employe.setLeaveId(sc.nextInt());
		System.out.println("Enter Employe id");
		employe.setEmpId(sc.nextInt());
		System.out.println("Enter No OF days");
		employe.setNoOfDays(sc.nextInt());
		System.out.println("Reason for Leave");
		employe.setLeaveReason(sc.next());
		
		
		System.out.println("Enter Employe Leave startDate");
	    String startDate =sc.next();
	    SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-YYY");
	    Date date =sdf.parse(startDate);
	    employe.setLeaveStartDate(date);
	    
	    System.out.println("Enter Employe Leave endDate");
	    String endDate =sc.next();
	    SimpleDateFormat sdf1 = new SimpleDateFormat ("dd-MM-YYY");
	    Date date1 =sdf1.parse(endDate);
	    employe.setLeaveStartDate(date1);
	    EmployeBAL bal = new EmployeBAL();
	    System.out.println(bal.addEmployeBal(employe));
	    
	    
	   
	  
	   
	
		
	}
	
	public static void main(String[] args) {
		int ch;
		do {
			System.out.println("O P T I O N S");
			System.out.println("--------------");
			System.out.println("1.Add Leave");
			System.out.println("2. Show Leave");
			System.out.println("3. Search Leave");
			System.out.println("4. Delete Leave");
			System.out.println("5. Update Leave");
			System.out.println("Enter Your Choice   ");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				try {
					addEmploye();
				} catch (EmployeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				return;
			}
		}while  ( ch !=2 ) ;
	

}
}
