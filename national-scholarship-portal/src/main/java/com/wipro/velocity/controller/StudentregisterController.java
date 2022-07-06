package com.wipro.velocity.controller;
import java.util.List;
import com.wipro.velocity.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.wipro.velocity.model.Studentregistration;

@RestController
public class StudentregisterController {

    @Autowired
    private StudentregisterRepository sturep;
    
    @PostMapping("/register-student")
    public String regstu(@RequestBody Studentregistration sr)
    {
    	sturep.save(sr);
		return "student is registered successfully";
    	
    }
    
    @GetMapping("/Students")
    public List<Studentregistration> getAllProducts(){
        return sturep.findAll();
    }
    
    @DeleteMapping("/delete-student/{id}")
    public String deletestudent(@PathVariable int id)
    {
    	sturep.deleteById(id);
		return "student is deleted successfully";
    }
}
