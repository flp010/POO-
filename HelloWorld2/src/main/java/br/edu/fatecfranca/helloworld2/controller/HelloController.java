package br.edu.fatecfranca.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/bomdia/{nome}")
    public String bomdia(@PathVariable String nome) {
        return nome + ", tenha um bom dia";
    }
    @GetMapping("/boatarde/{nome}")
    public String boatarde(@PathVariable String nome) {
        return nome + ", tenha uma boa tarde";
    }
    @GetMapping("/boanoite/{nome}")
    public String boanoite(@PathVariable String nome){
        return nome + ", tenha uma boa noite";
    }
}
