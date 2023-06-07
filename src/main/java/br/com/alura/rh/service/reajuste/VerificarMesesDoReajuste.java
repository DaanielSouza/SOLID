package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.exception.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class VerificarMesesDoReajuste implements ValidacaoReajuste {
  public void validar(Funcionario funcionario, BigDecimal aumento) {
    System.out.println("Validando data do último reajuste...");
    try {
      if (funcionario.getDataUltimoReajuste().isBefore(LocalDateTime.now().plusMonths(6L))) {
        throw new ValidacaoException("O último reajuste occoreu a menos de 6 meses");
      }
    } catch (NullPointerException e) {
      System.out.println("O aumento pode ocorrer, funcionário nunca recebeu aumento.");
    }
  }
}
