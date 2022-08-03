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
 * UpdateExtraDataInMessageResponseSortedMetaarrayInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T14:38:17.329046+01:00[Europe/London]")
public class UpdateExtraDataInMessageResponseSortedMetaarrayInner {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<String> value = null;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public UpdateExtraDataInMessageResponseSortedMetaarrayInner() { 
  }

  public UpdateExtraDataInMessageResponseSortedMetaarrayInner value(List<String> value) {
    
    this.value = value;
    return this;
  }

  public UpdateExtraDataInMessageResponseSortedMetaarrayInner addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getValue() {
    return value;
  }


  public void setValue(List<String> value) {
    this.value = value;
  }


  public UpdateExtraDataInMessageResponseSortedMetaarrayInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateExtraDataInMessageResponseSortedMetaarrayInner updateExtraDataInMessageResponseSortedMetaarrayInner = (UpdateExtraDataInMessageResponseSortedMetaarrayInner) o;
    return Objects.equals(this.value, updateExtraDataInMessageResponseSortedMetaarrayInner.value) &&
        Objects.equals(this.key, updateExtraDataInMessageResponseSortedMetaarrayInner.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateExtraDataInMessageResponseSortedMetaarrayInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateExtraDataInMessageResponseSortedMetaarrayInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateExtraDataInMessageResponseSortedMetaarrayInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateExtraDataInMessageResponseSortedMetaarrayInner is not found in the empty JSON string", UpdateExtraDataInMessageResponseSortedMetaarrayInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateExtraDataInMessageResponseSortedMetaarrayInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateExtraDataInMessageResponseSortedMetaarrayInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be an array in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateExtraDataInMessageResponseSortedMetaarrayInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateExtraDataInMessageResponseSortedMetaarrayInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateExtraDataInMessageResponseSortedMetaarrayInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateExtraDataInMessageResponseSortedMetaarrayInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateExtraDataInMessageResponseSortedMetaarrayInner>() {
           @Override
           public void write(JsonWriter out, UpdateExtraDataInMessageResponseSortedMetaarrayInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateExtraDataInMessageResponseSortedMetaarrayInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateExtraDataInMessageResponseSortedMetaarrayInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateExtraDataInMessageResponseSortedMetaarrayInner
  * @throws IOException if the JSON string is invalid with respect to UpdateExtraDataInMessageResponseSortedMetaarrayInner
  */
  public static UpdateExtraDataInMessageResponseSortedMetaarrayInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateExtraDataInMessageResponseSortedMetaarrayInner.class);
  }

 /**
  * Convert an instance of UpdateExtraDataInMessageResponseSortedMetaarrayInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

