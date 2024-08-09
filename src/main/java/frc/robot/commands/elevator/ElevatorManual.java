package frc.robot.commands.elevator;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.OI;
import frc.robot.commands.claw.ToggleClaw;
import frc.robot.subsystems.AngledElevator;
import frc.robot.util.XboxGamepad;

/**
 * ==================================
 * Remember what needs to be extended
 * What needs to be in the constructor?
 * What methods do we need?
 * ==================================
 */
public class ElevatorManual extends CommandBase {
    private static ElevatorManual instance;
    

    /**
     * =====================================
     * Constructor - what do we need to add?
     * =====================================
     */
    // TODO: function here [delete this comment]
    private ElevatorManual () {
        addRequirements(AngledElevator.getInstance());
    }

    
    public void execute() {
        /**
         * ================================================================================
         * if DRIVER presses the Up DPad Button, Move the elevator up by 500 steps
         * else if DRIVER presses the Down DPad Button, Move the elevator down by 500 steps
         * ================================================================================
         */
        // TODO: code here [delete this comment]
        if (OI.getInstance().getDriverInstance().getUpDPadButtonState()) {
            AngledElevator.getInstance().moveToPosition(AngledElevator.getInstance().getCurrentEncoderPosition() + 500);
        }

        if (OI.getInstance().getDriverInstance().getDownDPadButtonState()) {
            AngledElevator.getInstance().moveToPosition(AngledElevator.getInstance().getCurrentEncoderPosition() - 500);
        }
    
    

        /**
         * ==========================================
         * Always move to Elevator's Desired position
         * ==========================================
         */
        // TODO: code here [delete this comment]
        AngledElevator.getInstance().moveToPosition(AngledElevator.getInstance().getDesiredPosition());
    }

    /**
     * =======================
     * set power to 0 when end
     * make sure to override
     * =======================
     */
    // TODO: function here [delete this comment]
    public void end() {
        AngledElevator.getInstance().setElevatorPower(0);
    }
}
