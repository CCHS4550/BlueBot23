public class Uppsies extends SubsystemBase{
    
    private final CCsparkMax elevator = new CCsparkMax("Elevator Moter", "em", RobotMap.ELEVATOR, MotorType.kBrushless, IdleMode.kBrake, RobotMap.ELEVATOR_REVERSE, RobotMap.DRIVE_ENCODER);

    public void INeedUppsies(double speed){
        elevator.set(speed * Constants.power);
    }

    
}