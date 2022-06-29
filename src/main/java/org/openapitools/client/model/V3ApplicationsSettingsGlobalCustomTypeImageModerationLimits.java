/*
 * Sendbird Platform SDK
 * Sendbird Platform API Javascript SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V3ApplicationsSettingsGlobalCustomTypeImageModerationLimits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T11:00:21.022543+01:00[Europe/London]")
public class V3ApplicationsSettingsGlobalCustomTypeImageModerationLimits {
  public static final String SERIALIZED_NAME_ADULT = "adult";
  @SerializedName(SERIALIZED_NAME_ADULT)
  private Integer adult;

  public static final String SERIALIZED_NAME_SPOOF = "spoof";
  @SerializedName(SERIALIZED_NAME_SPOOF)
  private Integer spoof;

  public static final String SERIALIZED_NAME_MEDICAL = "medical";
  @SerializedName(SERIALIZED_NAME_MEDICAL)
  private Integer medical;

  public static final String SERIALIZED_NAME_VIOLENCE = "violence";
  @SerializedName(SERIALIZED_NAME_VIOLENCE)
  private Integer violence;

  public static final String SERIALIZED_NAME_RACY = "racy";
  @SerializedName(SERIALIZED_NAME_RACY)
  private Integer racy;

  public V3ApplicationsSettingsGlobalCustomTypeImageModerationLimits() { 
  }

  public V3ApplicationsSettingsGlobalCustomTypeImageModerationLimits adult(Integer adult) {
    
    this.adult = adult;
    return this;
  }

   /**
   * Get adult
   * @return adult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAdult() {
    return adult;
  }


  public void setAdult(Integer adult) {
    this.adult = adult;
  }


  public V3ApplicationsSettingsGlobalCustomTypeImageModerationLimits spoof(Integer spoof) {
    
    this.spoof = spoof;
    return this;
  }

   /**
   * Get spoof
   * @return spoof
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSpoof() {
    return spoof;
  }


  public void setSpoof(Integer spoof) {
    this.spoof = spoof;
  }


  public V3ApplicationsSettingsGlobalCustomTypeImageModerationLimits medical(Integer medical) {
    
    this.medical = medical;
    return this;
  }

   /**
   * Get medical
   * @return medical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMedical() {
    return medical;
  }


  public void setMedical(Integer medical) {
    this.medical = medical;
  }


  public V3ApplicationsSettingsGlobalCustomTypeImageModerationLimits violence(Integer violence) {
    
    this.violence = violence;
    return this;
  }

   /**
   * Get violence
   * @return violence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getViolence() {
    return violence;
  }


  public void setViolence(Integer violence) {
    this.violence = violence;
  }


  public V3ApplicationsSettingsGlobalCustomTypeImageModerationLimits racy(Integer racy) {
    
    this.racy = racy;
    return this;
  }

   /**
   * Get racy
   * @return racy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRacy() {
    return racy;
  }


  public void setRacy(Integer racy) {
    this.racy = racy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3ApplicationsSettingsGlobalCustomTypeImageModerationLimits v3ApplicationsSettingsGlobalCustomTypeImageModerationLimits = (V3ApplicationsSettingsGlobalCustomTypeImageModerationLimits) o;
    return Objects.equals(this.adult, v3ApplicationsSettingsGlobalCustomTypeImageModerationLimits.adult) &&
        Objects.equals(this.spoof, v3ApplicationsSettingsGlobalCustomTypeImageModerationLimits.spoof) &&
        Objects.equals(this.medical, v3ApplicationsSettingsGlobalCustomTypeImageModerationLimits.medical) &&
        Objects.equals(this.violence, v3ApplicationsSettingsGlobalCustomTypeImageModerationLimits.violence) &&
        Objects.equals(this.racy, v3ApplicationsSettingsGlobalCustomTypeImageModerationLimits.racy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adult, spoof, medical, violence, racy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3ApplicationsSettingsGlobalCustomTypeImageModerationLimits {\n");
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

