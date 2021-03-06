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
 * CleanRefereeObserverAvailabilities
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-24T11:09:35.462+02:00")
public class CleanRefereeObserverAvailabilities   {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("availabilities")
  private List<Availability> availabilities = new ArrayList<Availability>();

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

  @SerializedName("lastModified")
  private LocalDateTime lastModified = null;

  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  public CleanRefereeObserverAvailabilities active(Boolean active) {
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

  public CleanRefereeObserverAvailabilities availabilities(List<Availability> availabilities) {
    this.availabilities = availabilities;
    return this;
  }

  public CleanRefereeObserverAvailabilities addAvailabilitiesItem(Availability availabilitiesItem) {
    this.availabilities.add(availabilitiesItem);
    return this;
  }

   /**
   * Get availabilities
   * @return availabilities
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Availability> getAvailabilities() {
    return availabilities;
  }

  public void setAvailabilities(List<Availability> availabilities) {
    this.availabilities = availabilities;
  }

  public CleanRefereeObserverAvailabilities creationDate(LocalDateTime creationDate) {
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

  public CleanRefereeObserverAvailabilities deltaId(String deltaId) {
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

  public CleanRefereeObserverAvailabilities deltaObjectId(String deltaObjectId) {
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

  public CleanRefereeObserverAvailabilities deltaOperation(Operation deltaOperation) {
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

  public CleanRefereeObserverAvailabilities deltaTimestamp(Long deltaTimestamp) {
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

  public CleanRefereeObserverAvailabilities deltaTimestampDS(Long deltaTimestampDS) {
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

  public CleanRefereeObserverAvailabilities deltaType(KbvbEntityType deltaType) {
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

  public CleanRefereeObserverAvailabilities entityId(String entityId) {
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

  public CleanRefereeObserverAvailabilities extraUnknownFields(List<UnknownObject> extraUnknownFields) {
    this.extraUnknownFields = extraUnknownFields;
    return this;
  }

  public CleanRefereeObserverAvailabilities addExtraUnknownFieldsItem(UnknownObject extraUnknownFieldsItem) {
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

  public CleanRefereeObserverAvailabilities lastModified(LocalDateTime lastModified) {
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

  public CleanRefereeObserverAvailabilities links(List<Link> links) {
    this.links = links;
    return this;
  }

  public CleanRefereeObserverAvailabilities addLinksItem(Link linksItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanRefereeObserverAvailabilities cleanRefereeObserverAvailabilities = (CleanRefereeObserverAvailabilities) o;
    return Objects.equals(this.active, cleanRefereeObserverAvailabilities.active) &&
        Objects.equals(this.availabilities, cleanRefereeObserverAvailabilities.availabilities) &&
        Objects.equals(this.creationDate, cleanRefereeObserverAvailabilities.creationDate) &&
        Objects.equals(this.deltaId, cleanRefereeObserverAvailabilities.deltaId) &&
        Objects.equals(this.deltaObjectId, cleanRefereeObserverAvailabilities.deltaObjectId) &&
        Objects.equals(this.deltaOperation, cleanRefereeObserverAvailabilities.deltaOperation) &&
        Objects.equals(this.deltaTimestamp, cleanRefereeObserverAvailabilities.deltaTimestamp) &&
        Objects.equals(this.deltaTimestampDS, cleanRefereeObserverAvailabilities.deltaTimestampDS) &&
        Objects.equals(this.deltaType, cleanRefereeObserverAvailabilities.deltaType) &&
        Objects.equals(this.entityId, cleanRefereeObserverAvailabilities.entityId) &&
        Objects.equals(this.extraUnknownFields, cleanRefereeObserverAvailabilities.extraUnknownFields) &&
        Objects.equals(this.lastModified, cleanRefereeObserverAvailabilities.lastModified) &&
        Objects.equals(this.links, cleanRefereeObserverAvailabilities.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, availabilities, creationDate, deltaId, deltaObjectId, deltaOperation, deltaTimestamp, deltaTimestampDS, deltaType, entityId, extraUnknownFields, lastModified, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanRefereeObserverAvailabilities {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    availabilities: ").append(toIndentedString(availabilities)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    deltaId: ").append(toIndentedString(deltaId)).append("\n");
    sb.append("    deltaObjectId: ").append(toIndentedString(deltaObjectId)).append("\n");
    sb.append("    deltaOperation: ").append(toIndentedString(deltaOperation)).append("\n");
    sb.append("    deltaTimestamp: ").append(toIndentedString(deltaTimestamp)).append("\n");
    sb.append("    deltaTimestampDS: ").append(toIndentedString(deltaTimestampDS)).append("\n");
    sb.append("    deltaType: ").append(toIndentedString(deltaType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    extraUnknownFields: ").append(toIndentedString(extraUnknownFields)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

