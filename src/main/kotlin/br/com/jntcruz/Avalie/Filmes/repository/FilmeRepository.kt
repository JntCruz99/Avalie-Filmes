package br.com.jntcruz.Avalie.Filmes.repository

import br.com.jntcruz.Avalie.Filmes.entity.Filme
import org.springframework.data.jpa.repository.JpaRepository

interface FilmeRepository : JpaRepository<Filme, Long> {
}