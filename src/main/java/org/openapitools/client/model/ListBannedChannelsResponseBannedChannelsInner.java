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
import org.openapitools.client.model.SendBirdChannelResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListBannedChannelsResponseBannedChannelsInner
 */
@JsonPropertyOrder({
  ListBannedChannelsResponseBannedChannelsInner.JSON_PROPERTY_START_AT,
  ListBannedChannelsResponseBannedChannelsInner.JSON_PROPERTY_DESCRIPTION,
  ListBannedChannelsResponseBannedChannelsInner.JSON_PROPERTY_CHANNEL,
  ListBannedChannelsResponseBannedChannelsInner.JSON_PROPERTY_END_AT
})
@JsonTypeName("listBannedChannelsResponse_banned_channels_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T13:07:19.585435+09:00[Asia/Seoul]")
public class ListBannedChannelsResponseBannedChannelsInner {
  public static final String JSON_PROPERTY_START_AT = "start_at";
  private BigDecimal startAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private SendBirdChannelResponse channel;

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private BigDecimal endAt;

  public ListBannedChannelsResponseBannedChannelsInner() { 
  }

  public ListBannedChannelsResponseBannedChannelsInner startAt(BigDecimal startAt) {
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


  public ListBannedChannelsResponseBannedChannelsInner description(String description) {
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


  public ListBannedChannelsResponseBannedChannelsInner channel(SendBirdChannelResponse channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdChannelResponse getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(SendBirdChannelResponse channel) {
    this.channel = channel;
  }


  public ListBannedChannelsResponseBannedChannelsInner endAt(BigDecimal endAt) {
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


  /**
   * Return true if this listBannedChannelsResponse_banned_channels_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBannedChannelsResponseBannedChannelsInner listBannedChannelsResponseBannedChannelsInner = (ListBannedChannelsResponseBannedChannelsInner) o;
    return Objects.equals(this.startAt, listBannedChannelsResponseBannedChannelsInner.startAt) &&
        Objects.equals(this.description, listBannedChannelsResponseBannedChannelsInner.description) &&
        Objects.equals(this.channel, listBannedChannelsResponseBannedChannelsInner.channel) &&
        Objects.equals(this.endAt, listBannedChannelsResponseBannedChannelsInner.endAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, description, channel, endAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBannedChannelsResponseBannedChannelsInner {\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
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

