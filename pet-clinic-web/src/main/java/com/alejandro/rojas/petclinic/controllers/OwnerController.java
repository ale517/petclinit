package com.alejandro.rojas.petclinic.controllers;

import com.alejandro.rojas.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    String getListOwners (Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }
}
