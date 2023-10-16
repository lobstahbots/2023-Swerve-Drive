// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int DRIVER_CONTROLLER_PORT = 0;
    public static final int STRAFE_X_AXIS = 0;
    public static final int STRAFE_Y_AXIS = 1;
    public static final int ROTATION_AXIS = 2;
  }
  public static class RobotConstants {
    public static final double TRACK_WIDTH = Units.inchesToMeters(24);
    public static final double WHEELBASE = Units.inchesToMeters(24);
    public static final double WHEEL_DIAMETER = Units.inchesToMeters(3);
    public static final double DRIVE_GEAR_RATIO = 4.71;
    public static final double ANGLE_GEAR_RATIO = 6.1;
  }
  public static class DriveConstants {
    public static final double MAX_VOLTS = 4.95;
    public static final double MAX_ACCELERATION = 0.5;
    public static final double MAX_DRIVE_SPEED = 1;
    public static final int DRIVE_MOTOR_CURRENT_LIMIT = 80;
    public static final int ANGLE_MOTOR_CURRENT_LIMIT = 20;
    public static final SwerveDriveKinematics KINEMATICS = new SwerveDriveKinematics(
      new Translation2d(RobotConstants.WHEELBASE / 2.0, RobotConstants.TRACK_WIDTH / 2.0),
      new Translation2d(RobotConstants.WHEELBASE / 2.0, -RobotConstants.TRACK_WIDTH / 2.0),
      new Translation2d(-RobotConstants.WHEELBASE / 2.0, RobotConstants.TRACK_WIDTH / 2.0),
      new Translation2d(-RobotConstants.WHEELBASE / 2.0, -RobotConstants.TRACK_WIDTH / 2.0));

    public static final boolean FIELD_CENTRIC = true;
    public static final boolean IS_OPEN_LOOP = false;

    public static class FrontLeftModuleConstants {
      public static final int moduleID = 0;
      public static final int driveID = 0;
      public static final int angleID = 0;
      public static final double angleOffset = 0;
    }
    public static class BackLeftModuleConstants {
      public static final int moduleID = 1;
      public static final int driveID = 0;
      public static final int angleID = 0;
      public static final double angleOffset = 0;
    }
    public static class FrontRightModuleConstants {
      public static final int moduleID = 2;
      public static final int driveID = 0;
      public static final int angleID = 0;
      public static final double angleOffset = 0;
    }
    public static class BackRightModuleConstants {
      public static final int moduleID = 3;
      public static final int driveID = 0;
      public static final int angleID = 0;
      public static final double angleOffset = 0;
    }
  }

  public static class SwerveConstants {
    public static final boolean invertGyro = true;

    public static final double KS = 0.1;
    public static final double KA = 0.1;
    public static final double KV = 0.1;

    public static final double DRIVING_ENCODER_POSITION_CONVERSION_FACTOR = (RobotConstants.WHEEL_DIAMETER * Math.PI) / RobotConstants.DRIVE_GEAR_RATIO;
    public static final double DRIVING_ENCODER_VELOCITY_CONVERSION_FACTOR = DRIVING_ENCODER_POSITION_CONVERSION_FACTOR / 60.0;
    public static final double TURNING_ENCODER_POSITION_CONVERSION_FACTOR = 2 * Math.PI;
    public static final double TURNING_ENCODER_VELOCITY_CONVERSION_FACTOR = 2 * Math.PI / 60.0;

    public static final double TURN_PID_MIN_INPUT = 0;
    public static final double TURN_PID_MAX_INPUT = TURNING_ENCODER_POSITION_CONVERSION_FACTOR;

    public static final double DRIVE_PID_MIN_OUTPUT = -1;
    public static final double DRIVE_PID_MAX_OUTPUT = 1;
    public static final double DRIVE_PID_P = 0.04;
    public static final double DRIVE_PID_I = 0;
    public static final double DRIVE_PID_D = 0;
    public static final double DRIVE_PID_FF = 0;

    public static final double TURN_PID_MIN_OUTPUT = -1;
    public static final double TURN_PID_MAX_OUTPUT = 1;
    public static final double TURN_PID_P = 1;
    public static final double TURN_PID_I = 0;
    public static final double TURN_PID_D = 0;
    public static final double TURN_PID_FF = 0;
  }

  public static class SimConstants {
    public static final double LOOP_TIME = 0.02;
  }
}
