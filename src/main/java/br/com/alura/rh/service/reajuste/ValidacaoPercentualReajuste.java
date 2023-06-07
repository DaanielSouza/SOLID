package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.exception.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {
  public void validar(Funcionario funcionario, BigDecimal aumento) {
    System.out.println("Validando percentual do salário...");
    if (aumento.compareTo(new BigDecimal("0.4")) > 0) {
      throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
    }
  }
}
