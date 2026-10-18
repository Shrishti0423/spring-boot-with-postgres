package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/engineers")
public class softwareengineercontroller {

    @GetMapping
    public List<softwareengineer> getEngineer() {

        return List.of(
            new softwareengineer(
                1,
                "John Doe",
                "Java, Spring Boot"
            ),
            new softwareengineer(
                2,
                "Jane Smith",
                "Python, Django"
            )
        );
    }
}