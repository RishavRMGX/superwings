import { Department } from './Department';
import { ICompany } from '../interfaces/ICompany' 

export class Company implements ICompany {
    
    collegeName: string;

    collegeFoundationDate: Date;

    private _regNo: string;

    private _departments: Array<Department> ;

    public get regNo() {
        return this._regNo;
    }

    public set regNo(regNo: string) {
        this._regNo = regNo;
    }

    public get departments() {
        return this._departments;
    }

    public set departments(departments: Array<Department>) {
        this._departments = departments;
    } 


}