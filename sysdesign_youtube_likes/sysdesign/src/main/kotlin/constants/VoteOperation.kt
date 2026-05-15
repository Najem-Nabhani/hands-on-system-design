package org.nnabhani.constants

enum class VoteOperation(val commandKey: String) {
    LIKE("l"),
    DISLIKE("d"),
    CLEAR("c");

    companion object {
        fun from(command: String): VoteOperation {
            for (operation in entries) {
                if (operation.commandKey == command) {
                    return operation
                }
            }

            throw IllegalArgumentException("Unknown video interaction command: $command")
        }
    }
}