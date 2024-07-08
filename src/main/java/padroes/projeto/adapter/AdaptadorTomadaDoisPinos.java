package padroes.projeto.adapter;

public class AdaptadorTomadaDoisPinos implements Tomada{

    private TomadaDoisPinos tomada;

    public AdaptadorTomadaDoisPinos(TomadaDoisPinos tomada) {
        this.tomada = tomada;
    }

    public void ligarNaTomada() {
        tomada.ligarNaTomadaDoisPinos();
    }
}
