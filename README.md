# PRG1000
Need to add the following to the settings.json file for the user:
```json
"java.project.referencedLibraries": [
    "easygraphics.jar"
]
```


Press ctrl+k, ctrl+s

Press "Open Keyboard Shortcuts (JSON)" in the top right ![image](https://user-images.githubusercontent.com/26272249/135271284-cf0a5c26-1c04-4c2a-9e43-f02a081be00c.png)


Add the following:
```json
// Place your key bindings in this file to override the defaultsauto[]
[
    {
        "key": "ctrl+b",
        "command": "-workbench.action.toggleSidebarVisibility"
    },
    {
        "key": "ctrl+b",
        "command": "workbench.action.tasks.runTask",
        "args": "build"
    },
    {
        "key": "ctrl+shift+b",
        "command": "-workbench.action.tasks.build"
    },
    {
        "key": "ctrl+shift+b",
        "command": "workbench.action.tasks.runTask",
        "args": "debug"
    }
]
```
