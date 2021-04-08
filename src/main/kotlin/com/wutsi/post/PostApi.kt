package com.wutsi.post

import com.wutsi.post.dto.GetPostResponse
import feign.Param
import feign.RequestLine
import kotlin.Long

public interface PostApi {
  @RequestLine("GET /v1/posts/{id}")
  public fun `get`(@Param("id") id: Long): GetPostResponse
}
