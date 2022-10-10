/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SetDomainFilterDataImageModerationLimits
 */
@JsonPropertyOrder({
  SetDomainFilterDataImageModerationLimits.JSON_PROPERTY_ADULT,
  SetDomainFilterDataImageModerationLimits.JSON_PROPERTY_SPOOF,
  SetDomainFilterDataImageModerationLimits.JSON_PROPERTY_MEDICAL,
  SetDomainFilterDataImageModerationLimits.JSON_PROPERTY_VIOLENCE,
  SetDomainFilterDataImageModerationLimits.JSON_PROPERTY_RACY
})
@JsonTypeName("setDomainFilterData_image_moderation_limits")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
public class SetDomainFilterDataImageModerationLimits {
  public static final String JSON_PROPERTY_ADULT = "adult";
  private Integer adult;

  public static final String JSON_PROPERTY_SPOOF = "spoof";
  private Integer spoof;

  public static final String JSON_PROPERTY_MEDICAL = "medical";
  private Integer medical;

  public static final String JSON_PROPERTY_VIOLENCE = "violence";
  private Integer violence;

  public static final String JSON_PROPERTY_RACY = "racy";
  private Integer racy;

  public SetDomainFilterDataImageModerationLimits() { 
  }

  public SetDomainFilterDataImageModerationLimits adult(Integer adult) {
    this.adult = adult;
    return this;
  }

   /**
   * Get adult
   * @return adult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAdult() {
    return adult;
  }


  @JsonProperty(JSON_PROPERTY_ADULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdult(Integer adult) {
    this.adult = adult;
  }


  public SetDomainFilterDataImageModerationLimits spoof(Integer spoof) {
    this.spoof = spoof;
    return this;
  }

   /**
   * Get spoof
   * @return spoof
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPOOF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSpoof() {
    return spoof;
  }


  @JsonProperty(JSON_PROPERTY_SPOOF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpoof(Integer spoof) {
    this.spoof = spoof;
  }


  public SetDomainFilterDataImageModerationLimits medical(Integer medical) {
    this.medical = medical;
    return this;
  }

   /**
   * Get medical
   * @return medical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMedical() {
    return medical;
  }


  @JsonProperty(JSON_PROPERTY_MEDICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedical(Integer medical) {
    this.medical = medical;
  }


  public SetDomainFilterDataImageModerationLimits violence(Integer violence) {
    this.violence = violence;
    return this;
  }

   /**
   * Get violence
   * @return violence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIOLENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getViolence() {
    return violence;
  }


  @JsonProperty(JSON_PROPERTY_VIOLENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViolence(Integer violence) {
    this.violence = violence;
  }


  public SetDomainFilterDataImageModerationLimits racy(Integer racy) {
    this.racy = racy;
    return this;
  }

   /**
   * Get racy
   * @return racy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RACY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRacy() {
    return racy;
  }


  @JsonProperty(JSON_PROPERTY_RACY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRacy(Integer racy) {
    this.racy = racy;
  }


  /**
   * Return true if this setDomainFilterData_image_moderation_limits object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDomainFilterDataImageModerationLimits setDomainFilterDataImageModerationLimits = (SetDomainFilterDataImageModerationLimits) o;
    return Objects.equals(this.adult, setDomainFilterDataImageModerationLimits.adult) &&
        Objects.equals(this.spoof, setDomainFilterDataImageModerationLimits.spoof) &&
        Objects.equals(this.medical, setDomainFilterDataImageModerationLimits.medical) &&
        Objects.equals(this.violence, setDomainFilterDataImageModerationLimits.violence) &&
        Objects.equals(this.racy, setDomainFilterDataImageModerationLimits.racy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adult, spoof, medical, violence, racy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDomainFilterDataImageModerationLimits {\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    spoof: ").append(toIndentedString(spoof)).append("\n");
    sb.append("    medical: ").append(toIndentedString(medical)).append("\n");
    sb.append("    violence: ").append(toIndentedString(violence)).append("\n");
    sb.append("    racy: ").append(toIndentedString(racy)).append("\n");
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

