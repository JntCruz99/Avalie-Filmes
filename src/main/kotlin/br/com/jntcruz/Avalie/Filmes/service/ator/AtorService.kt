package br.com.jntcruz.Avalie.Filmes.service.ator

import br.com.jntcruz.Avalie.Filmes.entity.Ator

interface AtorService {

    fun findAll():List<Ator>

    fun findById(id:Long):Ator

    fun save(ator: Ator)

    fun delete(ator: Ator)

}