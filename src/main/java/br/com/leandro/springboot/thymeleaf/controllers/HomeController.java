package br.com.leandro.springboot.thymeleaf.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller(value = "/")
public class HomeController {

    @GetMapping("/homejson")
    public ResponseEntity<?> homeJson(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Contenty-type", "application/json");

        Map<String, String> map = new HashMap<String, String>();
        map.put("message", "Hello World");

        return new ResponseEntity<>(
                map, headers, HttpStatus.OK);
    }

    @GetMapping("/")
    public String home(){
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Contenty-type", "application/json");

        Map<String, String> map = new HashMap<String, String>();
        map.put("message", "Hello World");

        return "home.html";
    }
}
