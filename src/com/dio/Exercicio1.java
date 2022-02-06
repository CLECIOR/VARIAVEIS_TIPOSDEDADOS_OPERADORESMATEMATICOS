package com.dio;
                            //Variaveis
public class Exercicio1 {

    public static void main(String[] args) {

        int i;
        // int i; não pode repetir
        int I; //case sensitive
        // int 1a; não pode iniciar com numero
        int _1a; // uso de uma não boa pratica
        //int &aq; //uso de uma não boa pratica

        i = 5;
        I = 10;
        _1a = 20;
        //&aq = 7;

        final int j = 10;
        //j = 15; o j ja contem um valor constante definido pelo "final"
        int asnr24678md;
        //int asnr246 78md; não pode haver espaço em nome de variavel
        //int asnr2&4678_md; //nao uma boa pratica
        //int asnr2&46%78_md; simbolo de % é reservado

        asnr24678md = 100;
        //asnr2&4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; não boa pratica
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; não boa pratica
        int QUANTIDADE_OPCOES = 25; //não boa pratica
        int qtdProd; //nome da variavel dificulta identificação da variavel

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        //System.out.println(&aq);

        System.out.println(j);
        System.out.println(asnr24678md);
        //System.out.println(asnr2&4678_md);


    }
}
