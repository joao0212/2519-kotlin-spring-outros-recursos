package br.com.alura.forum.dto

data class Email(
    val subject: String,
    val text: String,
    val targetEmail: String
)