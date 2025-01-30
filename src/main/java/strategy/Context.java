package strategy;

public class Context {
    public Strategy strategy = new DefaultStrategyImpl();
    public void perform(){
        System.out.println("======= Debut de l'operation ============");
        System.out.println("********* Initialisation *************");
        strategy.apply();
        System.out.println("========= Nettoyage ===============");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
