/**
 * datalake-cache.appspot.com
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package be.ing.api.chatbot.service.model.datalake;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * CleanBbfCheckin
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-24T11:09:35.462+02:00")
public class CleanBbfCheckin   {
  @SerializedName("matchId")
  private String matchId = null;

  @SerializedName("optPresence")
  private String optPresence = null;

  public CleanBbfCheckin matchId(String matchId) {
    this.matchId = matchId;
    return this;
  }

   /**
   * Get matchId
   * @return matchId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMatchId() {
    return matchId;
  }

  public void setMatchId(String matchId) {
    this.matchId = matchId;
  }

  public CleanBbfCheckin optPresence(String optPresence) {
    this.optPresence = optPresence;
    return this;
  }

   /**
   * Get optPresence
   * @return optPresence
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOptPresence() {
    return optPresence;
  }

  public void setOptPresence(String optPresence) {
    this.optPresence = optPresence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanBbfCheckin cleanBbfCheckin = (CleanBbfCheckin) o;
    return Objects.equals(this.matchId, cleanBbfCheckin.matchId) &&
        Objects.equals(this.optPresence, cleanBbfCheckin.optPresence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchId, optPresence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanBbfCheckin {\n");
    
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    optPresence: ").append(toIndentedString(optPresence)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

