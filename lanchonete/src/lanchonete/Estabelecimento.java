package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        // ações que não precisam estarem disponíveis para a aplicação
// So o cozinheiro precisa saber por isso todos virou PRIVATE
       // cozinheiro.lavarIngredientes();
        //cozinheiro.baterVitaminaLiquidificador();
        //cozinheiro.selecionarIngredientesVitamina();
       // cozinheiro.prepararLanche();
       // cozinheiro.prepararVitamina();


        // Ações que o estabelecimento precisa ter ciência

        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        // tipo      nome       criando e  chamando a classe
        // Sem necessidade de criação para todos do estabelecimento
       // Almoxarife almoxarife = new Almoxarife();

// ações que não precisam estarem disponíveis para toda a aplicação
        // Ñ precisa ter ciencia por isso é PRIVATE
       // almoxarife.controlarEntrada();
        // almoxarife.controlarSaida();


        // aões que somente o seu pacote cozinha precisa conhecer(default)

        // Por ser default agora pouca importa o estabelecimento saber como funciona
//        almoxarife.entregarIngredientes();
//        almoxarife.trocarGas();


        Atendente atendente = new Atendente();
        // passa a ser private
        //atendente.pegarLancheCozinha();

        atendente.receberPagamento();
        atendente.servindoMesa();

        //ação que somente o seu pacote cozinha precisa conhecer
        // Por ser default e não estar no mesmo nivel dentro do pacote e  não ser um trabalho do atendente
        // o cozinheiro perde esse "favor"
       // atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // não deveria, mas o estabelecimento
        // ainda nao definiu normas de atendimento
        //cliente.pegarPedidoBalcao();

        //esta ação é muito sigilosa,que tal ser privada ?
       // cliente.consultarSaldoAplicativo();

        // Já pensou os clientes ouvindo que o gás acabou

        // Por ser default e não estar no mesmo nivel dentro do pacote e  não ser um trabalho do atendente
        // o cozinheiro perde esse "favor"
        //cozinheiro.pedirParaTrocarGas(atendente);
       // cozinheiro.pedirIngredientes(almoxarife);


    }
}
