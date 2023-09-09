package br.com.jntcruz.Avalie.Filmes.controller

import br.com.jntcruz.Avalie.Filmes.entity.Filme
import br.com.jntcruz.Avalie.Filmes.service.filme.FilmeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController // Marca a classe como um controlador Spring
@RequestMapping("/filmes") // Define o caminho base para as URLs deste controlador
class FilmeController @Autowired constructor(private val filmeService: FilmeService) {

    @GetMapping // Define um endpoint para GET
    fun listarFilmes(): List<Filme> {
        return filmeService.findAll()
    }

    @GetMapping("/{id}") // Define um endpoint para GET com um parâmetro ID
    fun buscarFilmePorId(@PathVariable id: Long): Filme {
        return filmeService.findById(id)
    }

    @PostMapping // Define um endpoint para POST
    fun criarFilme(@RequestBody filme: Filme) {
        filmeService.save(filme)
    }

    @DeleteMapping("/{id}") // Define um endpoint para DELETE com um parâmetro ID
    fun excluirFilme(@PathVariable id: Long) {
        val filme = filmeService.findById(id)
        filmeService.delete(filme)
    }
}
