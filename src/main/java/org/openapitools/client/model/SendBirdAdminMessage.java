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
import org.openapitools.client.model.SBObject;
import org.openapitools.client.model.SendBirdAppleCriticalAlertOptions;
import org.openapitools.client.model.SendBirdMessageMetaArray;
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendBirdOGMetaData;
import org.openapitools.client.model.SendBirdReaction;
import org.openapitools.client.model.SendBirdThreadInfo;
import org.openapitools.client.model.SendBirdUser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.sendbird.client.JSON;

/**
 * SendBirdAdminMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T13:37:01.045476+01:00[Europe/London]")
public class SendBirdAdminMessage {
  public static final String SERIALIZED_NAME_APPLE_CRITICAL_ALERT_OPTIONS = "apple_critical_alert_options";
  @SerializedName(SERIALIZED_NAME_APPLE_CRITICAL_ALERT_OPTIONS)
  private SendBirdAppleCriticalAlertOptions appleCriticalAlertOptions;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private String channelType;

  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public static final String SERIALIZED_NAME_CUSTOM_TYPE = "custom_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TYPE)
  private String customType;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_IS_REPLY_TO_CHANNEL = "is_reply_to_channel";
  @SerializedName(SERIALIZED_NAME_IS_REPLY_TO_CHANNEL)
  private Boolean isReplyToChannel;

  public static final String SERIALIZED_NAME_MENTION_TYPE = "mention_type";
  @SerializedName(SERIALIZED_NAME_MENTION_TYPE)
  private String mentionType;

  public static final String SERIALIZED_NAME_MENTIONED_USERS = "mentioned_users";
  @SerializedName(SERIALIZED_NAME_MENTIONED_USERS)
  private List<SendBirdUser> mentionedUsers = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private BigDecimal messageId;

  /**
   * Gets or Sets messageType
   */
  @JsonAdapter(MessageTypeEnum.Adapter.class)
  public enum MessageTypeEnum {
    MESG("MESG"),
    
    ADMM("ADMM"),
    
    FILE("FILE");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MessageTypeEnum fromValue(String value) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MessageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MessageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MessageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MessageTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "message_type";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  private MessageTypeEnum messageType;

  public static final String SERIALIZED_NAME_META_ARRAY = "meta_array";
  @SerializedName(SERIALIZED_NAME_META_ARRAY)
  private SBObject metaArray;

  public static final String SERIALIZED_NAME_META_ARRAYS = "meta_arrays";
  @SerializedName(SERIALIZED_NAME_META_ARRAYS)
  private List<SendBirdMessageMetaArray> metaArrays = null;

  public static final String SERIALIZED_NAME_OG_META_DATA = "og_meta_data";
  @SerializedName(SERIALIZED_NAME_OG_META_DATA)
  private SendBirdOGMetaData ogMetaData;

  public static final String SERIALIZED_NAME_PARENT_MESSAGE = "parent_message";
  @SerializedName(SERIALIZED_NAME_PARENT_MESSAGE)
  private SendBirdMessageResponse parentMessage;

  public static final String SERIALIZED_NAME_PARENT_MESSAGE_ID = "parent_message_id";
  @SerializedName(SERIALIZED_NAME_PARENT_MESSAGE_ID)
  private BigDecimal parentMessageId;

  public static final String SERIALIZED_NAME_PARENT_MESSAGE_TEXT = "parent_message_text";
  @SerializedName(SERIALIZED_NAME_PARENT_MESSAGE_TEXT)
  private String parentMessageText;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private List<SendBirdReaction> reactions = null;

  /**
   * Gets or Sets sendingStatus
   */
  @JsonAdapter(SendingStatusEnum.Adapter.class)
  public enum SendingStatusEnum {
    CANCELED("canceled"),
    
    FAILED("failed"),
    
    NONE("none"),
    
    PENDING("pending"),
    
    SUCCEEDED("succeeded");

    private String value;

    SendingStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SendingStatusEnum fromValue(String value) {
      for (SendingStatusEnum b : SendingStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SendingStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SendingStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SendingStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SendingStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SENDING_STATUS = "sending_status";
  @SerializedName(SERIALIZED_NAME_SENDING_STATUS)
  private SendingStatusEnum sendingStatus;

  public static final String SERIALIZED_NAME_SILENT = "silent";
  @SerializedName(SERIALIZED_NAME_SILENT)
  private Boolean silent;

  public static final String SERIALIZED_NAME_THREAD_INFO = "thread_info";
  @SerializedName(SERIALIZED_NAME_THREAD_INFO)
  private SendBirdThreadInfo threadInfo;

  public static final String SERIALIZED_NAME_TRANSLATIONS = "translations";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS)
  private SBObject translations;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private BigDecimal updatedAt;

  public SendBirdAdminMessage() { 
  }

  public SendBirdAdminMessage appleCriticalAlertOptions(SendBirdAppleCriticalAlertOptions appleCriticalAlertOptions) {
    
    this.appleCriticalAlertOptions = appleCriticalAlertOptions;
    return this;
  }

   /**
   * Get appleCriticalAlertOptions
   * @return appleCriticalAlertOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdAppleCriticalAlertOptions getAppleCriticalAlertOptions() {
    return appleCriticalAlertOptions;
  }


  public void setAppleCriticalAlertOptions(SendBirdAppleCriticalAlertOptions appleCriticalAlertOptions) {
    this.appleCriticalAlertOptions = appleCriticalAlertOptions;
  }


  public SendBirdAdminMessage channelType(String channelType) {
    
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


  public SendBirdAdminMessage channelUrl(String channelUrl) {
    
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


  public SendBirdAdminMessage createdAt(BigDecimal createdAt) {
    
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


  public SendBirdAdminMessage customType(String customType) {
    
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


  public SendBirdAdminMessage data(String data) {
    
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


  public SendBirdAdminMessage isReplyToChannel(Boolean isReplyToChannel) {
    
    this.isReplyToChannel = isReplyToChannel;
    return this;
  }

   /**
   * Get isReplyToChannel
   * @return isReplyToChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsReplyToChannel() {
    return isReplyToChannel;
  }


  public void setIsReplyToChannel(Boolean isReplyToChannel) {
    this.isReplyToChannel = isReplyToChannel;
  }


  public SendBirdAdminMessage mentionType(String mentionType) {
    
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


  public SendBirdAdminMessage mentionedUsers(List<SendBirdUser> mentionedUsers) {
    
    this.mentionedUsers = mentionedUsers;
    return this;
  }

  public SendBirdAdminMessage addMentionedUsersItem(SendBirdUser mentionedUsersItem) {
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

  public List<SendBirdUser> getMentionedUsers() {
    return mentionedUsers;
  }


  public void setMentionedUsers(List<SendBirdUser> mentionedUsers) {
    this.mentionedUsers = mentionedUsers;
  }


  public SendBirdAdminMessage message(String message) {
    
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


  public SendBirdAdminMessage messageId(BigDecimal messageId) {
    
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


  public SendBirdAdminMessage messageType(MessageTypeEnum messageType) {
    
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MessageTypeEnum getMessageType() {
    return messageType;
  }


  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }


  public SendBirdAdminMessage metaArray(SBObject metaArray) {
    
    this.metaArray = metaArray;
    return this;
  }

   /**
   * Get metaArray
   * @return metaArray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SBObject getMetaArray() {
    return metaArray;
  }


  public void setMetaArray(SBObject metaArray) {
    this.metaArray = metaArray;
  }


  public SendBirdAdminMessage metaArrays(List<SendBirdMessageMetaArray> metaArrays) {
    
    this.metaArrays = metaArrays;
    return this;
  }

  public SendBirdAdminMessage addMetaArraysItem(SendBirdMessageMetaArray metaArraysItem) {
    if (this.metaArrays == null) {
      this.metaArrays = new ArrayList<>();
    }
    this.metaArrays.add(metaArraysItem);
    return this;
  }

   /**
   * Get metaArrays
   * @return metaArrays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdMessageMetaArray> getMetaArrays() {
    return metaArrays;
  }


  public void setMetaArrays(List<SendBirdMessageMetaArray> metaArrays) {
    this.metaArrays = metaArrays;
  }


  public SendBirdAdminMessage ogMetaData(SendBirdOGMetaData ogMetaData) {
    
    this.ogMetaData = ogMetaData;
    return this;
  }

   /**
   * Get ogMetaData
   * @return ogMetaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdOGMetaData getOgMetaData() {
    return ogMetaData;
  }


  public void setOgMetaData(SendBirdOGMetaData ogMetaData) {
    this.ogMetaData = ogMetaData;
  }


  public SendBirdAdminMessage parentMessage(SendBirdMessageResponse parentMessage) {
    
    this.parentMessage = parentMessage;
    return this;
  }

   /**
   * Get parentMessage
   * @return parentMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdMessageResponse getParentMessage() {
    return parentMessage;
  }


  public void setParentMessage(SendBirdMessageResponse parentMessage) {
    this.parentMessage = parentMessage;
  }


  public SendBirdAdminMessage parentMessageId(BigDecimal parentMessageId) {
    
    this.parentMessageId = parentMessageId;
    return this;
  }

   /**
   * Get parentMessageId
   * @return parentMessageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getParentMessageId() {
    return parentMessageId;
  }


  public void setParentMessageId(BigDecimal parentMessageId) {
    this.parentMessageId = parentMessageId;
  }


  public SendBirdAdminMessage parentMessageText(String parentMessageText) {
    
    this.parentMessageText = parentMessageText;
    return this;
  }

   /**
   * Get parentMessageText
   * @return parentMessageText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentMessageText() {
    return parentMessageText;
  }


  public void setParentMessageText(String parentMessageText) {
    this.parentMessageText = parentMessageText;
  }


  public SendBirdAdminMessage reactions(List<SendBirdReaction> reactions) {
    
    this.reactions = reactions;
    return this;
  }

  public SendBirdAdminMessage addReactionsItem(SendBirdReaction reactionsItem) {
    if (this.reactions == null) {
      this.reactions = new ArrayList<>();
    }
    this.reactions.add(reactionsItem);
    return this;
  }

   /**
   * Get reactions
   * @return reactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdReaction> getReactions() {
    return reactions;
  }


  public void setReactions(List<SendBirdReaction> reactions) {
    this.reactions = reactions;
  }


  public SendBirdAdminMessage sendingStatus(SendingStatusEnum sendingStatus) {
    
    this.sendingStatus = sendingStatus;
    return this;
  }

   /**
   * Get sendingStatus
   * @return sendingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendingStatusEnum getSendingStatus() {
    return sendingStatus;
  }


  public void setSendingStatus(SendingStatusEnum sendingStatus) {
    this.sendingStatus = sendingStatus;
  }


  public SendBirdAdminMessage silent(Boolean silent) {
    
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


  public SendBirdAdminMessage threadInfo(SendBirdThreadInfo threadInfo) {
    
    this.threadInfo = threadInfo;
    return this;
  }

   /**
   * Get threadInfo
   * @return threadInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdThreadInfo getThreadInfo() {
    return threadInfo;
  }


  public void setThreadInfo(SendBirdThreadInfo threadInfo) {
    this.threadInfo = threadInfo;
  }


  public SendBirdAdminMessage translations(SBObject translations) {
    
    this.translations = translations;
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SBObject getTranslations() {
    return translations;
  }


  public void setTranslations(SBObject translations) {
    this.translations = translations;
  }


  public SendBirdAdminMessage updatedAt(BigDecimal updatedAt) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdAdminMessage sendBirdAdminMessage = (SendBirdAdminMessage) o;
    return Objects.equals(this.appleCriticalAlertOptions, sendBirdAdminMessage.appleCriticalAlertOptions) &&
        Objects.equals(this.channelType, sendBirdAdminMessage.channelType) &&
        Objects.equals(this.channelUrl, sendBirdAdminMessage.channelUrl) &&
        Objects.equals(this.createdAt, sendBirdAdminMessage.createdAt) &&
        Objects.equals(this.customType, sendBirdAdminMessage.customType) &&
        Objects.equals(this.data, sendBirdAdminMessage.data) &&
        Objects.equals(this.isReplyToChannel, sendBirdAdminMessage.isReplyToChannel) &&
        Objects.equals(this.mentionType, sendBirdAdminMessage.mentionType) &&
        Objects.equals(this.mentionedUsers, sendBirdAdminMessage.mentionedUsers) &&
        Objects.equals(this.message, sendBirdAdminMessage.message) &&
        Objects.equals(this.messageId, sendBirdAdminMessage.messageId) &&
        Objects.equals(this.messageType, sendBirdAdminMessage.messageType) &&
        Objects.equals(this.metaArray, sendBirdAdminMessage.metaArray) &&
        Objects.equals(this.metaArrays, sendBirdAdminMessage.metaArrays) &&
        Objects.equals(this.ogMetaData, sendBirdAdminMessage.ogMetaData) &&
        Objects.equals(this.parentMessage, sendBirdAdminMessage.parentMessage) &&
        Objects.equals(this.parentMessageId, sendBirdAdminMessage.parentMessageId) &&
        Objects.equals(this.parentMessageText, sendBirdAdminMessage.parentMessageText) &&
        Objects.equals(this.reactions, sendBirdAdminMessage.reactions) &&
        Objects.equals(this.sendingStatus, sendBirdAdminMessage.sendingStatus) &&
        Objects.equals(this.silent, sendBirdAdminMessage.silent) &&
        Objects.equals(this.threadInfo, sendBirdAdminMessage.threadInfo) &&
        Objects.equals(this.translations, sendBirdAdminMessage.translations) &&
        Objects.equals(this.updatedAt, sendBirdAdminMessage.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appleCriticalAlertOptions, channelType, channelUrl, createdAt, customType, data, isReplyToChannel, mentionType, mentionedUsers, message, messageId, messageType, metaArray, metaArrays, ogMetaData, parentMessage, parentMessageId, parentMessageText, reactions, sendingStatus, silent, threadInfo, translations, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdAdminMessage {\n");
    sb.append("    appleCriticalAlertOptions: ").append(toIndentedString(appleCriticalAlertOptions)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isReplyToChannel: ").append(toIndentedString(isReplyToChannel)).append("\n");
    sb.append("    mentionType: ").append(toIndentedString(mentionType)).append("\n");
    sb.append("    mentionedUsers: ").append(toIndentedString(mentionedUsers)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    metaArray: ").append(toIndentedString(metaArray)).append("\n");
    sb.append("    metaArrays: ").append(toIndentedString(metaArrays)).append("\n");
    sb.append("    ogMetaData: ").append(toIndentedString(ogMetaData)).append("\n");
    sb.append("    parentMessage: ").append(toIndentedString(parentMessage)).append("\n");
    sb.append("    parentMessageId: ").append(toIndentedString(parentMessageId)).append("\n");
    sb.append("    parentMessageText: ").append(toIndentedString(parentMessageText)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    sendingStatus: ").append(toIndentedString(sendingStatus)).append("\n");
    sb.append("    silent: ").append(toIndentedString(silent)).append("\n");
    sb.append("    threadInfo: ").append(toIndentedString(threadInfo)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("apple_critical_alert_options");
    openapiFields.add("channel_type");
    openapiFields.add("channel_url");
    openapiFields.add("created_at");
    openapiFields.add("custom_type");
    openapiFields.add("data");
    openapiFields.add("is_reply_to_channel");
    openapiFields.add("mention_type");
    openapiFields.add("mentioned_users");
    openapiFields.add("message");
    openapiFields.add("message_id");
    openapiFields.add("message_type");
    openapiFields.add("meta_array");
    openapiFields.add("meta_arrays");
    openapiFields.add("og_meta_data");
    openapiFields.add("parent_message");
    openapiFields.add("parent_message_id");
    openapiFields.add("parent_message_text");
    openapiFields.add("reactions");
    openapiFields.add("sending_status");
    openapiFields.add("silent");
    openapiFields.add("thread_info");
    openapiFields.add("translations");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendBirdAdminMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendBirdAdminMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendBirdAdminMessage is not found in the empty JSON string", SendBirdAdminMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendBirdAdminMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendBirdAdminMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `apple_critical_alert_options`
      if (jsonObj.getAsJsonObject("apple_critical_alert_options") != null) {
        SendBirdAppleCriticalAlertOptions.validateJsonObject(jsonObj.getAsJsonObject("apple_critical_alert_options"));
      }
      if (jsonObj.get("channel_type") != null && !jsonObj.get("channel_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_type").toString()));
      }
      if (jsonObj.get("channel_url") != null && !jsonObj.get("channel_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_url").toString()));
      }
      if (jsonObj.get("custom_type") != null && !jsonObj.get("custom_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_type").toString()));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if (jsonObj.get("mention_type") != null && !jsonObj.get("mention_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mention_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mention_type").toString()));
      }
      JsonArray jsonArraymentionedUsers = jsonObj.getAsJsonArray("mentioned_users");
      if (jsonArraymentionedUsers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("mentioned_users").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `mentioned_users` to be an array in the JSON string but got `%s`", jsonObj.get("mentioned_users").toString()));
        }

        // validate the optional field `mentioned_users` (array)
        for (int i = 0; i < jsonArraymentionedUsers.size(); i++) {
          SendBirdUser.validateJsonObject(jsonArraymentionedUsers.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (jsonObj.get("message_type") != null && !jsonObj.get("message_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_type").toString()));
      }
      // validate the optional field `meta_array`
      if (jsonObj.getAsJsonObject("meta_array") != null) {
        SBObject.validateJsonObject(jsonObj.getAsJsonObject("meta_array"));
      }
      JsonArray jsonArraymetaArrays = jsonObj.getAsJsonArray("meta_arrays");
      if (jsonArraymetaArrays != null) {
        // ensure the json data is an array
        if (!jsonObj.get("meta_arrays").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `meta_arrays` to be an array in the JSON string but got `%s`", jsonObj.get("meta_arrays").toString()));
        }

        // validate the optional field `meta_arrays` (array)
        for (int i = 0; i < jsonArraymetaArrays.size(); i++) {
          SendBirdMessageMetaArray.validateJsonObject(jsonArraymetaArrays.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `og_meta_data`
      if (jsonObj.getAsJsonObject("og_meta_data") != null) {
        SendBirdOGMetaData.validateJsonObject(jsonObj.getAsJsonObject("og_meta_data"));
      }
      // validate the optional field `parent_message`
      if (jsonObj.getAsJsonObject("parent_message") != null) {
        SendBirdMessageResponse.validateJsonObject(jsonObj.getAsJsonObject("parent_message"));
      }
      if (jsonObj.get("parent_message_text") != null && !jsonObj.get("parent_message_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_message_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_message_text").toString()));
      }
      JsonArray jsonArrayreactions = jsonObj.getAsJsonArray("reactions");
      if (jsonArrayreactions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("reactions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `reactions` to be an array in the JSON string but got `%s`", jsonObj.get("reactions").toString()));
        }

        // validate the optional field `reactions` (array)
        for (int i = 0; i < jsonArrayreactions.size(); i++) {
          SendBirdReaction.validateJsonObject(jsonArrayreactions.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("sending_status") != null && !jsonObj.get("sending_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sending_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sending_status").toString()));
      }
      // validate the optional field `thread_info`
      if (jsonObj.getAsJsonObject("thread_info") != null) {
        SendBirdThreadInfo.validateJsonObject(jsonObj.getAsJsonObject("thread_info"));
      }
      // validate the optional field `translations`
      if (jsonObj.getAsJsonObject("translations") != null) {
        SBObject.validateJsonObject(jsonObj.getAsJsonObject("translations"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendBirdAdminMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendBirdAdminMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendBirdAdminMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendBirdAdminMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<SendBirdAdminMessage>() {
           @Override
           public void write(JsonWriter out, SendBirdAdminMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendBirdAdminMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendBirdAdminMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendBirdAdminMessage
  * @throws IOException if the JSON string is invalid with respect to SendBirdAdminMessage
  */
  public static SendBirdAdminMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendBirdAdminMessage.class);
  }

 /**
  * Convert an instance of SendBirdAdminMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

