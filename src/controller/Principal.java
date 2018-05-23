package controller;

import model.JAGM;
import model.JGrafo;

/**
 *
 * @author gabrieldutra, rubiotorres, MarceloFCandido
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        final int A = 0;
        final int B = 1;
        final int C = 2;
        final int D = 3;
        final int E = 4;
        final int F = 5;
        final int G = 6;
        final int H = 7;
        final int K = 8;

        JGrafo grafo1 = new JGrafo(9, false);
        grafo1.insereAresta(F, G, 15);
        grafo1.insereAresta(F, B, 5);
        grafo1.insereAresta(G, A, 10);
        grafo1.insereAresta(A, B, 5);
        grafo1.insereAresta(G, D, 10);
        grafo1.insereAresta(G, C, 5);
        grafo1.insereAresta(A, D, 10);
        grafo1.insereAresta(A, H, 10);
        grafo1.insereAresta(B, H, 5);
        grafo1.insereAresta(B, K, 10);
        grafo1.insereAresta(C, D, 5);
        grafo1.insereAresta(D, E, 5);
        grafo1.insereAresta(A, E, 5);
        grafo1.insereAresta(H, K, 20);
        grafo1.insereAresta(C, E, 10);
        grafo1.insereAresta(E, K, 10);

        grafo1.imprime();
        System.out.println("\n\t----- AGM -----\n");
        JAGM agm1 = new JAGM(grafo1);
        agm1.obterAgm(0);
        agm1.imprime();

        JGrafo grafo2 = new JGrafo(8, false);
        grafo2.insereAresta(1, 0, 8);
        grafo2.insereAresta(1, 2, 3);
        grafo2.insereAresta(1, 3, 2);
        grafo2.insereAresta(1, 4, 7);
        grafo2.insereAresta(1, 5, 5);
        grafo2.insereAresta(1, 7, 6);
        grafo2.insereAresta(0, 2, 2);
        grafo2.insereAresta(2, 3, 9);
        grafo2.insereAresta(3, 4, 6);
        grafo2.insereAresta(4, 5, 5);
        grafo2.insereAresta(5, 7, 4);
        grafo2.insereAresta(0, 6, 9);
        grafo2.insereAresta(2, 6, 6);
        grafo2.insereAresta(3, 6, 2);
        grafo2.insereAresta(4, 6, 4);
        grafo2.insereAresta(5, 6, 6);
        grafo2.insereAresta(7, 6, 3);

        grafo2.imprime();
        System.out.println("\n\t----- AGM -----\n");
        JAGM agm2 = new JAGM(grafo2);
        agm2.obterAgm(1);
        agm2.imprime();

    }
}
