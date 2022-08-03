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
 * AddHmsPushConfigurationData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T14:38:17.329046+01:00[Europe/London]")
public class AddHmsPushConfigurationData {
  public static final String SERIALIZED_NAME_HUAWEI_APP_ID = "huawei_app_id";
  @SerializedName(SERIALIZED_NAME_HUAWEI_APP_ID)
  private String huaweiAppId;

  public static final String SERIALIZED_NAME_HUAWEI_APP_SECRET = "huawei_app_secret";
  @SerializedName(SERIALIZED_NAME_HUAWEI_APP_SECRET)
  private String huaweiAppSecret;

  public static final String SERIALIZED_NAME_PUSH_SOUND = "push_sound";
  @SerializedName(SERIALIZED_NAME_PUSH_SOUND)
  private String pushSound;

  public AddHmsPushConfigurationData() { 
  }

  public AddHmsPushConfigurationData huaweiAppId(String huaweiAppId) {
    
    this.huaweiAppId = huaweiAppId;
    return this;
  }

   /**
   * Specifies the unique ID of application registered to the HMS server.
   * @return huaweiAppId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of application registered to the HMS server.")

  public String getHuaweiAppId() {
    return huaweiAppId;
  }


  public void setHuaweiAppId(String huaweiAppId) {
    this.huaweiAppId = huaweiAppId;
  }


  public AddHmsPushConfigurationData huaweiAppSecret(String huaweiAppSecret) {
    
    this.huaweiAppSecret = huaweiAppSecret;
    return this;
  }

   /**
   * Specifies the secret key allocated to the application.
   * @return huaweiAppSecret
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the secret key allocated to the application.")

  public String getHuaweiAppSecret() {
    return huaweiAppSecret;
  }


  public void setHuaweiAppSecret(String huaweiAppSecret) {
    this.huaweiAppSecret = huaweiAppSecret;
  }


  public AddHmsPushConfigurationData pushSound(String pushSound) {
    
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file should be located in the &#x60;/res/raw&#x60; folder.
   * @return pushSound
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file should be located in the `/res/raw` folder.")

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
    AddHmsPushConfigurationData addHmsPushConfigurationData = (AddHmsPushConfigurationData) o;
    return Objects.equals(this.huaweiAppId, addHmsPushConfigurationData.huaweiAppId) &&
        Objects.equals(this.huaweiAppSecret, addHmsPushConfigurationData.huaweiAppSecret) &&
        Objects.equals(this.pushSound, addHmsPushConfigurationData.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(huaweiAppId, huaweiAppSecret, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddHmsPushConfigurationData {\n");
    sb.append("    huaweiAppId: ").append(toIndentedString(huaweiAppId)).append("\n");
    sb.append("    huaweiAppSecret: ").append(toIndentedString(huaweiAppSecret)).append("\n");
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
    openapiFields.add("huawei_app_id");
    openapiFields.add("huawei_app_secret");
    openapiFields.add("push_sound");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("huawei_app_id");
    openapiRequiredFields.add("huawei_app_secret");
    openapiRequiredFields.add("push_sound");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddHmsPushConfigurationData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddHmsPushConfigurationData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddHmsPushConfigurationData is not found in the empty JSON string", AddHmsPushConfigurationData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddHmsPushConfigurationData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddHmsPushConfigurationData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddHmsPushConfigurationData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("huawei_app_id") != null && !jsonObj.get("huawei_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `huawei_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("huawei_app_id").toString()));
      }
      if (jsonObj.get("huawei_app_secret") != null && !jsonObj.get("huawei_app_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `huawei_app_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("huawei_app_secret").toString()));
      }
      if (jsonObj.get("push_sound") != null && !jsonObj.get("push_sound").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_sound` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push_sound").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddHmsPushConfigurationData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddHmsPushConfigurationData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddHmsPushConfigurationData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddHmsPushConfigurationData.class));

       return (TypeAdapter<T>) new TypeAdapter<AddHmsPushConfigurationData>() {
           @Override
           public void write(JsonWriter out, AddHmsPushConfigurationData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddHmsPushConfigurationData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddHmsPushConfigurationData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddHmsPushConfigurationData
  * @throws IOException if the JSON string is invalid with respect to AddHmsPushConfigurationData
  */
  public static AddHmsPushConfigurationData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddHmsPushConfigurationData.class);
  }

 /**
  * Convert an instance of AddHmsPushConfigurationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

