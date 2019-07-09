/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon;

import java.util.Scanner;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class Hackathon {

    static int vetor[];

    public static void printRes(int arr[], int size) {

        int count[] = new int[size];

        int i;

        System.out.println("repetido elemtnso");

        for (i = 0; i < size; i++) {
            if (count[arr[i]] == 1) {
                System.out.println(arr[i] + " ");
            } else {
                count[arr[i]]++;
            }
        }

    }

    public static void main(String[] args) {

//        int vetor[] = {2, 5, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 3, 5, 3, 6, 1, 7};
//
//        int vetor_tamanho = vetor.length;
//
//        printRes(vetor, vetor_tamanho);
        questao9();

    }

    public static void questao6() {

        int n, c, a, b;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        a = leia.nextInt();

        System.out.print("Digite o segundo número:");
        b = leia.nextInt();

        /**
         * Se o valor do primeiro número do intervalo for maior ou igual ao segundo, então, o sistema pede para o usuário inserir novamente outro valor, até que o segundo número seja maior que o
         * primeiro, visto que não pode um intervalo ser entre dois números iguais ou o segundo número menor que o primeiro.
         */
        while (a >= b) {
            System.out.println("Digite o segundo número maior que o primeiro:");
            b = leia.nextInt();
        }

        int i = 0;

        for (int k = a; k < b; k++) {

            for (c = 2; c <= k - 1; c++) {
                if (k % c == 0) {
                    break;
                }
            }
            if (c == k) {
                i++;
                System.out.println(k + " é primo");
            }
        }

        for (c = 2; c <= i - 1; c++) {
            if (i % c == 0) {
                break;
            }
        }

        System.out.println();
        if (c == i) {
            System.out.println(i + " é primo");
        }
    }

    /**
     * QUESTÃO 8
     */
    static int heap[] = new int[1000000];
    static int heapSize;

    static void Init() {
        heapSize = 0;
        heap[0] = -Integer.MAX_VALUE;
    }

    static void Insert(int element) {
        heapSize++;
        heap[heapSize] = element;

        int now = heapSize;
        while (heap[now / 2] > element) {
            heap[now] = heap[now / 2];
            now /= 2;
        }
        heap[now] = element;
    }

    static int DeleteMin() {

        int minElement, lastElement, child, now;

        minElement = heap[1];

        lastElement = heap[heapSize--];

        for (now = 1; now * 2 <= heapSize; now = child) {
            child = now * 2;
            if (child != heapSize && heap[child + 1] < heap[child]) {
                child++;
            }
            if (lastElement > heap[child]) {
                heap[now] = heap[child];
            } else {
                break;
            }
        }
        heap[now] = lastElement;
        return minElement;
    }

    /**
     * Sobre Heap
     */
    public static void questao8() {

        int number_of_elements;

        System.out.println("Enter no. of elements : ");

        Scanner leia = new Scanner(System.in);
        number_of_elements = leia.nextInt();

        int iter, element;

        Init();

        System.out.printf("Enter %d elements : \n", number_of_elements);

        Scanner leia2 = new Scanner(System.in);

        for (iter = 0; iter < number_of_elements; iter++) {

            element = leia2.nextInt();
            Insert(element);
        }

        System.out.printf("Heap ordernação : \n");

        for (iter = 0; iter < number_of_elements; iter++) {
            System.out.printf("%d ", DeleteMin());
        }

        System.out.println("\n");

    }

    public static void questao3() {
        //N=Número de figurinhas
        //C Espaços
        //M Figurinhas carimbadas
        int n, c, m;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número de figurinha: ");
        n = leia.nextInt();

        while (!(n >= 1) || !(n <= 100)) {
            System.out.println("Digite o número de figurinha: ");
            n = leia.nextInt();
            System.out.println();
        }

        System.out.println("Digite o número de figurinhas carimbada: ");
        c = leia.nextInt();
        while (!(c >= 1) || !(c <= (n / 2))) {
            System.out.println("Digite o número de espaços: ");
            c = leia.nextInt();
            System.out.println();
        }

        System.out.println("Digite o número de figurinhas compradas:");
        m = leia.nextInt();
        while (!(m >= 1) || !(c <= m)) {
            System.out.println("Digite o número de figurinhas compradas: ");
            c = leia.nextInt();
            System.out.println();
        }

        System.out.println(n + "--" + c + "--" + m);

    }

    public static void questao5() {

        int coMarjoritaria = 0;

        for (int k = 7; k <= 24; k++) {

            if ((7 % k) == 0) {
                System.out.println(k + "");
            }

            if ((24 % k) == 0) {
                System.out.println(k + "");
            }

        }
    }

    public static void questao07() {

        while (true) {

            int i = 0, n;

            Scanner leia = new Scanner(System.in);

            System.out.print("Escreva um número: ");

            n = leia.nextInt();

            for (int k = 1; k <= n; k++) {
                if (k <= 9) {
                    i++;
                } else {
                    i += 2;
                }
            }

            System.out.println("Exemplo de entrada: " + n);

            System.out.println("Exemplo de saída: " + i);
        }

    }

    public static void questao9() {

        int largura = 3, comprimento = 5, tipo1 = 0;

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a largura: ");
        largura = leia.nextInt();

        System.out.print("Digite o comprimento: ");
        comprimento = leia.nextInt();

        for (int i = 1, k = 0; i <= comprimento || i < comprimento; i++, k += 1) {

            tipo1 = k * (largura - 1) + (largura * i);
        }

        System.out.println("Tipo 1" + tipo1);
        System.out.println("Tipo 2" + (largura - 1) * 2 + (comprimento - 1) * 2);

    }

    public static int maxRepetido(int vetor[], int n, int k) {

        int i;

        for (i = 0; i < n; i++) {
            vetor[vetor[i] % k] += k;
        }

        int max = vetor[0], result = 0;

        for (i = 1; i < n; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
                result = i;
            }
        }

        return result;

    }

}
