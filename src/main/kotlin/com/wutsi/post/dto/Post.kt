package com.wutsi.post.dto

import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Long
import kotlin.String

public data class Post(
  public val id: Long = 0,
  public val storyId: Long = 0,
  public val channelType: String = "",
  public val status: String = "",
  public val message: String? = null,
  public val pictureUrl: String? = null,
  public val includeLink: Boolean = true,
  public val language: String? = null,
  public val scheduledPostDateTime: OffsetDateTime = OffsetDateTime.now(),
  public val postDateTime: OffsetDateTime = OffsetDateTime.now(),
  public val modificationDateTime: OffsetDateTime = OffsetDateTime.now()
)
