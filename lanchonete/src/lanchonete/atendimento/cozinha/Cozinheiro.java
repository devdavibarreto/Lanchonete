package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    // PODE SER Default
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche Natural Hamburguer no balcao");
    }

    //Pode ser default
    public void  adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    // Pode ser de default (Bacana a ideia de uma função para acionar as outras)
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("Preparando Lanche tipo hamburguer");
    }

    private void prepararVitamina(){
        System.out.println("Preparando Vitamina");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private  void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO O PÃO,SALADA,OVO E CARNE");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionar fruta,leite e suco");
    }

    //So o cozinheiro precisa saber
   private void lavarIngredientes(){
        System.out.println("lavando Ingredientes");
    }

    private  void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }

    public void fritarIngredientesLanche(){
        System.out.println("Fritando a Carne E ovo Para o Hamburguer");
    }

    // Por ser default e não estar no mesmo nivel dentro do pacote e  não ser um trabalho do atendente
    // o cozinheiro perde esse "favor"
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();}

    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

}
