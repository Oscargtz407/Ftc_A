package org.firstinspires.ftc.teamcode.OpModos;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Comandos.DriveCommand;
import org.firstinspires.ftc.teamcode.Subsistemas.ChassisTankSubsystem;

@TeleOp
public class Teleoperao extends CommandOpMode {
    ChassisTankSubsystem chassisTankSubsystem;

    @Override
    public void initialize() {
        chassisTankSubsystem = new ChassisTankSubsystem(hardwareMap);

        register(chassisTankSubsystem);

        chassisTankSubsystem.setDefaultCommand(new DriveCommand(chassisTankSubsystem, gamepad1));

    }
}
