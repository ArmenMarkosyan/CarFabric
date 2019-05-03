package com.aca.carfabric.fabric;

import com.aca.carfabric.input.parameters.Parameter;

import java.util.Map;

import static com.aca.carfabric.fabric.PriceList.priceOfParam;

public class Fabric {
    private int totalPrice;

    public Fabric(Parameter[] parameter) {
        PriceList.setPrice();

        System.out.print("\n\nYou have chosen ");
        for (Parameter p : parameter) {
            System.out.print(p + " ");
        }

        calcTotalPrice(parameter);

        System.out.println("\nWith the total price of : " + totalPrice + "$");
    }

    private void calcTotalPrice(Parameter[] parameter) {
        for (Parameter param : parameter) {
            for (Map price : priceOfParam) {
                if (price.containsKey(param)) {
                    totalPrice += (int) price.get(param);
                }
            }
        }
    }
}
