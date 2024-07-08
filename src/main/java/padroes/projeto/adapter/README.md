# Padrão de Projeto Adapter

Se trata de um padrão de projeto que busca adaptar classes diferentes para que funcionem juntas através de uma única interface. Normalmente utilziado quando as classes que se deseja adaptar não podem ser alterados, ou modificadas.

## Atividade Proposta

Inicialmente, você deve implementar o Padrão de Projeto Adapter no código do pacote padroes.projeto.adapter.
Complete o código de forma que os adaptadores das tomadas de
três e dois pinos funcionem com o benjamin universal.
Ao finalizar, faça um commit cuja mensagem explique exatamente o que você fez.

### Abordagem da resolução

1. Entendimento do código atual.
    - Entender as classes e interfaces existentes, assim como seus métodos.

2. Implementação da Interface Tomada nos Adaptadores.
    - Construção de métodos de chamada.

3. Verificação da classe BenajminUniversal.
    - Entender a chamada do método Inicializar();

4. Adaptar a classe BenjaminUniversal para trabalhar com ambas as tomadas.
    - Percebesse, que o metodo inicializar(Tomada tomada), recebe como parametro um objeto do tipo Tomada, como as classes TomadaDoisPinos e TomadaTresPinos não extendem ou implmentam uma classe/interface Tomada, foi necessário adaptar o método para que funcionasse com ambos os casos. Para isso, foi utilizado a sobrecarga de métodos.

5. Uma vez, com tudo implementado, foi necessário testar, para verificar se o código é funcional.
    - Implementação da Classe Main, apenas para testar a chamada dos métodos.

# Referências

- Slides da aula
- [Blog Desenvolvimento Web](https://www.thiengo.com.br/padrao-de-projeto-adapter)
