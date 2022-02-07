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
 * InlineResponse20018
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class InlineResponse20018 {
  public static final String SERIALIZED_NAME_UNREAD_COUNT = "unread_count";
  @SerializedName(SERIALIZED_NAME_UNREAD_COUNT)
  private BigDecimal unreadCount;

  public InlineResponse20018() { 
  }

  public InlineResponse20018 unreadCount(BigDecimal unreadCount) {
    
    this.unreadCount = unreadCount;
    return this;
  }

   /**
   * Get unreadCount
   * @return unreadCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getUnreadCount() {
    return unreadCount;
  }


  public void setUnreadCount(BigDecimal unreadCount) {
    this.unreadCount = unreadCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018 inlineResponse20018 = (InlineResponse20018) o;
    return Objects.equals(this.unreadCount, inlineResponse20018.unreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unreadCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018 {\n");
    sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
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

