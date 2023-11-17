//On line 24 there are crucial errors. Try to fix it, and comment how you fixed it.
//On line 28 there are crucial errors. Try to fix it, and comment how you fixed it.
//On line 47 there are crucial errors. Try to fix it, and comment how you fixed it.

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

import frc.robot.subsystems.Drive;


public class DriveArcade extends CommandBase {

        private final Drive m_drive;


    public DriveArcade(Drive subsystem) {

        m_drive = subsystem;
        addRequirements(m_drive);

    }

    @override
    public void initialize() {
    }

    @override
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
    public booolean isFinished() {

        return false;
    }

    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}
