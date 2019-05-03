package com.aca.carfabric;

import com.aca.carfabric.fabric.Fabric;
import com.aca.carfabric.input.parameters.*;
import com.aca.carfabric.ui.CommandLineUserInterface;
import com.aca.carfabric.ui.GraphicalUserInterface;
import com.aca.carfabric.ui.UserInterface;

public class CarFabric {
    private UserInterface userInterface;
    private Model model;
    private Type type;
    private Wheels wheels;
    private Engine engine;
    private Color color;
    private Parameter[] parameter = {color, type, engine, model, wheels};

    public CarFabric(CarFabricType carFabricType) {
        switch (carFabricType) {
            case COMMAND_LINE:
                userInterface = new CommandLineUserInterface();
                break;
            case GRAPHICAL_UI:
                userInterface = new GraphicalUserInterface();
        }

        userInterface.output("\nThis is a Car Fabric.\nWe will create your car together!\n");
    }

    /**
     * Start the game.
     */
    public void start() {
        initialize();

        new Fabric(parameter);
    }

    /**
     * Initialize fabrication details based on user input.
     */
    private void initialize() {

        parameter[0] = initializeColor();

        parameter[1] = initializeType();

        parameter[2] = initializeEngine();

        parameter[3] = initializeModel();

        parameter[4] = initializeWheels();
    }

    /*private void initializeParameter(Parameter parameter) {
        userInterface.output("Please choose the Model from the following list");
        for (Parameter p: parameter.values()) {
            userInterface.output("\t" + p);
        }
        do {
            userInterface.output("\nno typo is allowed:");
            model = userInterface.getParameter();
        } while (model == null);
    }*/

    private Color initializeColor() {
        userInterface.output("Please choose the Color from the following list");
        for (Color c : Color.values()) {
            userInterface.output("\t" + c);
        }
        do {
            userInterface.output("\nno typo is allowed:");
            color = userInterface.getColor();
        } while (color == null);

        return color;
    }

    private Type initializeType() {
        userInterface.output("Please choose the Type from the following list");
        for (Type t : Type.values()) {
            userInterface.output("\t" + t);
        }
        do {
            userInterface.output("\nno typo is allowed:");
            type = userInterface.getType();
        } while (type == null);

        return type;
    }

    private Engine initializeEngine() {
        userInterface.output("Please choose the Engine from the following list");
        for (Engine e : Engine.values()) {
            userInterface.output("\t" + e);
        }
        do {
            userInterface.output("\nno typo is allowed:");
            engine = userInterface.getEngine();
        } while (engine == null);

        return engine;
    }

    private Model initializeModel() {
        userInterface.output("Please choose the Model from the following list");
        for (Model m : Model.values()) {
            userInterface.output("\t" + m);
        }
        do {
            userInterface.output("\nno typo is allowed:");
            model = userInterface.getModel();
        } while (model == null);

        return model;
    }

    private Wheels initializeWheels() {
        userInterface.output("Please choose the Driving Wheels from the following list");
        for (Wheels w : Wheels.values()) {
            userInterface.output("\t" + w);
        }
        do {
            userInterface.output("\nno typo is allowed:");
            wheels = userInterface.getWheels();
        } while (wheels == null);

        return wheels;
    }


}
