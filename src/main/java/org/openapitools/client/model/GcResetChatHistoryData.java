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

/**
 * GcResetChatHistoryData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class GcResetChatHistoryData {
  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_RESET_ALL = "reset_all";
  @SerializedName(SERIALIZED_NAME_RESET_ALL)
  private Boolean resetAll;

  public GcResetChatHistoryData() { 
  }

  public GcResetChatHistoryData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the target channel to reset chat history.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the target channel to reset chat history.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcResetChatHistoryData userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the unique ID of the user whose chat history to reset in the channel. If this user_id property is specified, the reset_all property is not required.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the user whose chat history to reset in the channel. If this user_id property is specified, the reset_all property is not required.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GcResetChatHistoryData resetAll(Boolean resetAll) {
    
    this.resetAll = resetAll;
    return this;
  }

   /**
   * Determines whether to reset all users&#39; chat history in the channel. If this reset_all property is specified, the user_id property is not required.
   * @return resetAll
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to reset all users' chat history in the channel. If this reset_all property is specified, the user_id property is not required.")

  public Boolean getResetAll() {
    return resetAll;
  }


  public void setResetAll(Boolean resetAll) {
    this.resetAll = resetAll;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcResetChatHistoryData gcResetChatHistoryData = (GcResetChatHistoryData) o;
    return Objects.equals(this.channelUrl, gcResetChatHistoryData.channelUrl) &&
        Objects.equals(this.userId, gcResetChatHistoryData.userId) &&
        Objects.equals(this.resetAll, gcResetChatHistoryData.resetAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, userId, resetAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcResetChatHistoryData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    resetAll: ").append(toIndentedString(resetAll)).append("\n");
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

