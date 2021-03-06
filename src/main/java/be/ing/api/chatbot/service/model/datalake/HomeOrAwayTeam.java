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
 * HomeOrAwayTeam
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-24T11:09:35.462+02:00")
public class HomeOrAwayTeam   {
  @SerializedName("areAllMatchesCancelled")
  private Boolean areAllMatchesCancelled = null;

  @SerializedName("goalsScored")
  private Integer goalsScored = null;

  @SerializedName("isBye")
  private Boolean isBye = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("penaltiesScored")
  private Integer penaltiesScored = null;

  @SerializedName("penaltyShootOutsScored")
  private Integer penaltyShootOutsScored = null;

  @SerializedName("teamId")
  private String teamId = null;

  public HomeOrAwayTeam areAllMatchesCancelled(Boolean areAllMatchesCancelled) {
    this.areAllMatchesCancelled = areAllMatchesCancelled;
    return this;
  }

   /**
   * Get areAllMatchesCancelled
   * @return areAllMatchesCancelled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAreAllMatchesCancelled() {
    return areAllMatchesCancelled;
  }

  public void setAreAllMatchesCancelled(Boolean areAllMatchesCancelled) {
    this.areAllMatchesCancelled = areAllMatchesCancelled;
  }

  public HomeOrAwayTeam goalsScored(Integer goalsScored) {
    this.goalsScored = goalsScored;
    return this;
  }

   /**
   * Get goalsScored
   * @return goalsScored
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGoalsScored() {
    return goalsScored;
  }

  public void setGoalsScored(Integer goalsScored) {
    this.goalsScored = goalsScored;
  }

  public HomeOrAwayTeam isBye(Boolean isBye) {
    this.isBye = isBye;
    return this;
  }

   /**
   * Get isBye
   * @return isBye
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsBye() {
    return isBye;
  }

  public void setIsBye(Boolean isBye) {
    this.isBye = isBye;
  }

  public HomeOrAwayTeam name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HomeOrAwayTeam penaltiesScored(Integer penaltiesScored) {
    this.penaltiesScored = penaltiesScored;
    return this;
  }

   /**
   * Get penaltiesScored
   * @return penaltiesScored
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPenaltiesScored() {
    return penaltiesScored;
  }

  public void setPenaltiesScored(Integer penaltiesScored) {
    this.penaltiesScored = penaltiesScored;
  }

  public HomeOrAwayTeam penaltyShootOutsScored(Integer penaltyShootOutsScored) {
    this.penaltyShootOutsScored = penaltyShootOutsScored;
    return this;
  }

   /**
   * Get penaltyShootOutsScored
   * @return penaltyShootOutsScored
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPenaltyShootOutsScored() {
    return penaltyShootOutsScored;
  }

  public void setPenaltyShootOutsScored(Integer penaltyShootOutsScored) {
    this.penaltyShootOutsScored = penaltyShootOutsScored;
  }

  public HomeOrAwayTeam teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HomeOrAwayTeam homeOrAwayTeam = (HomeOrAwayTeam) o;
    return Objects.equals(this.areAllMatchesCancelled, homeOrAwayTeam.areAllMatchesCancelled) &&
        Objects.equals(this.goalsScored, homeOrAwayTeam.goalsScored) &&
        Objects.equals(this.isBye, homeOrAwayTeam.isBye) &&
        Objects.equals(this.name, homeOrAwayTeam.name) &&
        Objects.equals(this.penaltiesScored, homeOrAwayTeam.penaltiesScored) &&
        Objects.equals(this.penaltyShootOutsScored, homeOrAwayTeam.penaltyShootOutsScored) &&
        Objects.equals(this.teamId, homeOrAwayTeam.teamId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areAllMatchesCancelled, goalsScored, isBye, name, penaltiesScored, penaltyShootOutsScored, teamId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomeOrAwayTeam {\n");
    
    sb.append("    areAllMatchesCancelled: ").append(toIndentedString(areAllMatchesCancelled)).append("\n");
    sb.append("    goalsScored: ").append(toIndentedString(goalsScored)).append("\n");
    sb.append("    isBye: ").append(toIndentedString(isBye)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    penaltiesScored: ").append(toIndentedString(penaltiesScored)).append("\n");
    sb.append("    penaltyShootOutsScored: ").append(toIndentedString(penaltyShootOutsScored)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
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

