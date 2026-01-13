package model;
import java.math.BigDecimal;

public abstract class Ativo {
    private String nome;
    private String ticker;
    private BigDecimal preçoAtual; // não vamos usar double para evitar erros com valores muito grandes;
    private boolean restritoQualificados;
    private TipoRenda TipoRenda; // fixa/variável
    private Origem Origem; // nacional/internacional;
}
