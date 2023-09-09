package br.com.jntcruz.Avalie.Filmes.entity

import jakarta.persistence.*

@Entity
class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    var nome: String? = null
    val descricao: String? = null
    val img: String? = null
    @ManyToMany
    @JoinTable(
            name = "filme_ator",
            joinColumns = [JoinColumn(name = "filme_id")],
            inverseJoinColumns = [JoinColumn(name = "ator_id")]
    )
    var atores: List<Ator>? = null
    @OneToMany(mappedBy = "filme")
    var avaliacoes: List<Avaliacao>? = null
}