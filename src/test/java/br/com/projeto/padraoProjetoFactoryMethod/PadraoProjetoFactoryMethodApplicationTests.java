package br.com.projeto.padraoProjetoFactoryMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.projeto.padraoProjetoFactoryMethod.produto.MusicaCd;
import br.com.projeto.padraoProjetoFactoryMethod.produto.MusicaDigital;
import br.com.projeto.padraoProjetoFactoryMethod.produto.MusicaFitaK7;
import br.com.projeto.padraoProjetoFactoryMethod.produto.MusicaPenDrive;

@SpringBootTest
class PadraoProjetoFactoryMethodApplicationTests {

	@Test
	void criarMusicaCd_quandoSucesso() {

		String musica = new MusicaCd().criarMusica();
		assertEquals("Musica CD criada", musica);

	}

	@Test
	void criarMusicaDigital_quandoSucesso() {

		String musica = new MusicaDigital().criarMusica();
		assertEquals("Musica Digital criada", musica);

	}

	@Test
	void criarMusicaFitaK7_quandoSucesso() {

		String musica = new MusicaFitaK7().criarMusica();
		assertEquals("Musica Fita K7 criada", musica);

	}

	@Test
	void criarMusicaPenDrive_quandoSucesso() {

		String musica = new MusicaPenDrive().criarMusica();
		assertEquals("Musica Pen Drive criada", musica);

	}

}
