package com.example.Dependency;

public class Car
 {
    @inject
    private Engine engine;

    
    public void drive()
    {
       engine.start();
       System.out.println("Car is Driving...") 
    }
}
