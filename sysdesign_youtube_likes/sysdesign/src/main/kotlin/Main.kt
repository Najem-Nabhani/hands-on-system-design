package org.nnabhani

import org.nnabhani.constants.VoteOperation
import org.nnabhani.constants.SystemOperation
import org.nnabhani.domain.Video
import org.nnabhani.userinterface.VideoRendered

fun main() {
    val howtoMessage = "\nSupported commands are: ${VoteOperation.entries.joinToString(", ") { it.commandKey }} for video interactions \n" +
            "${SystemOperation.HELP.commandKey} for help \n${SystemOperation.QUIT.commandKey} to quit the application.\n"

    println(howtoMessage)

    val video = Video()
    val ui = VideoRendered(video)

    while (true) {
        val command = readln().trim().lowercase()
        if (SystemOperation.isHelp(command)) {
            println(howtoMessage)
            continue
        }
        if (SystemOperation.shouldExitApplication(command)) {
            break
        }

        val voteOperation = try {
            VoteOperation.from(command)
        } catch (e: IllegalArgumentException) {
            println(e.message)
            continue
        }

        when (voteOperation) {
            VoteOperation.LIKE -> video.like()
            VoteOperation.DISLIKE -> video.dislike()
            VoteOperation.CLEAR -> video.clear()
        }

        ui.render()
    }
}