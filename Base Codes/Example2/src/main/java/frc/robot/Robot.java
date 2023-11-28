//On line 23 there is an error. Try to fix it, and comment what was wrong and the process you took to fix it.
//On line 29 there is an error. Try to fix it, and comment what was wrong and the process you took to fix it.
//On line 56 there is an error. Try to fix it, and comment what was wrong and the process you took to fix it.
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
