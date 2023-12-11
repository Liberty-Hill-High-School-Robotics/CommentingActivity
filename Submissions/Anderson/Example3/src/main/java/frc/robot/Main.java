//On line 6 there are errors. Try to fix it, and comment what was wrong and the process you took to fix it.
//On line 14 there are errors. Try to fix it, and comment what was wrong and the process you took to fix it.

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase; //:barf: wayyyy to many indents

public final class Main {
  private Main() {
  }

  
  public static void main(String... args) {
    RobotBase.startRobot(Robot::new); //needed an indent, don't see any other errors
  }
}
