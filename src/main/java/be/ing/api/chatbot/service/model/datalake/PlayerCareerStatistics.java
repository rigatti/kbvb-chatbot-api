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
 * PlayerCareerStatistics
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-24T11:09:35.462+02:00")
public class PlayerCareerStatistics   {
  @SerializedName("goals")
  private Integer goals = null;

  @SerializedName("matches")
  private Integer matches = null;

  @SerializedName("redCards")
  private Integer redCards = null;

  @SerializedName("season")
  private String season = null;

  @SerializedName("team")
  private String team = null;

  @SerializedName("yellowCards")
  private Integer yellowCards = null;

  @SerializedName("yellowRedCards")
  private Integer yellowRedCards = null;

  public PlayerCareerStatistics goals(Integer goals) {
    this.goals = goals;
    return this;
  }

   /**
   * Get goals
   * @return goals
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGoals() {
    return goals;
  }

  public void setGoals(Integer goals) {
    this.goals = goals;
  }

  public PlayerCareerStatistics matches(Integer matches) {
    this.matches = matches;
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMatches() {
    return matches;
  }

  public void setMatches(Integer matches) {
    this.matches = matches;
  }

  public PlayerCareerStatistics redCards(Integer redCards) {
    this.redCards = redCards;
    return this;
  }

   /**
   * Get redCards
   * @return redCards
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRedCards() {
    return redCards;
  }

  public void setRedCards(Integer redCards) {
    this.redCards = redCards;
  }

  public PlayerCareerStatistics season(String season) {
    this.season = season;
    return this;
  }

   /**
   * Get season
   * @return season
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSeason() {
    return season;
  }

  public void setSeason(String season) {
    this.season = season;
  }

  public PlayerCareerStatistics team(String team) {
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public PlayerCareerStatistics yellowCards(Integer yellowCards) {
    this.yellowCards = yellowCards;
    return this;
  }

   /**
   * Get yellowCards
   * @return yellowCards
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getYellowCards() {
    return yellowCards;
  }

  public void setYellowCards(Integer yellowCards) {
    this.yellowCards = yellowCards;
  }

  public PlayerCareerStatistics yellowRedCards(Integer yellowRedCards) {
    this.yellowRedCards = yellowRedCards;
    return this;
  }

   /**
   * Get yellowRedCards
   * @return yellowRedCards
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getYellowRedCards() {
    return yellowRedCards;
  }

  public void setYellowRedCards(Integer yellowRedCards) {
    this.yellowRedCards = yellowRedCards;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerCareerStatistics playerCareerStatistics = (PlayerCareerStatistics) o;
    return Objects.equals(this.goals, playerCareerStatistics.goals) &&
        Objects.equals(this.matches, playerCareerStatistics.matches) &&
        Objects.equals(this.redCards, playerCareerStatistics.redCards) &&
        Objects.equals(this.season, playerCareerStatistics.season) &&
        Objects.equals(this.team, playerCareerStatistics.team) &&
        Objects.equals(this.yellowCards, playerCareerStatistics.yellowCards) &&
        Objects.equals(this.yellowRedCards, playerCareerStatistics.yellowRedCards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goals, matches, redCards, season, team, yellowCards, yellowRedCards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerCareerStatistics {\n");
    
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    redCards: ").append(toIndentedString(redCards)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    yellowCards: ").append(toIndentedString(yellowCards)).append("\n");
    sb.append("    yellowRedCards: ").append(toIndentedString(yellowRedCards)).append("\n");
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

