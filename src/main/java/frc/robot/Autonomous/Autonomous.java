package frc.robot.Autonomous;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class Autonomous {
    public static final SequentialCommandGroup exampleAuton = new SequentialCommandGroup(
        CommandGroups.getFullZeroCommand(),
        CommandGroups.getFullShootSpeaker(),
        new SwervePositionController(Trajectories.wayOne, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.wayTwo, () -> Rotation2d.fromDegrees(180), true).alongWithlong(CommandGroups.getFullShootSpeaker()),
        new SwervePositionController(Trajectories.wayThree, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.end, () -> Rotation2d.fromDegrees(180), true).alongWith(CommandGroups.getFullShootSpeaker())
    );
}
