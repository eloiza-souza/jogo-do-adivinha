# Jogo do Adivinha

## Descrição do Programa

O **Jogo do Adivinha** é um jogo interativo em que o jogador tenta adivinhar um número gerado aleatoriamente pelo sistema. O objetivo é acumular a maior pontuação possível, acertando ou chegando próximo ao número sorteado. O jogo oferece diferentes níveis de dificuldade e permite que o jogador encerre a partida a qualquer momento.

## Explicação do Funcionamento

O programa funciona da seguinte forma:

1. O jogador escolhe um nível de dificuldade:
    - **Fácil**: Números entre 1 e 10.
    - **Médio**: Números entre 1 e 50.
    - **Difícil**: Números entre 1 e 100.
2. O sistema sorteia um número dentro do intervalo correspondente ao nível escolhido.
3. O jogador tenta adivinhar o número sorteado:
    - **Acerto exato**: 10 pontos.
    - **Erro por 1 unidade de diferença**: 5 pontos.
    - **Erro maior**: 0 pontos.
4. O jogador pode digitar `0` a qualquer momento para encerrar o jogo.
5. Ao final, o programa exibe a pontuação total, os números acertados e os números errados.

O jogo utiliza listas para armazenar os números acertados e errados, e a pontuação é acumulada ao longo das rodadas.

## Instruções para Executar o Código

### Dependências Necessárias

- **Java Development Kit (JDK)**: Certifique-se de que o JDK (versão 8 ou superior) está instalado no seu sistema.
- **Editor de Código ou IDE**: Você pode usar qualquer editor de texto ou IDE, como IntelliJ IDEA, Eclipse ou VS Code.

### Passos para Execução

1. **Clone ou copie o código-fonte**:
    - Salve o código em um arquivo chamado `Main.java`.

2. **Compile o código**:
    - Abra o terminal ou prompt de comando.
    - Navegue até o diretório onde o arquivo `Main.java` está salvo.
    - Execute o comando:
      ```bash
      javac Main.java
      ```

3. **Execute o programa**:
    - Após a compilação, execute o comando:
      ```bash
      java Main
      ```

4. **Interaja com o jogo**:
    - Siga as instruções exibidas no terminal para jogar.

### Exemplo de Entrada e Saída

#### Exemplo 1:
**Entrada**: