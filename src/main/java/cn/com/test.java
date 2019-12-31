package cn.com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @RequestMapping("/hello")
    public String t(){
        return "Hello Wold!";
    }

    public void ts(){}
}
