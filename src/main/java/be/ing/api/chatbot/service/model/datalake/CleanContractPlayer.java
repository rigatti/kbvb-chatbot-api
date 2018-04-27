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
 * CleanContractPlayer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-24T11:09:35.462+02:00")
public class CleanContractPlayer   {
  @SerializedName("buyOption")
  private String buyOption = null;

  @SerializedName("clubName")
  private String clubName = null;

  @SerializedName("contract")
  private String contract = null;

  @SerializedName("endDateContract")
  private String endDateContract = null;

  @SerializedName("endDateTempContract")
  private String endDateTempContract = null;

  @SerializedName("endDateTransfer")
  private String endDateTransfer = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("nationality")
  private String nationality = null;

  @SerializedName("nbrOfYearsContract")
  private Integer nbrOfYearsContract = null;

  @SerializedName("registrationNumber")
  private Integer registrationNumber = null;

  @SerializedName("startDateContract")
  private String startDateContract = null;

  @SerializedName("startDateTempContract")
  private String startDateTempContract = null;

  @SerializedName("startDateTransfer")
  private String startDateTransfer = null;

  @SerializedName("tempContract")
  private String tempContract = null;

  @SerializedName("transferType")
  private String transferType = null;

  @SerializedName("yearOfBirth")
  private Integer yearOfBirth = null;

  public CleanContractPlayer buyOption(String buyOption) {
    this.buyOption = buyOption;
    return this;
  }

   /**
   * Get buyOption
   * @return buyOption
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBuyOption() {
    return buyOption;
  }

  public void setBuyOption(String buyOption) {
    this.buyOption = buyOption;
  }

  public CleanContractPlayer clubName(String clubName) {
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

  public CleanContractPlayer contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public CleanContractPlayer endDateContract(String endDateContract) {
    this.endDateContract = endDateContract;
    return this;
  }

   /**
   * Get endDateContract
   * @return endDateContract
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndDateContract() {
    return endDateContract;
  }

  public void setEndDateContract(String endDateContract) {
    this.endDateContract = endDateContract;
  }

  public CleanContractPlayer endDateTempContract(String endDateTempContract) {
    this.endDateTempContract = endDateTempContract;
    return this;
  }

   /**
   * Get endDateTempContract
   * @return endDateTempContract
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndDateTempContract() {
    return endDateTempContract;
  }

  public void setEndDateTempContract(String endDateTempContract) {
    this.endDateTempContract = endDateTempContract;
  }

  public CleanContractPlayer endDateTransfer(String endDateTransfer) {
    this.endDateTransfer = endDateTransfer;
    return this;
  }

   /**
   * Get endDateTransfer
   * @return endDateTransfer
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndDateTransfer() {
    return endDateTransfer;
  }

  public void setEndDateTransfer(String endDateTransfer) {
    this.endDateTransfer = endDateTransfer;
  }

  public CleanContractPlayer firstName(String firstName) {
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

  public CleanContractPlayer id(String id) {
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

  public CleanContractPlayer lastName(String lastName) {
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

  public CleanContractPlayer nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public CleanContractPlayer nbrOfYearsContract(Integer nbrOfYearsContract) {
    this.nbrOfYearsContract = nbrOfYearsContract;
    return this;
  }

   /**
   * Get nbrOfYearsContract
   * @return nbrOfYearsContract
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNbrOfYearsContract() {
    return nbrOfYearsContract;
  }

  public void setNbrOfYearsContract(Integer nbrOfYearsContract) {
    this.nbrOfYearsContract = nbrOfYearsContract;
  }

  public CleanContractPlayer registrationNumber(Integer registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * Get registrationNumber
   * @return registrationNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(Integer registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public CleanContractPlayer startDateContract(String startDateContract) {
    this.startDateContract = startDateContract;
    return this;
  }

   /**
   * Get startDateContract
   * @return startDateContract
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStartDateContract() {
    return startDateContract;
  }

  public void setStartDateContract(String startDateContract) {
    this.startDateContract = startDateContract;
  }

  public CleanContractPlayer startDateTempContract(String startDateTempContract) {
    this.startDateTempContract = startDateTempContract;
    return this;
  }

   /**
   * Get startDateTempContract
   * @return startDateTempContract
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStartDateTempContract() {
    return startDateTempContract;
  }

  public void setStartDateTempContract(String startDateTempContract) {
    this.startDateTempContract = startDateTempContract;
  }

  public CleanContractPlayer startDateTransfer(String startDateTransfer) {
    this.startDateTransfer = startDateTransfer;
    return this;
  }

   /**
   * Get startDateTransfer
   * @return startDateTransfer
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStartDateTransfer() {
    return startDateTransfer;
  }

  public void setStartDateTransfer(String startDateTransfer) {
    this.startDateTransfer = startDateTransfer;
  }

  public CleanContractPlayer tempContract(String tempContract) {
    this.tempContract = tempContract;
    return this;
  }

   /**
   * Get tempContract
   * @return tempContract
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTempContract() {
    return tempContract;
  }

  public void setTempContract(String tempContract) {
    this.tempContract = tempContract;
  }

  public CleanContractPlayer transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  public CleanContractPlayer yearOfBirth(Integer yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
    return this;
  }

   /**
   * Get yearOfBirth
   * @return yearOfBirth
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(Integer yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanContractPlayer cleanContractPlayer = (CleanContractPlayer) o;
    return Objects.equals(this.buyOption, cleanContractPlayer.buyOption) &&
        Objects.equals(this.clubName, cleanContractPlayer.clubName) &&
        Objects.equals(this.contract, cleanContractPlayer.contract) &&
        Objects.equals(this.endDateContract, cleanContractPlayer.endDateContract) &&
        Objects.equals(this.endDateTempContract, cleanContractPlayer.endDateTempContract) &&
        Objects.equals(this.endDateTransfer, cleanContractPlayer.endDateTransfer) &&
        Objects.equals(this.firstName, cleanContractPlayer.firstName) &&
        Objects.equals(this.id, cleanContractPlayer.id) &&
        Objects.equals(this.lastName, cleanContractPlayer.lastName) &&
        Objects.equals(this.nationality, cleanContractPlayer.nationality) &&
        Objects.equals(this.nbrOfYearsContract, cleanContractPlayer.nbrOfYearsContract) &&
        Objects.equals(this.registrationNumber, cleanContractPlayer.registrationNumber) &&
        Objects.equals(this.startDateContract, cleanContractPlayer.startDateContract) &&
        Objects.equals(this.startDateTempContract, cleanContractPlayer.startDateTempContract) &&
        Objects.equals(this.startDateTransfer, cleanContractPlayer.startDateTransfer) &&
        Objects.equals(this.tempContract, cleanContractPlayer.tempContract) &&
        Objects.equals(this.transferType, cleanContractPlayer.transferType) &&
        Objects.equals(this.yearOfBirth, cleanContractPlayer.yearOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyOption, clubName, contract, endDateContract, endDateTempContract, endDateTransfer, firstName, id, lastName, nationality, nbrOfYearsContract, registrationNumber, startDateContract, startDateTempContract, startDateTransfer, tempContract, transferType, yearOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanContractPlayer {\n");
    
    sb.append("    buyOption: ").append(toIndentedString(buyOption)).append("\n");
    sb.append("    clubName: ").append(toIndentedString(clubName)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    endDateContract: ").append(toIndentedString(endDateContract)).append("\n");
    sb.append("    endDateTempContract: ").append(toIndentedString(endDateTempContract)).append("\n");
    sb.append("    endDateTransfer: ").append(toIndentedString(endDateTransfer)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    nbrOfYearsContract: ").append(toIndentedString(nbrOfYearsContract)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    startDateContract: ").append(toIndentedString(startDateContract)).append("\n");
    sb.append("    startDateTempContract: ").append(toIndentedString(startDateTempContract)).append("\n");
    sb.append("    startDateTransfer: ").append(toIndentedString(startDateTransfer)).append("\n");
    sb.append("    tempContract: ").append(toIndentedString(tempContract)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    yearOfBirth: ").append(toIndentedString(yearOfBirth)).append("\n");
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

