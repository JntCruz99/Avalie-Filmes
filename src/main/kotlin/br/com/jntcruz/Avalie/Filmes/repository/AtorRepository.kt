package br.com.jntcruz.Avalie.Filmes.repository

import br.com.jntcruz.Avalie.Filmes.entity.Ator
import org.springframework.data.jpa.repository.JpaRepository

interface AtorRepository: JpaRepository<Ator, Long>{
}