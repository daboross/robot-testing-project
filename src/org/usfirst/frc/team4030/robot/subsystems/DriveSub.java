package org.usfirst.frc.team4030.robot.subsystems;

import org.usfirst.frc.team4030.robot.commands.RunDrive;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSub extends Subsystem{
	
	
	private Jaguar leftMotor;
	private Jaguar rightMotor;
	private RobotDrive robotDrive;
	
	public DriveSub() {
		leftMotor = new Jaguar(0);
		rightMotor = new Jaguar(1);
		robotDrive = new RobotDrive(leftMotor, rightMotor);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new RunDrive());
		
	}
	
	public void setTank(double left, double right) {
		leftMotor.set(left);
		rightMotor.set(-right);
	}
	
	public void setArcade(double speed, double turn) {
		robotDrive.arcadeDrive(speed, turn);
	}
	
	public void set2() {
		
	}
}
