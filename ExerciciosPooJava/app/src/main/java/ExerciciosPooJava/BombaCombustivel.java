package ExerciciosPooJava;

/*     public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tipo de combustivel");
        String tipoCombustivel = entrada.next();
        BombaCombustivel bomba = new BombaCombustivel(tipoCombustivel, 5000.00f);

        System.out.println("De qual forma deseja abastecer");
        System.out.println("1 - Informar R$");
        System.out.println("2 - Informar Quantidade de ros");

        int opcaoMenu = entrada.nextInt();

        switch (opcaoMenu) {
            case 1 -> {
                System.out.println("Quantos R$ voce deseja abastecer ?");
                float valorAbastecer = entrada.nextFloat();
                System.out.println("Abasteceu: ");
                System.out.println("Quantidade Total de " + bomba.abastecerPorValor(valorAbastecer, bomba.getTipoCombustivel()) + " Litros");
                System.out.println(" ");
                System.out.println(bomba.alterarValor("Gasolina", 5.85f));

            }
            case 2 -> {
                System.out.println("Quantos Litros voce deseja abastecer ?");
                int valorLtAbastecer = entrada.nextInt();
                System.out.println("Ok, Abastecer " + valorLtAbastecer + " Litros");
                System.out.println("Valor Total: " + bomba.abastecerPorLitro(valorLtAbastecer, bomba.getTipoCombustivel()) + " R$");
            }
            default -> {
                System.out.println("Opcao invalida");
                System.out.println("Programa Encerrado");
            }
        }

    }

 */
public class BombaCombustivel {

    private String tipoCombustivel;
    private float valorLitro;
    private float quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, float quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void alterarQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void alterarCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    //altera o valor do litro do combust�vel.
    public float alterarValor(String tipo, float valor) {
        switch (tipo) {
            case "Gasolina" ->
                this.valorLitro = valor;
            case "Alcool" ->
                this.valorLitro = valor;
            case "GNV" ->
                this.valorLitro = valor;
            case "Diesel" ->
                this.valorLitro = valor;
            default ->
                this.valorLitro = valor;
        }
        return this.valorLitro;
    }

    public float getValorCombustivel(String tipoCombustivel) {
        switch (tipoCombustivel) {
            case "Gasolina" ->
                this.valorLitro = 4.89f;
            case "Alcool" ->
                this.valorLitro = 2.98f;
            case "GNV" ->
                this.valorLitro = 1.98f;
            case "Diesel" ->
                this.valorLitro = 3.98f;
            default ->
                this.valorLitro = 0.0f;
        }
        return this.valorLitro;
    }

    public float abastecerPorValor(float valorParaAbastecer, String combustivel) {
        this.quantidadeCombustivel = valorParaAbastecer / getValorCombustivel(combustivel);
        return this.quantidadeCombustivel;
    }

    public float abastecerPorLitro(int litrosParaAbastecer, String combustivel) {
        this.quantidadeCombustivel = litrosParaAbastecer * getValorCombustivel(combustivel);
        return this.quantidadeCombustivel;
    }

}
/* 3. Crie uma classe para representar uma BombaCombustivel. A classe 
BombaCombustivel deve conter os seguintes atributos: tipo de combust�vel, 
valor por litro e quantidade de combust�vel. Al�m desses atributos a classes
deve conter os seguintes m�todos.

a. abastecerPorValor; //m�todo onde � informado o valor a ser aba   stecido e mostra a quantidade de litros que foi colocada no ve�culo
b. abastecerPorLitro; // m�todo onde � informado a quantidade em litros de combust�vel e mostra o valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combust�vel.
d. alterarCombustivel; //altera o tipo do combust�vel.
e. alterarQuantidadeCombustivel; //altera a quantidade de combust�vel restante na bomba.


Crie uma classe que contenha um m�todo main para testar sua classe BombaCombust�vel */
