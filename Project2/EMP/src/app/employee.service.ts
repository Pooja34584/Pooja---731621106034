import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor() { }

  insertEmployee(employee:Employee){
     this.http.post("http://localhost:3004/",employee).subscribe();

  }
}
