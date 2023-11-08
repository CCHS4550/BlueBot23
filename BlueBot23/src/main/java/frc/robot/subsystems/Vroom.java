
public class Vroom extends SubsystemBase {
    private final CCsparkMax frontLeft = new CCsparkMax("Front Left", "fl", RobotMap.FRONT_LEFT, MotorType.kBrushless, IdleMode.kBrake, RobotMap.FRONT_LEFT_REVERSE, RobotMap.DRIVE_ENCODER);
    private final CCsparkMax frontRight = new CCsparkMax("Front Right", "fr", RobotMap.FRONT_RIGHT, MotorType.kBrushless, IdleMode.kBrake, RobotMap.FRONT_RIGHT_REVERSE, RobotMap.DRIVE_ENCODER);
    private final CCsparkMax backLeft = new CCsparkMax("Back Left", "bl", RobotMap.BACK_LEFT, MotorType.kBrushless, IdleMode.kBrake, RobotMap.BACK_LEFT_REVERSE, RobotMap.DRIVE_ENCODER);
    private final CCsparkMax backRight = new CCsparkMax("Back Right", "br", RobotMap.BACK_RIGHT, MotorType.kBrushless, IdleMode.kBrake, RobotMap.BACK_RIGHT_REVERSE, RobotMap.DRIVE_ENCODER);

    MotorControllerGroup left = new MotorControllerGroup(frontleft, backleft);
    MotorControllerGroup right = new MotorControllerGroup(frontright, backright);

    DifferentialDrive difDrive = new DifferentialDrive(left, right);

    public void drive(double moveSpeed, double turnSpeed){
        difDrive.arcadeDrive(movespeed, turnspeed);
    }
}