package org.t243sachse.states.operations;

import org.t243sachse.robot.Drive;
import org.t243sachse.states.DriveStateBase;

/**
 * Turns left the number of degrees passed into the constructor.
 */
public class TurnLeft extends DriveStateBase {
    private int degrees;

    public TurnLeft(Drive robotDrive, int degrees) {
        super(robotDrive);
        this.degrees = degrees;
    }

    @Override
    public void start() {
        robotDrive.left(degrees);
    }
}

