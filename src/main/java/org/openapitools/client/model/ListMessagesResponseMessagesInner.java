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
import org.openapitools.client.model.ListMessagesResponseMessagesInnerOgTag;
import org.openapitools.client.model.ListMessagesResponseMessagesInnerSortedMetaarrayInner;
import org.openapitools.client.model.SendBirdMessageResponseMentionedUsersInner;
import org.openapitools.client.model.SendBirdMessageResponseUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListMessagesResponseMessagesInner
 */
@JsonPropertyOrder({
  ListMessagesResponseMessagesInner.JSON_PROPERTY_MESSAGE_SURVIVAL_SECONDS,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_CUSTOM_TYPE,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_MENTIONED_USERS,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_TRANSLATIONS,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_UPDATED_AT,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_IS_OP_MSG,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_IS_REMOVED,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_USER,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_FILE,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_MESSAGE,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_DATA,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_MESSAGE_RETENTION_HOUR,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_SILENT,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_TYPE,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_CREATED_AT,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_CHANNEL_TYPE,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_REQ_ID,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_MENTION_TYPE,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_CHANNEL_URL,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_MESSAGE_ID,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_SORTED_METAARRAY,
  ListMessagesResponseMessagesInner.JSON_PROPERTY_OG_TAG
})
@JsonTypeName("listMessagesResponse_messages_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T12:28:02.899+09:00[Asia/Seoul]")
public class ListMessagesResponseMessagesInner {
  public static final String JSON_PROPERTY_MESSAGE_SURVIVAL_SECONDS = "message_survival_seconds";
  private BigDecimal messageSurvivalSeconds;

  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public static final String JSON_PROPERTY_MENTIONED_USERS = "mentioned_users";
  private List<SendBirdMessageResponseMentionedUsersInner> mentionedUsers = null;

  public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
  private Object translations;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private BigDecimal updatedAt;

  public static final String JSON_PROPERTY_IS_OP_MSG = "is_op_msg";
  private Boolean isOpMsg;

  public static final String JSON_PROPERTY_IS_REMOVED = "is_removed";
  private Boolean isRemoved;

  public static final String JSON_PROPERTY_USER = "user";
  private SendBirdMessageResponseUser user;

  public static final String JSON_PROPERTY_FILE = "file";
  private Object _file;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_MESSAGE_RETENTION_HOUR = "message_retention_hour";
  private BigDecimal messageRetentionHour;

  public static final String JSON_PROPERTY_SILENT = "silent";
  private Boolean silent;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private BigDecimal createdAt;

  public static final String JSON_PROPERTY_CHANNEL_TYPE = "channel_type";
  private String channelType;

  public static final String JSON_PROPERTY_REQ_ID = "req_id";
  private String reqId;

  public static final String JSON_PROPERTY_MENTION_TYPE = "mention_type";
  private String mentionType;

  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_MESSAGE_ID = "message_id";
  private BigDecimal messageId;

  public static final String JSON_PROPERTY_SORTED_METAARRAY = "sorted_metaarray";
  private List<ListMessagesResponseMessagesInnerSortedMetaarrayInner> sortedMetaarray = null;

  public static final String JSON_PROPERTY_OG_TAG = "og_tag";
  private ListMessagesResponseMessagesInnerOgTag ogTag;

  public ListMessagesResponseMessagesInner() { 
  }

  public ListMessagesResponseMessagesInner messageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    this.messageSurvivalSeconds = messageSurvivalSeconds;
    return this;
  }

   /**
   * Get messageSurvivalSeconds
   * @return messageSurvivalSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_SURVIVAL_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMessageSurvivalSeconds() {
    return messageSurvivalSeconds;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_SURVIVAL_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    this.messageSurvivalSeconds = messageSurvivalSeconds;
  }


  public ListMessagesResponseMessagesInner customType(String customType) {
    this.customType = customType;
    return this;
  }

   /**
   * Get customType
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomType() {
    return customType;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomType(String customType) {
    this.customType = customType;
  }


  public ListMessagesResponseMessagesInner mentionedUsers(List<SendBirdMessageResponseMentionedUsersInner> mentionedUsers) {
    this.mentionedUsers = mentionedUsers;
    return this;
  }

  public ListMessagesResponseMessagesInner addMentionedUsersItem(SendBirdMessageResponseMentionedUsersInner mentionedUsersItem) {
    if (this.mentionedUsers == null) {
      this.mentionedUsers = new ArrayList<>();
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
  @JsonProperty(JSON_PROPERTY_MENTIONED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdMessageResponseMentionedUsersInner> getMentionedUsers() {
    return mentionedUsers;
  }


  @JsonProperty(JSON_PROPERTY_MENTIONED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionedUsers(List<SendBirdMessageResponseMentionedUsersInner> mentionedUsers) {
    this.mentionedUsers = mentionedUsers;
  }


  public ListMessagesResponseMessagesInner translations(Object translations) {
    this.translations = translations;
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTranslations() {
    return translations;
  }


  @JsonProperty(JSON_PROPERTY_TRANSLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranslations(Object translations) {
    this.translations = translations;
  }


  public ListMessagesResponseMessagesInner updatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ListMessagesResponseMessagesInner isOpMsg(Boolean isOpMsg) {
    this.isOpMsg = isOpMsg;
    return this;
  }

   /**
   * Get isOpMsg
   * @return isOpMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_OP_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsOpMsg() {
    return isOpMsg;
  }


  @JsonProperty(JSON_PROPERTY_IS_OP_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOpMsg(Boolean isOpMsg) {
    this.isOpMsg = isOpMsg;
  }


  public ListMessagesResponseMessagesInner isRemoved(Boolean isRemoved) {
    this.isRemoved = isRemoved;
    return this;
  }

   /**
   * Get isRemoved
   * @return isRemoved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRemoved() {
    return isRemoved;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoved(Boolean isRemoved) {
    this.isRemoved = isRemoved;
  }


  public ListMessagesResponseMessagesInner user(SendBirdMessageResponseUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdMessageResponseUser getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(SendBirdMessageResponseUser user) {
    this.user = user;
  }


  public ListMessagesResponseMessagesInner _file(Object _file) {
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFile(Object _file) {
    this._file = _file;
  }


  public ListMessagesResponseMessagesInner message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public ListMessagesResponseMessagesInner data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(String data) {
    this.data = data;
  }


  public ListMessagesResponseMessagesInner messageRetentionHour(BigDecimal messageRetentionHour) {
    this.messageRetentionHour = messageRetentionHour;
    return this;
  }

   /**
   * Get messageRetentionHour
   * @return messageRetentionHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_RETENTION_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMessageRetentionHour() {
    return messageRetentionHour;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_RETENTION_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageRetentionHour(BigDecimal messageRetentionHour) {
    this.messageRetentionHour = messageRetentionHour;
  }


  public ListMessagesResponseMessagesInner silent(Boolean silent) {
    this.silent = silent;
    return this;
  }

   /**
   * Get silent
   * @return silent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SILENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSilent() {
    return silent;
  }


  @JsonProperty(JSON_PROPERTY_SILENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSilent(Boolean silent) {
    this.silent = silent;
  }


  public ListMessagesResponseMessagesInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public ListMessagesResponseMessagesInner createdAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }


  public ListMessagesResponseMessagesInner channelType(String channelType) {
    this.channelType = channelType;
    return this;
  }

   /**
   * Get channelType
   * @return channelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ListMessagesResponseMessagesInner reqId(String reqId) {
    this.reqId = reqId;
    return this;
  }

   /**
   * Get reqId
   * @return reqId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReqId() {
    return reqId;
  }


  @JsonProperty(JSON_PROPERTY_REQ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReqId(String reqId) {
    this.reqId = reqId;
  }


  public ListMessagesResponseMessagesInner mentionType(String mentionType) {
    this.mentionType = mentionType;
    return this;
  }

   /**
   * Get mentionType
   * @return mentionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMentionType() {
    return mentionType;
  }


  @JsonProperty(JSON_PROPERTY_MENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionType(String mentionType) {
    this.mentionType = mentionType;
  }


  public ListMessagesResponseMessagesInner channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Get channelUrl
   * @return channelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ListMessagesResponseMessagesInner messageId(BigDecimal messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMessageId() {
    return messageId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageId(BigDecimal messageId) {
    this.messageId = messageId;
  }


  public ListMessagesResponseMessagesInner sortedMetaarray(List<ListMessagesResponseMessagesInnerSortedMetaarrayInner> sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
    return this;
  }

  public ListMessagesResponseMessagesInner addSortedMetaarrayItem(ListMessagesResponseMessagesInnerSortedMetaarrayInner sortedMetaarrayItem) {
    if (this.sortedMetaarray == null) {
      this.sortedMetaarray = new ArrayList<>();
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
  @JsonProperty(JSON_PROPERTY_SORTED_METAARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListMessagesResponseMessagesInnerSortedMetaarrayInner> getSortedMetaarray() {
    return sortedMetaarray;
  }


  @JsonProperty(JSON_PROPERTY_SORTED_METAARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortedMetaarray(List<ListMessagesResponseMessagesInnerSortedMetaarrayInner> sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
  }


  public ListMessagesResponseMessagesInner ogTag(ListMessagesResponseMessagesInnerOgTag ogTag) {
    this.ogTag = ogTag;
    return this;
  }

   /**
   * Get ogTag
   * @return ogTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OG_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListMessagesResponseMessagesInnerOgTag getOgTag() {
    return ogTag;
  }


  @JsonProperty(JSON_PROPERTY_OG_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOgTag(ListMessagesResponseMessagesInnerOgTag ogTag) {
    this.ogTag = ogTag;
  }


  /**
   * Return true if this listMessagesResponse_messages_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMessagesResponseMessagesInner listMessagesResponseMessagesInner = (ListMessagesResponseMessagesInner) o;
    return Objects.equals(this.messageSurvivalSeconds, listMessagesResponseMessagesInner.messageSurvivalSeconds) &&
        Objects.equals(this.customType, listMessagesResponseMessagesInner.customType) &&
        Objects.equals(this.mentionedUsers, listMessagesResponseMessagesInner.mentionedUsers) &&
        Objects.equals(this.translations, listMessagesResponseMessagesInner.translations) &&
        Objects.equals(this.updatedAt, listMessagesResponseMessagesInner.updatedAt) &&
        Objects.equals(this.isOpMsg, listMessagesResponseMessagesInner.isOpMsg) &&
        Objects.equals(this.isRemoved, listMessagesResponseMessagesInner.isRemoved) &&
        Objects.equals(this.user, listMessagesResponseMessagesInner.user) &&
        Objects.equals(this._file, listMessagesResponseMessagesInner._file) &&
        Objects.equals(this.message, listMessagesResponseMessagesInner.message) &&
        Objects.equals(this.data, listMessagesResponseMessagesInner.data) &&
        Objects.equals(this.messageRetentionHour, listMessagesResponseMessagesInner.messageRetentionHour) &&
        Objects.equals(this.silent, listMessagesResponseMessagesInner.silent) &&
        Objects.equals(this.type, listMessagesResponseMessagesInner.type) &&
        Objects.equals(this.createdAt, listMessagesResponseMessagesInner.createdAt) &&
        Objects.equals(this.channelType, listMessagesResponseMessagesInner.channelType) &&
        Objects.equals(this.reqId, listMessagesResponseMessagesInner.reqId) &&
        Objects.equals(this.mentionType, listMessagesResponseMessagesInner.mentionType) &&
        Objects.equals(this.channelUrl, listMessagesResponseMessagesInner.channelUrl) &&
        Objects.equals(this.messageId, listMessagesResponseMessagesInner.messageId) &&
        Objects.equals(this.sortedMetaarray, listMessagesResponseMessagesInner.sortedMetaarray) &&
        Objects.equals(this.ogTag, listMessagesResponseMessagesInner.ogTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageSurvivalSeconds, customType, mentionedUsers, translations, updatedAt, isOpMsg, isRemoved, user, _file, message, data, messageRetentionHour, silent, type, createdAt, channelType, reqId, mentionType, channelUrl, messageId, sortedMetaarray, ogTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMessagesResponseMessagesInner {\n");
    sb.append("    messageSurvivalSeconds: ").append(toIndentedString(messageSurvivalSeconds)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    mentionedUsers: ").append(toIndentedString(mentionedUsers)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    isOpMsg: ").append(toIndentedString(isOpMsg)).append("\n");
    sb.append("    isRemoved: ").append(toIndentedString(isRemoved)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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

