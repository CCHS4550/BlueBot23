
public class Succies extends SubsystemBase{
    private final CCsparkMax intakeOne = new CCsparkMax("Intake One", "NO", RobotMap.Intake_One, MotorType.kBrushless, IdleMode.kBrake, RobotMap.ELEVATOR_REVERSE, RobotMap.DRIVE_ENCODER);
    private final CCsparkMax intakeTwo = new CCsparkMax("Intake Two", "NT", RobotMap.Intake_Two, MotorType.kBrushless, IdleMode.kBrake, RobotMap.ELEVATOR_REVERSE, RobotMap.DRIVE_ENCODER);

    MotorControllerGroup Succ = new MotorControllerGroup(intakeOne, intakeTwo);

    public void INeedSucc(double Speeed){
        Succ.set(Speeed);
    }
}//jasicnhdslcbjcbdewkjcb wkjcb ewkjcb,