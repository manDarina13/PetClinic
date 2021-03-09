package com.dadindi.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dadindi.petclinic.services.OwnerService;

@Controller
public class OwnerController {
    
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    
    /**
     * RequestMapping: se accede a la pagina "owner/index" a traves de: localhost8080/duenyos,
     * localhost:8080/duenyos/index,
     * localhost:8080/duenyos/index.html
     */
    @RequestMapping({ "/duenyos", "duenyos/index", "duenyos/index.html" }) 
    public String duenyos (Model modelo) {//el modelo lo inyecta spring
        modelo.addAttribute("owners", ownerService.finAll());
        return "owner/index";
    }
}
