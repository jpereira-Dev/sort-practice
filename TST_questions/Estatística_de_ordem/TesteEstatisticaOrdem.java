public class TesteEstatisticaOrdem {

    public static void main(String[] args) {
        System.out.println("🚀 Iniciando testes de Estatística de Ordem...\n");

        int testesPassados = 0;
        int testesTotal = 0;

        // Teste 1: Exemplo do enunciado
        testesTotal++;
        try {
            int[] v1 = {4, 5, 9, 1, 2, 6, 8};
            int resultado1 = Solucao.estatisticaOrdem(v1);
            assert resultado1 == 3 : "Teste 1 falhou! Esperado: 3, Recebido: " + resultado1;
            verificarParticao(v1, 0, resultado1 - 1);
            System.out.println("✅ Teste 1 passou: [4,5,9,1,2,6,8] → estatística = 3");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 1 falhou: " + e.getMessage());
        }

        // Teste 2: Exemplo do enunciado
        testesTotal++;
        try {
            int[] v2 = {6, 2, 1, 9, 3};
            int resultado2 = Solucao.estatisticaOrdem(v2);
            assert resultado2 == 4 : "Teste 2 falhou! Esperado: 4, Recebido: " + resultado2;
            verificarParticao(v2, 0, resultado2 - 1);
            System.out.println("✅ Teste 2 passou: [6,2,1,9,3] → estatística = 4");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 2 falhou: " + e.getMessage());
        }

        // Teste 3: Primeiro elemento é o menor
        testesTotal++;
        try {
            int[] v3 = {1, 5, 3, 8, 2, 9, 4};
            int resultado3 = Solucao.estatisticaOrdem(v3);
            assert resultado3 == 1 : "Teste 3 falhou! Esperado: 1, Recebido: " + resultado3;
            verificarParticao(v3, 0, resultado3 - 1);
            System.out.println("✅ Teste 3 passou: primeiro elemento é o menor → estatística = 1");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 3 falhou: " + e.getMessage());
        }

        // Teste 4: Primeiro elemento é o maior
        testesTotal++;
        try {
            int[] v4 = {10, 2, 5, 1, 8, 3, 6};
            int resultado4 = Solucao.estatisticaOrdem(v4);
            assert resultado4 == 7 : "Teste 4 falhou! Esperado: 7, Recebido: " + resultado4;
            verificarParticao(v4, 0, resultado4 - 1);
            System.out.println("✅ Teste 4 passou: primeiro elemento é o maior → estatística = 7");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 4 falhou: " + e.getMessage());
        }

        // Teste 5: Primeiro elemento é a mediana
        testesTotal++;
        try {
            int[] v5 = {5, 1, 2, 9, 8, 3, 7};
            int resultado5 = Solucao.estatisticaOrdem(v5);
            assert resultado5 == 4 : "Teste 5 falhou! Esperado: 4, Recebido: " + resultado5;
            verificarParticao(v5, 0, resultado5 - 1);
            System.out.println("✅ Teste 5 passou: primeiro elemento é mediana → estatística = 4");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 5 falhou: " + e.getMessage());
        }

        // Teste 6: Array pequeno (2 elementos)
        testesTotal++;
        try {
            int[] v6 = {5, 3};
            int resultado6 = Solucao.estatisticaOrdem(v6);
            assert resultado6 == 2 : "Teste 6 falhou! Esperado: 2, Recebido: " + resultado6;
            verificarParticao(v6, 0, resultado6 - 1);
            System.out.println("✅ Teste 6 passou: array com 2 elementos → estatística = 2");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 6 falhou: " + e.getMessage());
        }

        // Teste 7: Array pequeno (3 elementos)
        testesTotal++;
        try {
            int[] v7 = {2, 1, 3};
            int resultado7 = Solucao.estatisticaOrdem(v7);
            assert resultado7 == 2 : "Teste 7 falhou! Esperado: 2, Recebido: " + resultado7;
            verificarParticao(v7, 0, resultado7 - 1);
            System.out.println("✅ Teste 7 passou: array com 3 elementos → estatística = 2");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 7 falhou: " + e.getMessage());
        }

        // Teste 8: Array único elemento
        testesTotal++;
        try {
            int[] v8 = {42};
            int resultado8 = Solucao.estatisticaOrdem(v8);
            assert resultado8 == 1 : "Teste 8 falhou! Esperado: 1, Recebido: " + resultado8;
            System.out.println("✅ Teste 8 passou: array com 1 elemento → estatística = 1");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 8 falhou: " + e.getMessage());
        }

        // Teste 9: Array já está particionado
        testesTotal++;
        try {
            int[] v9 = {5, 1, 2, 3, 4, 6, 7, 8, 9};
            int resultado9 = Solucao.estatisticaOrdem(v9);
            assert resultado9 == 5 : "Teste 9 falhou! Esperado: 5, Recebido: " + resultado9;
            verificarParticao(v9, 0, resultado9 - 1);
            System.out.println("✅ Teste 9 passou: array já particionado → estatística = 5");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 9 falhou: " + e.getMessage());
        }

        // Teste 10: Array ordem decrescente
        testesTotal++;
        try {
            int[] v10 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            int resultado10 = Solucao.estatisticaOrdem(v10);
            assert resultado10 == 10 : "Teste 10 falhou! Esperado: 10, Recebido: " + resultado10;
            verificarParticao(v10, 0, resultado10 - 1);
            System.out.println("✅ Teste 10 passou: ordem decrescente → estatística = 10");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 10 falhou: " + e.getMessage());
        }

        // Teste 11: Array ordem crescente
        testesTotal++;
        try {
            int[] v11 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int resultado11 = Solucao.estatisticaOrdem(v11);
            assert resultado11 == 1 : "Teste 11 falhou! Esperado: 1, Recebido: " + resultado11;
            verificarParticao(v11, 0, resultado11 - 1);
            System.out.println("✅ Teste 11 passou: ordem crescente → estatística = 1");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 11 falhou: " + e.getMessage());
        }

        // Teste 12: Números negativos
        testesTotal++;
        try {
            int[] v12 = {-5, 10, -2, 8, 0, 3, -8, 6};
            int resultado12 = Solucao.estatisticaOrdem(v12);
            assert resultado12 == 2 : "Teste 12 falhou! Esperado: 4, Recebido: " + resultado12;
            verificarParticao(v12, 0, resultado12 - 1);
            System.out.println("✅ Teste 12 passou: números negativos → estatística = 4");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 12 falhou: " + e.getMessage());
        }

        // Teste 13: Array grande
        testesTotal++;
        try {
            int[] v13 = {50, 20, 70, 10, 90, 30, 80, 40, 60, 100, 5, 95, 15, 85, 25};
            int resultado13 = Solucao.estatisticaOrdem(v13);
            assert resultado13 == 8 : "Teste 13 falhou! Esperado: 8, Recebido: " + resultado13;
            verificarParticao(v13, 0, resultado13 - 1);
            System.out.println("✅ Teste 13 passou: array grande → estatística = 8");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 13 falhou: " + e.getMessage());
        }

        // Teste 14: Todos menores que o primeiro, exceto um
        testesTotal++;
        try {
            int[] v14 = {8, 1, 2, 3, 4, 5, 6, 7, 10};
            int resultado14 = Solucao.estatisticaOrdem(v14);
            assert resultado14 == 8 : "Teste 14 falhou! Esperado: 8, Recebido: " + resultado14;
            verificarParticao(v14, 0, resultado14 - 1);
            System.out.println("✅ Teste 14 passou: quase todos menores → estatística = 8");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 14 falhou: " + e.getMessage());
        }

        // Teste 15: Todos maiores que o primeiro, exceto um
        testesTotal++;
        try {
            int[] v15 = {3, 10, 20, 30, 40, 50, 60, 70, 1};
            int resultado15 = Solucao.estatisticaOrdem(v15);
            assert resultado15 == 2 : "Teste 15 falhou! Esperado: 2, Recebido: " + resultado15;
            verificarParticao(v15, 0, resultado15 - 1);
            System.out.println("✅ Teste 15 passou: quase todos maiores → estatística = 2");
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 15 falhou: " + e.getMessage());
        }

        // Resumo
        System.out.println("\n" + "=".repeat(50));
        System.out.println("📊 RESUMO: " + testesPassados + "/" + testesTotal + " testes passaram");

        if (testesPassados == testesTotal) {
            System.out.println("🎉 Todos os testes passaram! Parabéns!");
        } else {
            System.out.println("⚠️  Alguns testes falharam. Revise o código!");
        }
        System.out.println("=".repeat(50));
    }

    /**
     * Verifica se o array está corretamente particionado.
     * Após a partição, o primeiro elemento (pivô) deve estar na posição correta,
     * com todos os menores à esquerda e todos os maiores à direita.
     *
     * @param v array após a partição
     * @param inicio índice inicial da partição
     * @param posPivot posição do pivô após a partição (estatística de ordem - 1)
     */
    private static void verificarParticao(int[] v, int inicio, int posPivot) {
        if (posPivot < inicio || posPivot >= v.length) {
            return; // Caso base: array muito pequeno ou pivô fora dos limites
        }

        int pivot = v[posPivot];

        // Verifica se todos à esquerda são menores
        for (int i = inicio; i < posPivot; i++) {
            assert v[i] < pivot : "Erro na partição! v[" + i + "]=" + v[i] +
                                  " deveria ser < pivô=" + pivot;
        }

        // Verifica se todos à direita são maiores
        for (int i = posPivot + 1; i < v.length; i++) {
            assert v[i] > pivot : "Erro na partição! v[" + i + "]=" + v[i] +
                                  " deveria ser > pivô=" + pivot;
        }
    }
}
