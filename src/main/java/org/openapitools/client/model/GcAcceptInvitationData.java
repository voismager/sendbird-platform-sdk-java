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
 * GcAcceptInvitationData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class GcAcceptInvitationData {
  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ACCESS_CODE = "access_code";
  @SerializedName(SERIALIZED_NAME_ACCESS_CODE)
  private String accessCode;

  public GcAcceptInvitationData() { 
  }

  public GcAcceptInvitationData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the private group channel to join through accepting an invitation.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the private group channel to join through accepting an invitation.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcAcceptInvitationData userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the unique ID of the user to accept an invitation to join the private group channel.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the user to accept an invitation to join the private group channel.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GcAcceptInvitationData accessCode(String accessCode) {
    
    this.accessCode = accessCode;
    return this;
  }

   /**
   * This property should be specified if the private group channel to join requires an access code to the invited users, which means that the is_access_code_required property of the channel resource is true.
   * @return accessCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This property should be specified if the private group channel to join requires an access code to the invited users, which means that the is_access_code_required property of the channel resource is true.")

  public String getAccessCode() {
    return accessCode;
  }


  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcAcceptInvitationData gcAcceptInvitationData = (GcAcceptInvitationData) o;
    return Objects.equals(this.channelUrl, gcAcceptInvitationData.channelUrl) &&
        Objects.equals(this.userId, gcAcceptInvitationData.userId) &&
        Objects.equals(this.accessCode, gcAcceptInvitationData.accessCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, userId, accessCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcAcceptInvitationData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
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
    openapiFields.add("access_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel_url");
    openapiRequiredFields.add("user_id");
    openapiRequiredFields.add("access_code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GcAcceptInvitationData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GcAcceptInvitationData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GcAcceptInvitationData is not found in the empty JSON string", GcAcceptInvitationData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GcAcceptInvitationData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GcAcceptInvitationData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GcAcceptInvitationData.openapiRequiredFields) {
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
      if (jsonObj.get("access_code") != null && !jsonObj.get("access_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GcAcceptInvitationData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GcAcceptInvitationData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GcAcceptInvitationData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GcAcceptInvitationData.class));

       return (TypeAdapter<T>) new TypeAdapter<GcAcceptInvitationData>() {
           @Override
           public void write(JsonWriter out, GcAcceptInvitationData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GcAcceptInvitationData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GcAcceptInvitationData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GcAcceptInvitationData
  * @throws IOException if the JSON string is invalid with respect to GcAcceptInvitationData
  */
  public static GcAcceptInvitationData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GcAcceptInvitationData.class);
  }

 /**
  * Convert an instance of GcAcceptInvitationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

