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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * MuteUsersInChannelsWithCustomChannelTypeData
 */
@JsonPropertyOrder({
  MuteUsersInChannelsWithCustomChannelTypeData.JSON_PROPERTY_USER_IDS,
  MuteUsersInChannelsWithCustomChannelTypeData.JSON_PROPERTY_SECONDS,
  MuteUsersInChannelsWithCustomChannelTypeData.JSON_PROPERTY_DESCRIPTION,
  MuteUsersInChannelsWithCustomChannelTypeData.JSON_PROPERTY_ON_DEMAND_UPSERT
})
@JsonTypeName("muteUsersInChannelsWithCustomChannelTypeData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
public class MuteUsersInChannelsWithCustomChannelTypeData {
  public static final String JSON_PROPERTY_USER_IDS = "user_ids";
  private List<String> userIds = new ArrayList<>();

  public static final String JSON_PROPERTY_SECONDS = "seconds";
  private BigDecimal seconds;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ON_DEMAND_UPSERT = "on_demand_upsert";
  private Boolean onDemandUpsert;

  public MuteUsersInChannelsWithCustomChannelTypeData() { 
  }

  public MuteUsersInChannelsWithCustomChannelTypeData userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public MuteUsersInChannelsWithCustomChannelTypeData addUserIdsItem(String userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getUserIds() {
    return userIds;
  }


  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public MuteUsersInChannelsWithCustomChannelTypeData seconds(BigDecimal seconds) {
    this.seconds = seconds;
    return this;
  }

   /**
   * Get seconds
   * @return seconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSeconds() {
    return seconds;
  }


  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeconds(BigDecimal seconds) {
    this.seconds = seconds;
  }


  public MuteUsersInChannelsWithCustomChannelTypeData description(String description) {
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


  public MuteUsersInChannelsWithCustomChannelTypeData onDemandUpsert(Boolean onDemandUpsert) {
    this.onDemandUpsert = onDemandUpsert;
    return this;
  }

   /**
   * Get onDemandUpsert
   * @return onDemandUpsert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ON_DEMAND_UPSERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnDemandUpsert() {
    return onDemandUpsert;
  }


  @JsonProperty(JSON_PROPERTY_ON_DEMAND_UPSERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnDemandUpsert(Boolean onDemandUpsert) {
    this.onDemandUpsert = onDemandUpsert;
  }


  /**
   * Return true if this muteUsersInChannelsWithCustomChannelTypeData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MuteUsersInChannelsWithCustomChannelTypeData muteUsersInChannelsWithCustomChannelTypeData = (MuteUsersInChannelsWithCustomChannelTypeData) o;
    return Objects.equals(this.userIds, muteUsersInChannelsWithCustomChannelTypeData.userIds) &&
        Objects.equals(this.seconds, muteUsersInChannelsWithCustomChannelTypeData.seconds) &&
        Objects.equals(this.description, muteUsersInChannelsWithCustomChannelTypeData.description) &&
        Objects.equals(this.onDemandUpsert, muteUsersInChannelsWithCustomChannelTypeData.onDemandUpsert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIds, seconds, description, onDemandUpsert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MuteUsersInChannelsWithCustomChannelTypeData {\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    onDemandUpsert: ").append(toIndentedString(onDemandUpsert)).append("\n");
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

