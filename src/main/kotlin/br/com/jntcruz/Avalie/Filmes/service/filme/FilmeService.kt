package br.com.jntcruz.Avalie.Filmes.service.filme

import br.com.jntcruz.Avalie.Filmes.entity.Avaliacao
import br.com.jntcruz.Avalie.Filmes.entity.Filme

interface FilmeService {
    fun findAll():List<Filme>

    fun findById(id:Long): Filme

    fun save(filme: Filme)

    fun delete(filme: Filme)
}