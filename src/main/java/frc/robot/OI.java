package frc.robot;

import frc.robot.util.XboxGamepad;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.commands.claw.OpenClaw;
import frc.robot.commands.claw.ToggleClaw;
import frc.robot.subsystems.Claw;

public class OI {
    private static OI instance;
    private XboxGamepad driver;
    private XboxGamepad operator;

    /**
     * ====================================================================================================
     * Create two XboxGamepad instance variables
     * - one is the driver
     * - one is the operator
     * S
     * Instantiate both instance vars. with the id provided in RobotMap.java
     * when the Right DPad Button of the driver is true, toggle the claw (remember its a command you wrote)
     * ====================================================================================================
     */
    // TODO: function and variables here [delete this comment]
    private OI () {
        driver = new XboxGamepad(1);
        operator = new XboxGamepad(2);
    }

    public void rightDPad() {
        driver.getRightDPadButton().onTrue(new ToggleClaw());
    }

    /**
     * ==============================================
     * Getter (Accessor) for the driver instance var.
     * ==============================================
     * @return the driver instance
     */
    // TODO: function here [delete this comment]
    public XboxGamepad getDriverInstance() {
        return driver;
    }

    /**
     * ================================================
     * Getter (Accessor) for the operator instance var.
     * ================================================
     * @return the operator instance
     */
    // TODO: function here [delete this comment
    public XboxGamepad getOperatorInstance() {
        return operator;
    }

    /**
     * ==============
     * Singleton Code
     * ==============
     * 
     * @return instance of OI
     */
    // TODO: function here [delete this comment]
    public static OI getInstance() {
        if (instance == null)
            instance = new OI();
        return instance;
    }
}