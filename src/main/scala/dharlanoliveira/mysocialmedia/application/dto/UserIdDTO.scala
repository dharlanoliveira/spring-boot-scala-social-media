package dharlanoliveira.mysocialmedia.application.dto

import com.fasterxml.jackson.annotation.JsonProperty

class UserIdDTO(id: String) {

  @JsonProperty var uid: String = _

  this.uid = id
}