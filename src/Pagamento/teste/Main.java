package Pagamento.teste;

import Pagamento.dominio.Compra;
import Pagamento.dominio.MetodoPagamento;
import Pagamento.dominio.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        MetodoPagamento metodo = MetodoPagamento.A_VISTA_DINHEIRO_PIX;
        Produto p1 = new Produto("ryzen 5600g", 800);
        while(op <=0 || op >4){
            System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
                    "\n" +
                    " 2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
                    "\n" +
                    " 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
                    "\n" +
                    " 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
            Scanner scan = new Scanner(System.in);
            int operacao = scan.nextInt();
            switch (operacao){
                case 1:
                    metodo = MetodoPagamento.A_VISTA_DINHEIRO_PIX;
                    op = operacao;
                    break;
                case 2:
                    metodo = MetodoPagamento.A_VISTA_CREDITO;
                    op = operacao;
                    break;
                case 3:
                    metodo = MetodoPagamento.PARCELADO_CARTAO_2X;
                    op = operacao;
                    break;
                case 4:
                    metodo = MetodoPagamento.PARCELADO_CARTAO_3X;
                    op = operacao;
                    break;
                default:
                    System.out.println("Nao foi inserido um número válido, tente novamente");
                    op = operacao;
            }

        }
        Compra compra = new Compra(p1, metodo);
        System.out.println(compra);

    }
}
