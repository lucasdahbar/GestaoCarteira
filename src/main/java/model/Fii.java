package model;

import java.math.BigDecimal;

public class Fii extends Ativo {
    private String segmento;
    private BigDecimal ultimoDividendo;
    private BigDecimal taxaAdministracao;

    public Fii(String nome,
               String ticker,
               BigDecimal precoAtual,
               boolean restritoQualificados,
               String segmento,
               BigDecimal ultimoDividendo,
               BigDecimal taxaAdministracao) {

        super(nome, ticker, precoAtual, restritoQualificados, TipoRenda.VARIAVEL, Origem.NACIONAL);

        if (segmento == null || segmento.isBlank()) {
            throw new AtivoInvalidoException("Segmento do FII não pode ser nulo ou vazio.");
        }

        if (ultimoDividendo == null || ultimoDividendo.compareTo(BigDecimal.ZERO) < 0) {
            throw new AtivoInvalidoException("Último dividendo do FII não pode ser nulo ou negativo.");
        }

        if (taxaAdministracao == null || taxaAdministracao.compareTo(BigDecimal.ZERO) < 0) {
            throw new AtivoInvalidoException("Taxa de administração do FII não pode ser nula ou negativa.");
        }

        this.segmento = segmento;
        this.ultimoDividendo = ultimoDividendo;
        this.taxaAdministracao = taxaAdministracao;
    }

}
