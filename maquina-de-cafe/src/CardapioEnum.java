import java.text.DecimalFormat;

public enum CardapioEnum {
    CAPPUCCINO("Cappucino","A50",4.50),
    VANILLA("Vanilla","B40",5.00),
    MOCACCINO("Mocaccino","A60",3.75),
    CARIOCA("Carioca","M20",2.20),
    CHOCOLATE_QUENTE("Chocolate quente","C10",8.40);

    private String nome;
    private String codigo;
    private double valor;

    CardapioEnum(String nome, String codigo, double valor){

        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;

    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }
    public String opacaoCardapio(){
        DecimalFormat df = new DecimalFormat("#.00");
        StringBuilder string = new StringBuilder();
        string.append("|      " + getCodigo() + "       " );
        string.append("|  R$ " + df.format(getValor()) + "  ");
        string.append("|             " + getNome() + "                ");

        return string.toString();
    }
    public String opcaoeEscolhida(){
        DecimalFormat df = new DecimalFormat("#.00");
        StringBuilder string = new StringBuilder();
        // "O produto escolhido foi Cappuccino. \n Insira R$ 4,50"
        string.append("O produto escolhido foi ");
        string.append(getNome());
        string.append(". \n Insira R$ ");
        string.append(df.format(getValor()));

        return string.toString();
    }

}
