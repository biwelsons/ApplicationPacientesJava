package pacientes.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {


    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
        this.numero = dados.numero();
        this.uf = dados.uf();
        this.estado = dados.estado();
    }


    private String logradouro;
    private String bairro;
    private String cep;
    private int numero;
    private String complemento;
    private String cidade;
    private String uf;
    private String estado;

    public void atualizarInfos(DadosEndereco dados) {
        if(dados.logradouro() != null){this.logradouro = dados.logradouro();}
        if(dados.bairro() != null){this.bairro = dados.bairro();}
        if(dados.cep() != null){this.cep = dados.cep();}
        if(dados.cidade() != null){this.cidade = dados.cidade();}
        if(dados.complemento() != null){this.complemento = dados.complemento();}
        if(dados.numero() != 0){this.numero = dados.numero();}
        if(dados.uf() != null){this.uf = dados.uf();}
        if(dados.estado() != null){this.estado = dados.estado();}

    }
}

