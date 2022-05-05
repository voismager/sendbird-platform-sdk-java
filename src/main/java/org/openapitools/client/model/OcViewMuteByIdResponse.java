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
import java.math.BigDecimal;

/**
 * OcViewMuteByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-05T15:12:57.551715+01:00[Europe/London]")
public class OcViewMuteByIdResponse {
  public static final String SERIALIZED_NAME_IS_MUTED = "is_muted";
  @SerializedName(SERIALIZED_NAME_IS_MUTED)
  private Boolean isMuted;

  public static final String SERIALIZED_NAME_REMAINING_DURATION = "remaining_duration";
  @SerializedName(SERIALIZED_NAME_REMAINING_DURATION)
  private BigDecimal remainingDuration;

  public static final String SERIALIZED_NAME_START_AT = "start_at";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private BigDecimal startAt;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private BigDecimal endAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public OcViewMuteByIdResponse() { 
  }

  public OcViewMuteByIdResponse isMuted(Boolean isMuted) {
    
    this.isMuted = isMuted;
    return this;
  }

   /**
   * Get isMuted
   * @return isMuted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsMuted() {
    return isMuted;
  }


  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }


  public OcViewMuteByIdResponse remainingDuration(BigDecimal remainingDuration) {
    
    this.remainingDuration = remainingDuration;
    return this;
  }

   /**
   * Get remainingDuration
   * @return remainingDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getRemainingDuration() {
    return remainingDuration;
  }


  public void setRemainingDuration(BigDecimal remainingDuration) {
    this.remainingDuration = remainingDuration;
  }


  public OcViewMuteByIdResponse startAt(BigDecimal startAt) {
    
    this.startAt = startAt;
    return this;
  }

   /**
   * Get startAt
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getStartAt() {
    return startAt;
  }


  public void setStartAt(BigDecimal startAt) {
    this.startAt = startAt;
  }


  public OcViewMuteByIdResponse endAt(BigDecimal endAt) {
    
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEndAt() {
    return endAt;
  }


  public void setEndAt(BigDecimal endAt) {
    this.endAt = endAt;
  }


  public OcViewMuteByIdResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcViewMuteByIdResponse ocViewMuteByIdResponse = (OcViewMuteByIdResponse) o;
    return Objects.equals(this.isMuted, ocViewMuteByIdResponse.isMuted) &&
        Objects.equals(this.remainingDuration, ocViewMuteByIdResponse.remainingDuration) &&
        Objects.equals(this.startAt, ocViewMuteByIdResponse.startAt) &&
        Objects.equals(this.endAt, ocViewMuteByIdResponse.endAt) &&
        Objects.equals(this.description, ocViewMuteByIdResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMuted, remainingDuration, startAt, endAt, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcViewMuteByIdResponse {\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted)).append("\n");
    sb.append("    remainingDuration: ").append(toIndentedString(remainingDuration)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

