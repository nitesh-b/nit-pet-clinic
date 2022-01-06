package com.niteshb.nitpetclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {

    @RequestMapping({"", "/index"})
    public String listVets(){

        return "owner/index";
    }
}
