package br.com.projeto.padraoProjetoFactoryMethod.categoria;

import br.com.projeto.padraoProjetoFactoryMethod.produto.Musica;
import br.com.projeto.padraoProjetoFactoryMethod.produto.MusicaCd;
import br.com.projeto.padraoProjetoFactoryMethod.produto.MusicaDigital;
import br.com.projeto.padraoProjetoFactoryMethod.produto.MusicaFitaK7;
import br.com.projeto.padraoProjetoFactoryMethod.produto.MusicaPenDrive;
import br.com.projeto.padraoProjetoFactoryMethod.service.TipoMusica;

public class CategoriaAudio {

    public Musica criarMusica(TipoMusica tipoMusica) {

        switch (tipoMusica) {
            case CD:
                return new MusicaCd();
                
            case DIGITAL:
                return new MusicaDigital();

            case K7:
                return new MusicaFitaK7();
                
            case PENDRIVE:
                return new MusicaPenDrive();
                
            default:
                break;
        }

        return null;
    };
    
}
