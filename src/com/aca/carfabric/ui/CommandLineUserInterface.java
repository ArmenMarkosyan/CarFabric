package com.aca.carfabric.ui;

import com.aca.carfabric.input.parameters.*;

import java.util.Scanner;

/**
 * This class asks for user input.
 */
public class CommandLineUserInterface extends UserInterface {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void output(String message) {
        System.out.println(message);
    }

    /*public Parameter getParameter() {
        String string = scanner.nextLine();
        for (Parameter parameter : Parameter.values()) {
            if (parameter.toString().equals(string))
                return parameter;
        }
        return null;
    }*/

    @Override
    public Color getColor() {
        String string = scanner.nextLine();
        for (Color color : Color.values()) {
            if (color.toString().equals(string))
                return color;
        }
        return null;
    }

    @Override
    public Type getType() {
        String string = scanner.nextLine();
        for (Type type : Type.values()) {
            if (type.toString().equals(string))
                return type;
        }
        return null;
    }

    @Override
    public Engine getEngine() {
        String string = scanner.nextLine();
        for (Engine engine : Engine.values()) {
            if (engine.toString().equals(string))
                return engine;
        }
        return null;
    }

    @Override
    public Model getModel() {
        String string = scanner.nextLine();
        for (Model model : Model.values()) {
            if (model.toString().equals(string))
                return model;
        }
        return null;
    }

    @Override
    public Wheels getWheels() {
        String string = scanner.nextLine();
        for (Wheels wheels : Wheels.values()) {
            if (wheels.toString().equals(string))
                return wheels;
        }
        return null;
    }
}
