# Encontrar Par com Soma Alvo

## Descrição
Dado um array de inteiros e um valor alvo, encontre se existem dois números no array cuja soma seja igual ao valor alvo. Use ordenação para resolver eficientemente.

## Entrada
- Linha 1: array de inteiros separados por espaço
- Linha 2: valor alvo (inteiro)

## Saída
- Se existe par: "SIM: a + b = alvo"
- Se não existe: "NAO"

## Exemplos

### Exemplo 1
**Entrada:**
```
2 7 11 15
9
```

**Saída:**
```
SIM: 2 + 7 = 9
```

### Exemplo 2
**Entrada:**
```
1 3 5 7
10
```

**Saída:**
```
NAO
```

### Exemplo 3
**Entrada:**
```
3 2 4
6
```

**Saída:**
```
SIM: 2 + 4 = 6
```

## Estratégia
1. Ordene o array em O(n log n)
2. Use dois ponteiros (início e fim) para buscar o par em O(n)
3. Complexidade total: O(n log n)

## Restrições
- Não pode usar o mesmo elemento duas vezes
- Deve usar ordenação
- Complexidade: O(n log n)
