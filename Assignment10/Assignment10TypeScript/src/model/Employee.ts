import { IEmployee } from '../interfaces/IEmployees'
import { IDepartment } from '../interfaces/IDepartment'

export class Employee implements IEmployee, IDepartment {
    
    departmentName: string;

    employeeName: string;

    private _code: string;

    private _designation: string;

    private _joinDate: Date;

    public get code() {
        return this._code;
    }

    public set regNo(code: string) {
        this._code = code;
    } 

    public get designation() {
        return this._designation;
    }

    public set designation(designation: string) {
        this._designation = designation;
    }

    public get joinDate() {
        return this._joinDate;
    }

    public set joinDate(joinDate: Date) {
        this._joinDate = joinDate;
    }
}