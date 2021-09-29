# Step-by-step Guide

## Windows:
### **Extensions**
To use Java in Visual Studio Code, it is highly recommended to install the following extension pack (endorsed by Microsoft)
: [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

If you wish to add the text alignment extension that we have used in Sublime before, you can get that here: [Alignment](https://marketplace.visualstudio.com/items?itemName=annsk.alignment)


### **Adding EasyGraphics.jar**
To let Visual Studio Code understand that we have EasyGraphics, we need to add a reference to [EasyGraphics.jar](https://dbsys.info/programmering/easygraphics/nedlasting.html). The file is included in this repository, but feel free to download it yourself if you want it directly from the source.

1. Open Visual Studio Code, and press "`CTRL + ,`" (control comma). This will open the settings page.
1. Press the "Open Settings (JSON)" icon in the top right ![image](https://user-images.githubusercontent.com/26272249/135271284-cf0a5c26-1c04-4c2a-9e43-f02a081be00c.png)
. This should take you to the JSON file that contains user settings.
1. Add the following to the list of settings, and don't forget to put a comma after the previous setting.
```json
"java.project.referencedLibraries": [
    "easygraphics.jar"
]
```


### **Modifying keybinds**
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


### **Opening workspace**
After everything is set up:
1. Go to "File -> Open Workspace...".
1. In *your* file explorer, navigate to the .vscode folder downloaded from this page.
1. Open the file "`workspace.code-workspace`" (The extension might be hidden).

You should now have a file explorer on the left side of Visual Studio Code, that hides .class files among others.


## Linux:
No guide yet. If you manage to set it up correctly, please report back so we can fill this.


## Mac:
No guide yet. If you manage to set it up correctly, please report back so we can fill this.