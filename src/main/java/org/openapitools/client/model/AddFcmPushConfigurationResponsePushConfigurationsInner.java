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
 * AddFcmPushConfigurationResponsePushConfigurationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class AddFcmPushConfigurationResponsePushConfigurationsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PUSH_TYPE = "push_type";
  @SerializedName(SERIALIZED_NAME_PUSH_TYPE)
  private String pushType;

  public static final String SERIALIZED_NAME_API_KEY = "api_key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_PUSH_SOUND = "push_sound";
  @SerializedName(SERIALIZED_NAME_PUSH_SOUND)
  private String pushSound;

  public AddFcmPushConfigurationResponsePushConfigurationsInner() { 
  }

  public AddFcmPushConfigurationResponsePushConfigurationsInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AddFcmPushConfigurationResponsePushConfigurationsInner pushType(String pushType) {
    
    this.pushType = pushType;
    return this;
  }

   /**
   * Get pushType
   * @return pushType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPushType() {
    return pushType;
  }


  public void setPushType(String pushType) {
    this.pushType = pushType;
  }


  public AddFcmPushConfigurationResponsePushConfigurationsInner apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public AddFcmPushConfigurationResponsePushConfigurationsInner pushSound(String pushSound) {
    
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Get pushSound
   * @return pushSound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPushSound() {
    return pushSound;
  }


  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddFcmPushConfigurationResponsePushConfigurationsInner addFcmPushConfigurationResponsePushConfigurationsInner = (AddFcmPushConfigurationResponsePushConfigurationsInner) o;
    return Objects.equals(this.id, addFcmPushConfigurationResponsePushConfigurationsInner.id) &&
        Objects.equals(this.pushType, addFcmPushConfigurationResponsePushConfigurationsInner.pushType) &&
        Objects.equals(this.apiKey, addFcmPushConfigurationResponsePushConfigurationsInner.apiKey) &&
        Objects.equals(this.pushSound, addFcmPushConfigurationResponsePushConfigurationsInner.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pushType, apiKey, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFcmPushConfigurationResponsePushConfigurationsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pushType: ").append(toIndentedString(pushType)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("push_type");
    openapiFields.add("api_key");
    openapiFields.add("push_sound");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddFcmPushConfigurationResponsePushConfigurationsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddFcmPushConfigurationResponsePushConfigurationsInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddFcmPushConfigurationResponsePushConfigurationsInner is not found in the empty JSON string", AddFcmPushConfigurationResponsePushConfigurationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddFcmPushConfigurationResponsePushConfigurationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddFcmPushConfigurationResponsePushConfigurationsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("push_type") != null && !jsonObj.get("push_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push_type").toString()));
      }
      if (jsonObj.get("api_key") != null && !jsonObj.get("api_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_key").toString()));
      }
      if (jsonObj.get("push_sound") != null && !jsonObj.get("push_sound").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_sound` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push_sound").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddFcmPushConfigurationResponsePushConfigurationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddFcmPushConfigurationResponsePushConfigurationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddFcmPushConfigurationResponsePushConfigurationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddFcmPushConfigurationResponsePushConfigurationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AddFcmPushConfigurationResponsePushConfigurationsInner>() {
           @Override
           public void write(JsonWriter out, AddFcmPushConfigurationResponsePushConfigurationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddFcmPushConfigurationResponsePushConfigurationsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddFcmPushConfigurationResponsePushConfigurationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddFcmPushConfigurationResponsePushConfigurationsInner
  * @throws IOException if the JSON string is invalid with respect to AddFcmPushConfigurationResponsePushConfigurationsInner
  */
  public static AddFcmPushConfigurationResponsePushConfigurationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddFcmPushConfigurationResponsePushConfigurationsInner.class);
  }

 /**
  * Convert an instance of AddFcmPushConfigurationResponsePushConfigurationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

