package pl.krystian.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Krystian";
    }

    @GetMapping("/hello2")
    public String sayHello2(){
        return "Hello Krystian2";
    }



}
