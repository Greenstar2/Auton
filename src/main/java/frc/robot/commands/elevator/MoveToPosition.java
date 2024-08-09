package frc.robot.commands.elevator;

import javax.swing.text.Position;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.AngledElevator;

/**
 * ==================================
 * Remember what needs to be extended
 * What needs to be in the constructor?
 * What methods do we need?
 * ==================================
 */
public class MoveToPosition extends CommandBase {

    private double position;
    private final Timer timer = new Timer();

    /**
     * ==============================================
     * Constructor - what do we need to add?
     * assign parameter position to instance variable
     * ==============================================
     * 
     * @param position the position elevator needs
     */
    // TODO: function here [delete this comment]
    public MoveToPosition (double position) {
        addRequirements(AngledElevator.getInstance());
        this.position = position;
    }

    /**
     * 
     * ==========================================
     * Resets the timer and starts it (stopwatch)
     * ==========================================
     */
    // TODO: function here [delete this comment]
    public void initialize() {
        timer.reset();
        timer.start();
    }

    /**
     * =============================================================
     * Moves the elevator to a set position (the variable set above)
     * =============================================================
     */
    // TODO: function here [delete this comment]
    public void execute() {
        AngledElevator.getInstance().moveToPosition(position);
    }

    /**
     * =======================================================================================
     * if the Elevator is at the right position or the timer is above 2.5 seconds, return true
     * =======================================================================================
     */
    // TODO: function here [delete this comment]
    public boolean isFinished() {
        return AngledElevator.getInstance().getCurrentEncoderPosition() == position
        || timer.get() > 2.5;
        
    }

    

    /**
     * =======================================================
     * Keep the elevator at the set position when command ends
     * =======================================================
     */
    // TODO: function here [delete this comment]
    public void end() {
        AngledElevator.getInstance().moveToPosition(position);
        AngledElevator.getInstance().setElevatorPower(0);
    }
}