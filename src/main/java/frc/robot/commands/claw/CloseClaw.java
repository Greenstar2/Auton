package frc.robot.commands.claw;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Claw;

/**
 * ==================================
 * Remember what needs to be extended
 * What needs to be in the constructor?
 * What methods do we need?
 * ==================================
 */
public class CloseClaw extends InstantCommand {
    private static CloseClaw instance;
    

    /**
     * =====================================
     * Constructor - what do we need to add?
     * =====================================
     */
    // TODO: function here [delete this comment]
    public CloseClaw () {
        addRequirements(Claw.getInstance());
    }


    /**
     * ================================
     * Set the claw state to be forward
     * What method?
     * ================================
     */
    // TODO: function here [delete this comment]
    public void initialize () {
        Claw.getInstance().getDs().set(DoubleSolenoid.Value.kForward);
    }
    
}
