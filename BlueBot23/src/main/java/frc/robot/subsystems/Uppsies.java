import edu.wpi.first.wpilibj.Controller;
import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Uppsies extends SubsystemBase{
    
    private final CCSparkMax elevator = new CCSparkMax("Elevator Moter", "em", RobotMap.ELEVATOR, MotorType.kBrushless, IdleMode.kBrake, RobotMap.ELEVATOR_REVERSE, RobotMap.DRIVE_ENCODER);

    public void INeedUppsies(double speed){
        elevator.set(speed);

    } // leedleleedleleeedlele - Patrick Star
    public RunCommand elevatorUppies(double target) {
        PidController controllerUppsies = new PidController(.5,0,0);
        return new RunCommand(() -> {
            controllerUppsies.calculate(elevator.getPosition(), target);
            INeedUppsies();
        }, this) {
            @Override
            public boolean isFinished() {
                return false;
            }
        };
    }

    
}