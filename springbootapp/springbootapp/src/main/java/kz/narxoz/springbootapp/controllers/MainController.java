package kz.narxoz.springbootapp.controllers;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


public class MainController {

    @RequestMapping("/")
    public String showMainPage(){
        return "index";
    }


}
