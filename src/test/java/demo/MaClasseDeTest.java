package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import demoJavaAvecGit.FactorielException;
import demoJavaAvecGit.FonctionMathematique;

class MaClasseDeTest {

	FonctionMathematique fct;

	@BeforeEach
	void avantChaque() {
		fct = new FonctionMathematique();
	}

	@AfterEach
	void apresChaqueTest() {
		fct = null;
	}

	@BeforeAll
	static void avantLePremierTest() {
		// execute 1 fois avant le premier Test;
	}

	@AfterAll
	static void apresLeDernierTest() {
		// execute 1 fois apres le dernier Test;
	}

	@Test
	void additionTest() {
		assertEquals(10, fct.addition(2, 8));
	}

	@Test
	void factorielTest() {
		assertEquals(6, fct.factoriel(3));
	}

	@Test
	void factorielExceptionTest() {
		assertThrows(FactorielException.class, () -> {
			fct.factoriel(-1);
		});
	}
}
