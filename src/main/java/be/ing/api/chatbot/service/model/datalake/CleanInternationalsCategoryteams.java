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
 * CleanInternationalsCategoryteams
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-24T11:09:35.462+02:00")
public class CleanInternationalsCategoryteams   {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("category")
  private String category = null;

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

  @SerializedName("discipline")
  private String discipline = null;

  @SerializedName("entityId")
  private String entityId = null;

  @SerializedName("extraTimeDuration")
  private Long extraTimeDuration = null;

  @SerializedName("extraUnknownFields")
  private List<UnknownObject> extraUnknownFields = new ArrayList<UnknownObject>();

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("lastModified")
  private LocalDateTime lastModified = null;

  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("matchDuration")
  private Long matchDuration = null;

  @SerializedName("maximumAge")
  private Long maximumAge = null;

  @SerializedName("minimumAge")
  private Long minimumAge = null;

  public CleanInternationalsCategoryteams active(Boolean active) {
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

  public CleanInternationalsCategoryteams category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CleanInternationalsCategoryteams creationDate(LocalDateTime creationDate) {
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

  public CleanInternationalsCategoryteams deltaId(String deltaId) {
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

  public CleanInternationalsCategoryteams deltaObjectId(String deltaObjectId) {
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

  public CleanInternationalsCategoryteams deltaOperation(Operation deltaOperation) {
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

  public CleanInternationalsCategoryteams deltaTimestamp(Long deltaTimestamp) {
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

  public CleanInternationalsCategoryteams deltaTimestampDS(Long deltaTimestampDS) {
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

  public CleanInternationalsCategoryteams deltaType(KbvbEntityType deltaType) {
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

  public CleanInternationalsCategoryteams discipline(String discipline) {
    this.discipline = discipline;
    return this;
  }

   /**
   * Get discipline
   * @return discipline
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDiscipline() {
    return discipline;
  }

  public void setDiscipline(String discipline) {
    this.discipline = discipline;
  }

  public CleanInternationalsCategoryteams entityId(String entityId) {
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

  public CleanInternationalsCategoryteams extraTimeDuration(Long extraTimeDuration) {
    this.extraTimeDuration = extraTimeDuration;
    return this;
  }

   /**
   * Get extraTimeDuration
   * @return extraTimeDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getExtraTimeDuration() {
    return extraTimeDuration;
  }

  public void setExtraTimeDuration(Long extraTimeDuration) {
    this.extraTimeDuration = extraTimeDuration;
  }

  public CleanInternationalsCategoryteams extraUnknownFields(List<UnknownObject> extraUnknownFields) {
    this.extraUnknownFields = extraUnknownFields;
    return this;
  }

  public CleanInternationalsCategoryteams addExtraUnknownFieldsItem(UnknownObject extraUnknownFieldsItem) {
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

  public CleanInternationalsCategoryteams gender(String gender) {
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

  public CleanInternationalsCategoryteams id(String id) {
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

  public CleanInternationalsCategoryteams lastModified(LocalDateTime lastModified) {
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

  public CleanInternationalsCategoryteams links(List<Link> links) {
    this.links = links;
    return this;
  }

  public CleanInternationalsCategoryteams addLinksItem(Link linksItem) {
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

  public CleanInternationalsCategoryteams matchDuration(Long matchDuration) {
    this.matchDuration = matchDuration;
    return this;
  }

   /**
   * Get matchDuration
   * @return matchDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getMatchDuration() {
    return matchDuration;
  }

  public void setMatchDuration(Long matchDuration) {
    this.matchDuration = matchDuration;
  }

  public CleanInternationalsCategoryteams maximumAge(Long maximumAge) {
    this.maximumAge = maximumAge;
    return this;
  }

   /**
   * Get maximumAge
   * @return maximumAge
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getMaximumAge() {
    return maximumAge;
  }

  public void setMaximumAge(Long maximumAge) {
    this.maximumAge = maximumAge;
  }

  public CleanInternationalsCategoryteams minimumAge(Long minimumAge) {
    this.minimumAge = minimumAge;
    return this;
  }

   /**
   * Get minimumAge
   * @return minimumAge
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getMinimumAge() {
    return minimumAge;
  }

  public void setMinimumAge(Long minimumAge) {
    this.minimumAge = minimumAge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanInternationalsCategoryteams cleanInternationalsCategoryteams = (CleanInternationalsCategoryteams) o;
    return Objects.equals(this.active, cleanInternationalsCategoryteams.active) &&
        Objects.equals(this.category, cleanInternationalsCategoryteams.category) &&
        Objects.equals(this.creationDate, cleanInternationalsCategoryteams.creationDate) &&
        Objects.equals(this.deltaId, cleanInternationalsCategoryteams.deltaId) &&
        Objects.equals(this.deltaObjectId, cleanInternationalsCategoryteams.deltaObjectId) &&
        Objects.equals(this.deltaOperation, cleanInternationalsCategoryteams.deltaOperation) &&
        Objects.equals(this.deltaTimestamp, cleanInternationalsCategoryteams.deltaTimestamp) &&
        Objects.equals(this.deltaTimestampDS, cleanInternationalsCategoryteams.deltaTimestampDS) &&
        Objects.equals(this.deltaType, cleanInternationalsCategoryteams.deltaType) &&
        Objects.equals(this.discipline, cleanInternationalsCategoryteams.discipline) &&
        Objects.equals(this.entityId, cleanInternationalsCategoryteams.entityId) &&
        Objects.equals(this.extraTimeDuration, cleanInternationalsCategoryteams.extraTimeDuration) &&
        Objects.equals(this.extraUnknownFields, cleanInternationalsCategoryteams.extraUnknownFields) &&
        Objects.equals(this.gender, cleanInternationalsCategoryteams.gender) &&
        Objects.equals(this.id, cleanInternationalsCategoryteams.id) &&
        Objects.equals(this.lastModified, cleanInternationalsCategoryteams.lastModified) &&
        Objects.equals(this.links, cleanInternationalsCategoryteams.links) &&
        Objects.equals(this.matchDuration, cleanInternationalsCategoryteams.matchDuration) &&
        Objects.equals(this.maximumAge, cleanInternationalsCategoryteams.maximumAge) &&
        Objects.equals(this.minimumAge, cleanInternationalsCategoryteams.minimumAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, category, creationDate, deltaId, deltaObjectId, deltaOperation, deltaTimestamp, deltaTimestampDS, deltaType, discipline, entityId, extraTimeDuration, extraUnknownFields, gender, id, lastModified, links, matchDuration, maximumAge, minimumAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanInternationalsCategoryteams {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    deltaId: ").append(toIndentedString(deltaId)).append("\n");
    sb.append("    deltaObjectId: ").append(toIndentedString(deltaObjectId)).append("\n");
    sb.append("    deltaOperation: ").append(toIndentedString(deltaOperation)).append("\n");
    sb.append("    deltaTimestamp: ").append(toIndentedString(deltaTimestamp)).append("\n");
    sb.append("    deltaTimestampDS: ").append(toIndentedString(deltaTimestampDS)).append("\n");
    sb.append("    deltaType: ").append(toIndentedString(deltaType)).append("\n");
    sb.append("    discipline: ").append(toIndentedString(discipline)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    extraTimeDuration: ").append(toIndentedString(extraTimeDuration)).append("\n");
    sb.append("    extraUnknownFields: ").append(toIndentedString(extraUnknownFields)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    matchDuration: ").append(toIndentedString(matchDuration)).append("\n");
    sb.append("    maximumAge: ").append(toIndentedString(maximumAge)).append("\n");
    sb.append("    minimumAge: ").append(toIndentedString(minimumAge)).append("\n");
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

