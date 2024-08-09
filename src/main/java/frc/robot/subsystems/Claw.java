package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Claw extends SubsystemBase {
    private static Claw instance;
    private DoubleSolenoid ds;

    /**
     * =====================================================================
     * Create one double solenoid.
     * Instantiate the double solenoid with the id provided in RobotMap.java
     * - the module type is REVPH
     * - forward and reverse ids are provided in RobotMap.java
     * =====================================================================
     */

    // TODO: function here [delete this comment]
    private Claw(){
        ds = new DoubleSolenoid(RobotMap.Claw.PH_ID, PneumaticsModuleType.REVPH, RobotMap.Claw.CLAW_FORWARD_ID, RobotMap.Claw.CLAW_REVERSE_ID);
    }

    /**
     * ================================================
     * Getter (accessor) for the claw instance variable
     * ================================================
     */
    // TODO: function here [delete this comment]
    public DoubleSolenoid getDs() {
        return ds;
    }

    /**
     * ==============
     * Singleton Code
     * ==============
     */
    // TODO: function here [delete this comment]
    public static Claw getInstance() {
        if (instance == null)
            instance = new Claw();
        return instance;
    }
}
