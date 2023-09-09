package br.com.jntcruz.Avalie.Filmes.controller

import br.com.jntcruz.Avalie.Filmes.entity.Ator
import br.com.jntcruz.Avalie.Filmes.service.ator.AtorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/atores")
class AtorController @Autowired constructor(private val atorService: AtorService) {

    @GetMapping
    fun listarAtores(): ResponseEntity<List<Ator>> {
        val atores = atorService.findAll()
        return ResponseEntity(atores, HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun buscarAtorPorId(@PathVariable id: Long): ResponseEntity<Ator> {
        val ator = atorService.findById(id)
        return ResponseEntity(ator, HttpStatus.OK)
    }

    @PostMapping
    fun criarAtor(@RequestBody ator: Ator): ResponseEntity<Unit> {
        atorService.save(ator)
        return ResponseEntity(HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun atualizarAtor(@PathVariable id: Long, @RequestBody ator: Ator): ResponseEntity<Unit> {
        val atorExistente = atorService.findById(id)
        atorExistente.nome = ator.nome
        atorService.save(atorExistente)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }

    @DeleteMapping("/{id}")
    fun deletarAtor(@PathVariable id: Long): ResponseEntity<Unit> {
        val ator = atorService.findById(id)
        atorService.delete(ator)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}
