package by.anton.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmps(){


        return "view_for_all";
    }
    @GetMapping("/hr_info")
    public String viewForHR(){


        return "view_for_hr";
    }

    @GetMapping("/manager_info")
    public  String getForManager(){


        return "view_manager_info";
    }

}
