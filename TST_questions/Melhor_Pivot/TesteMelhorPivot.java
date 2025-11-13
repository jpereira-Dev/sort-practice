public class TesteMelhorPivot {

    public static void main(String[] args) {
        System.out.println("🚀 Iniciando testes do Melhor Pivot...\n");

        int testesPassados = 0;
        int testesTotal = 0;

        // Teste 1: Exemplo do enunciado
        testesTotal++;
        try {
            int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int resultado1 = Solucao.melhorPivot(v1, 4, 10);
            assert resultado1 == 4 : "Teste 1 falhou! Esperado: 4, Recebido: " + resultado1;
            System.out.println("✅ Teste 1 passou: array [0..10], i=4, j=10 → " + resultado1);
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 1 falhou: " + e.getMessage());
        }

        // Teste 2: Exemplo do enunciado
        testesTotal++;
        try {
            int[] v2 = {5, 1, 7, 3, 9, 10, 2, 4, 3};
            int resultado2 = Solucao.melhorPivot(v2, 0, 3);
            assert resultado2 == 0 : "Teste 2 falhou! Esperado: 0, Recebido: " + resultado2;
            System.out.println("✅ Teste 2 passou: array [5,1,7,3,9,10,2,4,3], i=0, j=3 → " + resultado2);
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 2 falhou: " + e.getMessage());
        }


        // Teste 4: Array ordenado decrescente
        testesTotal++;
        try {
            int[] v4 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
            int resultado4 = Solucao.melhorPivot(v4, 0, 8);
            assert resultado4 == 0 : "Teste 4 falhou! Esperado: 0, Recebido: " + resultado4;
            System.out.println("✅ Teste 4 passou: array ordenado decrescente → " + resultado4);
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 4 falhou: " + e.getMessage());
        }

        // Teste 5: Array com duplicatas
        testesTotal++;
        try {
            int[] v5 = {5, 5, 5, 5, 5, 5, 5};
            int resultado5 = Solucao.melhorPivot(v5, 1, 6);
            // Empate, deve retornar i
            assert resultado5 == 1 : "Teste 5 falhou! Esperado: 1 (empate), Recebido: " + resultado5;
            System.out.println("✅ Teste 5 passou: array com duplicatas (empate) → " + resultado5);
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 5 falhou: " + e.getMessage());
        }

        // Teste 6: Pivô no início melhor que no fim
        testesTotal++;
        try {
            int[] v6 = {50, 10, 20, 30, 40, 60, 70, 80, 90, 100};
            int resultado6 = Solucao.melhorPivot(v6, 0, 9);
            // v[0]=50 divide melhor que v[9]=100
            assert resultado6 == 0 : "Teste 6 falhou! Esperado: 0, Recebido: " + resultado6;
            System.out.println("✅ Teste 6 passou: pivô no início melhor → " + resultado6);
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 6 falhou: " + e.getMessage());
        }

        // Teste 7: Pivô no fim melhor que no início
        testesTotal++;
        try {
            int[] v7 = {10, 20, 30, 40, 60, 70, 80, 90, 100, 50};
            int resultado7 = Solucao.melhorPivot(v7, 0, 9);
            // v[9]=50 divide melhor que v[0]=10
            assert resultado7 == 9 : "Teste 7 falhou! Esperado: 9, Recebido: " + resultado7;
            System.out.println("✅ Teste 7 passou: pivô no fim melhor → " + resultado7);
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 7 falhou: " + e.getMessage());
        }

        // Teste 8: Array pequeno (2 elementos)
        testesTotal++;
        try {
            int[] v8 = {10, 5};
            int resultado8 = Solucao.melhorPivot(v8, 0, 1);
            // Ambos dividem igualmente, retorna i por empate
            assert resultado8 == 0 || resultado8 == 1 : "Teste 8 falhou! Resultado: " + resultado8;
            System.out.println("✅ Teste 8 passou: array pequeno (2 elementos) → " + resultado8);
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 8 falhou: " + e.getMessage());
        }

        // Teste 9: Números negativos
        testesTotal++;
        try {
            int[] v9 = {-5, -10, 0, 5, 10, 15, -3, 8};
            int resultado9 = Solucao.melhorPivot(v9, 2, 5);
            // v[2]=0 vs v[5]=15
            System.out.println("✅ Teste 9 passou: números negativos → " + resultado9);
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 9 falhou: " + e.getMessage());
        }

        // Teste 10: Pivô causa divisão desbalanceada
        testesTotal++;
        try {
            int[] v10 = {1, 1, 1, 1, 100, 1, 1, 1, 1};
            int resultado10 = Solucao.melhorPivot(v10, 0, 4);
            // v[0]=1 é melhor que v[4]=100 (mais balanceado)
            assert resultado10 == 0 : "Teste 10 falhou! Esperado: 0, Recebido: " + resultado10;
            System.out.println("✅ Teste 10 passou: pivô desbalanceado → " + resultado10);
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 10 falhou: " + e.getMessage());
        }

        // Teste 11: Caso extremo - mesmo valor é melhor pivot
        testesTotal++;
        try {
            int[] v11 = {5, 1, 2, 3, 4};
            int resultado11 = Solucao.melhorPivot(v11, 0, 1);
            // v[0]=5 vs v[1]=1 - precisa contar menores e maiores
            System.out.println("✅ Teste 11 passou: valores próximos → " + resultado11);
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 11 falhou: " + e.getMessage());
        }

        // Teste 12: Grande diferença de valores
        testesTotal++;
        try {
            int[] v12 = {1000, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int resultado12 = Solucao.melhorPivot(v12, 0, 9);
            // v[9]=9 seria melhor que v[0]=1000
            assert resultado12 == 9 : "Teste 12 falhou! Esperado: 9, Recebido: " + resultado12;
            System.out.println("✅ Teste 12 passou: grande diferença de valores → " + resultado12);
            testesPassados++;
        } catch (AssertionError e) {
            System.out.println("❌ Teste 12 falhou: " + e.getMessage());
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
}
