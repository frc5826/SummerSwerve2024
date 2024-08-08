package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import swervelib.SwerveDrive;
import swervelib.parser.SwerveParser;
import swervelib.telemetry.SwerveDriveTelemetry;

import java.io.File;

public class Swerve extends SubsystemBase {

    private SwerveDrive swerveDrive;

    public Swerve(File directory) {

        //Avoid creation of unnecessary stuff (?)
        SwerveDriveTelemetry.verbosity = SwerveDriveTelemetry.TelemetryVerbosity.HIGH;

        try {
            swerveDrive = new SwerveParser(directory).createSwerveDrive(2);
        }
        catch (Exception e){
            System.out.println("Failed to build Swerve Drive");
        }
    }
}
