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
import org.openapitools.client.model.AddApnsPushConfigurationResponsePushConfigurationsInner;

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
 * AddApnsPushConfigurationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T13:37:01.045476+01:00[Europe/London]")
public class AddApnsPushConfigurationResponse {
  public static final String SERIALIZED_NAME_PUSH_CONFIGURATIONS = "push_configurations";
  @SerializedName(SERIALIZED_NAME_PUSH_CONFIGURATIONS)
  private List<AddApnsPushConfigurationResponsePushConfigurationsInner> pushConfigurations = null;

  public AddApnsPushConfigurationResponse() { 
  }

  public AddApnsPushConfigurationResponse pushConfigurations(List<AddApnsPushConfigurationResponsePushConfigurationsInner> pushConfigurations) {
    
    this.pushConfigurations = pushConfigurations;
    return this;
  }

  public AddApnsPushConfigurationResponse addPushConfigurationsItem(AddApnsPushConfigurationResponsePushConfigurationsInner pushConfigurationsItem) {
    if (this.pushConfigurations == null) {
      this.pushConfigurations = new ArrayList<>();
    }
    this.pushConfigurations.add(pushConfigurationsItem);
    return this;
  }

   /**
   * Get pushConfigurations
   * @return pushConfigurations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AddApnsPushConfigurationResponsePushConfigurationsInner> getPushConfigurations() {
    return pushConfigurations;
  }


  public void setPushConfigurations(List<AddApnsPushConfigurationResponsePushConfigurationsInner> pushConfigurations) {
    this.pushConfigurations = pushConfigurations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddApnsPushConfigurationResponse addApnsPushConfigurationResponse = (AddApnsPushConfigurationResponse) o;
    return Objects.equals(this.pushConfigurations, addApnsPushConfigurationResponse.pushConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushConfigurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddApnsPushConfigurationResponse {\n");
    sb.append("    pushConfigurations: ").append(toIndentedString(pushConfigurations)).append("\n");
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
    openapiFields.add("push_configurations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddApnsPushConfigurationResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddApnsPushConfigurationResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddApnsPushConfigurationResponse is not found in the empty JSON string", AddApnsPushConfigurationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddApnsPushConfigurationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddApnsPushConfigurationResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraypushConfigurations = jsonObj.getAsJsonArray("push_configurations");
      if (jsonArraypushConfigurations != null) {
        // ensure the json data is an array
        if (!jsonObj.get("push_configurations").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `push_configurations` to be an array in the JSON string but got `%s`", jsonObj.get("push_configurations").toString()));
        }

        // validate the optional field `push_configurations` (array)
        for (int i = 0; i < jsonArraypushConfigurations.size(); i++) {
          AddApnsPushConfigurationResponsePushConfigurationsInner.validateJsonObject(jsonArraypushConfigurations.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddApnsPushConfigurationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddApnsPushConfigurationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddApnsPushConfigurationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddApnsPushConfigurationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AddApnsPushConfigurationResponse>() {
           @Override
           public void write(JsonWriter out, AddApnsPushConfigurationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddApnsPushConfigurationResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddApnsPushConfigurationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddApnsPushConfigurationResponse
  * @throws IOException if the JSON string is invalid with respect to AddApnsPushConfigurationResponse
  */
  public static AddApnsPushConfigurationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddApnsPushConfigurationResponse.class);
  }

 /**
  * Convert an instance of AddApnsPushConfigurationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

