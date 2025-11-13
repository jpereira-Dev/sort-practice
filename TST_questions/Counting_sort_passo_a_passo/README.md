# Counting Sort Passo a Passo

## Descrição
Ordene um array de inteiros cujos valores estão no intervalo [0..k] utilizando o Counting Sort.

## Entrada
Seu programa deve ler da entrada duas linhas:
- **Linha 1:** sequência de inteiros separados por espaço
- **Linha 2:** k (o maior elemento do array)

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
3 1 1 6 4 7
7
```

**Saída:**
```
0 0 0 1 0 0 0 0
0 1 0 1 0 0 0 0
0 2 0 1 0 0 0 0
0 2 0 1 0 0 1 0
0 2 0 1 1 0 1 0
0 2 0 1 1 0 1 1
Cumulativa do vetor de contagem - 0 2 2 3 4 4 5 6
0 0 2 2 3 4 4 5
1 1 3 4 6 7
```

---

### Exemplo 2

**Entrada:**
```
2 2 4 3 2 1 5
5
```

**Saída:**
```
0 0 1 0 0 0
0 0 2 0 0 0
0 0 2 0 1 0
0 0 2 1 1 0
0 0 3 1 1 0
0 1 3 1 1 0
0 1 3 1 1 1
Cumulativa do vetor de contagem - 0 1 4 5 6 7
0 0 1 4 5 6
1 2 2 2 3 4 5
```

---

## Observações e Restrições

- Não pode usar Collections (ArrayList, LinkedList, etc)
- Não pode usar métodos do Collections framework (Arrays.sort, etc)
- A implementação deve ser baseada em arrays

---


