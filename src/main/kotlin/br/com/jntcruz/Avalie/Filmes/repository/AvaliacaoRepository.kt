package br.com.jntcruz.Avalie.Filmes.repository

import br.com.jntcruz.Avalie.Filmes.entity.Avaliacao
import org.springframework.data.jpa.repository.JpaRepository

interface AvaliacaoRepository : JpaRepository<Avaliacao, Long> {
}