package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("Controlando a entrada dos itens");
    }

    private void controlarSaida(){
        System.out.println("Controlando a saida dos itens");

    }

    // DEFAULT FICA ACESSIVEL SOMENTE PARA PACOTES DO MESMO NÍVEL
   void entregarIngredientes(){
        System.out.println("EntregarIngredientes");
        // passa o controle parar aqui  que somente o cozinheiro tem acesso a entregar ingredientes
       // mas não tem noção de como é realizada o controle de saida!
        controlarSaida();
    }

    // DEFAULT FICA ACESSIVEL SOMENTE PARA PACOTES DO MESMO NÍVEL
    void trocarGas(){
        System.out.println(" ALMOXARIFE TROCANDO O GAS");
    }
}
