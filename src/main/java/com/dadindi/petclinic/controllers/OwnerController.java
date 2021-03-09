package com.dadindi.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({ "/duenyos", "duenyos/index", "duenyos/index.html" }) // se accede a la pagina "owner/index" a traves de: localhost8080/duenyos,
    // localhost:8080/duenyos/index,
    // localhost:8080/duenyos/index.html
    public String duenyos () {
        return "owner/index";
    }
}
