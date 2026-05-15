package org.nnabhani.userinterface

import org.nnabhani.domain.Video

class VideoRendered(val video: Video) {
    internal fun render() {
        val (l, d) = video.getVotes()
        println(
            """
            ╔════════════════════════════╗
            ║ ▶ 00:13 / 03:45     ⛶     ║
            ║                            ║
            ║          ▷                 ║
            ║                            ║
            ║ ▓▓▓▓▓▓▓▓▓░░░░░░░░░░░       ║
            ║ 👍 $l  👎 $d                 ║
            ╚════════════════════════════╝
        """
        )
    }
}