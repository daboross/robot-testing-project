package org.usfirst.frc.team4030.robot.commands;

import static org.usfirst.frc.team4030.robot.Robot.driveSubsystem;
import static org.usfirst.frc.team4030.robot.Robot.oi;

import org.usfirst.frc.team4030.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.command.Command;

public class RunDrive extends Command {


	private Joystick rightJoystick = new Joystick(1);

	public RunDrive() {
		requires(driveSubsystem);
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		if (Robot.isTank) {
			double left = oi.leftJoystick.getAxis(AxisType.kY);
			double right = oi.leftJoystick.getAxis(AxisType.kY);
			driveSubsystem.setTank(left, right);
		} else {
			double speed = oi.leftJoystick.getAxis(AxisType.kY);
			double turn = oi.leftJoystick.getAxis(AxisType.kX);
			driveSubsystem.setArcade(speed, turn);
		}
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
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
