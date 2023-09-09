package br.com.jntcruz.Avalie.Filmes.controller

import br.com.jntcruz.Avalie.Filmes.entity.Avaliacao
import br.com.jntcruz.Avalie.Filmes.service.avaliacao.AvaliacaoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController // Marca a classe como um controlador Spring
@RequestMapping("/avaliacoes") // Define o caminho base para as URLs deste controlador
class AvaliacaoController @Autowired constructor(private val avaliacaoService: AvaliacaoService) {

    @GetMapping // Define um endpoint para GET
    fun listarAvaliacoes(): List<Avaliacao> {
        return avaliacaoService.findAll()
    }

    @GetMapping("/{id}") // Define um endpoint para GET com um parâmetro ID
    fun buscarAvaliacaoPorId(@PathVariable id: Long): Avaliacao {
        return avaliacaoService.findById(id)
    }

    @PostMapping // Define um endpoint para POST
    fun criarAvaliacao(@RequestBody avaliacao: Avaliacao) {
        avaliacaoService.save(avaliacao)
    }

    @DeleteMapping("/{id}") // Define um endpoint para DELETE com um parâmetro ID
    fun excluirAvaliacao(@PathVariable id: Long) {
        val avaliacao = avaliacaoService.findById(id)
        avaliacaoService.delete(avaliacao)
    }
}
