package com.webproject.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ContactsController {
    @GetMapping("/contacts")
    public String contacts(@RequestParam(name="name", required=false, defaultValue="World") String name,
                          Map<String, Object> model){
        return "contacts";
    }
}
