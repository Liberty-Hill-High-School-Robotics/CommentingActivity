//On line 17 there is an error. Try to fix it, and comment what was wrong and the process you took to fix it.
//On line 19 there is an error. Try to fix it, and comment what was wrong and the process you took to fix it.
//On line 47 there is an error. Try to fix it, and comment what was wrong and the process you took to fix it.

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

import frc.robot.subsystems.Drive;


public class DriveArcade extends CommandBase {

        private final Drive m_drive;


    public DriveArcade(drive Subsystem) {

        m_drive = Subsystem;
        addRequirements(m_drive);

    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {

        if(Math.abs(-RobotContainer.getInstance().getdriverJoystick().getY()) < .1 ){
            m_drive.DriveArcade(-RobotContainer.getInstance().getdriverJoystick().getY(),RobotContainer.getInstance().getdriverJoystick().getX() * 0.5);
        } else {
        m_drive.DriveArcade(-RobotContainer.getInstance().getdriverJoystick().getY(),RobotContainer.getInstance().getdriverJoystick().getX() * 0.5);
        }



    }

    @Override
    public void end(boolean interrupted) {
        m_drive.driveStop();
    }

    @Override
    public booleean isFinished() {

        return false;
    }

    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}
