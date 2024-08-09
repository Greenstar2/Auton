package frc.robot.commands.elevator;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotMap;
import frc.robot.subsystems.AngledElevator;

/**
 * ==================================
 * Remember what needs to be extended
 * What needs to be in the constructor?
 * What methods do we need?
 * ==================================
 */
public class ZeroElevator extends CommandBase {

    /**
     * =====================================
     * Constructor - what do we need to add?
     * =====================================
     */
    // TODO: function here [delete this comment]
    public ZeroElevator () {
        addRequirements(AngledElevator.getInstance());
    }


    /** What method is this?
     * =============================
     * Slowly move the elevator down
     * The zero speed is in RobotMap
     * =============================
     */
    // TODO: function here [delete this comment]
    public void execute() {
        AngledElevator.getInstance().setElevatorPower(RobotMap.ZeroElevator.ZERO_SPEED);
    }


    /**
     * ====================================
     * if Elevator is at "Zero", stop Power
     * ====================================
     * 
     * Override a method (which one?)
     * @return a boolean
     */
    // TODO: function here [delete this comment]
    public boolean isFinished() {
        if (AngledElevator.getInstance().getCurrentEncoderPosition() == 0) {
            return true;
        }
        return false;
    }


    /**
     * =======================================================================
     * End: Reset Encoders and Move Elevator and Move Elevator to lowest position (ground level aka 0)
     * =======================================================================
     */
    // TODO: function here [delete this comment]
    public void end(boolean interrupted) {
        
        
        AngledElevator.getInstance().moveToPosition(0);
            
    
    }
}