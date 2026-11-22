package org.firstinspires.ftc.teamcode.Auto;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Subsystems.DriveTankSubsystem;

@Config
@Autonomous(name = "CLOSEForwardCornerMove ENCODER (Blocks to Java)")
public class CLOSEForwardMove_Encoder extends LinearOpMode {

    DriveTankSubsystem driveTankSubsystem = new DriveTankSubsystem();

    public static int targetPos = 1500;

    public static double leftPow = 0.3;
    public static double rightPow = 0.32;

    /**
     * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
     * Comment Blocks show where to place Initialization code (runs once, after touching the
     * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
     * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
     * Stopped).
     */
    @Override
    public void runOpMode() {

        driveTankSubsystem.init(hardwareMap);

        driveTankSubsystem.frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        driveTankSubsystem.frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);









        waitForStart();
        if (opModeIsActive()) {

            while(driveTankSubsystem.frontLeft.getCurrentPosition() <= targetPos) {
            driveTankSubsystem.frontLeft.setPower(leftPow);
            driveTankSubsystem.frontRight.setPower(rightPow);
        }

            driveTankSubsystem.frontLeft.setPower(0);
            driveTankSubsystem.frontRight.setPower(0);
        }
/*
        driveTankSubsystem.backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        driveTankSubsystem.backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        driveTankSubsystem.frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        driveTankSubsystem.frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        sleep(500);
        driveTankSubsystem.backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        driveTankSubsystem.backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        driveTankSubsystem.frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        driveTankSubsystem.frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);

 */
    }
}