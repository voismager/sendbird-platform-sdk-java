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
 * GcHideOrArchiveChannelData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class GcHideOrArchiveChannelData {
  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ALLOW_AUTO_UNHIDE = "allow_auto_unhide";
  @SerializedName(SERIALIZED_NAME_ALLOW_AUTO_UNHIDE)
  private Boolean allowAutoUnhide;

  public static final String SERIALIZED_NAME_SHOULD_HIDE_ALL = "should_hide_all";
  @SerializedName(SERIALIZED_NAME_SHOULD_HIDE_ALL)
  private Boolean shouldHideAll;

  public static final String SERIALIZED_NAME_HIDE_PREVIOUS_MESSAGES = "hide_previous_messages";
  @SerializedName(SERIALIZED_NAME_HIDE_PREVIOUS_MESSAGES)
  private Boolean hidePreviousMessages;

  public GcHideOrArchiveChannelData() { 
  }

  public GcHideOrArchiveChannelData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to hide or archive.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to hide or archive.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcHideOrArchiveChannelData userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the unique ID of the user whose channel will be hidden or archived from the list. This property is required when should_hide_all is set to false, which is the default value. However, when should_hide_all is set to true, this property isn&#39;t effective.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the user whose channel will be hidden or archived from the list. This property is required when should_hide_all is set to false, which is the default value. However, when should_hide_all is set to true, this property isn't effective.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GcHideOrArchiveChannelData allowAutoUnhide(Boolean allowAutoUnhide) {
    
    this.allowAutoUnhide = allowAutoUnhide;
    return this;
  }

   /**
   * Determines the state and operating behavior of the channel in a channel list. If set to true, the channel is hidden from a user&#39;s channel list but it will reappear when there is a new message. If set to false, the channel is hidden from a user&#39;s channel list and it will remain hidden unless the value of the property changes to true through [unarchiving](#2-unhide-or-unarchive-a-channel). (Default: true)&lt;br /&gt;&lt;br /&gt; When a user who has hidden the channel sends a message in that channel through the [Platform API](/docs/chat/v3/platform-api/guides/messages#2-send-a-message), the &#x60;allow_auto_unhide&#x60; property is changed to true, making the channel reappear in the channel list.
   * @return allowAutoUnhide
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines the state and operating behavior of the channel in a channel list. If set to true, the channel is hidden from a user's channel list but it will reappear when there is a new message. If set to false, the channel is hidden from a user's channel list and it will remain hidden unless the value of the property changes to true through [unarchiving](#2-unhide-or-unarchive-a-channel). (Default: true)<br /><br /> When a user who has hidden the channel sends a message in that channel through the [Platform API](/docs/chat/v3/platform-api/guides/messages#2-send-a-message), the `allow_auto_unhide` property is changed to true, making the channel reappear in the channel list.")

  public Boolean getAllowAutoUnhide() {
    return allowAutoUnhide;
  }


  public void setAllowAutoUnhide(Boolean allowAutoUnhide) {
    this.allowAutoUnhide = allowAutoUnhide;
  }


  public GcHideOrArchiveChannelData shouldHideAll(Boolean shouldHideAll) {
    
    this.shouldHideAll = shouldHideAll;
    return this;
  }

   /**
   * Determines whether to make the specified channel disappear from the channel list of all channel members. When this is set to true, the user_id property isn&#39;t effective and doesn&#39;t need to be specified in the request. (Default: false)
   * @return shouldHideAll
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to make the specified channel disappear from the channel list of all channel members. When this is set to true, the user_id property isn't effective and doesn't need to be specified in the request. (Default: false)")

  public Boolean getShouldHideAll() {
    return shouldHideAll;
  }


  public void setShouldHideAll(Boolean shouldHideAll) {
    this.shouldHideAll = shouldHideAll;
  }


  public GcHideOrArchiveChannelData hidePreviousMessages(Boolean hidePreviousMessages) {
    
    this.hidePreviousMessages = hidePreviousMessages;
    return this;
  }

   /**
   * When the channel gets appeared back in either the list of the user in the user_id property or the lists of all channel members (should_hide_all &#x3D; true), determines whether to conceal the messages sent and received before hiding or archiving the channel. (Default: false)&lt;br /&gt;&lt;br /&gt; This property is effective only when the value of the [global application settings resource](/docs/chat/v3/platform-api/guides/global-application-settings#-3-resource-representation)&#39;s display_past_message property is false.
   * @return hidePreviousMessages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When the channel gets appeared back in either the list of the user in the user_id property or the lists of all channel members (should_hide_all = true), determines whether to conceal the messages sent and received before hiding or archiving the channel. (Default: false)<br /><br /> This property is effective only when the value of the [global application settings resource](/docs/chat/v3/platform-api/guides/global-application-settings#-3-resource-representation)'s display_past_message property is false.")

  public Boolean getHidePreviousMessages() {
    return hidePreviousMessages;
  }


  public void setHidePreviousMessages(Boolean hidePreviousMessages) {
    this.hidePreviousMessages = hidePreviousMessages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcHideOrArchiveChannelData gcHideOrArchiveChannelData = (GcHideOrArchiveChannelData) o;
    return Objects.equals(this.channelUrl, gcHideOrArchiveChannelData.channelUrl) &&
        Objects.equals(this.userId, gcHideOrArchiveChannelData.userId) &&
        Objects.equals(this.allowAutoUnhide, gcHideOrArchiveChannelData.allowAutoUnhide) &&
        Objects.equals(this.shouldHideAll, gcHideOrArchiveChannelData.shouldHideAll) &&
        Objects.equals(this.hidePreviousMessages, gcHideOrArchiveChannelData.hidePreviousMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, userId, allowAutoUnhide, shouldHideAll, hidePreviousMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcHideOrArchiveChannelData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    allowAutoUnhide: ").append(toIndentedString(allowAutoUnhide)).append("\n");
    sb.append("    shouldHideAll: ").append(toIndentedString(shouldHideAll)).append("\n");
    sb.append("    hidePreviousMessages: ").append(toIndentedString(hidePreviousMessages)).append("\n");
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
    openapiFields.add("channel_url");
    openapiFields.add("user_id");
    openapiFields.add("allow_auto_unhide");
    openapiFields.add("should_hide_all");
    openapiFields.add("hide_previous_messages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel_url");
    openapiRequiredFields.add("user_id");
    openapiRequiredFields.add("allow_auto_unhide");
    openapiRequiredFields.add("should_hide_all");
    openapiRequiredFields.add("hide_previous_messages");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GcHideOrArchiveChannelData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GcHideOrArchiveChannelData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GcHideOrArchiveChannelData is not found in the empty JSON string", GcHideOrArchiveChannelData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GcHideOrArchiveChannelData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GcHideOrArchiveChannelData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GcHideOrArchiveChannelData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("channel_url") != null && !jsonObj.get("channel_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_url").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GcHideOrArchiveChannelData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GcHideOrArchiveChannelData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GcHideOrArchiveChannelData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GcHideOrArchiveChannelData.class));

       return (TypeAdapter<T>) new TypeAdapter<GcHideOrArchiveChannelData>() {
           @Override
           public void write(JsonWriter out, GcHideOrArchiveChannelData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GcHideOrArchiveChannelData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GcHideOrArchiveChannelData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GcHideOrArchiveChannelData
  * @throws IOException if the JSON string is invalid with respect to GcHideOrArchiveChannelData
  */
  public static GcHideOrArchiveChannelData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GcHideOrArchiveChannelData.class);
  }

 /**
  * Convert an instance of GcHideOrArchiveChannelData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

