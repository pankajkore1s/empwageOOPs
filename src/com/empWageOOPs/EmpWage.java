package com.empWageOOPs;

import java.util.*;

public class EmpWage{

	static final int isparttime = 1;
	static final int isfulltime = 2;
	static final int wagesperhour = 20;
	static final int NumOfWorkingDays = 20;
	static final int MaxHoursinMonth = 100;
	int full_time_days=0;
	int partime_days=0;
	int emp_worked_hour=0;
	int total_worked_day=0;

		   public void calculation() {
			   int totalEmployeeWage = 0, totalWorkingDays = 0, totalEmployeeHours =0;

			   while (totalEmployeeHours <= MaxHoursinMonth && totalWorkingDays < NumOfWorkingDays)
			    {
			      int employeeHours = 0;
			      totalWorkingDays++;
			      int employeecheck = (int) Math.floor(Math.random() * 10) % 3;
			      switch (employeecheck)
			      {
			        case isparttime:
			          employeeHours = 8;
			        break;
			        case isfulltime:
			          employeeHours = 8;
			        break;
			        default:
			          employeeHours = 0;
			        break;
			      }
			      totalEmployeeHours += employeeHours;
			      int employeeWage =employeeHours * wagesperhour;
			      totalEmployeeWage += employeeWage;
			    }
			   System.out.println("Total Employee Wage is : " + totalEmployeeWage + " $");
		   }
}