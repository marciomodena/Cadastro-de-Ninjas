package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Essa classe vai receber requisições HTTP e devolver respostas para uma API REST, geralmente em JSON
@RequestMapping


public class MissoesController {

    @GetMapping("/missoes")
    public String retornaMissao(){
        return "Voce esta retornando sua pagina de missoes";
    }

}
