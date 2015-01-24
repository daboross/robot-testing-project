package org.usfirst.frc.team4030.robot.commands;

import org.usfirst.frc.team4030.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveSwitch extends Command{
	private boolean finished;
	@Override
	protected void initialize() {
		finished = false;
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		Robot.isTank = !Robot.isTank;
		finished = true;
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
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
