# team-template

This repo is provided here to serve as a template for FTC teams to quickly create on or more Team Code modules to write their opmodes against.  For more information about how to write opmodes in this environment see: https://github.com/ftcbootstrap/training.  


<h1> Installation Instructions </h1>

-Download or clone the training module repo ( https://github.com/ftcbootstrap/team-template) to your local machine.  
-Download or clone the dependent utilities repo ( https://github.com/ftcbootstrap/ftc-utilities) to your local machine.  
-Copy the two directories under the ftc-app root project and change the ftc-app/settings.gradle file to look like this:

```
include ':FtcRobotController'
include ':ftc-utilities'
include ':team####'
```

Note: If you download either repo as a zip file, make sure the extracted directory name does not have a "-master" suffix and matches the name included in the settings.gradle file above.    Also make sure that the extract directory does not have a another subdirectory with the same name.  If this is the case then copy the lowest level directory under the ftc-app root project.
