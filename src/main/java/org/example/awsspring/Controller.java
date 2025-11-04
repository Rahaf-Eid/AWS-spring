package org.example.awsspring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/hey")
    public String hello() {
        return "hey from AWS Cloud!";
    }

}