package padroes.projeto.adapter;

public class Main {
    //Main para teste do Adapter
    public static void main(String[] args) {
        //Inicializar tomada de 2 pinos
        TomadaDoisPinos tomada2 = new TomadaDoisPinos();

        //Inicializar tomada de 3 pinos
        TomadaTresPinos tomada3 = new TomadaTresPinos();

        //Inicializar um Benjamin
        BenjaminUniversal benjamin = new BenjaminUniversal();

        //Teste da tomada de 2 pinos
        benjamin.inicializar(tomada2);

        //Teste da tomada de 3 pinos
        benjamin.inicializar(tomada3);

    }
}
