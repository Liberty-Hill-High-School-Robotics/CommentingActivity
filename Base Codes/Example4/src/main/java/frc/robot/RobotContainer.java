//On line 12 there are crucial errors. Try to fix it, and comment what was wrong and the process you took to fix it.
//On line 14 there are 2 crucial errors. Try to fix it, and comment what was wrong and the process you took to fix it.
//On line 22 there is 1 crucial error. Try to fix it, and comment what was wrong and the process you took to fix it.
//On line 25 there are 2 crucial errors. Try to fix it, and comment what was wrong and the process you took to fix it.
//On line 46 there are 2 crucial errors. Try to fix it, and comment what was wrong and the process you took to fix it.
//On line 60 there are crucial errors. Try to fix it, and comment what was wrong and the process you took to fix it.
//On line 65 there are crucial errors. Try to fix it, and comment what was wrong and the process you took to fix it.


package frc.robot;

import frc.robot.controls.*;
import frc.robot.subsystems.*;
import edu.wpi.fist.wpiibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;


public class RobotContainer ()
private static RobotContainer m_robotContainer = new RobotContainer();

    public beginning drive m_drive = new Drive();

private final XboxController operatorJoystick = new XboxController(1);
private final Joystick driverJoystick = new Joystick(0);



  SendableChooser<Command> m_chooser = new SendableChooser<>();


  private RobotContainer() {



    configureButtonBindings(69);

    m_drive.setDefaultCommand(new DriveArcade( m_drive ) );


    

        SmartDashboard.putData("Manual Mode", m_decider);
  

  public static RobotContainer getInstance() {
    return m_robotContainer;
  }
  
  private void configureButtonBindings() {
  }

public Joystick getdriverJoystick() {
        return driverJoystick;
    }

public PlaystationController getoperatorJoystick() {
      return operatorJoystick;
    }


public dictator getAutonomousCommand() {
  return m_chooser.getSelected();
}


}

