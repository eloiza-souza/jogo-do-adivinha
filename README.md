# Jogo do Adivinha

## Descrição do Programa

O **Jogo do Adivinha** é um jogo interativo em que o jogador tenta adivinhar um número gerado aleatoriamente pelo sistema. O objetivo é acumular a maior pontuação possível, acertando ou chegando próximo ao número sorteado. O jogo oferece diferentes níveis de dificuldade e permite que o jogador encerre a partida a qualquer momento.

## Explicação do Funcionamento

O programa funciona da seguinte forma:

1. O jogador escolhe um nível de dificuldade:
    - **Fácil**: Números entre 1 e 10.
    - **Médio**: Números entre 1 e 50.
    - **Difícil**: Números entre 1 e 100.
    - 
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
```
* * * * * J O G O   D O   A D I V I N H A * * * * *

Bem vindo ao Jogo!

A qualquer momento que deseje encerrar o jogo e sair digite '0' (zero)

Escolha o nível de dificuldade desejado:
1 - Fácil
2 - Médio
3 - Difícil
Opção: 2
```
### **Primeira Rodada**
```
Digite um número inteiro entre 1 e 50 ou '0' para sair: 25
Que pena! O número sorteado era 30.
Pontuação total: 0
```
### **Segunda Rodada**
```
Digite um número inteiro entre 1 e 50 ou '0' para sair: 29
Quase lá! Você estava a 1 de distância do número sorteado. Fez 5 pontos.
Pontuação total: 5
```
### **Terceira Rodada**
```
Digite um número inteiro entre 1 e 50 ou '0' para sair: 30
Parabéns! Você acertou o número e ganhou 10 pontos!
Pontuação total: 15
```
### **Encerrando o Jogo**
```
Digite um número inteiro entre 1 e 50 ou '0' para sair: 0

Você alcançou 15 pontos!
Números acertados: [30]
Números errados: [25, 29]

Obrigado por jogar! Até a próxima!
```

### Boas Práticas 
- Certifique-se de digitar apenas números inteiros dentro do intervalo permitido. 
- Use o comando `0` para encerrar o jogo de forma segura e visualizar o resumo da partida.
- Divirta-se jogando o **Jogo do Adivinha**!

### Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou 
enviar pull requests para melhorias no código ou na documentação.
