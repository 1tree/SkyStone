package org.t243sachse.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.t243sachse.robot.Definition;
import org.t243sachse.robot.Drive;
import org.t243sachse.states.operations.DriveForward;
import org.t243sachse.states.operations.TurnRight;

@TeleOp(name = "Make Box")
public class BoxOpMode extends StateBasedOpMode {
    @Override
    public void init() {
        Definition definition = new Definition(hardwareMap);
        drive = new Drive(definition);

        state = new DriveForward(drive, 36)
                .addNext(new TurnRight(drive, 90))
                .addNext(new DriveForward(drive, 36))
                .addNext(new TurnRight(drive, 90))
                .addNext(new DriveForward(drive, 36))
                .addNext(new TurnRight(drive, 90))
                .addNext(new DriveForward(drive, 36))
                .addNext(new TurnRight(drive, 90));
    }
}
