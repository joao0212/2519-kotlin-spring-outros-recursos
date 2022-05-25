package br.com.alura.forum.service

import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class EmailService(
    private val javaMailSender: JavaMailSender
) {

    fun notificar(emailAutor: String) {
        val message = SimpleMailMessage()

        message.setSubject("[Alura] Resposta Recebida")
        message.setText("Ola, o seu tópico foi respondido. Vamos la conferir?")
        message.setTo(emailAutor)

        javaMailSender.send(message)
    }
}