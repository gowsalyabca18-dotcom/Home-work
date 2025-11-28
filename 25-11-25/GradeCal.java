/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject.ExamGrader;

/**
 *
 * @author Administrator
 */
public class GradeCal
{
  double mark1;
  double mark2;
  double mark3;
  double average;
  char grade;
  public GradeCal(double m1,double m2,double m3)
  {
  mark1=m1;
  mark2=m2;
  mark3=m3;
  average=calculateAverage();
  grade=calculateGrade();
  }
  public double calculateAvarege()
  {
  return (mark1+mark2+mark3);
  }
  public char calculateGrade()
  {
  if(average>=90)
  {
  
  return 'A';
  }
  else 
  {
  return 'F';
  }
  }
  public void printGrade()
  {
      System.out.println("Average"+average);
      System.out.println("Grade"+grade);
  }
}
