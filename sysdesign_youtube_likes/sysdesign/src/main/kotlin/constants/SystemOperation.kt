package org.nnabhani.constants

enum class SystemOperation(val commandKey: String) {
    HELP("h"),
    QUIT("q");

    companion object {
        fun isHelp(command: String): Boolean =
            command == HELP.commandKey || command == "help"


        fun shouldExitApplication(command: String): Boolean =
            QUIT.commandKey == command
    }
}