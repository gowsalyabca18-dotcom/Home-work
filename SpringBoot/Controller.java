package com.example.Welcome;


 @RestController
 @RequestMapping("/hib")
public class Controller
 {
   @GetMapping
    public String print()
    {
        return "Welcome";
    }
    @GetMapping("/{name}")
    public String print1(@PathVariable String name)
    {
        return "Spring Boot"+name;
    }

    @GetMapping("/nithi")
    public String print2(@RequestParam String name)
    {
        return "Welcome to the Spring boot " +name
    }
}
