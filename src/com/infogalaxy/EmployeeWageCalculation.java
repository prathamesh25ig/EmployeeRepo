package com.infogalaxy;

import java.util.Random;

public class EmployeeWageCalculation {

        public static void main(String args[]){
            //Displaying Welcome Massege For User
            System.out.println("Welcome To Employee Wage Calculation Problem");
            Random random = new Random();
            //uc - 1 Chek Employee Attendance
            int empAttendance = random.nextInt()%2;
            System.out.println(empAttendance);
            if(empAttendance == 0){
                System.out.println("Employee Is absent");
            }else{
                System.out.println("Employee Is Present");
            }
        }



}
