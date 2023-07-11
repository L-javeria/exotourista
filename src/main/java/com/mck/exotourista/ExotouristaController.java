package com.mck.exotourista;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/hotel")
public class ExotouristaController {
    
    private ExoRepo exoRepo;

    public ExotouristaController(ExoRepo exoRepo){
        this.exoRepo = exoRepo;
    }

    @GetMapping("/list")
    public List<Exotourista> getTheData(){
        return exoRepo.findAll();
    }

    @PostMapping("/add")
    public String addTheData(@RequestBody Exotourista user){
        exoRepo.save(user);
        return "User has been added";
    }
}
