package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.DriveTankSubsystem;

@TeleOp(name="IMU Testing")
public class IMUTesting extends LinearOpMode {

    DriveTankSubsystem driveTankSubsystem = new DriveTankSubsystem();

    @Override
    public void runOpMode() throws InterruptedException {
        driveTankSubsystem.init(hardwareMap);

        waitForStart();

        while(opModeIsActive()) {

            

        }
    }
}
