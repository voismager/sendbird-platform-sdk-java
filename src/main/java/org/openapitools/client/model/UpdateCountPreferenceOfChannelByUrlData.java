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
 * UpdateCountPreferenceOfChannelByUrlData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T13:37:01.045476+01:00[Europe/London]")
public class UpdateCountPreferenceOfChannelByUrlData {
  public static final String SERIALIZED_NAME_COUNT_PREFERENCE = "count_preference";
  @SerializedName(SERIALIZED_NAME_COUNT_PREFERENCE)
  private String countPreference;

  public UpdateCountPreferenceOfChannelByUrlData() { 
  }

  public UpdateCountPreferenceOfChannelByUrlData countPreference(String countPreference) {
    
    this.countPreference = countPreference;
    return this;
  }

   /**
   * Determines whether to only count the number of unread messages or the number of unread mentioned messages in the specified group channel. Only the one that is chosen to be preferenced will be counted and added to the total number count after the action. A value of off indicates that both read statuses will not be counted, while all indicates that both read statuses will be counted by the system. A value of unread_message_count_only indicates that only the user&#39;s unread messages will be counted in the channel while unread_mentioned_count_only indicates that only the user&#39;s unread mentioned messages will be counted. (Default: all)
   * @return countPreference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to only count the number of unread messages or the number of unread mentioned messages in the specified group channel. Only the one that is chosen to be preferenced will be counted and added to the total number count after the action. A value of off indicates that both read statuses will not be counted, while all indicates that both read statuses will be counted by the system. A value of unread_message_count_only indicates that only the user's unread messages will be counted in the channel while unread_mentioned_count_only indicates that only the user's unread mentioned messages will be counted. (Default: all)")

  public String getCountPreference() {
    return countPreference;
  }


  public void setCountPreference(String countPreference) {
    this.countPreference = countPreference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCountPreferenceOfChannelByUrlData updateCountPreferenceOfChannelByUrlData = (UpdateCountPreferenceOfChannelByUrlData) o;
    return Objects.equals(this.countPreference, updateCountPreferenceOfChannelByUrlData.countPreference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countPreference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCountPreferenceOfChannelByUrlData {\n");
    sb.append("    countPreference: ").append(toIndentedString(countPreference)).append("\n");
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
    openapiFields.add("count_preference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("count_preference");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateCountPreferenceOfChannelByUrlData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateCountPreferenceOfChannelByUrlData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateCountPreferenceOfChannelByUrlData is not found in the empty JSON string", UpdateCountPreferenceOfChannelByUrlData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateCountPreferenceOfChannelByUrlData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateCountPreferenceOfChannelByUrlData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateCountPreferenceOfChannelByUrlData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("count_preference") != null && !jsonObj.get("count_preference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `count_preference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("count_preference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateCountPreferenceOfChannelByUrlData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateCountPreferenceOfChannelByUrlData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateCountPreferenceOfChannelByUrlData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateCountPreferenceOfChannelByUrlData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateCountPreferenceOfChannelByUrlData>() {
           @Override
           public void write(JsonWriter out, UpdateCountPreferenceOfChannelByUrlData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateCountPreferenceOfChannelByUrlData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateCountPreferenceOfChannelByUrlData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateCountPreferenceOfChannelByUrlData
  * @throws IOException if the JSON string is invalid with respect to UpdateCountPreferenceOfChannelByUrlData
  */
  public static UpdateCountPreferenceOfChannelByUrlData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateCountPreferenceOfChannelByUrlData.class);
  }

 /**
  * Convert an instance of UpdateCountPreferenceOfChannelByUrlData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

