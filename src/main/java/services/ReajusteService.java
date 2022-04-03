package services;

import enums.DesempenhoEnum;
import models.Funcionario;

public class ReajusteService {
	public void concederReajuste(Funcionario funcionario, DesempenhoEnum desempenhoEnum) {
		funcionario.reajustarSalario(desempenhoEnum.getPercentual());
	}
}
