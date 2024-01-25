package pacientes.api.domain.paciente;

import pacientes.api.domain.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long id,int idade, String nome, String email, String telefone, String cpf, String notaObservacao, String tipoConsulta, double valorConsulta, String diaRecorrencia, Endereco endereco, Boolean ativo) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getIdade(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getNotaObservacao(), paciente.getTipoConsulta(), paciente.getValorConsulta(), paciente.getDiaRecorrencia(), paciente.getEndereco(), paciente.getAtivo());
    }
}


