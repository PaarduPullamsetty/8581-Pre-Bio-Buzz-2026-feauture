package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;




import org.firstinspires.ftc.teamcode.Subsystems.DriveTankSubsystem;


@TeleOp(name="EncoderTest")
public class EncoderTest extends LinearOpMode {

    DriveTankSubsystem driveTankSubsystem = new DriveTankSubsystem();



    @Override
    public void runOpMode() throws InterruptedException {

        driveTankSubsystem.init(hardwareMap);

        FtcDashboard dashboard = FtcDashboard.getInstance();

        telemetry = new MultipleTelemetry(telemetry, dashboard.getTelemetry());

        driveTankSubsystem.frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        driveTankSubsystem.frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();

        while (opModeIsActive()) {

            telemetry.addData("Encoder Thingy", driveTankSubsystem.frontLeft.getVelocity());
            telemetry.update();

        }

    }
}
