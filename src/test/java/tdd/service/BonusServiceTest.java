package tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.Funcionario;
import services.BonusService;

class BonusServiceTest {

	private BonusService bonusService;

	@BeforeEach
	public void inicializa() {
		this.bonusService = new BonusService();
	}

	@Test
	void semBonus() {
		try {
			bonusService.calcularBonus(criarFuncionario(new BigDecimal("10000.01")));

			fail("Não deu exceção!");
		} catch (IllegalArgumentException e) {
			assertEquals("Funcionário com salário maior do que R$ 10000,00 não pode receber bonus!", e.getMessage());
		}
	}

	@Test
	void verificandoBonus() {
		BigDecimal bonus = bonusService.calcularBonus(criarFuncionario(new BigDecimal("1000")));

		assertEquals(new BigDecimal("100.00"), bonus);
	}

	private Funcionario criarFuncionario(BigDecimal salario) {
		return new Funcionario("Rodrigo", LocalDate.now(), salario);
	}
}
