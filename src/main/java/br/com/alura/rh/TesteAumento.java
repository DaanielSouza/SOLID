package br.com.alura.rh;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.service.promocao.PromocaoService;
import br.com.alura.rh.service.reajuste.ReajusteService;
import br.com.alura.rh.service.reajuste.ValidacaoPercentualReajuste;
import br.com.alura.rh.service.reajuste.ValidacaoReajuste;
import br.com.alura.rh.service.reajuste.VerificarMesesDoReajuste;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TesteAumento {
  public static void main(String[] args) {
    Funcionario func = new Funcionario("Daniel", "1111111111", Cargo.ANALISTA, new BigDecimal("13250"));
    logaFuncionario(func);
    ReajusteService reajusteService = new ReajusteService(populaListaValidacoes());
    reajusteService.reajustarSalarioDoFuncionario(func, new BigDecimal("0.39"));
    logaFuncionario(func);
    PromocaoService promocaoService = new PromocaoService();
    promocaoService.promover(func, true);
    logaFuncionario(func);
  }

  private static void logaFuncionario(Funcionario func){
    System.out.println("---------- LOG ----------");
    System.out.println(func.toString());
    System.out.println("---------- LOG ----------");
  }

  private static List<ValidacaoReajuste> populaListaValidacoes() {
    List<ValidacaoReajuste> lista = new ArrayList<>();
    lista.add(new ValidacaoPercentualReajuste());
    lista.add(new VerificarMesesDoReajuste());

    return lista;
  }
}
