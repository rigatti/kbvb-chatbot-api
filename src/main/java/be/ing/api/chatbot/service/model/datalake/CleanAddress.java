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
 * CleanAddress
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-24T11:09:35.462+02:00")
public class CleanAddress   {
  @SerializedName("country")
  private String country = null;

  @SerializedName("localityName")
  private String localityName = null;

  @SerializedName("postBoxNumber")
  private String postBoxNumber = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("streetName")
  private String streetName = null;

  @SerializedName("streetNumber")
  private String streetNumber = null;

  public CleanAddress country(String country) {
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

  public CleanAddress localityName(String localityName) {
    this.localityName = localityName;
    return this;
  }

   /**
   * Get localityName
   * @return localityName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocalityName() {
    return localityName;
  }

  public void setLocalityName(String localityName) {
    this.localityName = localityName;
  }

  public CleanAddress postBoxNumber(String postBoxNumber) {
    this.postBoxNumber = postBoxNumber;
    return this;
  }

   /**
   * Get postBoxNumber
   * @return postBoxNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostBoxNumber() {
    return postBoxNumber;
  }

  public void setPostBoxNumber(String postBoxNumber) {
    this.postBoxNumber = postBoxNumber;
  }

  public CleanAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public CleanAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public CleanAddress streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Get streetNumber
   * @return streetNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanAddress cleanAddress = (CleanAddress) o;
    return Objects.equals(this.country, cleanAddress.country) &&
        Objects.equals(this.localityName, cleanAddress.localityName) &&
        Objects.equals(this.postBoxNumber, cleanAddress.postBoxNumber) &&
        Objects.equals(this.postalCode, cleanAddress.postalCode) &&
        Objects.equals(this.streetName, cleanAddress.streetName) &&
        Objects.equals(this.streetNumber, cleanAddress.streetNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, localityName, postBoxNumber, postalCode, streetName, streetNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanAddress {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    localityName: ").append(toIndentedString(localityName)).append("\n");
    sb.append("    postBoxNumber: ").append(toIndentedString(postBoxNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
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
