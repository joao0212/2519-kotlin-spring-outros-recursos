package br.com.alura.forum.repository

import br.com.alura.forum.model.Resposta
import org.springframework.data.jpa.repository.JpaRepository

interface RespostaRepository: JpaRepository<Resposta, Long>