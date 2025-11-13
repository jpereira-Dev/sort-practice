# Counting Sort Passo a Passo (Para Números Negativos)

## Descrição
Ordene um array de inteiros positivos e negativos utilizando o Counting Sort.

## Entrada
Seu programa deve ler da entrada três linhas:
- **Linha 1:** sequência de inteiros separados por espaço
- **Linha 2:** k (o maior elemento do array)
- **Linha 3:** menor elemento do array (sempre negativo)

## Saída
Seu programa deve imprimir o status do vetor de contagem em diversos momentos:
1. Imprimir o conteúdo do array de contagem a cada modificação durante o cálculo da frequência
2. Imprimir a frase `"Cumulativa do vetor de contagem - "` seguida do vetor de contagem com a cumulativa
3. Imprimir o vetor de contagem ao fim da execução do algoritmo
4. Imprimir a sequência ordenada

## Exemplos de Execução

### Exemplo 1

**Entrada:**
```
3 1 1 6 4 -2 7
7
-2
```

**Saída:**
```
[0, 0, 0, 0, 0, 1, 0, 0, 0, 0]
[0, 0, 0, 1, 0, 1, 0, 0, 0, 0]
[0, 0, 0, 2, 0, 1, 0, 0, 0, 0]
[0, 0, 0, 2, 0, 1, 0, 0, 1, 0]
[0, 0, 0, 2, 0, 1, 1, 0, 1, 0]
[1, 0, 0, 2, 0, 1, 1, 0, 1, 0]
[1, 0, 0, 2, 0, 1, 1, 0, 1, 1]
Cumulativa do vetor de contagem - [1, 1, 1, 3, 3, 4, 5, 5, 6, 7]
[0, 1, 1, 1, 3, 3, 4, 5, 5, 6]
[-2, 1, 1, 3, 4, 6, 7]
```

---

### Exemplo 2

**Entrada:**
```
2 2 -4 9 3 2 1 5
9
-4
```

**Saída:**
```
[0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0]
[1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0]
[1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1]
[1, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 1]
[1, 0, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 1]
[1, 0, 0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 1]
[1, 0, 0, 0, 0, 1, 3, 1, 0, 1, 0, 0, 0, 1]
Cumulativa do vetor de contagem - [1, 1, 1, 1, 1, 2, 5, 6, 6, 7, 7, 7, 7, 8]
[0, 1, 1, 1, 1, 1, 2, 5, 6, 6, 7, 7, 7, 7]
[-4, 1, 2, 2, 2, 3, 5, 9]
```

---

## Observações e Restrições

- Arrays começam na posição 0
- Não pode usar Collections (ArrayList, LinkedList, etc)
- Não pode usar métodos do Collections framework (Arrays.sort, etc)
- A implementação deve ser baseada em arrays

---

