package br.com.alura.rh.service.promocao;

import br.com.alura.rh.exception.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

  public void promover(Funcionario funcionario, boolean metaBatida) {
    Cargo cargoAtual = funcionario.getCargo();

    if (cargoAtual.equals(Cargo.GERENTE)) {
      throw new ValidacaoException("O funcionário é gerente, não pode mais ser promovido!");
    }

    if (metaBatida) {
      Cargo novoCargo = cargoAtual.getProximoCargo();
      funcionario.atualizarCargo(novoCargo);
      System.out.println("Promovido com sucesso!");
    } else {
      throw new ValidacaoException("O funcionário não bateu a meta!");
    }
  }
}
