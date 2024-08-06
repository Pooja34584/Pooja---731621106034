//inject method is call by service
//taking values from txt box and add to model obj
//in the service we store the value in result to acces.
 // alert(data.empId+" "+data.empName+" "+data.empSalary);

 import { Component } from '@angular/core';
import { Staff } from './model/Staff';
import { StaffService } from './Staff.service';
 
 @Component({
   selector: 'app-root',
   templateUrl: './app.component.html',
   styleUrl: './app.component.css'
 })
 export class AppComponent {  
   
   staf : Staff ;
   result : string;
   stafArr : Staff[];
   flag:boolean;
 
    constructor(private service : StaffService){
     this.staf = new Staff();
     this.result = "";
     this.stafArr =[];
     this.flag=false;
    }
 
  insertStaff(data : any) {
   this.staf.id = data.id;
   this.staf.stafName = data.stafName;
   this.staf.stafSalary = data.stafSalary;
 
   this.result=this.service.insertStaff(this.staf);
  }
  updateStaff(data:any){
   this.staf.id = data.id;
   this.staf.stafName = data.stafName;
   this.staf.stafSalary = data.stafSalary;
 
   this.result=this.service.updateStaff(this.staf);
  }
  deleteStaff(data:any){
   this.result=this.service.deleteStaff(data.id);
  }
  findStaff(data:any){
   this.staf=this.service.findStaff(data.id);
   this.result=this.staf.id+" "+this.staf.stafName+" "+this.staf.stafSalary;
  }
  findAllStaff(){
   this.stafArr=this.service.findStaffAll();
   this.flag=true;
 
  }
  
 }