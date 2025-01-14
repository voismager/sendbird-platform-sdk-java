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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * MarkAllMessagesAsReadData
 */
@JsonPropertyOrder({
  MarkAllMessagesAsReadData.JSON_PROPERTY_CHANNEL_URLS
})
@JsonTypeName("markAllMessagesAsReadData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class MarkAllMessagesAsReadData {
  public static final String JSON_PROPERTY_CHANNEL_URLS = "channel_urls";
  private List<String> channelUrls = new ArrayList<>();

  public MarkAllMessagesAsReadData() { 
  }

  public MarkAllMessagesAsReadData channelUrls(List<String> channelUrls) {
    this.channelUrls = channelUrls;
    return this;
  }

  public MarkAllMessagesAsReadData addChannelUrlsItem(String channelUrlsItem) {
    this.channelUrls.add(channelUrlsItem);
    return this;
  }

   /**
   * Specifies an array of one or more group channel URLs to mark all of the unread messages in as read. If not specified, all of the unread messages in the joined group channels are marked as read.
   * @return channelUrls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more group channel URLs to mark all of the unread messages in as read. If not specified, all of the unread messages in the joined group channels are marked as read.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getChannelUrls() {
    return channelUrls;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelUrls(List<String> channelUrls) {
    this.channelUrls = channelUrls;
  }


  /**
   * Return true if this markAllMessagesAsReadData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkAllMessagesAsReadData markAllMessagesAsReadData = (MarkAllMessagesAsReadData) o;
    return Objects.equals(this.channelUrls, markAllMessagesAsReadData.channelUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkAllMessagesAsReadData {\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
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

