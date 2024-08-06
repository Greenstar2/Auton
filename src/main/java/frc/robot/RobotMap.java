package frc.robot;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;

public final class RobotMap {

    // Global Robot Constants
    public static final double MAX_DRIVING_SPEED = 4.0; // m/s
    public static final double MAX_ANGLE_VELOCITY = Math.PI;
    public static final double MAX_ANGLE_ACCELERATION = MAX_ANGLE_VELOCITY / 2;

    public static final String CAN_CHAIN = "rio";

    // Robot Dimensions
    public static final double ROBOT_LENGTH = Units.inchesToMeters(30);
    public static final double ROBOT_WIDTH = Units.inchesToMeters(28);

    public static final class Field {
        // field dimensions
        public static final double fieldLength = Units.inchesToMeters(651.25);
        public static final double fieldWidth = Units.inchesToMeters(315.5);
        public static final Field2d FIELD = new Field2d();

        // indexes for game pieces and field
        public static final int TAPE_INDEX = 0;
        public static final int CONE_INDEX = 1;
    }

    // CLAW
    public static final class Claw {
        public static final int PH_ID = 1;
        public static final int CLAW_FORWARD_ID = 7;
        public static final int CLAW_REVERSE_ID = 6;
    }

    // ELEVATOR
    
    public static final class AngledElevator {
        public static final double kP = 0.12; // Based on RoboCode2023; TUNE
        public static final double kG = 0.087; // Based on RoboCode2023; TUNE

        public static final double MAX_ERROR = 100;

        public static final double CRUISE_VELOCITY = 7447; // NEEDS TO BE TUNED (based on RoboCode2023)
        public static final double CRUISE_ACCELERATION = 4447; // NEEDS TO BE TUNED (based on RoboCode2023)

        public static final int MASTER_ID = 15; // Left Motor
        public static final int FOLLOWER_ID = 14; // Right Motor
        public static final int LIMIT_SWITCH_ID = 0;

        public static final boolean MASTER_INVERTED = false; // TODO
        public static final boolean FOLLOWER_INVERTED = false; // TODO

        // Thresholds for soft-limits
        public static final double FORWARD_LIMIT = 41000;
        public static final double REVERSE_LIMIT = 0;

        // Time for the motor to go from neutral to full
        public static final double RAMP_TIME = 0.01;

        // POSITIONS: Low, Middle, High, Human Player (HP), Fake Zero
        public static double[] POSITIONS = {
                10018, 29300, 41000, 28800, 5000
        };

        // HORIZONTAL Offsets: Middle, High, Human Player (HP)
        public static double[] HORIZONTAL_OFFSET = {
                10018, 27000, 39500
        };
    }

    public static final class ZeroElevator {
        public static final double ZERO_SPEED = -0.37;
    }
}
