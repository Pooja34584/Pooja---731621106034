//predefined data in client like delete,create,read,update.//post-where to data store.subscribe();//<> it indicates which obj going to store and url access of the data& sub-commit of all changes or transaction. //follow of data from html->component->service.same as well follow back to show result.//<> it indicates which obj going to store and url access of the data& sub-commit of all changes or transaction.
import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  url :string;
  employeeArr : Employee[];
  employee : Employee;
  constructor(private http: HttpClient) { 
    this.url = "http://localhost:3005/employee";
    this.employee = new Employee();
    this.employeeArr = [];
  }

  insertEmployee(employee : Employee){
    alert(employee.id);
    this.http.post<Employee>(this.url,employee).subscribe();
    return "Employee Details Added"
  }
  deleteEmployee(id:number){
    this.http.delete<Employee>(this.url+"/"+id).subscribe();
    return "Employee Details Deleted"
  }
  updateEmployee(employee:Employee){
    this.http.put<Employee>(this.url+"/"+employee.id,employee).subscribe();
    return "Employee Details Updated";
  }
  findEmployee(id:number){
    this.http.get<Employee>(this.url+"/"+id).subscribe(data=> this.employee=data); 
    return this.employee;
  }

  findEmployeeAll(){
    this.http.get<Employee[]>(this.url).subscribe(data=> this.employeeArr=data); 
    return this.employeeArr;
  }

}