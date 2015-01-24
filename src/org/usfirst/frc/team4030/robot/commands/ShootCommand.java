package org.usfirst.frc.team4030.robot.commands;

import static org.usfirst.frc.team4030.robot.Robot.shooterSubsystem;
import edu.wpi.first.wpilibj.command.Command;

public class ShootCommand extends Command {

	private boolean finished;
	private boolean toggle = false;

	@Override
	protected void initialize() {
		finished = false;
		
	}

	@Override
	protected void execute() {
		toggle = !toggle;
		shooterSubsystem.set(toggle);
		finished = true;
	}

	@Override
	protected boolean isFinished() {
		return finished;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
