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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * CleanInternationalsMatchesLineupsBelgiumLineup
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-24T11:09:35.462+02:00")
public class CleanInternationalsMatchesLineupsBelgiumLineup   {
  @SerializedName("captain")
  private Boolean captain = null;

  @SerializedName("clubName")
  private String clubName = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("playTime")
  private Long playTime = null;

  @SerializedName("playerId")
  private String playerId = null;

  @SerializedName("shirtNumber")
  private Long shirtNumber = null;

  @SerializedName("totalCaps")
  private Long totalCaps = null;

  @SerializedName("totalSelection")
  private Long totalSelection = null;

  public CleanInternationalsMatchesLineupsBelgiumLineup captain(Boolean captain) {
    this.captain = captain;
    return this;
  }

   /**
   * Get captain
   * @return captain
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCaptain() {
    return captain;
  }

  public void setCaptain(Boolean captain) {
    this.captain = captain;
  }

  public CleanInternationalsMatchesLineupsBelgiumLineup clubName(String clubName) {
    this.clubName = clubName;
    return this;
  }

   /**
   * Get clubName
   * @return clubName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClubName() {
    return clubName;
  }

  public void setClubName(String clubName) {
    this.clubName = clubName;
  }

  public CleanInternationalsMatchesLineupsBelgiumLineup firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CleanInternationalsMatchesLineupsBelgiumLineup links(List<Link> links) {
    this.links = links;
    return this;
  }

  public CleanInternationalsMatchesLineupsBelgiumLineup addLinksItem(Link linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public CleanInternationalsMatchesLineupsBelgiumLineup name(String name) {
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

  public CleanInternationalsMatchesLineupsBelgiumLineup playTime(Long playTime) {
    this.playTime = playTime;
    return this;
  }

   /**
   * Get playTime
   * @return playTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getPlayTime() {
    return playTime;
  }

  public void setPlayTime(Long playTime) {
    this.playTime = playTime;
  }

  public CleanInternationalsMatchesLineupsBelgiumLineup playerId(String playerId) {
    this.playerId = playerId;
    return this;
  }

   /**
   * Get playerId
   * @return playerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  public CleanInternationalsMatchesLineupsBelgiumLineup shirtNumber(Long shirtNumber) {
    this.shirtNumber = shirtNumber;
    return this;
  }

   /**
   * Get shirtNumber
   * @return shirtNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getShirtNumber() {
    return shirtNumber;
  }

  public void setShirtNumber(Long shirtNumber) {
    this.shirtNumber = shirtNumber;
  }

  public CleanInternationalsMatchesLineupsBelgiumLineup totalCaps(Long totalCaps) {
    this.totalCaps = totalCaps;
    return this;
  }

   /**
   * Get totalCaps
   * @return totalCaps
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTotalCaps() {
    return totalCaps;
  }

  public void setTotalCaps(Long totalCaps) {
    this.totalCaps = totalCaps;
  }

  public CleanInternationalsMatchesLineupsBelgiumLineup totalSelection(Long totalSelection) {
    this.totalSelection = totalSelection;
    return this;
  }

   /**
   * Get totalSelection
   * @return totalSelection
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTotalSelection() {
    return totalSelection;
  }

  public void setTotalSelection(Long totalSelection) {
    this.totalSelection = totalSelection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanInternationalsMatchesLineupsBelgiumLineup cleanInternationalsMatchesLineupsBelgiumLineup = (CleanInternationalsMatchesLineupsBelgiumLineup) o;
    return Objects.equals(this.captain, cleanInternationalsMatchesLineupsBelgiumLineup.captain) &&
        Objects.equals(this.clubName, cleanInternationalsMatchesLineupsBelgiumLineup.clubName) &&
        Objects.equals(this.firstName, cleanInternationalsMatchesLineupsBelgiumLineup.firstName) &&
        Objects.equals(this.links, cleanInternationalsMatchesLineupsBelgiumLineup.links) &&
        Objects.equals(this.name, cleanInternationalsMatchesLineupsBelgiumLineup.name) &&
        Objects.equals(this.playTime, cleanInternationalsMatchesLineupsBelgiumLineup.playTime) &&
        Objects.equals(this.playerId, cleanInternationalsMatchesLineupsBelgiumLineup.playerId) &&
        Objects.equals(this.shirtNumber, cleanInternationalsMatchesLineupsBelgiumLineup.shirtNumber) &&
        Objects.equals(this.totalCaps, cleanInternationalsMatchesLineupsBelgiumLineup.totalCaps) &&
        Objects.equals(this.totalSelection, cleanInternationalsMatchesLineupsBelgiumLineup.totalSelection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captain, clubName, firstName, links, name, playTime, playerId, shirtNumber, totalCaps, totalSelection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanInternationalsMatchesLineupsBelgiumLineup {\n");
    
    sb.append("    captain: ").append(toIndentedString(captain)).append("\n");
    sb.append("    clubName: ").append(toIndentedString(clubName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    playTime: ").append(toIndentedString(playTime)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    shirtNumber: ").append(toIndentedString(shirtNumber)).append("\n");
    sb.append("    totalCaps: ").append(toIndentedString(totalCaps)).append("\n");
    sb.append("    totalSelection: ").append(toIndentedString(totalSelection)).append("\n");
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

