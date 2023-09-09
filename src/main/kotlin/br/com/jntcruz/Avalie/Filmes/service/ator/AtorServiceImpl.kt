package br.com.jntcruz.Avalie.Filmes.service.ator

import br.com.jntcruz.Avalie.Filmes.entity.Ator
import br.com.jntcruz.Avalie.Filmes.repository.AtorRepository
import jakarta.persistence.EntityNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service // Anotação para marcar a classe como um serviço gerenciado pelo Spring
class AtorServiceImpl @Autowired constructor(private val atorRepository: AtorRepository) : AtorService {
    override fun findAll(): List<Ator> {
        // Implementação para recuperar todos os atores usando o atorRepository
        return atorRepository.findAll()
    }

    override fun findById(id: Long): Ator {
        // Implementação para recuperar um ator pelo ID usando o atorRepository
        return atorRepository.findById(id).orElseThrow { EntityNotFoundException("Ator não encontrado com ID $id") }
    }

    override fun save(ator: Ator) {
        // Implementação para salvar um ator usando o atorRepository
        atorRepository.save(ator)
    }

    override fun delete(ator: Ator) {
        // Implementação para excluir um ator usando o atorRepository
        atorRepository.delete(ator)
    }
}
