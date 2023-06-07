package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {
  List<ValidacaoReajuste> validacoes;

  public ReajusteService(List<ValidacaoReajuste> validacoes) {
    this.validacoes = validacoes;
  }

  public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
    BigDecimal salario = funcionario.getSalario();

    this.validacoes.forEach(e -> e.validar(funcionario, aumento));

    BigDecimal novoSalario = salario.add(salario.multiply(aumento));
    funcionario.atualizarSalario(novoSalario);
  }
}
