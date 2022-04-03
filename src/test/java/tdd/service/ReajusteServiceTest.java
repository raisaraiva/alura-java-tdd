package tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import enums.DesempenhoEnum;
import models.Funcionario;
import services.ReajusteService;

public class ReajusteServiceTest {

	private ReajusteService reajusteService;
	private Funcionario funcionario;

	@BeforeEach
	public void inicializar() {
		this.reajusteService = new ReajusteService();
		this.funcionario = new Funcionario("Nome", LocalDate.now(), new BigDecimal("1000.00"));
	}

	@Test
	void reajusteADesejar() {
		reajusteService.concederReajuste(funcionario, DesempenhoEnum.A_DESEJAR);

		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}

	@Test
	void reajusteBom() {
		reajusteService.concederReajuste(funcionario, DesempenhoEnum.BOM);

		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}

	@Test
	void reajusteOtimo() {
		reajusteService.concederReajuste(funcionario, DesempenhoEnum.OTIMO);

		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}
}
