package padroes.projeto.strategy;

public class EnvioPadrao extends StrategyCalculoCustoEnvio{
    public double calcularCustoEnvio(double peso) {
        // Simula o cálculo do custo de envio padrao
        return peso * 0.05; // Exemplo simples: custo baseado apenas no peso
    }
}
