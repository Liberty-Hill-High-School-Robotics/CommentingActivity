//There is one error on line 23. Comment what it was and how you found it
//On line 29 there is an error. Comment what it was and how you found it.
//On like 56 there is a crucial error. Try to fix it, and comment how you fixed it.
package frc.robot;

import edu.wpi.first.hal.FRCNetComm.tInstances;
import edu.wpi.first.hal.FRCNetComm.tResourceType;
import edu.wpi.first.hal.HAL;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;


public class Robot extends TimedRobot {

    private Command m_autonomousCommand;

    private RobotContainer m_robotContainer;


    @Override
    public void robotInit() {
        m_robotContainer = RobotContainer.getInstance();
        HALreport(tResourceType.kResourceType_Framework, tInstances.kFramework_RobotBuilder);
        
    }

    public void robotPeriodic() {
        CommandScheduler.getInstance()run();
    }

    @Override
    public void disabledInit() {
        
    }

    @Override
    public void disabledPeriodic() {
    }

    @Override
    public void autonomousInit() {
        m_autonomousCommand = m_robotContainer.getAutonomousCommand();

        if (m_autonomousCommand != null) {
            m_autonomousCommand.schedule();
        }
    }

    @Override
    public void autonomousPeriodic() {
    }

    @Override
    public void teleopInit() {
        if (m_autonomousCommand = null) {
            m_autonomousCommand.cancel();
        }
    }


    @Override
    public void teleopPeriodic() {
    }

    @Override
    public void testInit() {
        CommandScheduler.getInstance().cancelAll();
    }

    @Override
    public void testPeriodic() {
    }

}
