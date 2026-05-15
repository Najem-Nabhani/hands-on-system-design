package domain

import org.junit.jupiter.api.Test
import org.nnabhani.domain.Video
import kotlin.test.assertEquals

class VideoTest {

    @Test
    fun like_shouldResultInOneLikeCount() {
        val video = Video()
        video.like()
        assertEquals(Pair(1, 0), video.getVotes())
    }

    @Test
    fun dislike_shouldResultInOneDislikeCount() {
        val video = Video()
        video.dislike()
        assertEquals(Pair(0, 1), video.getVotes())
    }

    @Test
    fun clear_shouldResultInZeroLikeAndDislikeCounts() {
        val video = Video()
        video.like()
        video.clear()
        assertEquals(Pair(0, 0), video.getVotes())
    }

}