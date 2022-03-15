package com.infogalaxy;

import java.util.Random;

public class EmployeeWageCalculation {

        public static void main(String args[]){
            //Displaying Welcome Massege For User
            System.out.println("Welcome To Employee Wage Calculation Problem");
            //uc - 2 Calculate Daily Wage
            final int WAGE_PER_HR = 20;
            final int FULL_DAY_WAGE =8;
            int total_wage = 0;
            Random random = new Random();
            //uc- 1 Check Employee Is Absenr Or Present
            int empAttendance = random.nextInt()%2;
            System.out.println(empAttendance);
            if(empAttendance == 0){
                System.out.println("Employee Is absent");
            }else{
                System.out.println("Employee Is Present");
                total_wage =WAGE_PER_HR * FULL_DAY_WAGE;
            }
            System.out.println("Employee Day Wage:"+total_wage);
        }



}
