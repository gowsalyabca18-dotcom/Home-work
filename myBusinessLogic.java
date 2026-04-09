package com.example.demo;

public class myBusinessLogic 
{
    @myAnnotation
   private serviceA ser;
   
   @myAnnotation
   private serviceB serve;

   public void runLogic()
   {
    System.out.println("Running Business Logic...");

    if(serviceA!=null)
    {
        serviceA.doSomething();
    }
    else{
        System.out.println("Service A not injected!...");
    }

    if(serviceB!=null)
    {
        serviceB.doElse()
      }
      else{
        System.out.println("ServiceB not injected....");
      }
   }
}
