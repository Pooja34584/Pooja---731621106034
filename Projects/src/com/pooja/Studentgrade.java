package com.pooja;
import java.util.Arrays;
import java.util.Scanner;
class Student {
	int regNum;
	String stuName;
	int marks[] = new int[5];
	int sum;
	float avg;
	String grade;
	Student(int regNum, String stuName) {
		this.regNum=regNum;
		this.stuName=stuName;
		}
	void getmarks() {
		Scanner s = new Scanner(System.in);
		 for (int i = 0; i < marks.length; i++) {
System.out.println("Enter marks " + (i + 1) + ":");
 marks[i] = s.nextInt();	
			}
	}
	void calgrade() {
		for(int i=0;i<5;i++) {
			sum=sum+marks[i];
		}
		avg = sum/5;
		if(avg>=90) {
			System.out.println("O  grade");
		}
		
		if(avg<80){
			System.out.println("B grade");
		}
	}
	void display() {
		System.out.println ("name:"+stuName);
		System.out.println("regnumber:"+regNum);
		System.out.println("average:"+avg);
		System.out.println("sum:"+sum);
	
	}
}
public class Studentgrade {
	public static void main(String[] args) {
		Student obj = new Student(34 ,"Pooja");
	obj.getmarks();
	obj.calgrade();
	obj.display();
	}
}
