package pacientes.api.domain.medico;

public record DadosListagemMedico(Long id, String nome, String email, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getEspecialidade());
    }

}