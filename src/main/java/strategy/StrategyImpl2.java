package strategy;

public class StrategyImpl2 implements Strategy {
    @Override
    public void apply() {
        System.out.println("================================");
        System.out.println("............ Strategy 2 ........");
        System.out.println("================================");
    }
}
