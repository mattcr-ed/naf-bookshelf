package com.mcred.nafbookshelf;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookshelfController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}