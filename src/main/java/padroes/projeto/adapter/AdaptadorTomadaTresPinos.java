package padroes.projeto.adapter;

public class AdaptadorTomadaTresPinos implements Tomada{

    private TomadaTresPinos tomada;

    public AdaptadorTomadaTresPinos(TomadaTresPinos tomada) {
        this.tomada = tomada;
    }

    public void ligarNaTomada() {
        tomada.ligarNaTomadaTresPinos();
    }
}
