package br.com.jntcruz.Avalie.Filmes.service.filme

import br.com.jntcruz.Avalie.Filmes.entity.Filme
import br.com.jntcruz.Avalie.Filmes.repository.FilmeRepository
import jakarta.persistence.EntityNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service // Marca a classe como um serviço gerenciado pelo Spring
class FilmeServiceImpl @Autowired constructor(private val filmeRepository: FilmeRepository) : FilmeService {
    override fun findAll(): List<Filme> {
        // Implementação para recuperar todos os filmes usando o filmeRepository
        return filmeRepository.findAll()
    }

    override fun findById(id: Long): Filme {
        // Implementação para recuperar um filme pelo ID usando o filmeRepository
        return filmeRepository.findById(id).orElseThrow { EntityNotFoundException("Filme não encontrado com ID $id") }
    }

    override fun save(filme: Filme) {
        // Implementação para salvar um filme usando o filmeRepository
        filmeRepository.save(filme)
    }

    override fun delete(filme: Filme) {
        // Implementação para excluir um filme usando o filmeRepository
        filmeRepository.delete(filme)
    }
}
