
// MAQUINA DE CAFÉ Requisitos:
//
//        -A maquina deve possuir o seguinte cardápio:
//         • Cappuccino
//         valor: 4:50
//         code: A50
//
//         • Vanilla:
//         valor: 5:00
//         code: B40
//
//         • Mocaccino:
//         valor: 3:75
//         code: A60
//
//         • Carioca:
//         valor: 2:20
//         code: M20
//
//         • chocolate quente:
//         valor: 8:40
//         code: C10
//
//        - A máquina funciona na seguinte ordem:
//         Apresenta Menu
//         O usuário informa o código do produto
//         O usuário insere o dinheiro na máquina
//         O usuário Recebe o troco caso exista
//         Recebe o produto
//
//          - Apos a máquina entregar o produto, ela retorna para o menu inicial
//          - O troco deve ser devolvido na menor quantidade de notas e moedas possiveis
//
//         Exemplo:
//              troco de 7:70
//               1 nota de 5
//               1 nota de 2
//               1 moeda de 50
//               2 moedas de 10
//______________________________________________________________________________________________________________________

import java.util.Scanner;

import static java.lang.System.*;

public  class MaquinaDeCafe extends DevolveTroco {


    public boolean checaProdutovalido(String codproduto){
       codproduto  = codproduto.toUpperCase();


        return false;
    }
    public static String selecionaProduto(String s) {
         s = s.toUpperCase();
         switch (s) {
             case "A50" -> {
                 out.println(CardapioEnum.CAPPUCCINO.opcaoeEscolhida());
                 s = CardapioEnum.CAPPUCCINO.getNome();
             }
             case "B40" -> {
                 out.println(CardapioEnum.VANILLA.opcaoeEscolhida());
                 s = CardapioEnum.VANILLA.getNome();
             }
             case "A60" -> {
                 out.println(CardapioEnum.MOCACCINO.opcaoeEscolhida());
                 s = CardapioEnum.MOCACCINO.getNome();
             }
             case "M20" -> {
                 out.println(CardapioEnum.CARIOCA.opcaoeEscolhida());
                 s = CardapioEnum.CARIOCA.getNome();
             }
             case "C10" -> {
                 out.println(CardapioEnum.CHOCOLATE_QUENTE.opcaoeEscolhida());
                 s = CardapioEnum.CHOCOLATE_QUENTE.getNome();
             }
             case "0" -> {
                 out.println("Finalizando ...");
                 exit(0);
             }
             default -> {
                 out.println("Código de produto inválido. \n Digite novamente ou digite 0 para sair.  ");
                 Scanner sc = new Scanner(in);
                 s = sc.next();
                 selecionaProduto(s);
                 produto(s);
             }
         }


        return s;
    }

     public static double produto(String codproduto) {
         String prod = codproduto.toUpperCase();
         double valor = 0;

         if (prod.equals(CardapioEnum.CAPPUCCINO.getCodigo())) {
             valor = 4.50;
             return valor;
         }

         if (prod.equals(CardapioEnum.VANILLA.getCodigo())) {
             valor = 5.00;
             return valor;
         }

         if (prod.equals (CardapioEnum.MOCACCINO.getCodigo())) {
             valor = 3.75;
             return valor;
         }

         if (prod.equals (CardapioEnum.CARIOCA.getCodigo())) {
             valor = 2.20;
             return valor;
         }

         if (prod.equals (CardapioEnum.CHOCOLATE_QUENTE.getCodigo())) {
             valor = 8.40;
             return valor;
         }

         return valor;
     }




 public static void MenuPrincipal() {


      out.println("Escolha a bebida de sua preferência: \n ");

      out.println("____________________________________________________________________________");

      out.println("| Código Produto |   Valor   |             Produto                         |");

      out.println(CardapioEnum.CAPPUCCINO.opacaoCardapio() +"       |");

      out.println(CardapioEnum.VANILLA.opacaoCardapio()+"         |");

      out.println(CardapioEnum.MOCACCINO.opacaoCardapio()+"       |");

      out.println(CardapioEnum.CARIOCA.opacaoCardapio()+"         |");

      out.println(CardapioEnum.CHOCOLATE_QUENTE.opacaoCardapio()+"|");

      out.println("|__________________________________________________________________________| \n");

     }



     public static void main(String[] args) {


         MenuPrincipal();
         Scanner sc = new Scanner(in);
         out.println("Digite codigo do produto: ");
         String Codigodoproduto = sc.next();

         String bebida = selecionaProduto(Codigodoproduto);
         double preco = produto(bebida);


         Scanner scv = new Scanner(in);
         double valorInserido = scv.nextDouble();

        out.println(calculaTroco(preco,valorInserido));
        out.println("Sua está bebida sendo preparada aguarde! \n");
        out.println("aqui está sua bebida: " + bebida + " ☕︎");






     }
}

