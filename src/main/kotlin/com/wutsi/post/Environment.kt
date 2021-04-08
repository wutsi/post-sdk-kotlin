package com.wutsi.post

enum class Environment(public val url: String) {
  SANDBOX("https://int-com-wutsi-blog.herokuapp.com"),
  PRODUCTION("https://com-wutsi-blog.herokuapp.com")
}
