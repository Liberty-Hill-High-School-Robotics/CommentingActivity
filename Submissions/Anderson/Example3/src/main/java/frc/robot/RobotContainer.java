//Nothing here. You're done!

package frc.robot;

import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;


public class RobotContainer {
private static RobotContainer m_robotContainer = new RobotContainer();

    public final Drive m_drive = new Drive();

private final XboxController operatorJoystick = new XboxController(1);
private final Joystick driverJoystick = new Joystick(0);



  SendableChooser<Command> m_chooser = new SendableChooser<>();


  private RobotContainer() {



    configureButtonBindings();

    m_drive.setDefaultCommand(new DriveArcade( m_drive ) );


    

        SmartDashboard.putData("Auto Mode", m_chooser);
  }

  public static RobotContainer getInstance() {
    return m_robotContainer;
  }
  
  private void configureButtonBindings() {
  }

public Joystick getdriverJoystick() {
        return driverJoystick;
    }

public XboxController getoperatorJoystick() {
      return operatorJoystick;
    }


public Command getAutonomousCommand() {
  return m_chooser.getSelected();
}


}

