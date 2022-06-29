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
 * OcUpdateBanByIdData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T13:37:01.045476+01:00[Europe/London]")
public class OcUpdateBanByIdData {
  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_BANNED_USER_ID = "banned_user_id";
  @SerializedName(SERIALIZED_NAME_BANNED_USER_ID)
  private String bannedUserId;

  public static final String SERIALIZED_NAME_SECONDS = "seconds";
  @SerializedName(SERIALIZED_NAME_SECONDS)
  private Integer seconds;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public OcUpdateBanByIdData() { 
  }

  public OcUpdateBanByIdData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the target channel.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the target channel.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public OcUpdateBanByIdData bannedUserId(String bannedUserId) {
    
    this.bannedUserId = bannedUserId;
    return this;
  }

   /**
   * Specifies the ID of the banned user to update.
   * @return bannedUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the banned user to update.")

  public String getBannedUserId() {
    return bannedUserId;
  }


  public void setBannedUserId(String bannedUserId) {
    this.bannedUserId = bannedUserId;
  }


  public OcUpdateBanByIdData seconds(Integer seconds) {
    
    this.seconds = seconds;
    return this;
  }

   /**
   * Specifies a new ban duration to update. If set to -1, the user will be banned permanently (10 years, technically).
   * @return seconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a new ban duration to update. If set to -1, the user will be banned permanently (10 years, technically).")

  public Integer getSeconds() {
    return seconds;
  }


  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }


  public OcUpdateBanByIdData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Specifies a new reason for the banning to update. The length is limited to 250 characters.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a new reason for the banning to update. The length is limited to 250 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcUpdateBanByIdData ocUpdateBanByIdData = (OcUpdateBanByIdData) o;
    return Objects.equals(this.channelUrl, ocUpdateBanByIdData.channelUrl) &&
        Objects.equals(this.bannedUserId, ocUpdateBanByIdData.bannedUserId) &&
        Objects.equals(this.seconds, ocUpdateBanByIdData.seconds) &&
        Objects.equals(this.description, ocUpdateBanByIdData.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, bannedUserId, seconds, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcUpdateBanByIdData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    bannedUserId: ").append(toIndentedString(bannedUserId)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("banned_user_id");
    openapiFields.add("seconds");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel_url");
    openapiRequiredFields.add("banned_user_id");
    openapiRequiredFields.add("seconds");
    openapiRequiredFields.add("description");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OcUpdateBanByIdData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OcUpdateBanByIdData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OcUpdateBanByIdData is not found in the empty JSON string", OcUpdateBanByIdData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OcUpdateBanByIdData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OcUpdateBanByIdData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OcUpdateBanByIdData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("channel_url") != null && !jsonObj.get("channel_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_url").toString()));
      }
      if (jsonObj.get("banned_user_id") != null && !jsonObj.get("banned_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banned_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banned_user_id").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OcUpdateBanByIdData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OcUpdateBanByIdData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OcUpdateBanByIdData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OcUpdateBanByIdData.class));

       return (TypeAdapter<T>) new TypeAdapter<OcUpdateBanByIdData>() {
           @Override
           public void write(JsonWriter out, OcUpdateBanByIdData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OcUpdateBanByIdData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OcUpdateBanByIdData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OcUpdateBanByIdData
  * @throws IOException if the JSON string is invalid with respect to OcUpdateBanByIdData
  */
  public static OcUpdateBanByIdData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OcUpdateBanByIdData.class);
  }

 /**
  * Convert an instance of OcUpdateBanByIdData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

