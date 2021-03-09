package com.dadindi.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({ "", "/", "index", "index.html" }) // se accede a la pagina "index" a traves de: localhost:8080, localhost8080/, localhost:8080/index,
                                                        // localhost:8080/index.html
    public String index () {
        return "index";
    }

}
