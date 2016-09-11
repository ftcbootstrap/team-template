package org.ftcTeam;

import org.ftcbootstrap.BootstrapRegistrar;
import org.ftcbootstrap.demos.TelemetryTest;

import com.qualcomm.robotcore.eventloop.opmode.OpModeManager;
import com.qualcomm.robotcore.eventloop.opmode.OpModeRegister;


import org.ftcTeam.opmodes.GamePadDriveOpMode;


/**
 * Register Op Modes
 */
public class FTCTeamRegistry extends BootstrapRegistrar {


  protected Class[] getOpmodeClasses() {
    Class[] classes = {

            GamePadDriveOpMode.class,
            TelemetryTest.class

    };

    return classes;

  }
}
