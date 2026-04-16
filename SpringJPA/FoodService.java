package com.example.foodorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoodService {
   
    @Autowired
    Repo repo;

    public String addFood(Food food)
    {
        repo.save(food);
        return "Data Inserted Successfully";
    }

    public List<Food> viewFood()
    {
        return repo.findAll();
    }


    public String deleteFood(int f_Id)
    {
        if (repo.existsById(f_Id)) {
            repo.deleteById(f_Id);
            return "deleted Successful";
        }
        else{
            return "Food not found";
        }
    }
}
