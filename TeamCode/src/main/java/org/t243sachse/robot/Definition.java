package org.t243sachse.robot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * This class holds all the hardware definitions for the robot. It is pulled
 * out so that you have a single initialization - but allows for classes to
 * specialize in one area of robot operation.
 * <p>
 * An additional area of improvement would be to create a class to hold the
 * complete hardware state, then add a method to populate the state. The state
 * could then be used for decision making in various places and provide a single
 * location for updating the telemetry for the hardware state. (Though some might
 * prefer to NOT centralize the telemetry as that wouldn't allow as much customization.
 * <p>
 * A hybrid approach could also be used.
 */
public class Definition {
    private static final double MID_SERVO = 0.5;
    public DcMotor leftDrive;
    public DcMotor rightDrive;
    public DcMotor leftArm;
    public Servo leftClaw;
    public Servo rightClaw;

    public Definition(HardwareMap map) {
        leftDrive = map.get(DcMotor.class, "left_drive");
        rightDrive = map.get(DcMotor.class, "right_drive");
        leftArm = map.get(DcMotor.class, "left_arm");
        leftDrive.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        rightDrive.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors

        // Set all motors to zero power
        leftDrive.setPower(0);
        rightDrive.setPower(0);
        leftArm.setPower(0);

        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        leftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftArm.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        // Define and initialize ALL installed servos.
        leftClaw = map.get(Servo.class, "left_hand");
        rightClaw = map.get(Servo.class, "right_hand");
        leftClaw.setPosition(MID_SERVO);
        rightClaw.setPosition(MID_SERVO);
    }
}
