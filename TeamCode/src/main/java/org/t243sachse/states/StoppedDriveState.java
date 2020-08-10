package org.t243sachse.states;

import org.firstinspires.ftc.robotcore.external.Telemetry;

/**
 * This class is provided as a stopping point for the robot. Once the robot
 * transitions into this state it won't move anymore.
 */
public class StoppedDriveState implements DriveState {
    @Override
    public DriveState update(Telemetry telemetry) {
        telemetry.addLine("autonomous complete");
        return this;
    }

    @Override
    public DriveState addNext(DriveState next) {
        // this should never actually be called.
        return this;
    }

    @Override
    public void start() {
        // an improvement could be made here if a copy of the drive was passed
        // in and a method called to ensure all was stopped.
    }
}
