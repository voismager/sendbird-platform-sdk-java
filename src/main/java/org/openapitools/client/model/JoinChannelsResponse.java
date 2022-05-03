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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SendBirdGroupChannel;

/**
 * JoinChannelsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T07:39:00.941714+01:00[Europe/London]")
public class JoinChannelsResponse {
  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private List<SendBirdGroupChannel> channels = null;

  public JoinChannelsResponse() { 
  }

  public JoinChannelsResponse channels(List<SendBirdGroupChannel> channels) {
    
    this.channels = channels;
    return this;
  }

  public JoinChannelsResponse addChannelsItem(SendBirdGroupChannel channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<SendBirdGroupChannel>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdGroupChannel> getChannels() {
    return channels;
  }


  public void setChannels(List<SendBirdGroupChannel> channels) {
    this.channels = channels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JoinChannelsResponse joinChannelsResponse = (JoinChannelsResponse) o;
    return Objects.equals(this.channels, joinChannelsResponse.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JoinChannelsResponse {\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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
