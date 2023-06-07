package br.com.alura.rh.model;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@ToString
public class Funcionario {
  private String nome;
  private String cpf;
  private Cargo cargo;
  private BigDecimal salario;
  private LocalDateTime dataUltimoReajuste;

  public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.cargo = cargo;
    this.salario = salario;
  }

  public void atualizarSalario(BigDecimal novoSalario) {
    System.out.println("Atualizando salário...");
    this.salario = novoSalario;
    this.dataUltimoReajuste = LocalDateTime.now();
  }

  public void atualizarCargo(Cargo cargo){
    this.cargo = cargo;
  }

}
