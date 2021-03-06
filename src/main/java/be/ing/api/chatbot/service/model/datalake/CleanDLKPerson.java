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
import org.joda.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * CleanDLKPerson
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-24T11:09:35.462+02:00")
public class CleanDLKPerson   {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("address")
  private List<CleanAddress> address = new ArrayList<CleanAddress>();

  @SerializedName("bbfDataIds")
  private List<String> bbfDataIds = new ArrayList<String>();

  @SerializedName("birthDate")
  private String birthDate = null;

  @SerializedName("contactDetails")
  private List<CleanContactDetail> contactDetails = new ArrayList<CleanContactDetail>();

  @SerializedName("creationDate")
  private LocalDateTime creationDate = null;

  @SerializedName("deltaId")
  private String deltaId = null;

  @SerializedName("deltaObjectId")
  private String deltaObjectId = null;

  @SerializedName("deltaOperation")
  private Operation deltaOperation = null;

  @SerializedName("deltaTimestamp")
  private Long deltaTimestamp = null;

  @SerializedName("deltaTimestampDS")
  private Long deltaTimestampDS = null;

  @SerializedName("deltaType")
  private KbvbEntityType deltaType = null;

  @SerializedName("entityId")
  private String entityId = null;

  @SerializedName("extraUnknownFields")
  private List<UnknownObject> extraUnknownFields = new ArrayList<UnknownObject>();

  @SerializedName("fanIds")
  private List<String> fanIds = new ArrayList<String>();

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("lastModified")
  private LocalDateTime lastModified = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("memberships")
  private List<CleanMembership> memberships = new ArrayList<CleanMembership>();

  @SerializedName("nationality")
  private String nationality = null;

  @SerializedName("playerId")
  private String playerId = null;

  @SerializedName("spokenLanguage")
  private String spokenLanguage = null;

  public CleanDLKPerson active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CleanDLKPerson address(List<CleanAddress> address) {
    this.address = address;
    return this;
  }

  public CleanDLKPerson addAddressItem(CleanAddress addressItem) {
    this.address.add(addressItem);
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CleanAddress> getAddress() {
    return address;
  }

  public void setAddress(List<CleanAddress> address) {
    this.address = address;
  }

  public CleanDLKPerson bbfDataIds(List<String> bbfDataIds) {
    this.bbfDataIds = bbfDataIds;
    return this;
  }

  public CleanDLKPerson addBbfDataIdsItem(String bbfDataIdsItem) {
    this.bbfDataIds.add(bbfDataIdsItem);
    return this;
  }

   /**
   * Get bbfDataIds
   * @return bbfDataIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getBbfDataIds() {
    return bbfDataIds;
  }

  public void setBbfDataIds(List<String> bbfDataIds) {
    this.bbfDataIds = bbfDataIds;
  }

  public CleanDLKPerson birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Get birthDate
   * @return birthDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public CleanDLKPerson contactDetails(List<CleanContactDetail> contactDetails) {
    this.contactDetails = contactDetails;
    return this;
  }

  public CleanDLKPerson addContactDetailsItem(CleanContactDetail contactDetailsItem) {
    this.contactDetails.add(contactDetailsItem);
    return this;
  }

   /**
   * Get contactDetails
   * @return contactDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CleanContactDetail> getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(List<CleanContactDetail> contactDetails) {
    this.contactDetails = contactDetails;
  }

  public CleanDLKPerson creationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public CleanDLKPerson deltaId(String deltaId) {
    this.deltaId = deltaId;
    return this;
  }

   /**
   * Get deltaId
   * @return deltaId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDeltaId() {
    return deltaId;
  }

  public void setDeltaId(String deltaId) {
    this.deltaId = deltaId;
  }

  public CleanDLKPerson deltaObjectId(String deltaObjectId) {
    this.deltaObjectId = deltaObjectId;
    return this;
  }

   /**
   * Get deltaObjectId
   * @return deltaObjectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDeltaObjectId() {
    return deltaObjectId;
  }

  public void setDeltaObjectId(String deltaObjectId) {
    this.deltaObjectId = deltaObjectId;
  }

  public CleanDLKPerson deltaOperation(Operation deltaOperation) {
    this.deltaOperation = deltaOperation;
    return this;
  }

   /**
   * Get deltaOperation
   * @return deltaOperation
  **/
  @ApiModelProperty(example = "null", value = "")
  public Operation getDeltaOperation() {
    return deltaOperation;
  }

  public void setDeltaOperation(Operation deltaOperation) {
    this.deltaOperation = deltaOperation;
  }

  public CleanDLKPerson deltaTimestamp(Long deltaTimestamp) {
    this.deltaTimestamp = deltaTimestamp;
    return this;
  }

   /**
   * Get deltaTimestamp
   * @return deltaTimestamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getDeltaTimestamp() {
    return deltaTimestamp;
  }

  public void setDeltaTimestamp(Long deltaTimestamp) {
    this.deltaTimestamp = deltaTimestamp;
  }

  public CleanDLKPerson deltaTimestampDS(Long deltaTimestampDS) {
    this.deltaTimestampDS = deltaTimestampDS;
    return this;
  }

   /**
   * Get deltaTimestampDS
   * @return deltaTimestampDS
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getDeltaTimestampDS() {
    return deltaTimestampDS;
  }

  public void setDeltaTimestampDS(Long deltaTimestampDS) {
    this.deltaTimestampDS = deltaTimestampDS;
  }

  public CleanDLKPerson deltaType(KbvbEntityType deltaType) {
    this.deltaType = deltaType;
    return this;
  }

   /**
   * Get deltaType
   * @return deltaType
  **/
  @ApiModelProperty(example = "null", value = "")
  public KbvbEntityType getDeltaType() {
    return deltaType;
  }

  public void setDeltaType(KbvbEntityType deltaType) {
    this.deltaType = deltaType;
  }

  public CleanDLKPerson entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public CleanDLKPerson extraUnknownFields(List<UnknownObject> extraUnknownFields) {
    this.extraUnknownFields = extraUnknownFields;
    return this;
  }

  public CleanDLKPerson addExtraUnknownFieldsItem(UnknownObject extraUnknownFieldsItem) {
    this.extraUnknownFields.add(extraUnknownFieldsItem);
    return this;
  }

   /**
   * Get extraUnknownFields
   * @return extraUnknownFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<UnknownObject> getExtraUnknownFields() {
    return extraUnknownFields;
  }

  public void setExtraUnknownFields(List<UnknownObject> extraUnknownFields) {
    this.extraUnknownFields = extraUnknownFields;
  }

  public CleanDLKPerson fanIds(List<String> fanIds) {
    this.fanIds = fanIds;
    return this;
  }

  public CleanDLKPerson addFanIdsItem(String fanIdsItem) {
    this.fanIds.add(fanIdsItem);
    return this;
  }

   /**
   * Get fanIds
   * @return fanIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getFanIds() {
    return fanIds;
  }

  public void setFanIds(List<String> fanIds) {
    this.fanIds = fanIds;
  }

  public CleanDLKPerson firstName(String firstName) {
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

  public CleanDLKPerson gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public CleanDLKPerson id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CleanDLKPerson lastModified(LocalDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(LocalDateTime lastModified) {
    this.lastModified = lastModified;
  }

  public CleanDLKPerson lastName(String lastName) {
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

  public CleanDLKPerson links(List<Link> links) {
    this.links = links;
    return this;
  }

  public CleanDLKPerson addLinksItem(Link linksItem) {
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

  public CleanDLKPerson memberships(List<CleanMembership> memberships) {
    this.memberships = memberships;
    return this;
  }

  public CleanDLKPerson addMembershipsItem(CleanMembership membershipsItem) {
    this.memberships.add(membershipsItem);
    return this;
  }

   /**
   * Get memberships
   * @return memberships
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CleanMembership> getMemberships() {
    return memberships;
  }

  public void setMemberships(List<CleanMembership> memberships) {
    this.memberships = memberships;
  }

  public CleanDLKPerson nationality(String nationality) {
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

  public CleanDLKPerson playerId(String playerId) {
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

  public CleanDLKPerson spokenLanguage(String spokenLanguage) {
    this.spokenLanguage = spokenLanguage;
    return this;
  }

   /**
   * Get spokenLanguage
   * @return spokenLanguage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSpokenLanguage() {
    return spokenLanguage;
  }

  public void setSpokenLanguage(String spokenLanguage) {
    this.spokenLanguage = spokenLanguage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanDLKPerson cleanDLKPerson = (CleanDLKPerson) o;
    return Objects.equals(this.active, cleanDLKPerson.active) &&
        Objects.equals(this.address, cleanDLKPerson.address) &&
        Objects.equals(this.bbfDataIds, cleanDLKPerson.bbfDataIds) &&
        Objects.equals(this.birthDate, cleanDLKPerson.birthDate) &&
        Objects.equals(this.contactDetails, cleanDLKPerson.contactDetails) &&
        Objects.equals(this.creationDate, cleanDLKPerson.creationDate) &&
        Objects.equals(this.deltaId, cleanDLKPerson.deltaId) &&
        Objects.equals(this.deltaObjectId, cleanDLKPerson.deltaObjectId) &&
        Objects.equals(this.deltaOperation, cleanDLKPerson.deltaOperation) &&
        Objects.equals(this.deltaTimestamp, cleanDLKPerson.deltaTimestamp) &&
        Objects.equals(this.deltaTimestampDS, cleanDLKPerson.deltaTimestampDS) &&
        Objects.equals(this.deltaType, cleanDLKPerson.deltaType) &&
        Objects.equals(this.entityId, cleanDLKPerson.entityId) &&
        Objects.equals(this.extraUnknownFields, cleanDLKPerson.extraUnknownFields) &&
        Objects.equals(this.fanIds, cleanDLKPerson.fanIds) &&
        Objects.equals(this.firstName, cleanDLKPerson.firstName) &&
        Objects.equals(this.gender, cleanDLKPerson.gender) &&
        Objects.equals(this.id, cleanDLKPerson.id) &&
        Objects.equals(this.lastModified, cleanDLKPerson.lastModified) &&
        Objects.equals(this.lastName, cleanDLKPerson.lastName) &&
        Objects.equals(this.links, cleanDLKPerson.links) &&
        Objects.equals(this.memberships, cleanDLKPerson.memberships) &&
        Objects.equals(this.nationality, cleanDLKPerson.nationality) &&
        Objects.equals(this.playerId, cleanDLKPerson.playerId) &&
        Objects.equals(this.spokenLanguage, cleanDLKPerson.spokenLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, address, bbfDataIds, birthDate, contactDetails, creationDate, deltaId, deltaObjectId, deltaOperation, deltaTimestamp, deltaTimestampDS, deltaType, entityId, extraUnknownFields, fanIds, firstName, gender, id, lastModified, lastName, links, memberships, nationality, playerId, spokenLanguage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanDLKPerson {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    bbfDataIds: ").append(toIndentedString(bbfDataIds)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    deltaId: ").append(toIndentedString(deltaId)).append("\n");
    sb.append("    deltaObjectId: ").append(toIndentedString(deltaObjectId)).append("\n");
    sb.append("    deltaOperation: ").append(toIndentedString(deltaOperation)).append("\n");
    sb.append("    deltaTimestamp: ").append(toIndentedString(deltaTimestamp)).append("\n");
    sb.append("    deltaTimestampDS: ").append(toIndentedString(deltaTimestampDS)).append("\n");
    sb.append("    deltaType: ").append(toIndentedString(deltaType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    extraUnknownFields: ").append(toIndentedString(extraUnknownFields)).append("\n");
    sb.append("    fanIds: ").append(toIndentedString(fanIds)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    spokenLanguage: ").append(toIndentedString(spokenLanguage)).append("\n");
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

