package ru.netology.coroutines.dto

data class CommentWithAuthor(
    val id: Long,
    val postId: Long,
    val author: Author,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)
