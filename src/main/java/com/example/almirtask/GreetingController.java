package com.example.almirtask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired GreetingService greetingService;


    @GetMapping("/hello-rest")
    public Greeting helloRest(@RequestParam String language) {
        return greetingService.getById(language);
    }

    @GetMapping(value = "/hello", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String hello(@RequestParam String language) {
        return "<html><body>" + greetingService.getById(language).getTranslation() + "</body></html>";
    }

    @GetMapping("/secure/hello")
    public Greeting secureHello(@RequestParam String language) {
        return greetingService.getById(language);
    }
}
