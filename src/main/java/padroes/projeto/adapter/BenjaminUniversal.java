package padroes.projeto.adapter;

public class BenjaminUniversal {

    //sobrecarga de metodos para possibilitar o funcionamento do benjamin
    void inicializar(TomadaTresPinos tomada) {
        AdaptadorTomadaTresPinos adaptador = new AdaptadorTomadaTresPinos(tomada);
        adaptador.ligarNaTomada();
    }

    void inicializar(TomadaDoisPinos tomada) {
        AdaptadorTomadaDoisPinos adaptador = new AdaptadorTomadaDoisPinos(tomada);
        adaptador.ligarNaTomada();
    }
}