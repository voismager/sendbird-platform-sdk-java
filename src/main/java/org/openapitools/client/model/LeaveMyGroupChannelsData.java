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
 * LeaveMyGroupChannelsData
 */
@JsonPropertyOrder({
  LeaveMyGroupChannelsData.JSON_PROPERTY_CUSTOM_TYPE
})
@JsonTypeName("leaveMyGroupChannelsData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T12:28:02.899+09:00[Asia/Seoul]")
public class LeaveMyGroupChannelsData {
  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public LeaveMyGroupChannelsData() { 
  }

  public LeaveMyGroupChannelsData customType(String customType) {
    this.customType = customType;
    return this;
  }

   /**
   * Specifies the custom channel type to make the user leave joined group channels with the corresponding type.
   * @return customType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the custom channel type to make the user leave joined group channels with the corresponding type.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCustomType() {
    return customType;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomType(String customType) {
    this.customType = customType;
  }


  /**
   * Return true if this leaveMyGroupChannelsData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveMyGroupChannelsData leaveMyGroupChannelsData = (LeaveMyGroupChannelsData) o;
    return Objects.equals(this.customType, leaveMyGroupChannelsData.customType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveMyGroupChannelsData {\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
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

