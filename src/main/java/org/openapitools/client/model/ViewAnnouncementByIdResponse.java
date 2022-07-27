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
import org.openapitools.client.model.ScheduleAnnouncementResponseCreateChannelOptions;
import org.openapitools.client.model.ScheduleAnnouncementResponseMessage;

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
 * ViewAnnouncementByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class ViewAnnouncementByIdResponse {
  public static final String SERIALIZED_NAME_UNIQUE_ID = "unique_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ID)
  private String uniqueId;

  public static final String SERIALIZED_NAME_ANNOUNCEMENT_GROUP = "announcement_group";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENT_GROUP)
  private String announcementGroup;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private ScheduleAnnouncementResponseMessage message;

  public static final String SERIALIZED_NAME_ENABLE_PUSH = "enable_push";
  @SerializedName(SERIALIZED_NAME_ENABLE_PUSH)
  private Boolean enablePush;

  public static final String SERIALIZED_NAME_TARGET_AT = "target_at";
  @SerializedName(SERIALIZED_NAME_TARGET_AT)
  private String targetAt;

  public static final String SERIALIZED_NAME_TARGET_USER_COUNT = "target_user_count";
  @SerializedName(SERIALIZED_NAME_TARGET_USER_COUNT)
  private BigDecimal targetUserCount;

  public static final String SERIALIZED_NAME_TARGET_CHANNEL_COUNT = "target_channel_count";
  @SerializedName(SERIALIZED_NAME_TARGET_CHANNEL_COUNT)
  private BigDecimal targetChannelCount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SCHEDULED_AT = "scheduled_at";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_AT)
  private BigDecimal scheduledAt;

  public static final String SERIALIZED_NAME_CEASE_AT = "cease_at";
  @SerializedName(SERIALIZED_NAME_CEASE_AT)
  private String ceaseAt;

  public static final String SERIALIZED_NAME_RESUME_AT = "resume_at";
  @SerializedName(SERIALIZED_NAME_RESUME_AT)
  private String resumeAt;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private BigDecimal completedAt;

  public static final String SERIALIZED_NAME_SENT_USER_COUNT = "sent_user_count";
  @SerializedName(SERIALIZED_NAME_SENT_USER_COUNT)
  private BigDecimal sentUserCount;

  public static final String SERIALIZED_NAME_OPEN_COUNT = "open_count";
  @SerializedName(SERIALIZED_NAME_OPEN_COUNT)
  private BigDecimal openCount;

  public static final String SERIALIZED_NAME_OPEN_RATE = "open_rate";
  @SerializedName(SERIALIZED_NAME_OPEN_RATE)
  private BigDecimal openRate;

  public static final String SERIALIZED_NAME_CREATE_CHANNEL = "create_channel";
  @SerializedName(SERIALIZED_NAME_CREATE_CHANNEL)
  private Boolean createChannel;

  public static final String SERIALIZED_NAME_CREATE_CHANNEL_OPTIONS = "create_channel_options";
  @SerializedName(SERIALIZED_NAME_CREATE_CHANNEL_OPTIONS)
  private ScheduleAnnouncementResponseCreateChannelOptions createChannelOptions;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private BigDecimal endAt;

  public static final String SERIALIZED_NAME_MARK_AS_READ = "mark_as_read";
  @SerializedName(SERIALIZED_NAME_MARK_AS_READ)
  private Boolean markAsRead;

  public static final String SERIALIZED_NAME_SENT_CHANNEL_COUNT = "sent_channel_count";
  @SerializedName(SERIALIZED_NAME_SENT_CHANNEL_COUNT)
  private BigDecimal sentChannelCount;

  public static final String SERIALIZED_NAME_TARGET_CHANNEL_TYPE = "target_channel_type";
  @SerializedName(SERIALIZED_NAME_TARGET_CHANNEL_TYPE)
  private String targetChannelType;

  public static final String SERIALIZED_NAME_TARGET_CUSTOM_TYPE = "target_custom_type";
  @SerializedName(SERIALIZED_NAME_TARGET_CUSTOM_TYPE)
  private String targetCustomType;

  public ViewAnnouncementByIdResponse() { 
  }

  public ViewAnnouncementByIdResponse uniqueId(String uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUniqueId() {
    return uniqueId;
  }


  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public ViewAnnouncementByIdResponse announcementGroup(String announcementGroup) {
    
    this.announcementGroup = announcementGroup;
    return this;
  }

   /**
   * Get announcementGroup
   * @return announcementGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAnnouncementGroup() {
    return announcementGroup;
  }


  public void setAnnouncementGroup(String announcementGroup) {
    this.announcementGroup = announcementGroup;
  }


  public ViewAnnouncementByIdResponse message(ScheduleAnnouncementResponseMessage message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScheduleAnnouncementResponseMessage getMessage() {
    return message;
  }


  public void setMessage(ScheduleAnnouncementResponseMessage message) {
    this.message = message;
  }


  public ViewAnnouncementByIdResponse enablePush(Boolean enablePush) {
    
    this.enablePush = enablePush;
    return this;
  }

   /**
   * Get enablePush
   * @return enablePush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnablePush() {
    return enablePush;
  }


  public void setEnablePush(Boolean enablePush) {
    this.enablePush = enablePush;
  }


  public ViewAnnouncementByIdResponse targetAt(String targetAt) {
    
    this.targetAt = targetAt;
    return this;
  }

   /**
   * Get targetAt
   * @return targetAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetAt() {
    return targetAt;
  }


  public void setTargetAt(String targetAt) {
    this.targetAt = targetAt;
  }


  public ViewAnnouncementByIdResponse targetUserCount(BigDecimal targetUserCount) {
    
    this.targetUserCount = targetUserCount;
    return this;
  }

   /**
   * Get targetUserCount
   * @return targetUserCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTargetUserCount() {
    return targetUserCount;
  }


  public void setTargetUserCount(BigDecimal targetUserCount) {
    this.targetUserCount = targetUserCount;
  }


  public ViewAnnouncementByIdResponse targetChannelCount(BigDecimal targetChannelCount) {
    
    this.targetChannelCount = targetChannelCount;
    return this;
  }

   /**
   * Get targetChannelCount
   * @return targetChannelCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTargetChannelCount() {
    return targetChannelCount;
  }


  public void setTargetChannelCount(BigDecimal targetChannelCount) {
    this.targetChannelCount = targetChannelCount;
  }


  public ViewAnnouncementByIdResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ViewAnnouncementByIdResponse scheduledAt(BigDecimal scheduledAt) {
    
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * Get scheduledAt
   * @return scheduledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getScheduledAt() {
    return scheduledAt;
  }


  public void setScheduledAt(BigDecimal scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public ViewAnnouncementByIdResponse ceaseAt(String ceaseAt) {
    
    this.ceaseAt = ceaseAt;
    return this;
  }

   /**
   * Get ceaseAt
   * @return ceaseAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCeaseAt() {
    return ceaseAt;
  }


  public void setCeaseAt(String ceaseAt) {
    this.ceaseAt = ceaseAt;
  }


  public ViewAnnouncementByIdResponse resumeAt(String resumeAt) {
    
    this.resumeAt = resumeAt;
    return this;
  }

   /**
   * Get resumeAt
   * @return resumeAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResumeAt() {
    return resumeAt;
  }


  public void setResumeAt(String resumeAt) {
    this.resumeAt = resumeAt;
  }


  public ViewAnnouncementByIdResponse completedAt(BigDecimal completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(BigDecimal completedAt) {
    this.completedAt = completedAt;
  }


  public ViewAnnouncementByIdResponse sentUserCount(BigDecimal sentUserCount) {
    
    this.sentUserCount = sentUserCount;
    return this;
  }

   /**
   * Get sentUserCount
   * @return sentUserCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSentUserCount() {
    return sentUserCount;
  }


  public void setSentUserCount(BigDecimal sentUserCount) {
    this.sentUserCount = sentUserCount;
  }


  public ViewAnnouncementByIdResponse openCount(BigDecimal openCount) {
    
    this.openCount = openCount;
    return this;
  }

   /**
   * Get openCount
   * @return openCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getOpenCount() {
    return openCount;
  }


  public void setOpenCount(BigDecimal openCount) {
    this.openCount = openCount;
  }


  public ViewAnnouncementByIdResponse openRate(BigDecimal openRate) {
    
    this.openRate = openRate;
    return this;
  }

   /**
   * Get openRate
   * @return openRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getOpenRate() {
    return openRate;
  }


  public void setOpenRate(BigDecimal openRate) {
    this.openRate = openRate;
  }


  public ViewAnnouncementByIdResponse createChannel(Boolean createChannel) {
    
    this.createChannel = createChannel;
    return this;
  }

   /**
   * Get createChannel
   * @return createChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCreateChannel() {
    return createChannel;
  }


  public void setCreateChannel(Boolean createChannel) {
    this.createChannel = createChannel;
  }


  public ViewAnnouncementByIdResponse createChannelOptions(ScheduleAnnouncementResponseCreateChannelOptions createChannelOptions) {
    
    this.createChannelOptions = createChannelOptions;
    return this;
  }

   /**
   * Get createChannelOptions
   * @return createChannelOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScheduleAnnouncementResponseCreateChannelOptions getCreateChannelOptions() {
    return createChannelOptions;
  }


  public void setCreateChannelOptions(ScheduleAnnouncementResponseCreateChannelOptions createChannelOptions) {
    this.createChannelOptions = createChannelOptions;
  }


  public ViewAnnouncementByIdResponse endAt(BigDecimal endAt) {
    
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEndAt() {
    return endAt;
  }


  public void setEndAt(BigDecimal endAt) {
    this.endAt = endAt;
  }


  public ViewAnnouncementByIdResponse markAsRead(Boolean markAsRead) {
    
    this.markAsRead = markAsRead;
    return this;
  }

   /**
   * Get markAsRead
   * @return markAsRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMarkAsRead() {
    return markAsRead;
  }


  public void setMarkAsRead(Boolean markAsRead) {
    this.markAsRead = markAsRead;
  }


  public ViewAnnouncementByIdResponse sentChannelCount(BigDecimal sentChannelCount) {
    
    this.sentChannelCount = sentChannelCount;
    return this;
  }

   /**
   * Get sentChannelCount
   * @return sentChannelCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSentChannelCount() {
    return sentChannelCount;
  }


  public void setSentChannelCount(BigDecimal sentChannelCount) {
    this.sentChannelCount = sentChannelCount;
  }


  public ViewAnnouncementByIdResponse targetChannelType(String targetChannelType) {
    
    this.targetChannelType = targetChannelType;
    return this;
  }

   /**
   * Get targetChannelType
   * @return targetChannelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetChannelType() {
    return targetChannelType;
  }


  public void setTargetChannelType(String targetChannelType) {
    this.targetChannelType = targetChannelType;
  }


  public ViewAnnouncementByIdResponse targetCustomType(String targetCustomType) {
    
    this.targetCustomType = targetCustomType;
    return this;
  }

   /**
   * Get targetCustomType
   * @return targetCustomType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetCustomType() {
    return targetCustomType;
  }


  public void setTargetCustomType(String targetCustomType) {
    this.targetCustomType = targetCustomType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewAnnouncementByIdResponse viewAnnouncementByIdResponse = (ViewAnnouncementByIdResponse) o;
    return Objects.equals(this.uniqueId, viewAnnouncementByIdResponse.uniqueId) &&
        Objects.equals(this.announcementGroup, viewAnnouncementByIdResponse.announcementGroup) &&
        Objects.equals(this.message, viewAnnouncementByIdResponse.message) &&
        Objects.equals(this.enablePush, viewAnnouncementByIdResponse.enablePush) &&
        Objects.equals(this.targetAt, viewAnnouncementByIdResponse.targetAt) &&
        Objects.equals(this.targetUserCount, viewAnnouncementByIdResponse.targetUserCount) &&
        Objects.equals(this.targetChannelCount, viewAnnouncementByIdResponse.targetChannelCount) &&
        Objects.equals(this.status, viewAnnouncementByIdResponse.status) &&
        Objects.equals(this.scheduledAt, viewAnnouncementByIdResponse.scheduledAt) &&
        Objects.equals(this.ceaseAt, viewAnnouncementByIdResponse.ceaseAt) &&
        Objects.equals(this.resumeAt, viewAnnouncementByIdResponse.resumeAt) &&
        Objects.equals(this.completedAt, viewAnnouncementByIdResponse.completedAt) &&
        Objects.equals(this.sentUserCount, viewAnnouncementByIdResponse.sentUserCount) &&
        Objects.equals(this.openCount, viewAnnouncementByIdResponse.openCount) &&
        Objects.equals(this.openRate, viewAnnouncementByIdResponse.openRate) &&
        Objects.equals(this.createChannel, viewAnnouncementByIdResponse.createChannel) &&
        Objects.equals(this.createChannelOptions, viewAnnouncementByIdResponse.createChannelOptions) &&
        Objects.equals(this.endAt, viewAnnouncementByIdResponse.endAt) &&
        Objects.equals(this.markAsRead, viewAnnouncementByIdResponse.markAsRead) &&
        Objects.equals(this.sentChannelCount, viewAnnouncementByIdResponse.sentChannelCount) &&
        Objects.equals(this.targetChannelType, viewAnnouncementByIdResponse.targetChannelType) &&
        Objects.equals(this.targetCustomType, viewAnnouncementByIdResponse.targetCustomType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueId, announcementGroup, message, enablePush, targetAt, targetUserCount, targetChannelCount, status, scheduledAt, ceaseAt, resumeAt, completedAt, sentUserCount, openCount, openRate, createChannel, createChannelOptions, endAt, markAsRead, sentChannelCount, targetChannelType, targetCustomType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewAnnouncementByIdResponse {\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    announcementGroup: ").append(toIndentedString(announcementGroup)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    enablePush: ").append(toIndentedString(enablePush)).append("\n");
    sb.append("    targetAt: ").append(toIndentedString(targetAt)).append("\n");
    sb.append("    targetUserCount: ").append(toIndentedString(targetUserCount)).append("\n");
    sb.append("    targetChannelCount: ").append(toIndentedString(targetChannelCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    ceaseAt: ").append(toIndentedString(ceaseAt)).append("\n");
    sb.append("    resumeAt: ").append(toIndentedString(resumeAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    sentUserCount: ").append(toIndentedString(sentUserCount)).append("\n");
    sb.append("    openCount: ").append(toIndentedString(openCount)).append("\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
    sb.append("    createChannel: ").append(toIndentedString(createChannel)).append("\n");
    sb.append("    createChannelOptions: ").append(toIndentedString(createChannelOptions)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    markAsRead: ").append(toIndentedString(markAsRead)).append("\n");
    sb.append("    sentChannelCount: ").append(toIndentedString(sentChannelCount)).append("\n");
    sb.append("    targetChannelType: ").append(toIndentedString(targetChannelType)).append("\n");
    sb.append("    targetCustomType: ").append(toIndentedString(targetCustomType)).append("\n");
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
    openapiFields.add("unique_id");
    openapiFields.add("announcement_group");
    openapiFields.add("message");
    openapiFields.add("enable_push");
    openapiFields.add("target_at");
    openapiFields.add("target_user_count");
    openapiFields.add("target_channel_count");
    openapiFields.add("status");
    openapiFields.add("scheduled_at");
    openapiFields.add("cease_at");
    openapiFields.add("resume_at");
    openapiFields.add("completed_at");
    openapiFields.add("sent_user_count");
    openapiFields.add("open_count");
    openapiFields.add("open_rate");
    openapiFields.add("create_channel");
    openapiFields.add("create_channel_options");
    openapiFields.add("end_at");
    openapiFields.add("mark_as_read");
    openapiFields.add("sent_channel_count");
    openapiFields.add("target_channel_type");
    openapiFields.add("target_custom_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ViewAnnouncementByIdResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ViewAnnouncementByIdResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViewAnnouncementByIdResponse is not found in the empty JSON string", ViewAnnouncementByIdResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ViewAnnouncementByIdResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ViewAnnouncementByIdResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("unique_id") != null && !jsonObj.get("unique_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_id").toString()));
      }
      if (jsonObj.get("announcement_group") != null && !jsonObj.get("announcement_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `announcement_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("announcement_group").toString()));
      }
      // validate the optional field `message`
      if (jsonObj.getAsJsonObject("message") != null) {
        ScheduleAnnouncementResponseMessage.validateJsonObject(jsonObj.getAsJsonObject("message"));
      }
      if (jsonObj.get("target_at") != null && !jsonObj.get("target_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_at").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("cease_at") != null && !jsonObj.get("cease_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cease_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cease_at").toString()));
      }
      if (jsonObj.get("resume_at") != null && !jsonObj.get("resume_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resume_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resume_at").toString()));
      }
      // validate the optional field `create_channel_options`
      if (jsonObj.getAsJsonObject("create_channel_options") != null) {
        ScheduleAnnouncementResponseCreateChannelOptions.validateJsonObject(jsonObj.getAsJsonObject("create_channel_options"));
      }
      if (jsonObj.get("target_channel_type") != null && !jsonObj.get("target_channel_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_channel_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_channel_type").toString()));
      }
      if (jsonObj.get("target_custom_type") != null && !jsonObj.get("target_custom_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_custom_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_custom_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViewAnnouncementByIdResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViewAnnouncementByIdResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViewAnnouncementByIdResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViewAnnouncementByIdResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ViewAnnouncementByIdResponse>() {
           @Override
           public void write(JsonWriter out, ViewAnnouncementByIdResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ViewAnnouncementByIdResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ViewAnnouncementByIdResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ViewAnnouncementByIdResponse
  * @throws IOException if the JSON string is invalid with respect to ViewAnnouncementByIdResponse
  */
  public static ViewAnnouncementByIdResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViewAnnouncementByIdResponse.class);
  }

 /**
  * Convert an instance of ViewAnnouncementByIdResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

