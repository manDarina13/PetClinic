package com.dadindi.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({ "/veterinarios", "veterinarios/index", "veterinarios/index.html" }) // se accede a la pagina "vet/index" a traves de: localhost8080/veterinarios,
                                                                                          // localhost:8080/veterinarios/index,
                                                                                          // localhost:8080/veterinarios/index.html
    public String veterinaios () {
        return "vet/index";
    }

}
