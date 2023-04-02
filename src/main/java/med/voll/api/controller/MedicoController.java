package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    //métodos para funcionalidade
    @PostMapping  //verbo post
    //requisição do tipo post para a URL /medicos, para que ative o método cadastrar da classe MedicoController
    public void cadastrar(@RequestBody String json) {
        System.out.println(json);cd 
    }

}
