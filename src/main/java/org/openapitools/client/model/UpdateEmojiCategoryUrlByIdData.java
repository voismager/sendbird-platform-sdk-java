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
 * UpdateEmojiCategoryUrlByIdData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T13:37:01.045476+01:00[Europe/London]")
public class UpdateEmojiCategoryUrlByIdData {
  public static final String SERIALIZED_NAME_EMOJI_CATEGORY_ID = "emoji_category_id";
  @SerializedName(SERIALIZED_NAME_EMOJI_CATEGORY_ID)
  private Integer emojiCategoryId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public UpdateEmojiCategoryUrlByIdData() { 
  }

  public UpdateEmojiCategoryUrlByIdData emojiCategoryId(Integer emojiCategoryId) {
    
    this.emojiCategoryId = emojiCategoryId;
    return this;
  }

   /**
   * Specifies the unique ID of the emoji category to update.
   * @return emojiCategoryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the emoji category to update.")

  public Integer getEmojiCategoryId() {
    return emojiCategoryId;
  }


  public void setEmojiCategoryId(Integer emojiCategoryId) {
    this.emojiCategoryId = emojiCategoryId;
  }


  public UpdateEmojiCategoryUrlByIdData url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Specifies the new URL of the emoji category.
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the new URL of the emoji category.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEmojiCategoryUrlByIdData updateEmojiCategoryUrlByIdData = (UpdateEmojiCategoryUrlByIdData) o;
    return Objects.equals(this.emojiCategoryId, updateEmojiCategoryUrlByIdData.emojiCategoryId) &&
        Objects.equals(this.url, updateEmojiCategoryUrlByIdData.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiCategoryId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEmojiCategoryUrlByIdData {\n");
    sb.append("    emojiCategoryId: ").append(toIndentedString(emojiCategoryId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("emoji_category_id");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("emoji_category_id");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateEmojiCategoryUrlByIdData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateEmojiCategoryUrlByIdData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateEmojiCategoryUrlByIdData is not found in the empty JSON string", UpdateEmojiCategoryUrlByIdData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateEmojiCategoryUrlByIdData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateEmojiCategoryUrlByIdData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateEmojiCategoryUrlByIdData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateEmojiCategoryUrlByIdData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateEmojiCategoryUrlByIdData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateEmojiCategoryUrlByIdData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateEmojiCategoryUrlByIdData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateEmojiCategoryUrlByIdData>() {
           @Override
           public void write(JsonWriter out, UpdateEmojiCategoryUrlByIdData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateEmojiCategoryUrlByIdData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateEmojiCategoryUrlByIdData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateEmojiCategoryUrlByIdData
  * @throws IOException if the JSON string is invalid with respect to UpdateEmojiCategoryUrlByIdData
  */
  public static UpdateEmojiCategoryUrlByIdData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateEmojiCategoryUrlByIdData.class);
  }

 /**
  * Convert an instance of UpdateEmojiCategoryUrlByIdData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

