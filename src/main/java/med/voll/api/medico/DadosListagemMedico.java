package med.voll.api.medico;

//campos nome, email, crm, especialidade são os campos que apareceram para o cliente.
public record DadosListagemMedico(String nome, String email, String crm, Especialidade especialidade) {
    //declaração de construtor
    public DadosListagemMedico(Medico medico) {
        this(
                medico.getNome(),
                medico.getEmail(),
                medico.getCrm(),
                medico.getEspecialidade()
        );
    }
}
