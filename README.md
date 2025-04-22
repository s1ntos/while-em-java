# 🧠 Dicas Essenciais para Resolver Questões com `while` em Java

## ✅ 1. Tenha uma condição clara de parada

➤ Antes de escrever `while`, pergunte:

- Quando esse loop deve parar?
- O que precisa acontecer para ele sair?

📌 Exemplo:

```java```

while (senha != senhaCorreta) {

    // Repete até que a senha esteja certa
}

## ✅ 2. Evite laço infinito sem querer
➤ Sempre garanta que alguma variável da condição vai mudar dentro do while.

🛑 ERRADO:

java
Sempre exibir os detalhes

Copiar
int x = 0;
while (x < 5) {
    System.out.println(x); // loop infinito se esquecer do x++
}
✅ CERTO:

java
Sempre exibir os detalhes

Copiar
int x = 0;
while (x < 5) {
    System.out.println(x);
    x++; // agora x vai crescer e sair do while
}

## ✅ 3. Inicie variáveis fora do while
Variáveis que fazem parte da condição devem ser declaradas antes do loop.

📌 Exemplo:

java
Sempre exibir os detalhes

Copiar
int tentativa = 0;
while (tentativa < 3) {
    tentativa++;
}

## ✅ 4. Use o Scanner com cuidado
Quando alternar entre nextLine() e nextInt() ou next(), pode acontecer de "pular" inputs por causa do Enter (newline).

📌 Dica: use um sc.nextLine() extra após um nextInt() quando for ler strings depois.

## ✅ 5. Evite criar variáveis repetidas dentro do while
Senão você perde o valor delas a cada repetição.

🛑 ERRADO:

java
Sempre exibir os detalhes

Copiar
while (true) {
    int senha = sc.nextInt(); // redefinida sempre aqui
}
✅ CERTO:

java
Sempre exibir os detalhes

Copiar
int senha;
while (true) {
    senha = sc.nextInt(); // mesma variável, só atualiza
}

## ✅ 6. Use contadores quando precisar de limite
Quando quiser limitar tentativas, rodadas, etc., use um contador.

📌 Exemplo:

java
Sempre exibir os detalhes

Copiar
int tentativas = 0;
while (tentativas < 3) {
    tentativas++;
}

## ✅ 7. Use break se necessário
Para sair do while no meio, você pode usar break.

📌 Exemplo:

java
Sempre exibir os detalhes

Copiar
while (true) {
    int opcao = sc.nextInt();
    if (opcao == 3) {
        break; // encerra o loop
    }
}

## ✅ 8. Valide entradas do usuário
Use while para obrigar o usuário a digitar um valor válido.

📌 Exemplo:

java
Sempre exibir os detalhes

Copiar
int idade = -1;
while (idade < 0) {
    System.out.print("Digite uma idade válida: ");
    idade = sc.nextInt();
}

## ✅ 9. Simule menus e repetições com while externo
Muito útil para sistemas interativos, como menus de opções ou joguinhos.

## ✅ 10. Leia o enunciado e pense em “repetição + condição”
Sempre que a questão pedir algo como:

"até que"

"enquanto"

"repita até"

"pergunte várias vezes"

🚨 Pense: isso é um while!
