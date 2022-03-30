package br.com.alura.forum.controller

import br.com.alura.forum.service.TopicoService
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
@SecurityRequirement(name = "bearerAuth")
class AdminController(
    private val service: TopicoService
) {

    @GetMapping("/relatorios")
    fun relatorio(model: Model): String {
        model.addAttribute("topicosPorCategorias", service.relatorio())
        return "relatorio"
    }
}