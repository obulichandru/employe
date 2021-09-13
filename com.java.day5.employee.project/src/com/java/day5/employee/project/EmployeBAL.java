package com.java.day5.employee.project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;





public class EmployeBAL {
	
	static StringBuilder sb = new StringBuilder();
	@SuppressWarnings("deprecation")
	public boolean ValidateEmploye (Employe employe){
		boolean isAdded = true ;
		Date x=employe.getLeaveStartDate();
		Date y=employe.getLeaveEndDate();
		Date thisDate = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyy");
		
		if(x.getDate()>y.getDate()){
			isAdded = false ;
			sb.append("start Date is invalid");
		}	
		return isAdded;
	}
	
	public String addEmployeBal(Employe employe) throws EmployeException{
		if(ValidateEmploye (employe) == true){
			return new EmployeDAO().addEmployeDao(employe);
		}else{
			throw new EmployeException(sb.toString());
		}
				
			}
			
	public List<Employe> showEmployeBsl(){
		return new EmployeDAO().showEmployeDao();
	}
	
	
	
		
		}
	


