package strategy;

public class DefaultStrategyImpl implements Strategy {
    @Override
    public void apply() {
        System.out.println("===================================");
        System.out.println("=========== Default Strategy ============");
        System.out.println("*******************************************");
    }
}
