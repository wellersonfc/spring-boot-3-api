package imoveiswell.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import imoveiswell.api.imoveis.DadosCastroImoveis;

@RestController
@RequestMapping("/imoveis")
public class ImoveisController {
    
    @PostMapping
    public void cadastrar(@RequestBody DadosCastroImoveis dados){
        System.out.println(dados);
    }


}
