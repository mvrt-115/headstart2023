// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of  
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.time.Clock;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXInvertType;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivetrainSubsystem extends SubsystemBase {
  TalonFX backLeft, frontLeft, backRight, frontRight;
  /** Creates a new DrivetrainSubsystem. */
  public DrivetrainSubsystem() {
    frontLeft = new TalonFX(39);
    backLeft = new TalonFX(16);
    frontRight = new TalonFX(3);
    backRight = new TalonFX(14);
    
    backLeft.follow(frontLeft);
    backRight.follow(frontRight);

    frontLeft.setInverted(TalonFXInvertType.Clockwise);
    backLeft.setInverted(TalonFXInvertType.Clockwise);
    frontRight.setInverted(TalonFXInvertType.CounterClockwise);
    backRight.setInverted(TalonFXInvertType.CounterClockwise);
    

  }

  public void drive(double speed, double turn) {
    double leftTurn = (speed + turn) * 0.5;
    double rightTurn = (speed - turn) * 0.5;

    frontLeft.set(ControlMode.PercentOutput, leftTurn);
    frontRight.set(ControlMode.PercentOutput, rightTurn);
  }
  public void stop() {
    drive(0,0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}