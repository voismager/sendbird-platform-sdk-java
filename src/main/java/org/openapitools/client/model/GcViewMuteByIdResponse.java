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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GcViewMuteByIdResponse
 */
@JsonPropertyOrder({
  GcViewMuteByIdResponse.JSON_PROPERTY_IS_MUTED,
  GcViewMuteByIdResponse.JSON_PROPERTY_REMAINING_DURATION,
  GcViewMuteByIdResponse.JSON_PROPERTY_START_AT,
  GcViewMuteByIdResponse.JSON_PROPERTY_END_AT,
  GcViewMuteByIdResponse.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("gcViewMuteByIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T12:28:02.899+09:00[Asia/Seoul]")
public class GcViewMuteByIdResponse {
  public static final String JSON_PROPERTY_IS_MUTED = "is_muted";
  private Boolean isMuted;

  public static final String JSON_PROPERTY_REMAINING_DURATION = "remaining_duration";
  private BigDecimal remainingDuration;

  public static final String JSON_PROPERTY_START_AT = "start_at";
  private BigDecimal startAt;

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private BigDecimal endAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public GcViewMuteByIdResponse() { 
  }

  public GcViewMuteByIdResponse isMuted(Boolean isMuted) {
    this.isMuted = isMuted;
    return this;
  }

   /**
   * Get isMuted
   * @return isMuted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_MUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMuted() {
    return isMuted;
  }


  @JsonProperty(JSON_PROPERTY_IS_MUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }


  public GcViewMuteByIdResponse remainingDuration(BigDecimal remainingDuration) {
    this.remainingDuration = remainingDuration;
    return this;
  }

   /**
   * Get remainingDuration
   * @return remainingDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REMAINING_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRemainingDuration() {
    return remainingDuration;
  }


  @JsonProperty(JSON_PROPERTY_REMAINING_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemainingDuration(BigDecimal remainingDuration) {
    this.remainingDuration = remainingDuration;
  }


  public GcViewMuteByIdResponse startAt(BigDecimal startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * Get startAt
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStartAt() {
    return startAt;
  }


  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartAt(BigDecimal startAt) {
    this.startAt = startAt;
  }


  public GcViewMuteByIdResponse endAt(BigDecimal endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEndAt() {
    return endAt;
  }


  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndAt(BigDecimal endAt) {
    this.endAt = endAt;
  }


  public GcViewMuteByIdResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this gcViewMuteByIdResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcViewMuteByIdResponse gcViewMuteByIdResponse = (GcViewMuteByIdResponse) o;
    return Objects.equals(this.isMuted, gcViewMuteByIdResponse.isMuted) &&
        Objects.equals(this.remainingDuration, gcViewMuteByIdResponse.remainingDuration) &&
        Objects.equals(this.startAt, gcViewMuteByIdResponse.startAt) &&
        Objects.equals(this.endAt, gcViewMuteByIdResponse.endAt) &&
        Objects.equals(this.description, gcViewMuteByIdResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMuted, remainingDuration, startAt, endAt, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcViewMuteByIdResponse {\n");
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

