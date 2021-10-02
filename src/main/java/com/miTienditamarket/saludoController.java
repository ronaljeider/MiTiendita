package com.miTienditamarket;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("*/saludar")
public class saludoController {

    @GetMapping("*/hola")
    public String saludar (){
        return "Este es un saludo de prueba! ";
    }

}
