//Nothing on this one. Onward!

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

public final class Main {
  private Main() {
  }

  
  public static void main(String... args) {
    RobotBase.startRobot(Robot::new);
  }
}
