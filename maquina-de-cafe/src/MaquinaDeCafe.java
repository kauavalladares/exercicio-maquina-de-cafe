
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

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class MaquinaDeCafe extends DevolveTroco {


    public static CardapioEnum selecionaProduto(String s) {
        s = s.toUpperCase();
        CardapioEnum resultado = null;
        switch (s) {
            case "A50" -> resultado = CardapioEnum.CAPPUCCINO;
            case "B40" -> resultado = CardapioEnum.VANILLA;
            case "A60" -> resultado = CardapioEnum.MOCACCINO;
            case "M20" -> resultado = CardapioEnum.CARIOCA;
            case "C10" -> resultado = CardapioEnum.CHOCOLATE_QUENTE;
        }
        out.println("A bebida escolhida foi:" + resultado.getNome());
        return resultado;
    }

    private static boolean validaTexto(String codProduto) {
    /*   List<String> codigos = new ArrayList<>();

       codigos.add("A50");
       codigos.add("B40");
       codigos.add("A60");
       codigos.add("M20");
       codigos.add("C10");

       return codigos.contains(codProduto.toUpperCase());
      */
        boolean resultado = !Arrays.asList("A50", "B40", "A60", "M20", "C10").contains(codProduto.toUpperCase());
        if (resultado){
            out.println("Código de produto inválido. ");
        }
        return resultado;
    }


    public static void MenuPrincipal() {


        out.println("Escolha a bebida de sua preferência: \n ");

        out.println("____________________________________________________________________________");

        out.println("| Código Produto |   Valor   |             Produto                         |");

        out.println(CardapioEnum.CAPPUCCINO.opacaoCardapio() + "       |");

        out.println(CardapioEnum.VANILLA.opacaoCardapio() + "         |");

        out.println(CardapioEnum.MOCACCINO.opacaoCardapio() + "       |");

        out.println(CardapioEnum.CARIOCA.opacaoCardapio() + "         |");

        out.println(CardapioEnum.CHOCOLATE_QUENTE.opacaoCardapio() + "|");

        out.println("|__________________________________________________________________________| \n");

    }


    public static void main(String[] args) {


        MenuPrincipal();
        Scanner sc = new Scanner(in);
        String codigodoproduto;

        do {
            out.println("Digite codigo do produto: ");
            codigodoproduto = sc.nextLine();
        } while (validaTexto(codigodoproduto));

        CardapioEnum bebida = selecionaProduto(codigodoproduto);

        double valorInserido;
        do {
            out.println("Insira o valor da bebida: " + bebida.getValor());
            valorInserido = sc.nextDouble();
        } while (valorInserido < bebida.getValor());



        out.println(calculaTroco(bebida.getValor(), valorInserido));
        out.println("Sua está bebida sendo preparada aguarde! \n");
        out.println("aqui está sua bebida: " + bebida + " ☕︎");


    }
}


