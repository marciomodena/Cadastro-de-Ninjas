package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas") //vou pegar informações , uma convenção é usar o "barra" pois é a mesma coisa que "localhost:8080/boasvindas
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }
}
