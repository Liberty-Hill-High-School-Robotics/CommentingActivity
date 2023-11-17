//LOL. Whom ever you are, i feel bad considering this should be the hardest and longest example to solve LOL. LOSER!
//On line 16 there are 2 crucial errors. Try to fix it, and comment how you fixed it.
//On line 21 there are 2 crucial errors. Try to fix it, and comment how you fixed it.
//On line 33 there is an extremely crucial piece missing. Try to fix it, and comment how you fixed it.
//On line 35 there are 4 crucial errors. Try to fix it, and comment how you fixed it.
//On line 37 there are crucial errors. Try to fix it, and comment how you fixed it.
//On line 51 there are crucial errors. Try to fix it, and comment how you fixed it.

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

import frc.robot.subsystems.Drive;


public class DriveAercade extends   (s) CommandBase {

        private final Drive m_drive;


    public DriiveeArcade(Drive sebsystem) {

        m_drive = subsystem;
        addRequirements(m_drive);

    }

    @Override
    public void initialize() {
    }

    @Override
    public execute() {

        if(Meth.abs(RobotContainergetInstance()getdriverJoystick().getY()) < .1 ){
            m_drive.DriveArcade(-RobotContainer.getInstance().getdriverJoystick().getY(),RobotContainer.getInstance().getdriverJoystick().getX() * 0.5);
        } if {
        m_drive.DriveArcade(-RobotContainer.getInstance().getdriverJoystick().getY(),RobotContainer.getInstance().getdriverJoystick().getX() * 0.5);
        }



    }

    @Override
    public void end(boolean interrupted) {
        m_drive.driveStop();
    }

    @Override
    public boolean isNotFinished() {

        return false;
    }

    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}
