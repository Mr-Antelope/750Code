package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "TeleOmni", group = "Test")
public class TeleOmni extends LinearOpMode {

    private DcMotor FL;
    private DcMotor FR;
    private DcMotor BL;
    private DcMotor BR;
    private DcMotor Arm;
    private Servo Claw;

    private static final double OPEN = 0.8;
    private static final double CLOSED = 0.2;

    @Override
    public void runOpMode()  {

        FL = hardwareMap.dcMotor.get("FL");
        FR = hardwareMap.dcMotor.get("FR");
        BL = hardwareMap.dcMotor.get("BL");
        BR = hardwareMap.dcMotor.get("BR");
        Arm = hardwareMap.dcMotor.get("Arm");
        //Claw = hardwareMap.servo.get("Claw");

        FR.setDirection(DcMotor.Direction.REVERSE);
        BR.setDirection(DcMotor.Direction.REVERSE);

        //Claw.setPosition(CLOSED);


        waitForStart();


        while (opModeIsActive()) {


                FL.setPower(gamepad1.left_stick_y);
                FR.setPower(gamepad1.left_stick_y);
                BL.setPower(gamepad1.left_stick_y);
                BR.setPower(gamepad1.left_stick_y);

                FL.setPower(-gamepad1.left_stick_x);
                FR.setPower(gamepad1.left_stick_x);
                BL.setPower(gamepad1.left_stick_x);
                BR.setPower(-gamepad1.left_stick_x);

                FL.setPower(-gamepad1.right_stick_x);
                FR.setPower(gamepad1.right_stick_x);
                BL.setPower(-gamepad1.right_stick_x);
                BR.setPower(gamepad1.right_stick_x);

                Arm.setPower(gamepad1.left_trigger);
                Arm.setPower(-gamepad1.right_trigger);

                if(gamepad2.a){
                    Claw.setPosition(OPEN);
                }
                if(gamepad2.b){
                    Claw.setPosition(CLOSED);
                }
                idle();
            }
        }
    }
