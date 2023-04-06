
import java.text.DecimalFormat;
public class DevolveTroco {

    public static String calculaTroco(double conta, double pago) {
        DecimalFormat formatador = new DecimalFormat("###,##0.00");
        if (pago < conta)
            return("\nPagamento insuficiente, faltam R$"+
                    formatador.format(conta - pago) +"\n\n");
        else {
            int nota[] = { 10, 5, 2, 1};
            int centavos[] = { 50, 25, 10, 5};

            String result;
            double troco;
            int i, vlr, ct;

            troco = pago - conta;
            result ="\nTroco = R$"+ formatador.format(troco) +"\n\n";

// definindo as notas do troco (parte inteira)
            vlr = (int)troco;
            i = 0;
            while (vlr != 0) {
                ct = vlr / nota[i]; // calculando a qtde de notas
                if (ct != 0) {
                    result = result + (ct +" nota(s) de R$"+ nota[i] +"\n");
                    vlr = vlr % nota[i]; // sobra
                }
                i = i + 1; // próxima nota
            }

            result = result +"\n";

// definindo os centavos do troco (parte fracionária)
            vlr = (int)Math.round((troco - (int)troco) * 100);
            i = 0;
            while (vlr != 0) {
                ct = vlr / centavos[i]; // calculando a qtde de moedas
                if (ct != 0) {
                    result = result + (ct +" moeda(s) de "+ centavos[i] +
                            " centavo(s)\n");
                    vlr = vlr % centavos[i]; // sobra
                }
                i = i + 1; // próximo centavo
            }

            return(result);
        }
    }



}

