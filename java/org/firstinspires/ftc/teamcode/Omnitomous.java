package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Omnitomous", group = "Test")
public class Omnitomous extends LinearOpMode {

    DcMotor FL;
    DcMotor FR;
    DcMotor BL;
    DcMotor BR;

    @Override
    public void runOpMode() {
        FL = hardwareMap.dcMotor.get("FL");
        FR = hardwareMap.dcMotor.get("FR");
        BL = hardwareMap.dcMotor.get("BL");
        BR = hardwareMap.dcMotor.get("BR");

        FL.setDirection(DcMotor.Direction.REVERSE);
        BL.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
//AutoStart
        DriveForward(1.0);
        sleep(1000);
        StopDriving();

    }

    public void DriveForward(double power)
    {
        FL.setPower(power);
        FR.setPower(power);
        BL.setPower(power);
        BR.setPower(power);
    }
    public void StopDriving()
    {
        DriveForward(0);
    }

    public void DriveBackward(double power)
    {
        FL.setPower(-power);
        FR.setPower(-power);
        BL.setPower(-power);
        BR.setPower(-power);
    }

    public void TurnRight(double power)
    {
        FL.setPower(power);
        FR.setPower(-power);
        BL.setPower(power);
        BR.setPower(-power);
    }

    public void TurnLeft(double power)
    {
        FL.setPower(-power);
        FR.setPower(power);
        BL.setPower(-power);
        BR.setPower(power);
    }

    public void StrafeLeft(double power)
    {
        FL.setPower(-power);
        FR.setPower(power);
        BL.setPower(power);
        BR.setPower(-power);
    }

    public void StrafeRight(double power)
    {
        FL.setPower(power);
        FR.setPower(-power);
        BL.setPower(-power);
        BR.setPower(power);
    }
}

