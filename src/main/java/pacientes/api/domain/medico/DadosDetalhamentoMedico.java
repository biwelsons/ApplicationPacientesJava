package pacientes.api.domain.medico;

import pacientes.api.domain.endereco.Endereco;

public record DadosDetalhamentoMedico(Long id, String nome, String email, String telefone, Especialidade especialidade, Endereco endereco) {

    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
