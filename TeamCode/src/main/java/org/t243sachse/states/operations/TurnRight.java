package org.t243sachse.states.operations;

import org.t243sachse.robot.Drive;
import org.t243sachse.states.DriveStateBase;

/**
 * Turns right the number of degrees passed into the constructor.
 */
public class TurnRight extends DriveStateBase {
    private int degrees;

    public TurnRight(Drive robotDrive, int degrees) {
        super(robotDrive);
        this.degrees = degrees;
    }

    @Override
    public void start() {
        robotDrive.right(degrees);
    }
}
