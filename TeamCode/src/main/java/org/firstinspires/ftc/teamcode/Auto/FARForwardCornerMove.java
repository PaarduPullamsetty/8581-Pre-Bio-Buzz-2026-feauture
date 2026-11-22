package org.firstinspires.ftc.teamcode.Auto;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Subsystems.DriveTankSubsystem;

@Config
@Autonomous(name = "FARForwardCornerMove (Blocks to Java)")
public class FARForwardCornerMove extends LinearOpMode {

    DriveTankSubsystem driveTankSubsystem = new DriveTankSubsystem();
    // ElapsedTime timer = new ElapsedTime();

    //public double elapsed;

    //Change to add a strafe for proper parking

    public static int targetPosForward = 4500;

    public static int sleepTime = 1000;
    public static double leftPow = 0.3;
    public static double rightPow = 0.34;


    @Override
    public void runOpMode() {

        driveTankSubsystem.init(hardwareMap);

        driveTankSubsystem.frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        driveTankSubsystem.frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();
        if (opModeIsActive()) {

            while (driveTankSubsystem.frontLeft.getCurrentPosition() <= targetPosForward) {
                driveTankSubsystem.frontLeft.setPower(leftPow);
                driveTankSubsystem.frontRight.setPower(rightPow);
            }

            driveTankSubsystem.strafe(0.5);

            sleep(sleepTime);

            driveTankSubsystem.strafe(-0.2);

            sleep(750);

            driveTankSubsystem.stopMove();


            driveTankSubsystem.frontLeft.setPower(0);
            driveTankSubsystem.frontRight.setPower(0);


        }
    }
}