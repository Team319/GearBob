// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc319.GearBob.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

import org.usfirst.frc319.GearBob.commands.Gear.GearCollectorArmDeploy;
import org.usfirst.frc319.GearBob.commands.Gear.GearCollectorArmGoToDepositGear;
import org.usfirst.frc319.GearBob.commands.Gear.GearCollectorHold;
import org.usfirst.frc319.GearBob.commands.Gear.GearCollectorIn;
import org.usfirst.frc319.GearBob.commands.Gear.GearCollectorInUntilCollected;

import org.usfirst.frc319.GearBob.subsystems.*;

/**
 *
 */
public class AutomatedCollectGearAndLift extends CommandGroup {


  
    public AutomatedCollectGearAndLift() {
    	
    	//addSequential(new StartGearRumble(1.0));
    	addSequential(new GearCollectorArmDeploy());
    	addSequential(new GearCollectorIn(),1); // run for 1 second to get past current spike
    	addSequential(new GearCollectorInUntilCollected()); // runs until current is exceeded
    	//addSequential(new SetDrivetrainSpeedLimits(1000.0, -100.0));
    	addSequential(new GearCollectorHold());
    	//addSequential(new StopGearRumble());
    	addSequential(new WaitCommand(0.5)); //reduced from 1.0 at Summer Heat
    	addSequential(new GearCollectorArmGoToDepositGear());
    	addSequential(new WaitCommand(1.0));
    	//addSequential(new ResetDrivetrainSpeedLimits());
    	
   
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        
 
    } 
}
