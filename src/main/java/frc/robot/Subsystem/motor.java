// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystem;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class motor extends SubsystemBase {

  TalonFX left;
  TalonFX right;
  CANSparkMax thomasnice;

  /** Creates a new motor. */
  public motor() {

  left = new TalonFX(Constants.LEFT_ID);
  right = new TalonFX(Constants.RIGHT_ID);
  thomasnice = new CANSparkMax(Constants.NEO_ID, MotorType.kBrushless);

  }

  public void MOVE(double s) {

  //change s to a number between 0 and 1 to adj speeds manually

    left.set(-s);
    right.set(s);
    thomasnice.set(s);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
