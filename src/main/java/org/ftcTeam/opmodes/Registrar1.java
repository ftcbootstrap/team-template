package org.ftcTeam.opmodes;

import org.ftcbootstrap.BootstrapRegistrar;
import org.ftcbootstrap.demos.TelemetryTest;
import org.ftcTeam.opmodes.registrar1.GamePadDriveOpMode;


/**
 * Register Op Modes
 */
public class Registrar1 extends BootstrapRegistrar {


  protected Class[] getOpmodeClasses() {
    Class[] classes = {

            GamePadDriveOpMode.class,
            TelemetryTest.class

    };

    return classes;

  }
}
