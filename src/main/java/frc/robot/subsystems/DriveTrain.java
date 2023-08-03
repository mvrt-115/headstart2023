// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXInvertType;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */

  //declare 4 motor variables(TalonFX)

  public DriveTrain() {
    //initialize motor varaibles (order: left front, left back, right front, right back: 4, 2, 1, 3)

    //have the back motors follow the front motors

    //set front and back left motors to invert clockwise(TalonFXInvertType.Clockwise)

    //set front and back right motors to invert counterclockwise(TalonFXInvertType.CounterClockwise)

  }

  public void drive(double speed, double turn) {
    //declare and instantiate left and right turn with max speed to 0.5  

    //set front motors to the speed of left and right turn, respectively
  }
  public void stop() {
    // stop the robot using the drive method
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
