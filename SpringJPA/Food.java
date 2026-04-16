package com.example.foodorder;
import jakarta.persistence.*;


@Entity
@Table(name="hotel")
public class Food {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int f_Id;
    private String f_name;
    private double f_price;

    public int getId()
    {
        return f_Id;
    }
    public void setId(int f_Id)
    {
        this.f_Id=f_Id;
    }


    public String getName()
    {
        return f_name;
    }
    public void setName(String f_name)
    {
        this.f_name=f_name;
    }


    public double getPrice()
    {
        return f_price;
    }
    public void setPrice(double f_price)
    {
        this.f_price=f_price;
    }

}
