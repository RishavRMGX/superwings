import { Employee } from './Employee'
import { ICompany } from '../interfaces/ICompany'
import { IDepartment } from '../interfaces/IDepartment'

export class Department implements IDepartment, ICompany{

    private _code: string;

    departmentName: string;

    collegeName: string;
    
    collegeFoundationDate: Date;

    private _employees: Array<Employee> ;

    public get code() {
        return this._code;
    }

    public set regNo(code: string) {
        this._code = code;
    }

    public get employeesList(){
        return this._employees;
    }

    public set employeesList(employees: Array<Employee>) {
        this._employees = employees;
    }

}