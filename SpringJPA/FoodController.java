package com.example.foodorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")
public class FoodController {
    
    @Autowired
    FoodService  service;

   
     @GetMapping("/foods")
    public List<Food> getAllFoods()
    {
        return service.viewFood();
    }

    @PostMapping("/foodes")
    public String addFood (@RequestBody Food food) {
        //TODO: process POST request
        
        return service.addFood(food);


        @DeleteMapping("/{f_id}")
        public String delete(@PathVariable int f_Id)
        {
            return service.deleteFood(id);
        }
    
}
