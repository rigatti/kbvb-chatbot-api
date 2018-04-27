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
 * CleaninternationalsPlayersCareerCareer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-24T11:09:35.462+02:00")
public class CleaninternationalsPlayersCareerCareer   {
  @SerializedName("clubName")
  private String clubName = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("registrationNumber")
  private String registrationNumber = null;

  @SerializedName("startDate")
  private String startDate = null;

  public CleaninternationalsPlayersCareerCareer clubName(String clubName) {
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

  public CleaninternationalsPlayersCareerCareer country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CleaninternationalsPlayersCareerCareer registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * Get registrationNumber
   * @return registrationNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public CleaninternationalsPlayersCareerCareer startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleaninternationalsPlayersCareerCareer cleaninternationalsPlayersCareerCareer = (CleaninternationalsPlayersCareerCareer) o;
    return Objects.equals(this.clubName, cleaninternationalsPlayersCareerCareer.clubName) &&
        Objects.equals(this.country, cleaninternationalsPlayersCareerCareer.country) &&
        Objects.equals(this.registrationNumber, cleaninternationalsPlayersCareerCareer.registrationNumber) &&
        Objects.equals(this.startDate, cleaninternationalsPlayersCareerCareer.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clubName, country, registrationNumber, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleaninternationalsPlayersCareerCareer {\n");
    
    sb.append("    clubName: ").append(toIndentedString(clubName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

