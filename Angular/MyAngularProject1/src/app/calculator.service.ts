import { Injectable } from '@angular/core';

@Injectable()
export class CalculatorService {

    getAddition(a:number,b:number){
      return a+b;
    }

    getMultiplication(a:number,b:number){
      return a*b;
    }
}
