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
import org.openapitools.client.model.SendBirdUser;

/**
 * GcViewBanByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-05T15:12:57.551715+01:00[Europe/London]")
public class GcViewBanByIdResponse {
  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private SendBirdUser user;

  public static final String SERIALIZED_NAME_START_AT = "start_at";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private BigDecimal startAt;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private BigDecimal endAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public GcViewBanByIdResponse() { 
  }

  public GcViewBanByIdResponse user(SendBirdUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdUser getUser() {
    return user;
  }


  public void setUser(SendBirdUser user) {
    this.user = user;
  }


  public GcViewBanByIdResponse startAt(BigDecimal startAt) {
    
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


  public GcViewBanByIdResponse endAt(BigDecimal endAt) {
    
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


  public GcViewBanByIdResponse description(String description) {
    
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
    GcViewBanByIdResponse gcViewBanByIdResponse = (GcViewBanByIdResponse) o;
    return Objects.equals(this.user, gcViewBanByIdResponse.user) &&
        Objects.equals(this.startAt, gcViewBanByIdResponse.startAt) &&
        Objects.equals(this.endAt, gcViewBanByIdResponse.endAt) &&
        Objects.equals(this.description, gcViewBanByIdResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, startAt, endAt, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcViewBanByIdResponse {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

