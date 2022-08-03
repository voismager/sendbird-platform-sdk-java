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
 * MarkAllMessagesAsReadData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T14:38:17.329046+01:00[Europe/London]")
public class MarkAllMessagesAsReadData {
  public static final String SERIALIZED_NAME_CHANNEL_URLS = "channel_urls";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URLS)
  private List<String> channelUrls = new ArrayList<>();

  public MarkAllMessagesAsReadData() { 
  }

  public MarkAllMessagesAsReadData channelUrls(List<String> channelUrls) {
    
    this.channelUrls = channelUrls;
    return this;
  }

  public MarkAllMessagesAsReadData addChannelUrlsItem(String channelUrlsItem) {
    this.channelUrls.add(channelUrlsItem);
    return this;
  }

   /**
   * Specifies an array of one or more group channel URLs to mark all of the unread messages in as read. If not specified, all of the unread messages in the joined group channels are marked as read.
   * @return channelUrls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more group channel URLs to mark all of the unread messages in as read. If not specified, all of the unread messages in the joined group channels are marked as read.")

  public List<String> getChannelUrls() {
    return channelUrls;
  }


  public void setChannelUrls(List<String> channelUrls) {
    this.channelUrls = channelUrls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkAllMessagesAsReadData markAllMessagesAsReadData = (MarkAllMessagesAsReadData) o;
    return Objects.equals(this.channelUrls, markAllMessagesAsReadData.channelUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkAllMessagesAsReadData {\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
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
    openapiFields.add("channel_urls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel_urls");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MarkAllMessagesAsReadData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MarkAllMessagesAsReadData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarkAllMessagesAsReadData is not found in the empty JSON string", MarkAllMessagesAsReadData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MarkAllMessagesAsReadData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarkAllMessagesAsReadData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MarkAllMessagesAsReadData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("channel_urls") != null && !jsonObj.get("channel_urls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_urls` to be an array in the JSON string but got `%s`", jsonObj.get("channel_urls").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarkAllMessagesAsReadData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarkAllMessagesAsReadData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarkAllMessagesAsReadData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarkAllMessagesAsReadData.class));

       return (TypeAdapter<T>) new TypeAdapter<MarkAllMessagesAsReadData>() {
           @Override
           public void write(JsonWriter out, MarkAllMessagesAsReadData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarkAllMessagesAsReadData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarkAllMessagesAsReadData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarkAllMessagesAsReadData
  * @throws IOException if the JSON string is invalid with respect to MarkAllMessagesAsReadData
  */
  public static MarkAllMessagesAsReadData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarkAllMessagesAsReadData.class);
  }

 /**
  * Convert an instance of MarkAllMessagesAsReadData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

