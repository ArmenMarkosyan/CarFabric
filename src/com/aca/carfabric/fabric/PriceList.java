package com.aca.carfabric.fabric;

import com.aca.carfabric.input.parameters.*;

import java.util.HashMap;
import java.util.Map;

class PriceList {

    static private Map<Model, Integer> model = new HashMap<>();
    static private Map<Color, Integer> color = new HashMap<>();
    static private Map<Type, Integer> type = new HashMap<>();
    static private Map<Wheels, Integer> wheels = new HashMap<>();
    static private Map<Engine, Integer> engine = new HashMap<>();

    static Map[] priceOfParam = {color, type, engine, model, wheels};

    static void setPrice() {
        color.put(Color.BLACK, 10);
        color.put(Color.BLUE, 20);
        color.put(Color.GREEN, 30);
        color.put(Color.RED, 40);
        color.put(Color.WHITE, 50);

        type.put(Type.BUSINESS, 10000);
        type.put(Type.ECOCAR, 2000);
        type.put(Type.SPORTCAR, 5000);

        engine.put(Engine.DIESEL, 10);
        engine.put(Engine.ELECTRICAL, 20);
        engine.put(Engine.HYBRID, 30);
        engine.put(Engine.PETROL, 40);

        model.put(Model.CROSSOVER, 1000);
        model.put(Model.HATCHBACK, 2000);
        model.put(Model.MOTORCYCLE, 3000);
        model.put(Model.SEDAN, 4000);
        model.put(Model.TRUCK, 5000);
        model.put(Model.TRACTOR, 6000);

        wheels.put(Wheels.ALL_WHEEL_DRIVE, 10000);
        wheels.put(Wheels.BACK_WHEEL_DRIVE, 2000);
        wheels.put(Wheels.FRONT_WHEEL_DRIVE, 5000);
    }
}
