// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ModuleTester extends SubsystemBase {
  //Naming Convention : button:Drive/Turn
  //Change to your liking

  //Instruction
  //Install wpilib tools + ni tools (most importantly driver station, prob using prog laptop anyways)
  //connect to radio/wifi of roborio controlling motor controller
  //Ctrl+Shift+P deploy project when comms are up
  //plug in controller
  //Go into driver station, press enable if all lights are green, press enter to disable quickly
  //KEEP ON BLOCKS, NO SAFETY MEASURES ON GROUD ARE KEPT
  private static final int xDriveId = 1;
  private static final int xTurnId = 5;

  private static final int aDriveId = 2;
  private static final int aTurnId = 6;

  private static final int bDriveId = 3;
  private static final int bTurnId = 7;
  
  private static final int yDriveId = 4;
  private static final int yTurnId = 8;

  public static CANSparkFlex xDriveFlex = new CANSparkFlex(xDriveId, MotorType.kBrushless);
  public static CANSparkMax xTurnSpark = new CANSparkMax(xTurnId, MotorType.kBrushless);

  public static CANSparkFlex aDriveFlex = new CANSparkFlex(aDriveId, MotorType.kBrushless);
  public static CANSparkMax aTurnSpark = new CANSparkMax(aTurnId, MotorType.kBrushless);

  public static CANSparkFlex bDriveFlex = new CANSparkFlex(bDriveId, MotorType.kBrushless);
  public static CANSparkMax bTurnSpark = new CANSparkMax(bTurnId, MotorType.kBrushless);

  public static CANSparkFlex yDriveFlex = new CANSparkFlex(yDriveId, MotorType.kBrushless);
  public static CANSparkMax yTurnSpark = new CANSparkMax(yTurnId, MotorType.kBrushless);
  

  public ModuleTester() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
