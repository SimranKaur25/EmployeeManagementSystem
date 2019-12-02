import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeServiceService } from '../employee-service.service';


@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

    user: Employee;
    searchText;
  constructor(private route: ActivatedRoute, 
      private router: Router,
      private EmployeeServiceService: EmployeeServiceService) { 
      this.user = new Employee();}
      
      onSubmit() {
    this.EmployeeServiceService.save(this.user).subscribe(result => this.gotoUserList());
  }
 
  gotoUserList() {
    this.router.navigate(['/users']);
  }

  ngOnInit() {
  }

}
