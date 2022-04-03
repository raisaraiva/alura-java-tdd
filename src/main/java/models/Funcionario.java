package models;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

    private LocalDate dataAdmissao;

    private String nome;

    private BigDecimal salario;

    // constructors

    public Funcionario() {
    }

    public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    // getters and setters

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    // methods

    public void reajustarSalario(BigDecimal percentual) {
        setSalario(getSalario().add(getSalario().multiply(percentual)).setScale(2, RoundingMode.HALF_UP));
    }
}








