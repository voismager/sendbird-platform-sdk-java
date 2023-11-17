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
 * V3PollsPollIdDeleteRequest
 */
@JsonPropertyOrder({
  V3PollsPollIdDeleteRequest.JSON_PROPERTY_CHANNEL_URL,
  V3PollsPollIdDeleteRequest.JSON_PROPERTY_CHANNEL_TYPE,
  V3PollsPollIdDeleteRequest.JSON_PROPERTY_SHOW_PARTIAL_VOTER_LIST
})
@JsonTypeName("_v3_polls__poll_id__delete_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T12:28:02.899+09:00[Asia/Seoul]")
public class V3PollsPollIdDeleteRequest {
  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_CHANNEL_TYPE = "channel_type";
  private String channelType;

  public static final String JSON_PROPERTY_SHOW_PARTIAL_VOTER_LIST = "show_partial_voter_list";
  private Boolean showPartialVoterList;

  public V3PollsPollIdDeleteRequest() { 
  }

  public V3PollsPollIdDeleteRequest channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel. If channel_type is specified, channel_url must be specified as well.
   * @return channelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the URL of the channel. If channel_type is specified, channel_url must be specified as well.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelUrl() {
    return channelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public V3PollsPollIdDeleteRequest channelType(String channelType) {
    this.channelType = channelType;
    return this;
  }

   /**
   * Specifies the type of the channel. Either open_channels or group_channels.
   * @return channelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the type of the channel. Either open_channels or group_channels.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelType() {
    return channelType;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public V3PollsPollIdDeleteRequest showPartialVoterList(Boolean showPartialVoterList) {
    this.showPartialVoterList = showPartialVoterList;
    return this;
  }

   /**
   * Determines whether to show a partial list of voters for each option. If set to true, the option resources inside the response include the partial_voter_list property which shows up to ten voters.
   * @return showPartialVoterList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to show a partial list of voters for each option. If set to true, the option resources inside the response include the partial_voter_list property which shows up to ten voters.")
  @JsonProperty(JSON_PROPERTY_SHOW_PARTIAL_VOTER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowPartialVoterList() {
    return showPartialVoterList;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_PARTIAL_VOTER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowPartialVoterList(Boolean showPartialVoterList) {
    this.showPartialVoterList = showPartialVoterList;
  }


  /**
   * Return true if this _v3_polls__poll_id__delete_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3PollsPollIdDeleteRequest v3PollsPollIdDeleteRequest = (V3PollsPollIdDeleteRequest) o;
    return Objects.equals(this.channelUrl, v3PollsPollIdDeleteRequest.channelUrl) &&
        Objects.equals(this.channelType, v3PollsPollIdDeleteRequest.channelType) &&
        Objects.equals(this.showPartialVoterList, v3PollsPollIdDeleteRequest.showPartialVoterList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, channelType, showPartialVoterList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3PollsPollIdDeleteRequest {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    showPartialVoterList: ").append(toIndentedString(showPartialVoterList)).append("\n");
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

