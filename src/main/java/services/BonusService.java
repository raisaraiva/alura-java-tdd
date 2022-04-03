package services;

import models.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {
    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal bonus = funcionario.getSalario().multiply(new BigDecimal("0.1"));

        if (bonus.compareTo(new BigDecimal("1000")) > 0) {
            throw new IllegalArgumentException("Funcionário com salário maior do que R$ 10000,00 não pode receber bonus!");
        }

        return bonus.setScale(2, RoundingMode.HALF_UP);
    }
}
