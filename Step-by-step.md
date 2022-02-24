# Step-by-step Guide
### Fork it!
Fork this repository onto your own GitHub user. If you do this, you can receive updates to script and settings files if there are any.

Alternatively, download this repository onto your computer, but please try to use a form of version control, as it will help you manage the code.

## Download libraries
You will need to download the following libraries and place them in the root folder of this repository:
- [EasyGraphics.java](https://dbsys.info/programmering/easygraphics/download/EasyGraphics.java), for compilation. (Right click and "save link as.." to download)
- [EasyGraphics.jar](https://dbsys.info/programmering/easygraphics/download/easygraphics.jar), for syntax.
- [JavaFX](https://download2.gluonhq.com/openjfx/17.0.1/openjfx-17.0.1_windows-x64_bin-sdk.zip), extract so you have the "javafx-sdk-17.0.1" folder placed into the root of this repository.
- [SQLite JDBC](https://github.com/xerial/sqlite-jdbc/releases/download/3.36.0.3/sqlite-jdbc-3.36.0.3.jar), for communication with SQLite.

Windows/Linux (not mac):
Download the binaries for SQLite ([Windows](https://sqlite.org/2022/sqlite-tools-win32-x86-3380000.zip)/[Linux](https://sqlite.org/2022/sqlite-tools-linux-x86-3380000.zip)), and unpack them into the root folder.

Windows only:
Download and extract [this API](https://sqlite.org/2022/sqlite-dll-win64-x64-3380000.zip) into your root folder.


## **Extensions**
- [VSCode Java Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- [Alignment](https://marketplace.visualstudio.com/items?itemName=annsk.alignment) (optional), if you wish to add the text alignment extension that the teacher recommends.


## **Adding libraries**
To let Visual Studio Code understand what libraries we have, we need to add a reference to them.

1. Open Visual Studio Code, and press "`CTRL + ,`" (control comma). This will open the settings page.
1. Press the "Open Settings (JSON)" icon in the top right ![image](https://user-images.githubusercontent.com/26272249/135271284-cf0a5c26-1c04-4c2a-9e43-f02a081be00c.png)
. This should take you to the JSON file that contains user settings.
1. Add the following to the list of settings, and don't forget to put a comma after the previous setting.
```json
"java.project.referencedLibraries": [
    "easygraphics.jar",
    "sqlite-jdbc-3.36.0.3.jar",
    "javafx-sdk-17.0.1/lib/*"
]
```


## **Modifying keybinds**
For quickly and easily compiling and running code, we will replace a couple of keyboard shortcuts with our own.
1. Open Visual Studio Code, and press "`CTRL + K`" followed by "`CTRL + S`". This will open the keyboard shortcuts page.
1. Press the "Open Keyboard Shortcuts (JSON)" icon in the top right ![image](https://user-images.githubusercontent.com/26272249/135271284-cf0a5c26-1c04-4c2a-9e43-f02a081be00c.png)
. This should take you to the JSON file that contains all modified keybinds.
1. If the file only has the basic template, then you can replace it all with this:
```json
// Place your key bindings in this file to override the defaultsauto[]
[
    {
        // Removes the original 'CTRL + B' keybind
        "key": "ctrl+b",
        "command": "-workbench.action.toggleSidebarVisibility"
    },
    {
        // Adds the 'CTRL + B' bind to build the file
        "key": "ctrl+b",
        "command": "workbench.action.tasks.runTask",
        "args": "build"
    },
    {
        // Removes the original 'CTRL + SHIFT + B' keybind
        "key": "ctrl+shift+b",
        "command": "-workbench.action.tasks.build"
    },
    {
        // Adds the 'CTRL + SHIFT + B' bind to build and run the file
        "key": "ctrl+shift+b",
        "command": "workbench.action.tasks.runTask",
        "args": "debug"
    }
]
```
*If you already have keybinds here, copy the new keybindings into the file using the same format.*

If you want to see the scripts that will be run by the new keybinds, please check out the [tasks.json](.vscode/tasks.json) file.


## **Opening workspace**
After everything is set up:
1. Go to "File -> Open Workspace...".
1. In *your* file explorer, navigate to the .vscode folder downloaded from this page.
1. Open the file "`workspace.code-workspace`" (The extension might be hidden).

You should now have a file explorer on the left side of Visual Studio Code, that hides .class files among others.
