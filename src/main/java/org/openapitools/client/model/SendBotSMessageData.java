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

/**
 * SendBotSMessageData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T11:00:21.022543+01:00[Europe/London]")
public class SendBotSMessageData {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_CUSTOM_TYPE = "custom_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TYPE)
  private String customType;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_SEND_PUSH = "send_push";
  @SerializedName(SERIALIZED_NAME_SEND_PUSH)
  private Boolean sendPush;

  public static final String SERIALIZED_NAME_MENTIONED = "mentioned";
  @SerializedName(SERIALIZED_NAME_MENTIONED)
  private List<Integer> mentioned = null;

  public static final String SERIALIZED_NAME_MARK_AS_READ = "mark_as_read";
  @SerializedName(SERIALIZED_NAME_MARK_AS_READ)
  private Boolean markAsRead;

  public static final String SERIALIZED_NAME_DEDUP_ID = "dedup_id";
  @SerializedName(SERIALIZED_NAME_DEDUP_ID)
  private String dedupId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public SendBotSMessageData() { 
  }

  public SendBotSMessageData message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Specifies the content of the message sent by the bot.
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the content of the message sent by the bot.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SendBotSMessageData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel where the message is sent to.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel where the message is sent to.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public SendBotSMessageData customType(String customType) {
    
    this.customType = customType;
    return this;
  }

   /**
   * Specifies a custom message type which is used for message grouping. The length is limited to 128 characters.
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a custom message type which is used for message grouping. The length is limited to 128 characters.")

  public String getCustomType() {
    return customType;
  }


  public void setCustomType(String customType) {
    this.customType = customType;
  }


  public SendBotSMessageData data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Specifies additional message information such as custom font size, font type or &#x60;JSON&#x60; formatted string.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional message information such as custom font size, font type or `JSON` formatted string.")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public SendBotSMessageData sendPush(Boolean sendPush) {
    
    this.sendPush = sendPush;
    return this;
  }

   /**
   * Determines whether to send a push notification for the message to the members of the channel (Default: true)
   * @return sendPush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to send a push notification for the message to the members of the channel (Default: true)")

  public Boolean getSendPush() {
    return sendPush;
  }


  public void setSendPush(Boolean sendPush) {
    this.sendPush = sendPush;
  }


  public SendBotSMessageData mentioned(List<Integer> mentioned) {
    
    this.mentioned = mentioned;
    return this;
  }

  public SendBotSMessageData addMentionedItem(Integer mentionedItem) {
    if (this.mentioned == null) {
      this.mentioned = new ArrayList<Integer>();
    }
    this.mentioned.add(mentionedItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of the users who get a notification for the message.
   * @return mentioned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more IDs of the users who get a notification for the message.")

  public List<Integer> getMentioned() {
    return mentioned;
  }


  public void setMentioned(List<Integer> mentioned) {
    this.mentioned = mentioned;
  }


  public SendBotSMessageData markAsRead(Boolean markAsRead) {
    
    this.markAsRead = markAsRead;
    return this;
  }

   /**
   * Determines whether to mark the message as read for the bot. If set to false, the bot&#39;s unread_count and read_receipt remain unchanged after the message is sent. (Default: true)
   * @return markAsRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to mark the message as read for the bot. If set to false, the bot's unread_count and read_receipt remain unchanged after the message is sent. (Default: true)")

  public Boolean getMarkAsRead() {
    return markAsRead;
  }


  public void setMarkAsRead(Boolean markAsRead) {
    this.markAsRead = markAsRead;
  }


  public SendBotSMessageData dedupId(String dedupId) {
    
    this.dedupId = dedupId;
    return this;
  }

   /**
   * Specifies the unique ID for the message to prevent the same message data from getting sent to the channel.
   * @return dedupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the unique ID for the message to prevent the same message data from getting sent to the channel.")

  public String getDedupId() {
    return dedupId;
  }


  public void setDedupId(String dedupId) {
    this.dedupId = dedupId;
  }


  public SendBotSMessageData createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Specifies the time that the message was sent, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time that the message was sent, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format.")

  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBotSMessageData sendBotSMessageData = (SendBotSMessageData) o;
    return Objects.equals(this.message, sendBotSMessageData.message) &&
        Objects.equals(this.channelUrl, sendBotSMessageData.channelUrl) &&
        Objects.equals(this.customType, sendBotSMessageData.customType) &&
        Objects.equals(this.data, sendBotSMessageData.data) &&
        Objects.equals(this.sendPush, sendBotSMessageData.sendPush) &&
        Objects.equals(this.mentioned, sendBotSMessageData.mentioned) &&
        Objects.equals(this.markAsRead, sendBotSMessageData.markAsRead) &&
        Objects.equals(this.dedupId, sendBotSMessageData.dedupId) &&
        Objects.equals(this.createdAt, sendBotSMessageData.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, channelUrl, customType, data, sendPush, mentioned, markAsRead, dedupId, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBotSMessageData {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    sendPush: ").append(toIndentedString(sendPush)).append("\n");
    sb.append("    mentioned: ").append(toIndentedString(mentioned)).append("\n");
    sb.append("    markAsRead: ").append(toIndentedString(markAsRead)).append("\n");
    sb.append("    dedupId: ").append(toIndentedString(dedupId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

