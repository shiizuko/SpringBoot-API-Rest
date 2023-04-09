package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(

        @NotNull // não é string portanto não é um @notblank
        Long id,
        String nome,
        String telefone,
        String email,
        DadosEndereco endereco
) {

}
