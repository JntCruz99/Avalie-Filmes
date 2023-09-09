package br.com.jntcruz.Avalie.Filmes.service.avaliacao

import br.com.jntcruz.Avalie.Filmes.entity.Avaliacao
import br.com.jntcruz.Avalie.Filmes.repository.AvaliacaoRepository
import jakarta.persistence.EntityNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service // Marca a classe como um serviço gerenciado pelo Spring
class AvaliacaoServiceImpl @Autowired constructor(private val avaliacaoRepository: AvaliacaoRepository) : AvaliacaoService {
    override fun findAll(): List<Avaliacao> {
        // Implementação para recuperar todas as avaliações usando o avaliacaoRepository
        return avaliacaoRepository.findAll()
    }

    override fun findById(id: Long): Avaliacao {
        // Implementação para recuperar uma avaliação pelo ID usando o avaliacaoRepository
        return avaliacaoRepository.findById(id).orElseThrow { EntityNotFoundException("Avaliação não encontrada com ID $id") }
    }

    override fun save(avaliacao: Avaliacao) {
        // Implementação para salvar uma avaliação usando o avaliacaoRepository
        avaliacaoRepository.save(avaliacao)
    }

    override fun delete(avaliacao: Avaliacao) {
        // Implementação para excluir uma avaliação usando o avaliacaoRepository
        avaliacaoRepository.delete(avaliacao)
    }
}
