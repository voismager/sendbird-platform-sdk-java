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
 * SendBirdGroupChannelSmsFallback
 */
@JsonPropertyOrder({
  SendBirdGroupChannelSmsFallback.JSON_PROPERTY_WAIT_SECONDS,
  SendBirdGroupChannelSmsFallback.JSON_PROPERTY_EXCLUDE_USER_IDS
})
@JsonTypeName("SendBird_GroupChannel_sms_fallback")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class SendBirdGroupChannelSmsFallback {
  public static final String JSON_PROPERTY_WAIT_SECONDS = "wait_seconds";
  private BigDecimal waitSeconds;

  public static final String JSON_PROPERTY_EXCLUDE_USER_IDS = "exclude_user_ids";
  private List<String> excludeUserIds = null;

  public SendBirdGroupChannelSmsFallback() { 
  }

  public SendBirdGroupChannelSmsFallback waitSeconds(BigDecimal waitSeconds) {
    this.waitSeconds = waitSeconds;
    return this;
  }

   /**
   * Get waitSeconds
   * @return waitSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WAIT_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWaitSeconds() {
    return waitSeconds;
  }


  @JsonProperty(JSON_PROPERTY_WAIT_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWaitSeconds(BigDecimal waitSeconds) {
    this.waitSeconds = waitSeconds;
  }


  public SendBirdGroupChannelSmsFallback excludeUserIds(List<String> excludeUserIds) {
    this.excludeUserIds = excludeUserIds;
    return this;
  }

  public SendBirdGroupChannelSmsFallback addExcludeUserIdsItem(String excludeUserIdsItem) {
    if (this.excludeUserIds == null) {
      this.excludeUserIds = new ArrayList<>();
    }
    this.excludeUserIds.add(excludeUserIdsItem);
    return this;
  }

   /**
   * Get excludeUserIds
   * @return excludeUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExcludeUserIds() {
    return excludeUserIds;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeUserIds(List<String> excludeUserIds) {
    this.excludeUserIds = excludeUserIds;
  }


  /**
   * Return true if this SendBird_GroupChannel_sms_fallback object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdGroupChannelSmsFallback sendBirdGroupChannelSmsFallback = (SendBirdGroupChannelSmsFallback) o;
    return Objects.equals(this.waitSeconds, sendBirdGroupChannelSmsFallback.waitSeconds) &&
        Objects.equals(this.excludeUserIds, sendBirdGroupChannelSmsFallback.excludeUserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waitSeconds, excludeUserIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdGroupChannelSmsFallback {\n");
    sb.append("    waitSeconds: ").append(toIndentedString(waitSeconds)).append("\n");
    sb.append("    excludeUserIds: ").append(toIndentedString(excludeUserIds)).append("\n");
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

