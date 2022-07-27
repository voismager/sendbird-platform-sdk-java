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
 * GenerateSecondaryApiTokenData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class GenerateSecondaryApiTokenData {
  public static final String SERIALIZED_NAME_H_T_T_P_A_P_I_T_O_K_E_N = "HTTP_API_TOKEN";
  @SerializedName(SERIALIZED_NAME_H_T_T_P_A_P_I_T_O_K_E_N)
  private String HTTP_API_TOKEN;

  public GenerateSecondaryApiTokenData() { 
  }

  public GenerateSecondaryApiTokenData HTTP_API_TOKEN(String HTTP_API_TOKEN) {
    
    this.HTTP_API_TOKEN = HTTP_API_TOKEN;
    return this;
  }

   /**
   * Specifies the master API token of the application.
   * @return HTTP_API_TOKEN
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the master API token of the application.")

  public String getHTTPAPITOKEN() {
    return HTTP_API_TOKEN;
  }


  public void setHTTPAPITOKEN(String HTTP_API_TOKEN) {
    this.HTTP_API_TOKEN = HTTP_API_TOKEN;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateSecondaryApiTokenData generateSecondaryApiTokenData = (GenerateSecondaryApiTokenData) o;
    return Objects.equals(this.HTTP_API_TOKEN, generateSecondaryApiTokenData.HTTP_API_TOKEN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(HTTP_API_TOKEN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateSecondaryApiTokenData {\n");
    sb.append("    HTTP_API_TOKEN: ").append(toIndentedString(HTTP_API_TOKEN)).append("\n");
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
    openapiFields.add("HTTP_API_TOKEN");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("HTTP_API_TOKEN");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenerateSecondaryApiTokenData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GenerateSecondaryApiTokenData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateSecondaryApiTokenData is not found in the empty JSON string", GenerateSecondaryApiTokenData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GenerateSecondaryApiTokenData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateSecondaryApiTokenData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GenerateSecondaryApiTokenData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("HTTP_API_TOKEN") != null && !jsonObj.get("HTTP_API_TOKEN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HTTP_API_TOKEN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HTTP_API_TOKEN").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateSecondaryApiTokenData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateSecondaryApiTokenData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateSecondaryApiTokenData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateSecondaryApiTokenData.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateSecondaryApiTokenData>() {
           @Override
           public void write(JsonWriter out, GenerateSecondaryApiTokenData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateSecondaryApiTokenData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenerateSecondaryApiTokenData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateSecondaryApiTokenData
  * @throws IOException if the JSON string is invalid with respect to GenerateSecondaryApiTokenData
  */
  public static GenerateSecondaryApiTokenData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateSecondaryApiTokenData.class);
  }

 /**
  * Convert an instance of GenerateSecondaryApiTokenData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

