package com.pooja;

class Employee{
	//variables
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	//Constructor-initalization of values->it works when we creating object 
	Employee(int employeeId,String employeeName,float employeeSalary){
//to call the current class of a obj
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	//Method
	void display() {
		System.out.println("Employee Id: "+ employeeId);
		System.out.println("Employee Name: "+ employeeName);
		System.out.println("Employee Salary: "+ employeeSalary);


	}
}

public class Myclass {
	
	public static void main(String [] args) {
		
		Employee emp1=new Employee(101,"Pooja",3000.0F);
		emp1.display();
		
	}

}
