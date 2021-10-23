package dharlanoliveira.mysocialmedia.application.dto

import com.fasterxml.jackson.annotation.JsonProperty

import java.time.LocalDateTime

class CommentDTO {

  @JsonProperty
  var text: String = _

  @JsonProperty
  var instant: LocalDateTime = _

}
