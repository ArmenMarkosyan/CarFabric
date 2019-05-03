package com.aca;

import com.aca.carfabric.CarFabric;
import com.aca.carfabric.CarFabricType;

public class Main {
    public static void main(String[] args) {
        // Create fabric with given interface type
        CarFabric carFabric = new CarFabric(CarFabricType.COMMAND_LINE);

        // Start the game
        carFabric.start();
    }
}
