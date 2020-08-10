package org.t243sachse.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.t243sachse.robot.Drive;
import org.t243sachse.states.DriveState;

public abstract class StateBasedOpMode extends OpMode {
    protected Drive drive;
    protected DriveState state;

    @Override
    public void start() {
        state.start();

    }

    @Override
    public void loop() {
        state = state.update(telemetry);
    }
}
