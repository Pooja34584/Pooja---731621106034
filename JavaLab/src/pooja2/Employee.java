package com.Pooja;

//class and object
class MyClass {
	//Variables
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	//constructor

	MyClass(int employeeId,String employeeName,float employeeSalary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	
	private void MyClass() {
		// TODO Auto-generated method stub
		
	}

	//Method 
	void display() {
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Employee Salary :"+employeeSalary);
	}
}
public class Employee  {
	public static void main(String args[])
	{
		MyClass emp1=new MyClass(003,"Pooja",5000.0f);
		emp1.display();
		MyClass emp2=new MyClass(004,"Mani",6000.0f);
		emp2.display();
		
	}

}
