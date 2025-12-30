package Mains;

import br.com.pratica.modelos.CarroModelo;

public class CarroMain {
    public static void main(String[] args) {
        CarroModelo meuCarro = new CarroModelo();

        meuCarro.representarModelo("Hummer");
        meuCarro.definirPreco(112595, 112495, 90000);
        meuCarro.definirTipoTracao("4x4");
        meuCarro.definirAno(2021);
        meuCarro.exibirInformacao();
        meuCarro.exibirDetalhesModelo();


    }
}
