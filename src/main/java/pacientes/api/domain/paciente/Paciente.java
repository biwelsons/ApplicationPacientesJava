package pacientes.api.domain.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pacientes.api.domain.endereco.Endereco;

@Table(name = "cadastropacientes")
@Entity(name = "paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int idade;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    @Column(name="notaobservacao")
    private String notaObservacao;
    @Column(name="tipoconsulta")
    private String tipoConsulta;
    @Column(name="valorconsulta")
    private double valorConsulta;
    @Column(name="diarecorrencia")
    private String diaRecorrencia;
    @Embedded
    private Endereco endereco;
    private Boolean ativo;



    public Paciente(DadosCadastroPaciente dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
        this.notaObservacao = dados.notaObservacao();
        this.tipoConsulta = dados.tipoConsulta();
        this.valorConsulta = dados.valorConsulta();
        this.diaRecorrencia = dados.diaRecorrencia();
        this.idade = dados.idade();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(DadosAtualizacaoPaciente dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.endereco() != null) {
            this.endereco.atualizarInfos(dados.endereco());
        }

        if (dados.notaObservacao() != null) {
            this.notaObservacao = dados.notaObservacao();
        }

        if (dados.tipoConsulta() != null) {
            this.tipoConsulta = dados.tipoConsulta();
        }

        if (dados.diaRecorrencia() != null) {
            this.diaRecorrencia = dados.diaRecorrencia();
        }

        if (dados.idade() != 0) {
            this.idade = dados.idade();
        }

    }

    public void excluir() {
        this.ativo = false;
    }
}

