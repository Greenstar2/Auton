package frc.robot.commands.claw;

import java.security.spec.DSAGenParameterSpec;

import edu.wpi.first.wpilibj.Relay.Value;
import frc.robot.subsystems.Claw;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.InstantCommand;

/**
 * ==================================
 * Remember what needs to be extended
 * What needs to be in the constructor?
 * What methods do we need?
 * ==================================
 */
public class OpenClaw extends InstantCommand {

    /**
     * =====================================
     * Constructor - what do we need to add?
     * =====================================
     */
    // TODO: function here [delete this comment]
    public OpenClaw() {
        addRequirements(Claw.getInstance());
    }


    /**
     * ================================
     * Set the claw state to be reverse
     * What method?
     * ================================
     */
    // TODO: function here [delete this comment]
    public void initialize() {
        Claw.getInstance().getDs().set(DoubleSolenoid.Value.kReverse);
    }
    
}
