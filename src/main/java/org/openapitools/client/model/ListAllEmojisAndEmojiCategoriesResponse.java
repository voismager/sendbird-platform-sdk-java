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
import org.openapitools.client.model.ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner;

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
 * ListAllEmojisAndEmojiCategoriesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T14:16:58.424760+01:00[Europe/London]")
public class ListAllEmojisAndEmojiCategoriesResponse {
  public static final String SERIALIZED_NAME_EMOJI_HASH = "emoji_hash";
  @SerializedName(SERIALIZED_NAME_EMOJI_HASH)
  private String emojiHash;

  public static final String SERIALIZED_NAME_EMOJI_CATEGORIES = "emoji_categories";
  @SerializedName(SERIALIZED_NAME_EMOJI_CATEGORIES)
  private List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner> emojiCategories = null;

  public ListAllEmojisAndEmojiCategoriesResponse() { 
  }

  public ListAllEmojisAndEmojiCategoriesResponse emojiHash(String emojiHash) {
    
    this.emojiHash = emojiHash;
    return this;
  }

   /**
   * Get emojiHash
   * @return emojiHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmojiHash() {
    return emojiHash;
  }


  public void setEmojiHash(String emojiHash) {
    this.emojiHash = emojiHash;
  }


  public ListAllEmojisAndEmojiCategoriesResponse emojiCategories(List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner> emojiCategories) {
    
    this.emojiCategories = emojiCategories;
    return this;
  }

  public ListAllEmojisAndEmojiCategoriesResponse addEmojiCategoriesItem(ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner emojiCategoriesItem) {
    if (this.emojiCategories == null) {
      this.emojiCategories = new ArrayList<>();
    }
    this.emojiCategories.add(emojiCategoriesItem);
    return this;
  }

   /**
   * Get emojiCategories
   * @return emojiCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner> getEmojiCategories() {
    return emojiCategories;
  }


  public void setEmojiCategories(List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner> emojiCategories) {
    this.emojiCategories = emojiCategories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAllEmojisAndEmojiCategoriesResponse listAllEmojisAndEmojiCategoriesResponse = (ListAllEmojisAndEmojiCategoriesResponse) o;
    return Objects.equals(this.emojiHash, listAllEmojisAndEmojiCategoriesResponse.emojiHash) &&
        Objects.equals(this.emojiCategories, listAllEmojisAndEmojiCategoriesResponse.emojiCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiHash, emojiCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAllEmojisAndEmojiCategoriesResponse {\n");
    sb.append("    emojiHash: ").append(toIndentedString(emojiHash)).append("\n");
    sb.append("    emojiCategories: ").append(toIndentedString(emojiCategories)).append("\n");
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
    openapiFields.add("emoji_hash");
    openapiFields.add("emoji_categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAllEmojisAndEmojiCategoriesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListAllEmojisAndEmojiCategoriesResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAllEmojisAndEmojiCategoriesResponse is not found in the empty JSON string", ListAllEmojisAndEmojiCategoriesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAllEmojisAndEmojiCategoriesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAllEmojisAndEmojiCategoriesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("emoji_hash") != null && !jsonObj.get("emoji_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emoji_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emoji_hash").toString()));
      }
      JsonArray jsonArrayemojiCategories = jsonObj.getAsJsonArray("emoji_categories");
      if (jsonArrayemojiCategories != null) {
        // ensure the json data is an array
        if (!jsonObj.get("emoji_categories").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `emoji_categories` to be an array in the JSON string but got `%s`", jsonObj.get("emoji_categories").toString()));
        }

        // validate the optional field `emoji_categories` (array)
        for (int i = 0; i < jsonArrayemojiCategories.size(); i++) {
          ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner.validateJsonObject(jsonArrayemojiCategories.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAllEmojisAndEmojiCategoriesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAllEmojisAndEmojiCategoriesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAllEmojisAndEmojiCategoriesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAllEmojisAndEmojiCategoriesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAllEmojisAndEmojiCategoriesResponse>() {
           @Override
           public void write(JsonWriter out, ListAllEmojisAndEmojiCategoriesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAllEmojisAndEmojiCategoriesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAllEmojisAndEmojiCategoriesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAllEmojisAndEmojiCategoriesResponse
  * @throws IOException if the JSON string is invalid with respect to ListAllEmojisAndEmojiCategoriesResponse
  */
  public static ListAllEmojisAndEmojiCategoriesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAllEmojisAndEmojiCategoriesResponse.class);
  }

 /**
  * Convert an instance of ListAllEmojisAndEmojiCategoriesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

