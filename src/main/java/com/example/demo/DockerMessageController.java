package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DockerMessageController {
    @GetMapping("/param")
    @ResponseBody 
    public String getMessageparam(@RequestParam String data) {
        return "Hello from Docker v1!"+data;
    }
    @GetMapping("/app1")
    public String getMessage() {
        return "Hello from Docker v1!";
    }
    @GetMapping("/app2")
    public String getMessagev2() {
        return "Hello from Docker app2 !";
    }
}