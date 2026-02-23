package com.vaishnavi.guardianapp;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> sayHello() {

        Map<String, Object> response = new HashMap<>();
        response.put("name", "Vaishnavi");
        response.put("company", "Guardian");
        response.put("experience", 3);

        return response;

    }
}