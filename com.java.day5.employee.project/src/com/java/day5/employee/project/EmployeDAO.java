package com.java.day5.employee.project;

import java.util.ArrayList;
import java.util.List;

public class EmployeDAO {
	
	static List<Employe> lstEmploye;
	
	static {
		
		lstEmploye = new ArrayList<Employe>();
		
	}
	
	public String addEmployeDao (Employe employe){
		lstEmploye.add(employe);
		return "Leave added sucessfully";
	}
	
	public static List<Employe>showEmployeDao(){
		return lstEmploye;
	}

}
