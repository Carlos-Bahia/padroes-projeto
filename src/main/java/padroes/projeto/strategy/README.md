# Padrão de Projeto Strategy

O padrão de projeto Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. Esse padrão permite que o algoritmo varie independentemente dos clientes que o utilizam.

## Atividade Proposta

Implemente,
seguindo os conceitos do Strategy, uma abordagem para calcular o custo de envio padrão e o custo de envio econômico.
O cálculo do custo de envio padrão é realizado pelo peso multiplicado por 0,05.
Por outro lado, o cálculo do custo de envio econômico é realizado pelo peso multiplicado por 0,03.
O método EnvioExpresso.calcularCustoEnvio(double) exemplifica como esse cálculo deve ser feito.
Ao finalizar, faça um commit cuja mensagem explique exatamente o que você fez.

### Abordagem da resolução

1. Entendimento do código atual.
    - Entender as classes e interfaces existentes, assim como seus métodos.

2. Implementar as classes necessárias.
    - EnvioEconomico = Implementação da classe e do método calcularCustoEnvio seguindo as regras de negocio.
    - EnvioPadrao = Implementação da classe e do método calcularCustoEnvio seguindo as regras de negocio.

3. Uma vez implementado, é necessário testar seu funcionamento, para isso, ajustamos a main para considerar essa situação.
    - Chamada do método setStrategy passando as novas Estrategias de calculo de custo, e impressao na tela do usuário.

# Referências

- Slides da aula
- [Softplan](https://www.softplan.com.br/tech-writers/descomplicando-o-strategy/#:~:text=O%20que%20é%20o%20Padrão,e%20então%20torná-los%20intercambiáveis.)
