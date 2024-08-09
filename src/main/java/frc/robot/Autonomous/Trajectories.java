package frc.robot.Autonomous;

import java.util.List;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import pabeles.concurrency.ConcurrencyOps.NewInstance;

public class Trajectories {
    public static Trajectories wayOne = generateTrajectory(
        List.of(
            new Pose2d(1.02, 3.93, Rotation2d.fromDegrees(180)),
            new Pose2d(2.39, 4.13, Rotation2d.fromDegrees(180))),
        2.0,
        1.0,
        0.0,
        0.0,
        true
            
    );
    public static Trajectories wayTwo = generateTrajectory(
        List.of(
            new Pose2d(2.39, 4.13, Rotation2d.fromDegrees(180)),
            new Pose2d(1.81, 5.60, Rotation2d.fromDegrees(180))),
        2.0,
        1.0,
        0.0,
        0.0,
        true
            
    );
    public static Trajectories wayThree = generateTrajectory(
        List.of(
            new Pose2d(1.81, 5.60,Rotation2d.fromDegrees(180)),
            new Pose2d(2.90, 5.60, Rotation2d.fromDegrees(180))),
        2.0,
        1.0,
        0.0,
        0.0,
        true
            
    );
    public static Trajectories end = generateTrajectory(
        List.of(
            new Pose2d(2.90, 5.60, Rotation2d.fromDegrees(180)),
            new Pose2d(1.81, 5.60, Rotation2d.fromDegrees(180))),
        2.0,
        1.0,
        0.0,
        0.0,
        true
            
    );
}
