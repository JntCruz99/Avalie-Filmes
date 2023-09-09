package br.com.jntcruz.Avalie.Filmes.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany

@Entity
class Ator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    var nome: String? = null

    @ManyToMany(mappedBy = "atores")
    var filmes: List<Filme>? = null


}