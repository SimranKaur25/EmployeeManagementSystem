import { Pipe, PipeTransform } from '@angular/core';
import { Employee } from './employee';
import { DatePipe } from '@angular/common'; 

@Pipe({
  name: 'namePipe'
})
export class NamePipePipe implements PipeTransform {

  transform(items:Employee[], name:string,startDate:Date,endDate:Date): Object[] 
  {
    if(items && items.length)
    {
        return items.filter(item =>{

            if(name && (item.firstname.toLowerCase().indexOf(name.toLowerCase()) === -1 && item.lastname.toLowerCase().indexOf(name.toLowerCase()) === -1))
            {
                return false;
            }
            if(startDate && endDate && !(item.startDate >= new Date(startDate).getTime() && item.startDate <= new Date(endDate).getTime()))
            {
                return false;
            }
            
            return true;
        })
        
    }
    else
    {
        return items;
    }
    
  }

}
