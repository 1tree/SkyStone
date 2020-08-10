package org.t243sachse.robot;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

/**
 * This class is for driving the robot. An additional class should be created
 * for control of the robot arm.
 */
public class Drive {
    private static final double countsPerInch = 100.6;
    private static final double countsPerDegree = 11.5;
    private DcMotor left;
    private int leftTarget;
    private DcMotor right;
    private int rightTarget;

    public Drive(Definition definition) {
        left = definition.leftDrive;
        right = definition.rightDrive;
    }

    public void forward(double inches) {
        left.setPower(0);
        right.setPower(0);
        int distance = (int) (countsPerInch * inches);
        leftTarget += distance;
        rightTarget += distance;
        start();
    }

    public void backward(double inches) {
        forward(-inches);
    }

    public void left(int degrees) {
        left.setPower(0);
        right.setPower(0);
        int distance = (int) (countsPerDegree * degrees);
        leftTarget -= distance;
        rightTarget += distance;
        start();
    }

    public void right(int degrees) {
        left(-degrees);
    }

    public boolean isBusy() {
        return left.isBusy() || right.isBusy();
    }

    public void updateTelemetry(Telemetry telemetry) {
        telemetry.addData("leftDrive", left.getCurrentPosition());
        telemetry.addData("rightDrive", right.getCurrentPosition());
    }

    private void start() {
        left.setTargetPosition(leftTarget);
        right.setTargetPosition(rightTarget);
        left.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        right.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        left.setPower(0.7);
        right.setPower(0.7);
    }
}
