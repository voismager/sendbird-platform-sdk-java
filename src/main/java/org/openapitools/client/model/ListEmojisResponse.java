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
 * ListEmojisResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T14:16:58.424760+01:00[Europe/London]")
public class ListEmojisResponse {
  public static final String SERIALIZED_NAME_EMOJIS = "emojis";
  @SerializedName(SERIALIZED_NAME_EMOJIS)
  private List<SendBirdEmoji> emojis = null;

  public ListEmojisResponse() { 
  }

  public ListEmojisResponse emojis(List<SendBirdEmoji> emojis) {
    
    this.emojis = emojis;
    return this;
  }

  public ListEmojisResponse addEmojisItem(SendBirdEmoji emojisItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEmojisResponse listEmojisResponse = (ListEmojisResponse) o;
    return Objects.equals(this.emojis, listEmojisResponse.emojis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEmojisResponse {\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListEmojisResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListEmojisResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListEmojisResponse is not found in the empty JSON string", ListEmojisResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListEmojisResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListEmojisResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListEmojisResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListEmojisResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListEmojisResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListEmojisResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListEmojisResponse>() {
           @Override
           public void write(JsonWriter out, ListEmojisResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListEmojisResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListEmojisResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListEmojisResponse
  * @throws IOException if the JSON string is invalid with respect to ListEmojisResponse
  */
  public static ListEmojisResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListEmojisResponse.class);
  }

 /**
  * Convert an instance of ListEmojisResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

