/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject.SpeedCalculator;

/**
 *
 * @author Administrator
 */
public class Speed 
{
   double distance;
   double time;
   double speed;
   public Speed(double distance,double time)
   {
   this.distance=distance;
   this.time=time;
   this.speed=calculateSpeed();
   }
   public double calculateSpeed()
   {
   return (distance/time);
   }
   public void printSpeed()
   {
       System.out.println("Speed"+speed+"km/Hr");
   }
}
