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
import org.openapitools.client.model.SendBirdEmoji;

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
 * SendBirdEmojiCategory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class SendBirdEmojiCategory {
  public static final String SERIALIZED_NAME_EMOJIS = "emojis";
  @SerializedName(SERIALIZED_NAME_EMOJIS)
  private List<SendBirdEmoji> emojis = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public SendBirdEmojiCategory() { 
  }

  public SendBirdEmojiCategory emojis(List<SendBirdEmoji> emojis) {
    
    this.emojis = emojis;
    return this;
  }

  public SendBirdEmojiCategory addEmojisItem(SendBirdEmoji emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

   /**
   * Get emojis
   * @return emojis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdEmoji> getEmojis() {
    return emojis;
  }


  public void setEmojis(List<SendBirdEmoji> emojis) {
    this.emojis = emojis;
  }


  public SendBirdEmojiCategory id(BigDecimal id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getId() {
    return id;
  }


  public void setId(BigDecimal id) {
    this.id = id;
  }


  public SendBirdEmojiCategory name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SendBirdEmojiCategory url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    SendBirdEmojiCategory sendBirdEmojiCategory = (SendBirdEmojiCategory) o;
    return Objects.equals(this.emojis, sendBirdEmojiCategory.emojis) &&
        Objects.equals(this.id, sendBirdEmojiCategory.id) &&
        Objects.equals(this.name, sendBirdEmojiCategory.name) &&
        Objects.equals(this.url, sendBirdEmojiCategory.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojis, id, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdEmojiCategory {\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("emojis");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendBirdEmojiCategory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendBirdEmojiCategory.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendBirdEmojiCategory is not found in the empty JSON string", SendBirdEmojiCategory.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendBirdEmojiCategory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendBirdEmojiCategory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayemojis = jsonObj.getAsJsonArray("emojis");
      if (jsonArrayemojis != null) {
        // ensure the json data is an array
        if (!jsonObj.get("emojis").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `emojis` to be an array in the JSON string but got `%s`", jsonObj.get("emojis").toString()));
        }

        // validate the optional field `emojis` (array)
        for (int i = 0; i < jsonArrayemojis.size(); i++) {
          SendBirdEmoji.validateJsonObject(jsonArrayemojis.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendBirdEmojiCategory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendBirdEmojiCategory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendBirdEmojiCategory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendBirdEmojiCategory.class));

       return (TypeAdapter<T>) new TypeAdapter<SendBirdEmojiCategory>() {
           @Override
           public void write(JsonWriter out, SendBirdEmojiCategory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendBirdEmojiCategory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendBirdEmojiCategory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendBirdEmojiCategory
  * @throws IOException if the JSON string is invalid with respect to SendBirdEmojiCategory
  */
  public static SendBirdEmojiCategory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendBirdEmojiCategory.class);
  }

 /**
  * Convert an instance of SendBirdEmojiCategory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

