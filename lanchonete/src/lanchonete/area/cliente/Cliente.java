package lanchonete.area.cliente;

public class Cliente {
public void escolherLanche(){
    System.out.println("Esccolhendo o lanche");
}
    public void fazerPedido(){
        System.out.println("Fazendo o Pedido");
    }

    public void pagarConta(){
        consultarSaldoAplicativo();
    System.out.println("Pagando a Conta");
    }

    public void consultarSaldoAplicativo(){
        System.out.println(" Consultando saldo no aplicativo");
    }

    // Esse métod não deveria nem existir então pode apagar
//    public void pegarPedidoBalcao(){
//        System.out.println("Pegando o Pedido no Balcao");
//    }
}
