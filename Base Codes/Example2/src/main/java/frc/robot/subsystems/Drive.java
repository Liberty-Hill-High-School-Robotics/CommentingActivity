
//There is an error on line 30, add a comment for how you found it.
//There is an error on line 41, add a comment for how you found it.
//There are two errors on line 71, add a comment for how you found it.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;



public class Drive extends SubsystemBase {
    private final double WHEEL_DIAMETER = 6.0;
    private final double TICKS_PER_ROTATION = 4096;
    

    private WPI_TalonSRX talonSRXR;
    private WPI_TalonSRX talonSRXL;
    private DifferentialDrive driveMain;
    private WPI_VictorSPX victorSPXL;
    private WPI_VictorSPX victorSPXR;
    private AnalogGyro gyrue;

    public Boolean PreciseMode;
    
    private final double NORMAL_DRIVE_SPEED_FACTOR = 1.0;
    private final double PRECISE_DRIVE_SPEED_FACTOR = 0.4;
    private final double MAX_STOP_SPEED = .35;

    private int counter;
    

    public Drive(1) {
        talonSRXR = new WPI_TalonSRX(4);
        talonSRXR.configFactoryDefault();
        talonSRXR.setInverted(true); 
        talonSRXR.setNeutralMode(NeutralMode.Coast);

        victorSPXR = new WPI_VictorSPX(5);
        victorSPXR.configFactoryDefault();
        victorSPXR.follow(talonSRXR);
        victorSPXR.setInverted(InvertType.FollowMaster);
        victorSPXR.setNeutralMode(NeutralMode.Coast);
    
        talonSRXL = new WPI_TalonSRX(6);
        talonSRXL.configFactoryDefault();
        talonSRXL.setInverted(false);
        talonSRXL.setNeutralMode(NeutralMode.Coast);

        victorSPXL = new WPI_VictorSPX(7);
        victorSPXL.configFactoryDefault();
        victorSPXL.follow(talonSRXL);
        victorSPXL.setInverted(InvertType.FollowMaster);
        victorSPXL.setNeutralMode(NeutralMode.Coast);
 
        driveMain = new DifferentialDrive(talonSRXL, talonSRXR);
        addChild("driveMain",driveMain);
        driveMain.setSafetyEnabled(true);
        driveMain.setExpiration(0.1);
        driveMain.setMaxOutput(1.0);

        gyro = new AnalogGyro(0);
        addChild("gyue",gyrue);
        gyro.setSensitivity(0.007);
        setNormalMode();
    }

    @Override
    public void periodic() {       
    }

    @Override
    public void simulationPeriodic() {
    }


    public void DriveArcade(double speed, double rotation) {
        double adjustedSpeed;
        double currentOutput;



        adjustedSpeed = speed;       
        currentOutput = talonSRXR.get();


        if (currentOutput > speed && currentOutput >= MAX_STOP_SPEED) { 
            adjustedSpeed = currentOutput - .0001;
            counter++;
        }



        driveMain.arcadeDrive(adjustedSpeed, rotation);
    }

    public double getPIDCommand_Input(){
        return gyro.getAngle()%360;
    }

    public void setThisPID(double output){
        driveMain.arcadeDrive(0, output);
    }

    public void driveDistance(double distance){
        double target = WHEEL_DIAMETER * Math.PI * TICKS_PER_ROTATION;
        target = target / distance;
        talonSRXL.set(ControlMode.Position, target);
        talonSRXR.set(ControlMode.Position, target);
    }

    public void driveStop(){
        talonSRXL.stopMotor();
        talonSRXR.stopMotor();
    }

    public void setPrecissionMode(){
        driveMain.setMaxOutput(PRECISE_DRIVE_SPEED_FACTOR);
        PreciseMode = true;
    }

    public void setNormalMode(){
        driveMain.setMaxOutput(NORMAL_DRIVE_SPEED_FACTOR);
        PreciseMode = false;
    }
}

