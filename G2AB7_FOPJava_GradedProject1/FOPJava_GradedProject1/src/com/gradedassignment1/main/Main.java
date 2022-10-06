package com.gradedassignment1.main;

//importing packages to access the respective methods
import com.gradedassignment1.admin.*;
import com.gradedassignment1.hr.*;
import com.gradedassignment1.tech.*;

public class Main {
	public static void main(String[] args) {

		// Creating Object Of All Classes
		AdminDepartment AdminDepartment = new AdminDepartment();
		HrDepartment HrDepartment = new HrDepartment();
		TechDepartment TechDepartment = new TechDepartment();

		// Output For Admin Department
		System.out.println(AdminDepartment.departmentName());
		System.out.println(AdminDepartment.getTodaysWork());
		System.out.println(AdminDepartment.getWorkDeadline());
		System.out.println(AdminDepartment.isTodayAHoliday() + "\n");

		// Output For HR Department
		System.out.println(HrDepartment.departmentName());
		System.out.println(HrDepartment.doActivity());
		System.out.println(HrDepartment.getTodaysWork());
		System.out.println(HrDepartment.getWorkDeadline());
		System.out.println(HrDepartment.isTodayAHoliday() + "\n");

		// Output For Tech Department
		System.out.println(TechDepartment.departmentName());
		System.out.println(TechDepartment.getTodaysWork());
		System.out.println(TechDepartment.getWorkDeadline());
		System.out.println(TechDepartment.getTechStackInformation());
		System.out.println(TechDepartment.isTodayAHoliday() + "\n");

	}

}
