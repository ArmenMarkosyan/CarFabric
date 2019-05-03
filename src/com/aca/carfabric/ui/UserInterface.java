package com.aca.carfabric.ui;

import com.aca.carfabric.input.parameters.*;

/**
 * This interface contains methods to get input from user
 * and send them info
 */
public abstract class UserInterface {
    /**
     * Send info to user.
     *
     * @param message the message
     */
    public abstract void output(String message);

    public abstract Color getColor();

    public abstract Type getType();

    public abstract Engine getEngine();

    public abstract Model getModel();

    public abstract Wheels getWheels();
}
