// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class Drive extends CommandBase {
  // declare a final variable for the subsystem

  /** Creates a new Drive. */
  public Drive(DriveTrain dt) {
    // initialize the member variable with dt
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // stop the drivetrain
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // make the drivetrain drive using speed and turn values
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
