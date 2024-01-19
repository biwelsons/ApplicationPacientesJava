package pacientes.api.controller;

import jakarta.el.PropertyNotFoundException;
import jakarta.validation.Valid;
import pacientes.api.domain.paciente.*;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

     private static final Logger logger = LoggerFactory.getLogger(PacienteController.class);

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<String> cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        try {
            logger.info("Recebendo solicitação para cadastrar paciente: {}", dados);

            // Chame o serviço para salvar o paciente
            repository.save(new Paciente(dados));

            return ResponseEntity.ok("Paciente cadastrado com sucesso!");
        } catch (Exception e) {
            logger.error("Erro ao cadastrar paciente.", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno ao cadastrar paciente.");
        }
        
        
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosListagemPaciente> buscarPorId(@PathVariable Long id) {
        try {
            logger.info("Recebendo solicitação para buscar paciente pelo ID: {}", id);

            // Busque o paciente pelo ID no repositório
            Paciente paciente = repository.findById(id)
                    .orElseThrow();

            // Retorne os dados do paciente
            DadosListagemPaciente dadosPaciente = new DadosListagemPaciente(paciente);
            return ResponseEntity.ok(dadosPaciente);
        } catch (PropertyNotFoundException e) {
            logger.warn("Paciente não encontrado pelo ID: {}", id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } catch (Exception e) {
            logger.error("Erro ao buscar paciente pelo ID: {}", id, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPaciente dados) {
        var paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var paciente = repository.getReferenceById(id);
        paciente.excluir();
    }


}
