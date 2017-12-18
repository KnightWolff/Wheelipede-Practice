package org.usfirst.frc.team829.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.CANTalon;

public abstract class WheelDrive extends WheelSystem {
	
	//Objects
	CANTalon RFD, LFD, RBD, LBD;
	
	public Drive() {
		
		try {
			Right_Front = new CANTalon(ButtonMap.RFD);
			Left_Front = new CANTalon(ButtonMap.LFD);
			Right_Back = new CANTalon(ButtonMap.RBD);
			
		} catch (Exception e) {
			System.out.println("Hey there pal, something went wrong my boy.");
		}
	}

}
