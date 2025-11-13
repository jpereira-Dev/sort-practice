Estatística de Ordem

A i-ésima estatística de ordem de uma sequência de inteiros é o i-ésimo menor elemento dessa sequência.

Por exemplo, na sequência:

[4, 5, 9, 1, 2, 6, 8]


O número 4 é a terceira estatística de ordem, pois ele é o terceiro menor número da sequência.

🧩 Objetivo

Escreva um programa que imprime qual a estatística de ordem do primeiro elemento de uma sequência.

Embora os testes apenas verifiquem se o seu programa imprime a estatística de ordem do primeiro elemento, ao final da execução do seu algoritmo, o primeiro elemento deve dividir a sequência de tal forma que:

Os elementos menores que ele fiquem à esquerda, e

Os elementos maiores que ele fiquem à direita.

⚙️ Regras

Não é permitido ordenar o array.

Não é permitido usar coleções auxiliares.

A sequência não possui elementos repetidos.

🧠 Entrada e Saída
Exemplo 1
Entrada:
javac Solution.java ; java Solution
4 5 9 1 2 6 8

Saída esperada:
3

Exemplo 2
Entrada:
javac Solution.java ; java Solution
6 2 1 9 3

Saída esperada:
4

