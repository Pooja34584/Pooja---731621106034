import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
  name:string;
  email:string;
  age:number;
  imagePath:string;
 flag:boolean;
 vehicles:string[];
 selectedvehicle:string;
 myStyle:{};
 myClass:string;

  constructor(){
    this.name="pooja";
    this.email="poojashanmugam05@gmail.com";
    this.age=19;
    this.imagePath="MyAngularProject1/src/assets/bird.jpg";
    this.flag=true;
    this.vehicles=["Twowheeler","Threewheeler","Fourwheeler"];
    this.selectedvehicle=" ";
    this.myClass="MyClass1";
    this.myStyle={'height':'160px','width':'40%','border':'2px solid green','background-color':'pink'};
  }
  changeName(){
    this.name="Amala";
  }
  changeImage(){
    this.imagePath="MyAngularProject1/src/assets";
   }

  changeFlag(){
    this.flag=! this.flag;
  }

  setSelectedItem(vec:string){
      this.selectedvehicle=vec;
  }

  changeStyle(){
    this.myStyle={'height':'160px','width':'40%','border':'2px solid blue','background-color':'pink'};
  }
}



 
 