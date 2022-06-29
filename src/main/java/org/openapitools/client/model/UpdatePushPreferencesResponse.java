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
 * UpdatePushPreferencesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T14:16:58.424760+01:00[Europe/London]")
public class UpdatePushPreferencesResponse {
  public static final String SERIALIZED_NAME_BLOCK_PUSH_FROM_BOTS = "block_push_from_bots";
  @SerializedName(SERIALIZED_NAME_BLOCK_PUSH_FROM_BOTS)
  private Boolean blockPushFromBots;

  public static final String SERIALIZED_NAME_ENABLE_PUSH_FOR_REPLIES = "enable_push_for_replies";
  @SerializedName(SERIALIZED_NAME_ENABLE_PUSH_FOR_REPLIES)
  private Boolean enablePushForReplies;

  public static final String SERIALIZED_NAME_PUSH_BLOCKED_BOT_IDS = "push_blocked_bot_ids";
  @SerializedName(SERIALIZED_NAME_PUSH_BLOCKED_BOT_IDS)
  private List<String> pushBlockedBotIds = null;

  public static final String SERIALIZED_NAME_PUSH_TRIGGER_OPTION = "push_trigger_option";
  @SerializedName(SERIALIZED_NAME_PUSH_TRIGGER_OPTION)
  private String pushTriggerOption;

  public static final String SERIALIZED_NAME_DO_NOT_DISTURB = "do_not_disturb";
  @SerializedName(SERIALIZED_NAME_DO_NOT_DISTURB)
  private Boolean doNotDisturb;

  public static final String SERIALIZED_NAME_START_HOUR = "start_hour";
  @SerializedName(SERIALIZED_NAME_START_HOUR)
  private BigDecimal startHour;

  public static final String SERIALIZED_NAME_START_MIN = "start_min";
  @SerializedName(SERIALIZED_NAME_START_MIN)
  private BigDecimal startMin;

  public static final String SERIALIZED_NAME_END_HOUR = "end_hour";
  @SerializedName(SERIALIZED_NAME_END_HOUR)
  private BigDecimal endHour;

  public static final String SERIALIZED_NAME_END_MIN = "end_min";
  @SerializedName(SERIALIZED_NAME_END_MIN)
  private BigDecimal endMin;

  public static final String SERIALIZED_NAME_SNOOZE_ENABLED = "snooze_enabled";
  @SerializedName(SERIALIZED_NAME_SNOOZE_ENABLED)
  private Boolean snoozeEnabled;

  public static final String SERIALIZED_NAME_SNOOZE_START_TS = "snooze_start_ts";
  @SerializedName(SERIALIZED_NAME_SNOOZE_START_TS)
  private BigDecimal snoozeStartTs;

  public static final String SERIALIZED_NAME_SNOOZE_END_TS = "snooze_end_ts";
  @SerializedName(SERIALIZED_NAME_SNOOZE_END_TS)
  private BigDecimal snoozeEndTs;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_PUSH_SOUND = "push_sound";
  @SerializedName(SERIALIZED_NAME_PUSH_SOUND)
  private String pushSound;

  public UpdatePushPreferencesResponse() { 
  }

  public UpdatePushPreferencesResponse blockPushFromBots(Boolean blockPushFromBots) {
    
    this.blockPushFromBots = blockPushFromBots;
    return this;
  }

   /**
   * Get blockPushFromBots
   * @return blockPushFromBots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBlockPushFromBots() {
    return blockPushFromBots;
  }


  public void setBlockPushFromBots(Boolean blockPushFromBots) {
    this.blockPushFromBots = blockPushFromBots;
  }


  public UpdatePushPreferencesResponse enablePushForReplies(Boolean enablePushForReplies) {
    
    this.enablePushForReplies = enablePushForReplies;
    return this;
  }

   /**
   * Get enablePushForReplies
   * @return enablePushForReplies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnablePushForReplies() {
    return enablePushForReplies;
  }


  public void setEnablePushForReplies(Boolean enablePushForReplies) {
    this.enablePushForReplies = enablePushForReplies;
  }


  public UpdatePushPreferencesResponse pushBlockedBotIds(List<String> pushBlockedBotIds) {
    
    this.pushBlockedBotIds = pushBlockedBotIds;
    return this;
  }

  public UpdatePushPreferencesResponse addPushBlockedBotIdsItem(String pushBlockedBotIdsItem) {
    if (this.pushBlockedBotIds == null) {
      this.pushBlockedBotIds = new ArrayList<>();
    }
    this.pushBlockedBotIds.add(pushBlockedBotIdsItem);
    return this;
  }

   /**
   * Get pushBlockedBotIds
   * @return pushBlockedBotIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPushBlockedBotIds() {
    return pushBlockedBotIds;
  }


  public void setPushBlockedBotIds(List<String> pushBlockedBotIds) {
    this.pushBlockedBotIds = pushBlockedBotIds;
  }


  public UpdatePushPreferencesResponse pushTriggerOption(String pushTriggerOption) {
    
    this.pushTriggerOption = pushTriggerOption;
    return this;
  }

   /**
   * Get pushTriggerOption
   * @return pushTriggerOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPushTriggerOption() {
    return pushTriggerOption;
  }


  public void setPushTriggerOption(String pushTriggerOption) {
    this.pushTriggerOption = pushTriggerOption;
  }


  public UpdatePushPreferencesResponse doNotDisturb(Boolean doNotDisturb) {
    
    this.doNotDisturb = doNotDisturb;
    return this;
  }

   /**
   * Get doNotDisturb
   * @return doNotDisturb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDoNotDisturb() {
    return doNotDisturb;
  }


  public void setDoNotDisturb(Boolean doNotDisturb) {
    this.doNotDisturb = doNotDisturb;
  }


  public UpdatePushPreferencesResponse startHour(BigDecimal startHour) {
    
    this.startHour = startHour;
    return this;
  }

   /**
   * Get startHour
   * @return startHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getStartHour() {
    return startHour;
  }


  public void setStartHour(BigDecimal startHour) {
    this.startHour = startHour;
  }


  public UpdatePushPreferencesResponse startMin(BigDecimal startMin) {
    
    this.startMin = startMin;
    return this;
  }

   /**
   * Get startMin
   * @return startMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getStartMin() {
    return startMin;
  }


  public void setStartMin(BigDecimal startMin) {
    this.startMin = startMin;
  }


  public UpdatePushPreferencesResponse endHour(BigDecimal endHour) {
    
    this.endHour = endHour;
    return this;
  }

   /**
   * Get endHour
   * @return endHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEndHour() {
    return endHour;
  }


  public void setEndHour(BigDecimal endHour) {
    this.endHour = endHour;
  }


  public UpdatePushPreferencesResponse endMin(BigDecimal endMin) {
    
    this.endMin = endMin;
    return this;
  }

   /**
   * Get endMin
   * @return endMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEndMin() {
    return endMin;
  }


  public void setEndMin(BigDecimal endMin) {
    this.endMin = endMin;
  }


  public UpdatePushPreferencesResponse snoozeEnabled(Boolean snoozeEnabled) {
    
    this.snoozeEnabled = snoozeEnabled;
    return this;
  }

   /**
   * Get snoozeEnabled
   * @return snoozeEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSnoozeEnabled() {
    return snoozeEnabled;
  }


  public void setSnoozeEnabled(Boolean snoozeEnabled) {
    this.snoozeEnabled = snoozeEnabled;
  }


  public UpdatePushPreferencesResponse snoozeStartTs(BigDecimal snoozeStartTs) {
    
    this.snoozeStartTs = snoozeStartTs;
    return this;
  }

   /**
   * Get snoozeStartTs
   * @return snoozeStartTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSnoozeStartTs() {
    return snoozeStartTs;
  }


  public void setSnoozeStartTs(BigDecimal snoozeStartTs) {
    this.snoozeStartTs = snoozeStartTs;
  }


  public UpdatePushPreferencesResponse snoozeEndTs(BigDecimal snoozeEndTs) {
    
    this.snoozeEndTs = snoozeEndTs;
    return this;
  }

   /**
   * Get snoozeEndTs
   * @return snoozeEndTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSnoozeEndTs() {
    return snoozeEndTs;
  }


  public void setSnoozeEndTs(BigDecimal snoozeEndTs) {
    this.snoozeEndTs = snoozeEndTs;
  }


  public UpdatePushPreferencesResponse timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public UpdatePushPreferencesResponse pushSound(String pushSound) {
    
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Get pushSound
   * @return pushSound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPushSound() {
    return pushSound;
  }


  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePushPreferencesResponse updatePushPreferencesResponse = (UpdatePushPreferencesResponse) o;
    return Objects.equals(this.blockPushFromBots, updatePushPreferencesResponse.blockPushFromBots) &&
        Objects.equals(this.enablePushForReplies, updatePushPreferencesResponse.enablePushForReplies) &&
        Objects.equals(this.pushBlockedBotIds, updatePushPreferencesResponse.pushBlockedBotIds) &&
        Objects.equals(this.pushTriggerOption, updatePushPreferencesResponse.pushTriggerOption) &&
        Objects.equals(this.doNotDisturb, updatePushPreferencesResponse.doNotDisturb) &&
        Objects.equals(this.startHour, updatePushPreferencesResponse.startHour) &&
        Objects.equals(this.startMin, updatePushPreferencesResponse.startMin) &&
        Objects.equals(this.endHour, updatePushPreferencesResponse.endHour) &&
        Objects.equals(this.endMin, updatePushPreferencesResponse.endMin) &&
        Objects.equals(this.snoozeEnabled, updatePushPreferencesResponse.snoozeEnabled) &&
        Objects.equals(this.snoozeStartTs, updatePushPreferencesResponse.snoozeStartTs) &&
        Objects.equals(this.snoozeEndTs, updatePushPreferencesResponse.snoozeEndTs) &&
        Objects.equals(this.timezone, updatePushPreferencesResponse.timezone) &&
        Objects.equals(this.pushSound, updatePushPreferencesResponse.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockPushFromBots, enablePushForReplies, pushBlockedBotIds, pushTriggerOption, doNotDisturb, startHour, startMin, endHour, endMin, snoozeEnabled, snoozeStartTs, snoozeEndTs, timezone, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePushPreferencesResponse {\n");
    sb.append("    blockPushFromBots: ").append(toIndentedString(blockPushFromBots)).append("\n");
    sb.append("    enablePushForReplies: ").append(toIndentedString(enablePushForReplies)).append("\n");
    sb.append("    pushBlockedBotIds: ").append(toIndentedString(pushBlockedBotIds)).append("\n");
    sb.append("    pushTriggerOption: ").append(toIndentedString(pushTriggerOption)).append("\n");
    sb.append("    doNotDisturb: ").append(toIndentedString(doNotDisturb)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    startMin: ").append(toIndentedString(startMin)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    endMin: ").append(toIndentedString(endMin)).append("\n");
    sb.append("    snoozeEnabled: ").append(toIndentedString(snoozeEnabled)).append("\n");
    sb.append("    snoozeStartTs: ").append(toIndentedString(snoozeStartTs)).append("\n");
    sb.append("    snoozeEndTs: ").append(toIndentedString(snoozeEndTs)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
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
    openapiFields.add("block_push_from_bots");
    openapiFields.add("enable_push_for_replies");
    openapiFields.add("push_blocked_bot_ids");
    openapiFields.add("push_trigger_option");
    openapiFields.add("do_not_disturb");
    openapiFields.add("start_hour");
    openapiFields.add("start_min");
    openapiFields.add("end_hour");
    openapiFields.add("end_min");
    openapiFields.add("snooze_enabled");
    openapiFields.add("snooze_start_ts");
    openapiFields.add("snooze_end_ts");
    openapiFields.add("timezone");
    openapiFields.add("push_sound");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdatePushPreferencesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdatePushPreferencesResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePushPreferencesResponse is not found in the empty JSON string", UpdatePushPreferencesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdatePushPreferencesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePushPreferencesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("push_blocked_bot_ids") != null && !jsonObj.get("push_blocked_bot_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_blocked_bot_ids` to be an array in the JSON string but got `%s`", jsonObj.get("push_blocked_bot_ids").toString()));
      }
      if (jsonObj.get("push_trigger_option") != null && !jsonObj.get("push_trigger_option").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_trigger_option` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push_trigger_option").toString()));
      }
      if (jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if (jsonObj.get("push_sound") != null && !jsonObj.get("push_sound").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_sound` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push_sound").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePushPreferencesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePushPreferencesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePushPreferencesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePushPreferencesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePushPreferencesResponse>() {
           @Override
           public void write(JsonWriter out, UpdatePushPreferencesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePushPreferencesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePushPreferencesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePushPreferencesResponse
  * @throws IOException if the JSON string is invalid with respect to UpdatePushPreferencesResponse
  */
  public static UpdatePushPreferencesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePushPreferencesResponse.class);
  }

 /**
  * Convert an instance of UpdatePushPreferencesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

