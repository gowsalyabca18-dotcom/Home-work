/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalAndStatic1;

/**
 *
 * @author Administrator
 */
public class Student
{
   static  String school="Govt.School";
   String studentName;
   Student(String studentName)
   {
   this.studentName=studentName;
   }
   void display()
   {
       
       System.out.println("Student Name: " +studentName);
       System.out.println("School Name: " + school);
   }
   
}
