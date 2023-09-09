package br.com.jntcruz.Avalie.Filmes.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*

@Entity
class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    var nome: String? = null
    var avaliacao: Double? = null

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "filme_id")
    var filme: Filme? = null
}