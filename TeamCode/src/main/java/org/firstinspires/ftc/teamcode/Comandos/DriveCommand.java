package org.firstinspires.ftc.teamcode.Comandos;

import com.arcrobotics.ftclib.command.CommandBase;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Subsistemas.ChassisTankSubsystem;

public class DriveCommand extends CommandBase {
    private ChassisTankSubsystem driveSubsystem;
    private Gamepad gamepad;

    public DriveCommand(ChassisTankSubsystem driveSubsystem, Gamepad gamepad){
        this.driveSubsystem = driveSubsystem;
        this.gamepad = gamepad;

        addRequirements(driveSubsystem);
    }
    @Override
    public void initialize(){}

    @Override
    public void execute(){
        driveSubsystem.moveRobot(gamepad.left_stick_y, gamepad.right_stick_x);
    }
    @Override
    public void end(boolean interrupted){}

    @Override
    public boolean isFinished(){
        return false;
    }
}
