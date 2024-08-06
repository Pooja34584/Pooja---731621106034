//predefined data in client like delete,create,read,update.//post-where to data store.subscribe();//<> it indicates which obj going to store and url access of the data& sub-commit of all changes or transaction. //follow of data from html->component->service.same as well follow back to show result.//<> it indicates which obj going to store and url access of the data& sub-commit of all changes or transaction.
import { Injectable } from '@angular/core';
import { Staff } from './model/Staff';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StaffService {
  url :string;
  stafArr : Staff[];
  staf : Staff;
  constructor(private http: HttpClient) { 
    this.url = "http://localhost:53546/staff";
    this.staf = new Staff();
    this.stafArr = [];
  }

  insertStaff(staf : Staff){
    alert(staf.id);
    this.http.post<Staff>(this.url,staf).subscribe();
    return "Staff Details Inserted"
  }
  deleteStaff(id:number){
    this.http.delete<Staff>(this.url+"/"+id).subscribe();
    return "Staff Details Deleted"
  }
  updateStaff(staf:Staff){
    this.http.put<Staff>(this.url+"/"+staf.id,staf).subscribe();
    return "Employee Details Updated";
  }
  findStaff(id:number){
    this.http.get<Staff>(this.url+"/"+id).subscribe(data=> this.staf=data); 
    return this.staf;
  }

  findStaffAll(){
    this.http.get<Staff[]>(this.url).subscribe(data=> this.stafArr=data); 
    return this.stafArr;
  }

}