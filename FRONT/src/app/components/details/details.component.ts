import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Employee } from '../models/employee';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  @Input() employee!: Employee;
  @Input() index!: number;

  @Output() deleteEmployeeEvent = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }

  deleteEmployee(index: number): void {
    this.deleteEmployeeEvent.emit(index);
  }

}
