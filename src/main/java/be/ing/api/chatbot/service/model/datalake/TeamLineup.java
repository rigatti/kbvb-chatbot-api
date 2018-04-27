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
 * TeamLineup
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-24T11:09:35.462+02:00")
public class TeamLineup   {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isCaptain")
  private Boolean isCaptain = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("position")
  private String position = null;

  @SerializedName("shirtNumber")
  private Integer shirtNumber = null;

  public TeamLineup firstName(String firstName) {
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

  public TeamLineup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TeamLineup isCaptain(Boolean isCaptain) {
    this.isCaptain = isCaptain;
    return this;
  }

   /**
   * Get isCaptain
   * @return isCaptain
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsCaptain() {
    return isCaptain;
  }

  public void setIsCaptain(Boolean isCaptain) {
    this.isCaptain = isCaptain;
  }

  public TeamLineup lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public TeamLineup links(List<Link> links) {
    this.links = links;
    return this;
  }

  public TeamLineup addLinksItem(Link linksItem) {
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

  public TeamLineup position(String position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public TeamLineup shirtNumber(Integer shirtNumber) {
    this.shirtNumber = shirtNumber;
    return this;
  }

   /**
   * Get shirtNumber
   * @return shirtNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getShirtNumber() {
    return shirtNumber;
  }

  public void setShirtNumber(Integer shirtNumber) {
    this.shirtNumber = shirtNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamLineup teamLineup = (TeamLineup) o;
    return Objects.equals(this.firstName, teamLineup.firstName) &&
        Objects.equals(this.id, teamLineup.id) &&
        Objects.equals(this.isCaptain, teamLineup.isCaptain) &&
        Objects.equals(this.lastName, teamLineup.lastName) &&
        Objects.equals(this.links, teamLineup.links) &&
        Objects.equals(this.position, teamLineup.position) &&
        Objects.equals(this.shirtNumber, teamLineup.shirtNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, id, isCaptain, lastName, links, position, shirtNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamLineup {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCaptain: ").append(toIndentedString(isCaptain)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    shirtNumber: ").append(toIndentedString(shirtNumber)).append("\n");
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
