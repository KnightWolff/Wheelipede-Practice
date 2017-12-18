package org.usfirst.frc.team829.robot;

import edu.wpi.first.wpilibj.Joystick;

public abstract class WheelSystem {
	public abstract void update(Joystick DualA, Joystick DualB);
	public abstract void dashboard();
}
