
public class Auto extends SequentialCommandGroup {
    public Auto(Succies intake) {
        super.add(
            Commands.wait(3),
            Commands.run(() -> System.out.println(1)),
            new InstantCommand(() -> intake.INeedSucc(.5))
        );
    }
}