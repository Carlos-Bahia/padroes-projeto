package padroes.projeto.strategy;

public class EnvioEconomico extends StrategyCalculoCustoEnvio{
    public double calcularCustoEnvio(double peso) {
        // Simula o cálculo do custo de envio economico
        return peso * 0.03; // Exemplo simples: custo baseado apenas no peso
    }
}
