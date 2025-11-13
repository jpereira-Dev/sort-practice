# Mesclar Intervalos

## Descrição
Dado um conjunto de intervalos, mescle todos os intervalos que se sobrepõem. Use ordenação para resolver eficientemente.

## Entrada
- Linha 1: número de intervalos N
- Próximas N linhas: dois inteiros representando início e fim de cada intervalo

## Saída
- Intervalos mesclados, um por linha

## Exemplos

### Exemplo 1
**Entrada:**
```
4
1 3
2 6
8 10
15 18
```

**Saída:**
```
1 6
8 10
15 18
```

**Explicação:** [1,3] e [2,6] se sobrepõem, então se mesclam em [1,6]

### Exemplo 2
**Entrada:**
```
2
1 4
4 5
```

**Saída:**
```
1 5
```

### Exemplo 3
**Entrada:**
```
3
1 10
2 3
4 5
```

**Saída:**
```
1 10
```

**Explicação:** Todos os intervalos estão dentro de [1,10]

## Estratégia
1. Ordene os intervalos pelo início em O(n log n)
2. Percorra mesclando intervalos sobrepostos em O(n)
3. Complexidade total: O(n log n)

## Restrições
- Intervalos podem se tocar (ex: [1,3] e [3,5] viram [1,5])
- Use ordenação
