package com.enset;

import strategy.*;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Context context=new Context();
        Scanner scanner=new Scanner(System.in);
        Map<String, Strategy> strategyMap=new HashMap<>();
        strategyMap.put("st1", new StrategyImpl1());
        strategyMap.put("st2", new StrategyImpl2());
        strategyMap.put("st3", new StrategyImpl3());
        strategyMap.put("d", new DefaultStrategyImpl());

        while (true){
            System.out.println("Donner votre strategie:");
            String st=scanner.nextLine();
            Strategy strategy = strategyMap.get(st);
            context.setStrategy(strategy);
            context.perform();
        }

    }
}