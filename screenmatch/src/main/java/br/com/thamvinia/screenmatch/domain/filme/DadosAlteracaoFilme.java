package br.com.thamvinia.screenmatch.domain.filme;

public record DadosAlteracaoFilme(
        Long id,
        String nome,
        Integer duracao,
        Integer ano,
        String genero

) {
}
