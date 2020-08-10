package org.t243sachse.states;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.t243sachse.robot.Drive;

/**
 * This class provides the basis for most states. Note that the only method that
 * classes inheriting from this need to implement is the start method.
 */
public abstract class DriveStateBase implements DriveState {
    protected Drive robotDrive;
    private DriveState next = new StoppedDriveState();

    public DriveStateBase(Drive robotDrive) {
        this.robotDrive = robotDrive;
    }

    @Override
    public DriveState update(Telemetry telemetry) {
        robotDrive.updateTelemetry(telemetry);
        if (robotDrive.isBusy()) {
            return this;
        }
        next.start();
        return next;
    }

    @Override
    public DriveState addNext(DriveState next) {
        this.next = next;
        return next;
    }
}
