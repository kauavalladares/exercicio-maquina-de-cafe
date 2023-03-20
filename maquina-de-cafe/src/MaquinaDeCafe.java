
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

public  class MaquinaDeCafe {


     public static void selecionaProduto(String s ) {
     switch (s) {

          case "a50": System.out.println("O produto escolhido foi Cappuccino. \n Insira R$ 4,50");
          break;

          case "b40": System.out.println("O produto escolhido foi Vanilla. \n Insira R$ 5,00");
          break;

         case "a60": System.out.println("O produto escolhido Mocaccino. \n Insira R$ 3,75");
         break;

         case "m20": System.out.println("O produto escolhido Carioca. \n Insira R$ 2,20");
         break;

         case "c10": System.out.println("O produto escolhido Chocolate quente. \n Insira R$ 8,40");
         break;

         case "0": System.out.println("Finalizando ...");
         break;
         
      default:System.out.println("Código de produto inválido. \n Digite novamente ou digite 0 para sair.  ");
          Scanner sc = new Scanner(System.in);
          String Codigodoproduto = sc.next();
          selecionaProduto(Codigodoproduto);

     }




}


 public static void MenuPrincipal() {


      System.out.println("Escolha a bebida de sua preferência: \n ");

      System.out.println("_____________________________________________________________________");

      System.out.println("| Código Produto |             Produto                  |   Valor   |");

      System.out.println("|      A50       |            Cappuccino                |  R$ 4,50  |");

      System.out.println("|      B40       |             Vanilla                  |  R$ 5,00  |");

      System.out.println("|      A60       |            Mocaccino                 |  R$ 3,75  |");

      System.out.println("|      M20       |             Carioca                  |  R$ 2,20  |");

      System.out.println("|      C10       |         Chocolate quente             |  R$ 8,40  |");

      System.out.println("|___________________________________________________________________| \n");

     }

     public static void main(String[] args) {



      MenuPrincipal();
          Scanner sc = new Scanner(System.in);
          System.out.println("Digite codigo do produto: ");
          String Codigodoproduto = sc.next();
          selecionaProduto(Codigodoproduto);

          Scanner scv = new Scanner(System.in);
          String valorInserido = String.valueOf(scv.next());





     }
}
