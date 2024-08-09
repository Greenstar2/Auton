package frc.robot.commands.claw;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Claw;
import edu.wpi.first.wpilibj.DoubleSolenoid;


/**
 * ==================================
 * Remember what needs to be extended
 * What needs to be in the constructor?
 * What methods do we need?
 * ==================================
 */
public class ToggleClaw extends InstantCommand {

    /**
     * =====================================
     * Constructor - what do we need to add?
     * =====================================
     */
    // TODO: function here [delete this comment]
    public ToggleClaw() {
        addRequirements(Claw.getInstance());
    }



    /**
     * ================================
     * Toggle the state of the solenoid
     * What method?
     * ================================
     */
    // TODO: function here [delete this comment]
    public void initialize() {
        if (Claw.getInstance().getDs().get() == DoubleSolenoid.Value.kForward)
            Claw.getInstance().getDs().set(DoubleSolenoid.Value.kReverse);
        else   
            Claw.getInstance().getDs().set(DoubleSolenoid.Value.kForward);
    }
    
}