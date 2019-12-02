import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeServiceService } from '../employee-service.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

    users: Employee[];

  constructor(private employeeService: EmployeeServiceService) { }

  ngOnInit() {
    this.employeeService.findAll().subscribe(data => {
      this.users = data;
    });
  }

}
