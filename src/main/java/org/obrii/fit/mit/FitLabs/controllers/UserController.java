package org.obrii.fit.mit.FitLabs.controllers;

import org.obrii.fit.mit.FitLabs.Data.Data;
import org.obrii.fit.mit.FitLabs.crud.ISpringCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    ISpringCrud CRUD;

    @GetMapping("/addButton")
    public String makeAppointment(Data data){
        return "form";
    }

    @PostMapping("/add")
    public String makeAppointment(@Valid Data addData, BindingResult result, Model model){
        if(result.hasErrors()){
            return "form";
        }
        CRUD.save(addData);
        return "redirect:/";
    }

    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("usersList", CRUD.findAll());
        return "index";
    }


}