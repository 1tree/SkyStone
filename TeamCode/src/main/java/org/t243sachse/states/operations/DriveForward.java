package org.t243sachse.states.operations;

import org.t243sachse.robot.Drive;
import org.t243sachse.states.DriveStateBase;

/**
 * Drives forward the number of inches passed into the constructor
 */
public class DriveForward extends DriveStateBase {
    private double inches;

    public DriveForward(Drive robotDrive, double inches) {
        super(robotDrive);
        this.inches = inches;
    }

    @Override
    public void start() {
        robotDrive.forward(inches);
    }
}
