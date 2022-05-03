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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ListMessagesResponseOgTag;
import org.openapitools.client.model.ListMessagesResponseSortedMetaarray;
import org.openapitools.client.model.SendBirdMessageResponseMentionedUsers;
import org.openapitools.client.model.SendBirdMessageResponseUser;

/**
 * ListMessagesResponseMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T07:39:00.941714+01:00[Europe/London]")
public class ListMessagesResponseMessages {
  public static final String SERIALIZED_NAME_MESSAGE_SURVIVAL_SECONDS = "message_survival_seconds";
  @SerializedName(SERIALIZED_NAME_MESSAGE_SURVIVAL_SECONDS)
  private BigDecimal messageSurvivalSeconds;

  public static final String SERIALIZED_NAME_CUSTOM_TYPE = "custom_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TYPE)
  private String customType;

  public static final String SERIALIZED_NAME_MENTIONED_USERS = "mentioned_users";
  @SerializedName(SERIALIZED_NAME_MENTIONED_USERS)
  private List<SendBirdMessageResponseMentionedUsers> mentionedUsers = null;

  public static final String SERIALIZED_NAME_TRANSLATIONS = "translations";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS)
  private Object translations;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private BigDecimal updatedAt;

  public static final String SERIALIZED_NAME_IS_OP_MSG = "is_op_msg";
  @SerializedName(SERIALIZED_NAME_IS_OP_MSG)
  private Boolean isOpMsg;

  public static final String SERIALIZED_NAME_IS_REMOVED = "is_removed";
  @SerializedName(SERIALIZED_NAME_IS_REMOVED)
  private Boolean isRemoved;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private SendBirdMessageResponseUser user;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private Object file;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_MESSAGE_RETENTION_HOUR = "message_retention_hour";
  @SerializedName(SERIALIZED_NAME_MESSAGE_RETENTION_HOUR)
  private BigDecimal messageRetentionHour;

  public static final String SERIALIZED_NAME_SILENT = "silent";
  @SerializedName(SERIALIZED_NAME_SILENT)
  private Boolean silent;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private String channelType;

  public static final String SERIALIZED_NAME_REQ_ID = "req_id";
  @SerializedName(SERIALIZED_NAME_REQ_ID)
  private String reqId;

  public static final String SERIALIZED_NAME_MENTION_TYPE = "mention_type";
  @SerializedName(SERIALIZED_NAME_MENTION_TYPE)
  private String mentionType;

  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private BigDecimal messageId;

  public static final String SERIALIZED_NAME_SORTED_METAARRAY = "sorted_metaarray";
  @SerializedName(SERIALIZED_NAME_SORTED_METAARRAY)
  private List<ListMessagesResponseSortedMetaarray> sortedMetaarray = null;

  public static final String SERIALIZED_NAME_OG_TAG = "og_tag";
  @SerializedName(SERIALIZED_NAME_OG_TAG)
  private ListMessagesResponseOgTag ogTag;

  public ListMessagesResponseMessages() { 
  }

  public ListMessagesResponseMessages messageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    
    this.messageSurvivalSeconds = messageSurvivalSeconds;
    return this;
  }

   /**
   * Get messageSurvivalSeconds
   * @return messageSurvivalSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMessageSurvivalSeconds() {
    return messageSurvivalSeconds;
  }


  public void setMessageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    this.messageSurvivalSeconds = messageSurvivalSeconds;
  }


  public ListMessagesResponseMessages customType(String customType) {
    
    this.customType = customType;
    return this;
  }

   /**
   * Get customType
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomType() {
    return customType;
  }


  public void setCustomType(String customType) {
    this.customType = customType;
  }


  public ListMessagesResponseMessages mentionedUsers(List<SendBirdMessageResponseMentionedUsers> mentionedUsers) {
    
    this.mentionedUsers = mentionedUsers;
    return this;
  }

  public ListMessagesResponseMessages addMentionedUsersItem(SendBirdMessageResponseMentionedUsers mentionedUsersItem) {
    if (this.mentionedUsers == null) {
      this.mentionedUsers = new ArrayList<SendBirdMessageResponseMentionedUsers>();
    }
    this.mentionedUsers.add(mentionedUsersItem);
    return this;
  }

   /**
   * Get mentionedUsers
   * @return mentionedUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdMessageResponseMentionedUsers> getMentionedUsers() {
    return mentionedUsers;
  }


  public void setMentionedUsers(List<SendBirdMessageResponseMentionedUsers> mentionedUsers) {
    this.mentionedUsers = mentionedUsers;
  }


  public ListMessagesResponseMessages translations(Object translations) {
    
    this.translations = translations;
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTranslations() {
    return translations;
  }


  public void setTranslations(Object translations) {
    this.translations = translations;
  }


  public ListMessagesResponseMessages updatedAt(BigDecimal updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ListMessagesResponseMessages isOpMsg(Boolean isOpMsg) {
    
    this.isOpMsg = isOpMsg;
    return this;
  }

   /**
   * Get isOpMsg
   * @return isOpMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOpMsg() {
    return isOpMsg;
  }


  public void setIsOpMsg(Boolean isOpMsg) {
    this.isOpMsg = isOpMsg;
  }


  public ListMessagesResponseMessages isRemoved(Boolean isRemoved) {
    
    this.isRemoved = isRemoved;
    return this;
  }

   /**
   * Get isRemoved
   * @return isRemoved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRemoved() {
    return isRemoved;
  }


  public void setIsRemoved(Boolean isRemoved) {
    this.isRemoved = isRemoved;
  }


  public ListMessagesResponseMessages user(SendBirdMessageResponseUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdMessageResponseUser getUser() {
    return user;
  }


  public void setUser(SendBirdMessageResponseUser user) {
    this.user = user;
  }


  public ListMessagesResponseMessages file(Object file) {
    
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFile() {
    return file;
  }


  public void setFile(Object file) {
    this.file = file;
  }


  public ListMessagesResponseMessages message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ListMessagesResponseMessages data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public ListMessagesResponseMessages messageRetentionHour(BigDecimal messageRetentionHour) {
    
    this.messageRetentionHour = messageRetentionHour;
    return this;
  }

   /**
   * Get messageRetentionHour
   * @return messageRetentionHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMessageRetentionHour() {
    return messageRetentionHour;
  }


  public void setMessageRetentionHour(BigDecimal messageRetentionHour) {
    this.messageRetentionHour = messageRetentionHour;
  }


  public ListMessagesResponseMessages silent(Boolean silent) {
    
    this.silent = silent;
    return this;
  }

   /**
   * Get silent
   * @return silent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSilent() {
    return silent;
  }


  public void setSilent(Boolean silent) {
    this.silent = silent;
  }


  public ListMessagesResponseMessages type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ListMessagesResponseMessages createdAt(BigDecimal createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }


  public ListMessagesResponseMessages channelType(String channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * Get channelType
   * @return channelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelType() {
    return channelType;
  }


  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public ListMessagesResponseMessages reqId(String reqId) {
    
    this.reqId = reqId;
    return this;
  }

   /**
   * Get reqId
   * @return reqId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReqId() {
    return reqId;
  }


  public void setReqId(String reqId) {
    this.reqId = reqId;
  }


  public ListMessagesResponseMessages mentionType(String mentionType) {
    
    this.mentionType = mentionType;
    return this;
  }

   /**
   * Get mentionType
   * @return mentionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMentionType() {
    return mentionType;
  }


  public void setMentionType(String mentionType) {
    this.mentionType = mentionType;
  }


  public ListMessagesResponseMessages channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Get channelUrl
   * @return channelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public ListMessagesResponseMessages messageId(BigDecimal messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMessageId() {
    return messageId;
  }


  public void setMessageId(BigDecimal messageId) {
    this.messageId = messageId;
  }


  public ListMessagesResponseMessages sortedMetaarray(List<ListMessagesResponseSortedMetaarray> sortedMetaarray) {
    
    this.sortedMetaarray = sortedMetaarray;
    return this;
  }

  public ListMessagesResponseMessages addSortedMetaarrayItem(ListMessagesResponseSortedMetaarray sortedMetaarrayItem) {
    if (this.sortedMetaarray == null) {
      this.sortedMetaarray = new ArrayList<ListMessagesResponseSortedMetaarray>();
    }
    this.sortedMetaarray.add(sortedMetaarrayItem);
    return this;
  }

   /**
   * Get sortedMetaarray
   * @return sortedMetaarray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ListMessagesResponseSortedMetaarray> getSortedMetaarray() {
    return sortedMetaarray;
  }


  public void setSortedMetaarray(List<ListMessagesResponseSortedMetaarray> sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
  }


  public ListMessagesResponseMessages ogTag(ListMessagesResponseOgTag ogTag) {
    
    this.ogTag = ogTag;
    return this;
  }

   /**
   * Get ogTag
   * @return ogTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListMessagesResponseOgTag getOgTag() {
    return ogTag;
  }


  public void setOgTag(ListMessagesResponseOgTag ogTag) {
    this.ogTag = ogTag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMessagesResponseMessages listMessagesResponseMessages = (ListMessagesResponseMessages) o;
    return Objects.equals(this.messageSurvivalSeconds, listMessagesResponseMessages.messageSurvivalSeconds) &&
        Objects.equals(this.customType, listMessagesResponseMessages.customType) &&
        Objects.equals(this.mentionedUsers, listMessagesResponseMessages.mentionedUsers) &&
        Objects.equals(this.translations, listMessagesResponseMessages.translations) &&
        Objects.equals(this.updatedAt, listMessagesResponseMessages.updatedAt) &&
        Objects.equals(this.isOpMsg, listMessagesResponseMessages.isOpMsg) &&
        Objects.equals(this.isRemoved, listMessagesResponseMessages.isRemoved) &&
        Objects.equals(this.user, listMessagesResponseMessages.user) &&
        Objects.equals(this.file, listMessagesResponseMessages.file) &&
        Objects.equals(this.message, listMessagesResponseMessages.message) &&
        Objects.equals(this.data, listMessagesResponseMessages.data) &&
        Objects.equals(this.messageRetentionHour, listMessagesResponseMessages.messageRetentionHour) &&
        Objects.equals(this.silent, listMessagesResponseMessages.silent) &&
        Objects.equals(this.type, listMessagesResponseMessages.type) &&
        Objects.equals(this.createdAt, listMessagesResponseMessages.createdAt) &&
        Objects.equals(this.channelType, listMessagesResponseMessages.channelType) &&
        Objects.equals(this.reqId, listMessagesResponseMessages.reqId) &&
        Objects.equals(this.mentionType, listMessagesResponseMessages.mentionType) &&
        Objects.equals(this.channelUrl, listMessagesResponseMessages.channelUrl) &&
        Objects.equals(this.messageId, listMessagesResponseMessages.messageId) &&
        Objects.equals(this.sortedMetaarray, listMessagesResponseMessages.sortedMetaarray) &&
        Objects.equals(this.ogTag, listMessagesResponseMessages.ogTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageSurvivalSeconds, customType, mentionedUsers, translations, updatedAt, isOpMsg, isRemoved, user, file, message, data, messageRetentionHour, silent, type, createdAt, channelType, reqId, mentionType, channelUrl, messageId, sortedMetaarray, ogTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMessagesResponseMessages {\n");
    sb.append("    messageSurvivalSeconds: ").append(toIndentedString(messageSurvivalSeconds)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    mentionedUsers: ").append(toIndentedString(mentionedUsers)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    isOpMsg: ").append(toIndentedString(isOpMsg)).append("\n");
    sb.append("    isRemoved: ").append(toIndentedString(isRemoved)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    messageRetentionHour: ").append(toIndentedString(messageRetentionHour)).append("\n");
    sb.append("    silent: ").append(toIndentedString(silent)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    reqId: ").append(toIndentedString(reqId)).append("\n");
    sb.append("    mentionType: ").append(toIndentedString(mentionType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    sortedMetaarray: ").append(toIndentedString(sortedMetaarray)).append("\n");
    sb.append("    ogTag: ").append(toIndentedString(ogTag)).append("\n");
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

