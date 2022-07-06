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
import com.wipro.velocity.model.*;

@RestController
public class InstituteRegisterController {

    @Autowired
    private InstituteRegistrationRepository instrep;
    
    @PostMapping("/register-institute")
    public String reginst(@RequestBody InstituteRegistration ir)
    {
    	instrep.save(ir);
		return "institute is registered successfully";
    	
    }
    
    @GetMapping("/Institutes")
    public List<InstituteRegistration> getAllProducts(){
        return instrep.findAll();
    }
    
    @DeleteMapping("/delete-institute/{id}")
    public String deleteInstitution(@PathVariable int id)
    {
    	instrep.deleteById(id);
		return "institute is deleted successfully";
    }
}
