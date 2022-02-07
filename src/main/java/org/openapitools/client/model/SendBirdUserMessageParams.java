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
import org.openapitools.client.model.SendBirdAppleCriticalAlertOptions;
import org.openapitools.client.model.SendBirdMessageMetaArray;
import org.openapitools.client.model.SendBirdUser;

/**
 * SendBirdUserMessageParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class SendBirdUserMessageParams {
  public static final String SERIALIZED_NAME_APPLE_CRITICAL_ALERT_OPTIONS = "apple_critical_alert_options";
  @SerializedName(SERIALIZED_NAME_APPLE_CRITICAL_ALERT_OPTIONS)
  private SendBirdAppleCriticalAlertOptions appleCriticalAlertOptions;

  public static final String SERIALIZED_NAME_CUSTOM_TYPE = "custom_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TYPE)
  private String customType;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_IS_REPLY_TO_CHANNEL = "is_reply_to_channel";
  @SerializedName(SERIALIZED_NAME_IS_REPLY_TO_CHANNEL)
  private Boolean isReplyToChannel;

  /**
   * Gets or Sets mentionType
   */
  @JsonAdapter(MentionTypeEnum.Adapter.class)
  public enum MentionTypeEnum {
    CHANNEL("channel"),
    
    USERS("users");

    private String value;

    MentionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MentionTypeEnum fromValue(String value) {
      for (MentionTypeEnum b : MentionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MentionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MentionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MentionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MentionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MENTION_TYPE = "mention_type";
  @SerializedName(SERIALIZED_NAME_MENTION_TYPE)
  private MentionTypeEnum mentionType;

  public static final String SERIALIZED_NAME_MENTIONED_USER_IDS = "mentioned_user_ids";
  @SerializedName(SERIALIZED_NAME_MENTIONED_USER_IDS)
  private List<String> mentionedUserIds = null;

  public static final String SERIALIZED_NAME_MENTIONED_USERS = "mentioned_users";
  @SerializedName(SERIALIZED_NAME_MENTIONED_USERS)
  private List<SendBirdUser> mentionedUsers = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_META_ARRAY_KEYS = "meta_array_keys";
  @SerializedName(SERIALIZED_NAME_META_ARRAY_KEYS)
  private List<String> metaArrayKeys = null;

  public static final String SERIALIZED_NAME_META_ARRAYS = "meta_arrays";
  @SerializedName(SERIALIZED_NAME_META_ARRAYS)
  private List<SendBirdMessageMetaArray> metaArrays = null;

  public static final String SERIALIZED_NAME_PARENT_MESSAGE_ID = "parent_message_id";
  @SerializedName(SERIALIZED_NAME_PARENT_MESSAGE_ID)
  private BigDecimal parentMessageId;

  public static final String SERIALIZED_NAME_POLL_ID = "poll_id";
  @SerializedName(SERIALIZED_NAME_POLL_ID)
  private BigDecimal pollId;

  /**
   * Gets or Sets pushNotificationDeliveryOption
   */
  @JsonAdapter(PushNotificationDeliveryOptionEnum.Adapter.class)
  public enum PushNotificationDeliveryOptionEnum {
    DEFAULT("default"),
    
    SUPPRESS("suppress");

    private String value;

    PushNotificationDeliveryOptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PushNotificationDeliveryOptionEnum fromValue(String value) {
      for (PushNotificationDeliveryOptionEnum b : PushNotificationDeliveryOptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PushNotificationDeliveryOptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PushNotificationDeliveryOptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PushNotificationDeliveryOptionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PushNotificationDeliveryOptionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PUSH_NOTIFICATION_DELIVERY_OPTION = "push_notification_delivery_option";
  @SerializedName(SERIALIZED_NAME_PUSH_NOTIFICATION_DELIVERY_OPTION)
  private PushNotificationDeliveryOptionEnum pushNotificationDeliveryOption;

  public static final String SERIALIZED_NAME_TARGET_LANGUAGES = "target_languages";
  @SerializedName(SERIALIZED_NAME_TARGET_LANGUAGES)
  private List<String> targetLanguages = null;

  public static final String SERIALIZED_NAME_TRANSLATION_TARGET_LANGUAGES = "translation_target_languages";
  @SerializedName(SERIALIZED_NAME_TRANSLATION_TARGET_LANGUAGES)
  private List<String> translationTargetLanguages = null;

  public SendBirdUserMessageParams() { 
  }

  public SendBirdUserMessageParams appleCriticalAlertOptions(SendBirdAppleCriticalAlertOptions appleCriticalAlertOptions) {
    
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


  public SendBirdUserMessageParams customType(String customType) {
    
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


  public SendBirdUserMessageParams data(String data) {
    
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


  public SendBirdUserMessageParams isReplyToChannel(Boolean isReplyToChannel) {
    
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


  public SendBirdUserMessageParams mentionType(MentionTypeEnum mentionType) {
    
    this.mentionType = mentionType;
    return this;
  }

   /**
   * Get mentionType
   * @return mentionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MentionTypeEnum getMentionType() {
    return mentionType;
  }


  public void setMentionType(MentionTypeEnum mentionType) {
    this.mentionType = mentionType;
  }


  public SendBirdUserMessageParams mentionedUserIds(List<String> mentionedUserIds) {
    
    this.mentionedUserIds = mentionedUserIds;
    return this;
  }

  public SendBirdUserMessageParams addMentionedUserIdsItem(String mentionedUserIdsItem) {
    if (this.mentionedUserIds == null) {
      this.mentionedUserIds = new ArrayList<String>();
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

  public List<String> getMentionedUserIds() {
    return mentionedUserIds;
  }


  public void setMentionedUserIds(List<String> mentionedUserIds) {
    this.mentionedUserIds = mentionedUserIds;
  }


  public SendBirdUserMessageParams mentionedUsers(List<SendBirdUser> mentionedUsers) {
    
    this.mentionedUsers = mentionedUsers;
    return this;
  }

  public SendBirdUserMessageParams addMentionedUsersItem(SendBirdUser mentionedUsersItem) {
    if (this.mentionedUsers == null) {
      this.mentionedUsers = new ArrayList<SendBirdUser>();
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


  public SendBirdUserMessageParams message(String message) {
    
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


  public SendBirdUserMessageParams metaArrayKeys(List<String> metaArrayKeys) {
    
    this.metaArrayKeys = metaArrayKeys;
    return this;
  }

  public SendBirdUserMessageParams addMetaArrayKeysItem(String metaArrayKeysItem) {
    if (this.metaArrayKeys == null) {
      this.metaArrayKeys = new ArrayList<String>();
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

  public List<String> getMetaArrayKeys() {
    return metaArrayKeys;
  }


  public void setMetaArrayKeys(List<String> metaArrayKeys) {
    this.metaArrayKeys = metaArrayKeys;
  }


  public SendBirdUserMessageParams metaArrays(List<SendBirdMessageMetaArray> metaArrays) {
    
    this.metaArrays = metaArrays;
    return this;
  }

  public SendBirdUserMessageParams addMetaArraysItem(SendBirdMessageMetaArray metaArraysItem) {
    if (this.metaArrays == null) {
      this.metaArrays = new ArrayList<SendBirdMessageMetaArray>();
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


  public SendBirdUserMessageParams parentMessageId(BigDecimal parentMessageId) {
    
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


  public SendBirdUserMessageParams pollId(BigDecimal pollId) {
    
    this.pollId = pollId;
    return this;
  }

   /**
   * Get pollId
   * @return pollId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPollId() {
    return pollId;
  }


  public void setPollId(BigDecimal pollId) {
    this.pollId = pollId;
  }


  public SendBirdUserMessageParams pushNotificationDeliveryOption(PushNotificationDeliveryOptionEnum pushNotificationDeliveryOption) {
    
    this.pushNotificationDeliveryOption = pushNotificationDeliveryOption;
    return this;
  }

   /**
   * Get pushNotificationDeliveryOption
   * @return pushNotificationDeliveryOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PushNotificationDeliveryOptionEnum getPushNotificationDeliveryOption() {
    return pushNotificationDeliveryOption;
  }


  public void setPushNotificationDeliveryOption(PushNotificationDeliveryOptionEnum pushNotificationDeliveryOption) {
    this.pushNotificationDeliveryOption = pushNotificationDeliveryOption;
  }


  public SendBirdUserMessageParams targetLanguages(List<String> targetLanguages) {
    
    this.targetLanguages = targetLanguages;
    return this;
  }

  public SendBirdUserMessageParams addTargetLanguagesItem(String targetLanguagesItem) {
    if (this.targetLanguages == null) {
      this.targetLanguages = new ArrayList<String>();
    }
    this.targetLanguages.add(targetLanguagesItem);
    return this;
  }

   /**
   * Get targetLanguages
   * @return targetLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTargetLanguages() {
    return targetLanguages;
  }


  public void setTargetLanguages(List<String> targetLanguages) {
    this.targetLanguages = targetLanguages;
  }


  public SendBirdUserMessageParams translationTargetLanguages(List<String> translationTargetLanguages) {
    
    this.translationTargetLanguages = translationTargetLanguages;
    return this;
  }

  public SendBirdUserMessageParams addTranslationTargetLanguagesItem(String translationTargetLanguagesItem) {
    if (this.translationTargetLanguages == null) {
      this.translationTargetLanguages = new ArrayList<String>();
    }
    this.translationTargetLanguages.add(translationTargetLanguagesItem);
    return this;
  }

   /**
   * Get translationTargetLanguages
   * @return translationTargetLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTranslationTargetLanguages() {
    return translationTargetLanguages;
  }


  public void setTranslationTargetLanguages(List<String> translationTargetLanguages) {
    this.translationTargetLanguages = translationTargetLanguages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdUserMessageParams sendBirdUserMessageParams = (SendBirdUserMessageParams) o;
    return Objects.equals(this.appleCriticalAlertOptions, sendBirdUserMessageParams.appleCriticalAlertOptions) &&
        Objects.equals(this.customType, sendBirdUserMessageParams.customType) &&
        Objects.equals(this.data, sendBirdUserMessageParams.data) &&
        Objects.equals(this.isReplyToChannel, sendBirdUserMessageParams.isReplyToChannel) &&
        Objects.equals(this.mentionType, sendBirdUserMessageParams.mentionType) &&
        Objects.equals(this.mentionedUserIds, sendBirdUserMessageParams.mentionedUserIds) &&
        Objects.equals(this.mentionedUsers, sendBirdUserMessageParams.mentionedUsers) &&
        Objects.equals(this.message, sendBirdUserMessageParams.message) &&
        Objects.equals(this.metaArrayKeys, sendBirdUserMessageParams.metaArrayKeys) &&
        Objects.equals(this.metaArrays, sendBirdUserMessageParams.metaArrays) &&
        Objects.equals(this.parentMessageId, sendBirdUserMessageParams.parentMessageId) &&
        Objects.equals(this.pollId, sendBirdUserMessageParams.pollId) &&
        Objects.equals(this.pushNotificationDeliveryOption, sendBirdUserMessageParams.pushNotificationDeliveryOption) &&
        Objects.equals(this.targetLanguages, sendBirdUserMessageParams.targetLanguages) &&
        Objects.equals(this.translationTargetLanguages, sendBirdUserMessageParams.translationTargetLanguages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appleCriticalAlertOptions, customType, data, isReplyToChannel, mentionType, mentionedUserIds, mentionedUsers, message, metaArrayKeys, metaArrays, parentMessageId, pollId, pushNotificationDeliveryOption, targetLanguages, translationTargetLanguages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdUserMessageParams {\n");
    sb.append("    appleCriticalAlertOptions: ").append(toIndentedString(appleCriticalAlertOptions)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isReplyToChannel: ").append(toIndentedString(isReplyToChannel)).append("\n");
    sb.append("    mentionType: ").append(toIndentedString(mentionType)).append("\n");
    sb.append("    mentionedUserIds: ").append(toIndentedString(mentionedUserIds)).append("\n");
    sb.append("    mentionedUsers: ").append(toIndentedString(mentionedUsers)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metaArrayKeys: ").append(toIndentedString(metaArrayKeys)).append("\n");
    sb.append("    metaArrays: ").append(toIndentedString(metaArrays)).append("\n");
    sb.append("    parentMessageId: ").append(toIndentedString(parentMessageId)).append("\n");
    sb.append("    pollId: ").append(toIndentedString(pollId)).append("\n");
    sb.append("    pushNotificationDeliveryOption: ").append(toIndentedString(pushNotificationDeliveryOption)).append("\n");
    sb.append("    targetLanguages: ").append(toIndentedString(targetLanguages)).append("\n");
    sb.append("    translationTargetLanguages: ").append(toIndentedString(translationTargetLanguages)).append("\n");
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

