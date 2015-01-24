package org.usfirst.frc.team4030.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ShootSub extends Subsystem{

	private Solenoid shooterExtend = new Solenoid(0);
	private Solenoid shooterRetract = new Solenoid(1);

	@Override
	protected void initDefaultCommand() {}
	
	public void set (boolean retract) {
		shooterExtend.set(!retract);
		shooterRetract.set(retract);
		
	}

}
