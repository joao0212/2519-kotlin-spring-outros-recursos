package br.com.alura.forum.controller

import br.com.alura.forum.model.Resposta
import br.com.alura.forum.service.RespostaService
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/respostas")
@SecurityRequirement(name = "bearerAuth")
class RespostaController(
    private val respostaService: RespostaService
) {

    @PostMapping
    fun salvar(@RequestBody @Valid resposta: Resposta) = respostaService.salvar(resposta)
}