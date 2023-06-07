package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
  public default void validar(Funcionario funcionario, BigDecimal aumento){}
}
