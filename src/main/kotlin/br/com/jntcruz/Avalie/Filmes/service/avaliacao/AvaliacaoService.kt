package br.com.jntcruz.Avalie.Filmes.service.avaliacao

import br.com.jntcruz.Avalie.Filmes.entity.Ator
import br.com.jntcruz.Avalie.Filmes.entity.Avaliacao

interface AvaliacaoService {

    fun findAll():List<Avaliacao>

    fun findById(id:Long): Avaliacao

    fun save(avaliacao: Avaliacao)

    fun delete(avaliacao: Avaliacao)

}