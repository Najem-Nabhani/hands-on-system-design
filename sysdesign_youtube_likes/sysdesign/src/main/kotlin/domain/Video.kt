package org.nnabhani.domain

class Video {
    var likesCounter: Int = 0
        private set
    var dislikesCounter: Int = 0
        private set

    fun like() {
        likesCounter = 1
        dislikesCounter = 0
    }

    fun dislike() {
        likesCounter = 0
        dislikesCounter = 1
    }

    fun clear() {
        likesCounter = 0
        dislikesCounter = 0
    }

    fun getVotes(): Pair<Int, Int> {
        return Pair(likesCounter, dislikesCounter)
    }
}