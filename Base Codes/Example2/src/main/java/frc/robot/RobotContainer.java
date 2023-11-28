//On l 26. There is an error. Try to fix it, and add a comment to explain what was wrong and the process you took to fix it.
//There is a blank on line 35. Fill it to the best of your ability, and add a comment to explain what you did.
//There is an error on both lines 43 an 44. They are of the same type of error. Add comment(s) explaining what was wrong and the process you took to fix it.
package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.DriveArcade;
import frc.robot.subsystems.Drive;


public class RobotContainer {
private static RobotContainer m_robotContainer = new RobotContainer();

    public final Drive m_drive = new Drive();

private final XboxController operatorJoystick = new XboxController(1);
private final Joystick driverJoystick = new Joystick(0);



  SendableChooser<Command> m_chooser = new SendableChooser<>(1);


  private RobotContainer() {



    configureButtonBindings();

    m_drive.setDefaultCommand(new DriveArcade(  ) );


    

        SmartDashboard.putData("Auto Mode", m_chooser);
  }

  public static RobotContainer getinstance() {
    return m_robotcontainer;
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

