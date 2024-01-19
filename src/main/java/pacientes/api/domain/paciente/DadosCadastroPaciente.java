package pacientes.api.domain.paciente;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import pacientes.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(

        @Id 
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,

        @NotBlank
        String nome,
        
        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")
        String cpf,

        @NotBlank
        int idade,

        String notaObservacao,

         @NotBlank
        String tipoConsulta,
         
         @NotBlank
        double valorConsulta,

        String diaRecorrencia,

        @NotNull @Valid DadosEndereco endereco) {
}
