package lx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixin
 */
@RestController
@RequestMapping("/jenkinsTest")
public class JenkinsTestController {


    @GetMapping("/getTest")
    public String getTest() {
        return "test success!";
    }
}
