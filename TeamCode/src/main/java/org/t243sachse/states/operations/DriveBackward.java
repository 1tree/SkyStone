package org.t243sachse.states.operations;

import org.t243sachse.robot.Drive;
import org.t243sachse.states.DriveStateBase;

/**
 * Drives backwards the number of inches passed in.
 */
public class DriveBackward extends DriveStateBase {
    private double inches;

    public DriveBackward(Drive robotDrive, double inches) {
        super(robotDrive);
        this.inches = inches;
    }

    @Override
    public void start() {
        robotDrive.backward(inches);
    }
}
