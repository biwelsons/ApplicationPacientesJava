package pacientes.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import pacientes.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        int idade,
        String nome,
        String telefone,
        DadosEndereco endereco,
        String notaObservacao,
        String tipoConsulta,
        double valorConsulta,
        String diaRecorrencia
        ) {
}