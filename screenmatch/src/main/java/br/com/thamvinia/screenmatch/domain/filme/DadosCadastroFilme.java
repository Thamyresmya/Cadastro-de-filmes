package br.com.thamvinia.screenmatch.domain.filme;

public record DadosCadastroFilme(
        String nome,
        Integer duracao,
        Integer ano,
        String genero
) {}
