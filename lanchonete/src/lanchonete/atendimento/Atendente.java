package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa(){
        //...??
        pegarLancheCozinha();
        System.out.println("Servindo Mesa");
    }

   private void pegarLancheCozinha(){
        System.out.println("Pegando o Lanche na cozinha");
    }

    public void receberPagamento(){
        System.out.println("RECEBENDO PAGAMENTO");
    }

     void trocarGas(){
        System.out.println("ATENDENTE TROCANDO O GAS");
    }

    private void pegarPedidoBalcao(){
        System.out.println("Pegando o pedido no balcao");
    }
}
