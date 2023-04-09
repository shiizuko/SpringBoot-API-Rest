package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico; //DTO
import med.voll.api.medico.DadosListagemMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    //métodos para funcionalidade
    @PostMapping  //verbo post
    @Transactional
    //requisição do tipo post para a URL /medicos, para que ative o método cadastrar da classe MedicoController
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping
    //DadosListagemMedico DTO
    public Page<DadosListagemMedico> listar(
            @PageableDefault(
                    size = 10, sort = {"nome"}
            ) Pageable paginacao)
    {
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }
}
