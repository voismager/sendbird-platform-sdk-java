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
import org.openapitools.client.model.Blob;
import org.openapitools.client.model.SendBirdAppleCriticalAlertOptions;
import org.openapitools.client.model.SendBirdMessageMetaArray;
import org.openapitools.client.model.SendBirdThumbnailSize;
import org.openapitools.client.model.SendBirdUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SendBirdFileMessageParams
 */
@JsonPropertyOrder({
  SendBirdFileMessageParams.JSON_PROPERTY_APPLE_CRITICAL_ALERT_OPTIONS,
  SendBirdFileMessageParams.JSON_PROPERTY_CUSTOM_TYPE,
  SendBirdFileMessageParams.JSON_PROPERTY_DATA,
  SendBirdFileMessageParams.JSON_PROPERTY_FILE,
  SendBirdFileMessageParams.JSON_PROPERTY_FILE_NAME,
  SendBirdFileMessageParams.JSON_PROPERTY_FILE_SIZE,
  SendBirdFileMessageParams.JSON_PROPERTY_FILE_URL,
  SendBirdFileMessageParams.JSON_PROPERTY_IS_REPLY_TO_CHANNEL,
  SendBirdFileMessageParams.JSON_PROPERTY_MENTION_TYPE,
  SendBirdFileMessageParams.JSON_PROPERTY_MENTIONED_USER_IDS,
  SendBirdFileMessageParams.JSON_PROPERTY_MENTIONED_USERS,
  SendBirdFileMessageParams.JSON_PROPERTY_META_ARRAY_KEYS,
  SendBirdFileMessageParams.JSON_PROPERTY_META_ARRAYS,
  SendBirdFileMessageParams.JSON_PROPERTY_MIME_TYPE,
  SendBirdFileMessageParams.JSON_PROPERTY_PARENT_MESSAGE_ID,
  SendBirdFileMessageParams.JSON_PROPERTY_PUSH_NOTIFICATION_DELIVERY_OPTION,
  SendBirdFileMessageParams.JSON_PROPERTY_THUMBNAIL_SIZES
})
@JsonTypeName("SendBird.FileMessageParams")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class SendBirdFileMessageParams {
  public static final String JSON_PROPERTY_APPLE_CRITICAL_ALERT_OPTIONS = "apple_critical_alert_options";
  private SendBirdAppleCriticalAlertOptions appleCriticalAlertOptions;

  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_FILE = "file";
  private Blob _file;

  public static final String JSON_PROPERTY_FILE_NAME = "file_name";
  private String fileName;

  public static final String JSON_PROPERTY_FILE_SIZE = "file_size";
  private BigDecimal fileSize;

  public static final String JSON_PROPERTY_FILE_URL = "file_url";
  private String fileUrl;

  public static final String JSON_PROPERTY_IS_REPLY_TO_CHANNEL = "is_reply_to_channel";
  private Boolean isReplyToChannel;

  /**
   * Gets or Sets mentionType
   */
  public enum MentionTypeEnum {
    CHANNEL("channel"),
    
    USERS("users");

    private String value;

    MentionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MentionTypeEnum fromValue(String value) {
      for (MentionTypeEnum b : MentionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MENTION_TYPE = "mention_type";
  private MentionTypeEnum mentionType;

  public static final String JSON_PROPERTY_MENTIONED_USER_IDS = "mentioned_user_ids";
  private List<String> mentionedUserIds = null;

  public static final String JSON_PROPERTY_MENTIONED_USERS = "mentioned_users";
  private List<SendBirdUser> mentionedUsers = null;

  public static final String JSON_PROPERTY_META_ARRAY_KEYS = "meta_array_keys";
  private List<String> metaArrayKeys = null;

  public static final String JSON_PROPERTY_META_ARRAYS = "meta_arrays";
  private List<SendBirdMessageMetaArray> metaArrays = null;

  public static final String JSON_PROPERTY_MIME_TYPE = "mime_type";
  private String mimeType;

  public static final String JSON_PROPERTY_PARENT_MESSAGE_ID = "parent_message_id";
  private BigDecimal parentMessageId;

  /**
   * Gets or Sets pushNotificationDeliveryOption
   */
  public enum PushNotificationDeliveryOptionEnum {
    DEFAULT("default"),
    
    SUPPRESS("suppress");

    private String value;

    PushNotificationDeliveryOptionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PushNotificationDeliveryOptionEnum fromValue(String value) {
      for (PushNotificationDeliveryOptionEnum b : PushNotificationDeliveryOptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PUSH_NOTIFICATION_DELIVERY_OPTION = "push_notification_delivery_option";
  private PushNotificationDeliveryOptionEnum pushNotificationDeliveryOption;

  public static final String JSON_PROPERTY_THUMBNAIL_SIZES = "thumbnail_sizes";
  private List<SendBirdThumbnailSize> thumbnailSizes = null;

  public SendBirdFileMessageParams() { 
  }

  public SendBirdFileMessageParams appleCriticalAlertOptions(SendBirdAppleCriticalAlertOptions appleCriticalAlertOptions) {
    this.appleCriticalAlertOptions = appleCriticalAlertOptions;
    return this;
  }

   /**
   * Get appleCriticalAlertOptions
   * @return appleCriticalAlertOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLE_CRITICAL_ALERT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdAppleCriticalAlertOptions getAppleCriticalAlertOptions() {
    return appleCriticalAlertOptions;
  }


  @JsonProperty(JSON_PROPERTY_APPLE_CRITICAL_ALERT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppleCriticalAlertOptions(SendBirdAppleCriticalAlertOptions appleCriticalAlertOptions) {
    this.appleCriticalAlertOptions = appleCriticalAlertOptions;
  }


  public SendBirdFileMessageParams customType(String customType) {
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


  public SendBirdFileMessageParams data(String data) {
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


  public SendBirdFileMessageParams _file(Blob _file) {
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

  public Blob getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFile(Blob _file) {
    this._file = _file;
  }


  public SendBirdFileMessageParams fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public SendBirdFileMessageParams fileSize(BigDecimal fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(BigDecimal fileSize) {
    this.fileSize = fileSize;
  }


  public SendBirdFileMessageParams fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * Get fileUrl
   * @return fileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileUrl() {
    return fileUrl;
  }


  @JsonProperty(JSON_PROPERTY_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }


  public SendBirdFileMessageParams isReplyToChannel(Boolean isReplyToChannel) {
    this.isReplyToChannel = isReplyToChannel;
    return this;
  }

   /**
   * Get isReplyToChannel
   * @return isReplyToChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REPLY_TO_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsReplyToChannel() {
    return isReplyToChannel;
  }


  @JsonProperty(JSON_PROPERTY_IS_REPLY_TO_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsReplyToChannel(Boolean isReplyToChannel) {
    this.isReplyToChannel = isReplyToChannel;
  }


  public SendBirdFileMessageParams mentionType(MentionTypeEnum mentionType) {
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

  public MentionTypeEnum getMentionType() {
    return mentionType;
  }


  @JsonProperty(JSON_PROPERTY_MENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionType(MentionTypeEnum mentionType) {
    this.mentionType = mentionType;
  }


  public SendBirdFileMessageParams mentionedUserIds(List<String> mentionedUserIds) {
    this.mentionedUserIds = mentionedUserIds;
    return this;
  }

  public SendBirdFileMessageParams addMentionedUserIdsItem(String mentionedUserIdsItem) {
    if (this.mentionedUserIds == null) {
      this.mentionedUserIds = new ArrayList<>();
    }
    this.mentionedUserIds.add(mentionedUserIdsItem);
    return this;
  }

   /**
   * Get mentionedUserIds
   * @return mentionedUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MENTIONED_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMentionedUserIds() {
    return mentionedUserIds;
  }


  @JsonProperty(JSON_PROPERTY_MENTIONED_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionedUserIds(List<String> mentionedUserIds) {
    this.mentionedUserIds = mentionedUserIds;
  }


  public SendBirdFileMessageParams mentionedUsers(List<SendBirdUser> mentionedUsers) {
    this.mentionedUsers = mentionedUsers;
    return this;
  }

  public SendBirdFileMessageParams addMentionedUsersItem(SendBirdUser mentionedUsersItem) {
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

  public List<SendBirdUser> getMentionedUsers() {
    return mentionedUsers;
  }


  @JsonProperty(JSON_PROPERTY_MENTIONED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionedUsers(List<SendBirdUser> mentionedUsers) {
    this.mentionedUsers = mentionedUsers;
  }


  public SendBirdFileMessageParams metaArrayKeys(List<String> metaArrayKeys) {
    this.metaArrayKeys = metaArrayKeys;
    return this;
  }

  public SendBirdFileMessageParams addMetaArrayKeysItem(String metaArrayKeysItem) {
    if (this.metaArrayKeys == null) {
      this.metaArrayKeys = new ArrayList<>();
    }
    this.metaArrayKeys.add(metaArrayKeysItem);
    return this;
  }

   /**
   * Get metaArrayKeys
   * @return metaArrayKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META_ARRAY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMetaArrayKeys() {
    return metaArrayKeys;
  }


  @JsonProperty(JSON_PROPERTY_META_ARRAY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetaArrayKeys(List<String> metaArrayKeys) {
    this.metaArrayKeys = metaArrayKeys;
  }


  public SendBirdFileMessageParams metaArrays(List<SendBirdMessageMetaArray> metaArrays) {
    this.metaArrays = metaArrays;
    return this;
  }

  public SendBirdFileMessageParams addMetaArraysItem(SendBirdMessageMetaArray metaArraysItem) {
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
  @JsonProperty(JSON_PROPERTY_META_ARRAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdMessageMetaArray> getMetaArrays() {
    return metaArrays;
  }


  @JsonProperty(JSON_PROPERTY_META_ARRAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetaArrays(List<SendBirdMessageMetaArray> metaArrays) {
    this.metaArrays = metaArrays;
  }


  public SendBirdFileMessageParams mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMimeType() {
    return mimeType;
  }


  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public SendBirdFileMessageParams parentMessageId(BigDecimal parentMessageId) {
    this.parentMessageId = parentMessageId;
    return this;
  }

   /**
   * Get parentMessageId
   * @return parentMessageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARENT_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getParentMessageId() {
    return parentMessageId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentMessageId(BigDecimal parentMessageId) {
    this.parentMessageId = parentMessageId;
  }


  public SendBirdFileMessageParams pushNotificationDeliveryOption(PushNotificationDeliveryOptionEnum pushNotificationDeliveryOption) {
    this.pushNotificationDeliveryOption = pushNotificationDeliveryOption;
    return this;
  }

   /**
   * Get pushNotificationDeliveryOption
   * @return pushNotificationDeliveryOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_NOTIFICATION_DELIVERY_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PushNotificationDeliveryOptionEnum getPushNotificationDeliveryOption() {
    return pushNotificationDeliveryOption;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_NOTIFICATION_DELIVERY_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushNotificationDeliveryOption(PushNotificationDeliveryOptionEnum pushNotificationDeliveryOption) {
    this.pushNotificationDeliveryOption = pushNotificationDeliveryOption;
  }


  public SendBirdFileMessageParams thumbnailSizes(List<SendBirdThumbnailSize> thumbnailSizes) {
    this.thumbnailSizes = thumbnailSizes;
    return this;
  }

  public SendBirdFileMessageParams addThumbnailSizesItem(SendBirdThumbnailSize thumbnailSizesItem) {
    if (this.thumbnailSizes == null) {
      this.thumbnailSizes = new ArrayList<>();
    }
    this.thumbnailSizes.add(thumbnailSizesItem);
    return this;
  }

   /**
   * Get thumbnailSizes
   * @return thumbnailSizes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THUMBNAIL_SIZES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdThumbnailSize> getThumbnailSizes() {
    return thumbnailSizes;
  }


  @JsonProperty(JSON_PROPERTY_THUMBNAIL_SIZES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnailSizes(List<SendBirdThumbnailSize> thumbnailSizes) {
    this.thumbnailSizes = thumbnailSizes;
  }


  /**
   * Return true if this SendBird.FileMessageParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdFileMessageParams sendBirdFileMessageParams = (SendBirdFileMessageParams) o;
    return Objects.equals(this.appleCriticalAlertOptions, sendBirdFileMessageParams.appleCriticalAlertOptions) &&
        Objects.equals(this.customType, sendBirdFileMessageParams.customType) &&
        Objects.equals(this.data, sendBirdFileMessageParams.data) &&
        Objects.equals(this._file, sendBirdFileMessageParams._file) &&
        Objects.equals(this.fileName, sendBirdFileMessageParams.fileName) &&
        Objects.equals(this.fileSize, sendBirdFileMessageParams.fileSize) &&
        Objects.equals(this.fileUrl, sendBirdFileMessageParams.fileUrl) &&
        Objects.equals(this.isReplyToChannel, sendBirdFileMessageParams.isReplyToChannel) &&
        Objects.equals(this.mentionType, sendBirdFileMessageParams.mentionType) &&
        Objects.equals(this.mentionedUserIds, sendBirdFileMessageParams.mentionedUserIds) &&
        Objects.equals(this.mentionedUsers, sendBirdFileMessageParams.mentionedUsers) &&
        Objects.equals(this.metaArrayKeys, sendBirdFileMessageParams.metaArrayKeys) &&
        Objects.equals(this.metaArrays, sendBirdFileMessageParams.metaArrays) &&
        Objects.equals(this.mimeType, sendBirdFileMessageParams.mimeType) &&
        Objects.equals(this.parentMessageId, sendBirdFileMessageParams.parentMessageId) &&
        Objects.equals(this.pushNotificationDeliveryOption, sendBirdFileMessageParams.pushNotificationDeliveryOption) &&
        Objects.equals(this.thumbnailSizes, sendBirdFileMessageParams.thumbnailSizes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appleCriticalAlertOptions, customType, data, _file, fileName, fileSize, fileUrl, isReplyToChannel, mentionType, mentionedUserIds, mentionedUsers, metaArrayKeys, metaArrays, mimeType, parentMessageId, pushNotificationDeliveryOption, thumbnailSizes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdFileMessageParams {\n");
    sb.append("    appleCriticalAlertOptions: ").append(toIndentedString(appleCriticalAlertOptions)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    isReplyToChannel: ").append(toIndentedString(isReplyToChannel)).append("\n");
    sb.append("    mentionType: ").append(toIndentedString(mentionType)).append("\n");
    sb.append("    mentionedUserIds: ").append(toIndentedString(mentionedUserIds)).append("\n");
    sb.append("    mentionedUsers: ").append(toIndentedString(mentionedUsers)).append("\n");
    sb.append("    metaArrayKeys: ").append(toIndentedString(metaArrayKeys)).append("\n");
    sb.append("    metaArrays: ").append(toIndentedString(metaArrays)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    parentMessageId: ").append(toIndentedString(parentMessageId)).append("\n");
    sb.append("    pushNotificationDeliveryOption: ").append(toIndentedString(pushNotificationDeliveryOption)).append("\n");
    sb.append("    thumbnailSizes: ").append(toIndentedString(thumbnailSizes)).append("\n");
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

