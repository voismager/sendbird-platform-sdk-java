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
 * OcDeleteChannelByUrl200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class OcDeleteChannelByUrl200Response {
  public static final String SERIALIZED_NAME_ANY_OF = "anyOf";
  @SerializedName(SERIALIZED_NAME_ANY_OF)
  private String anyOf;

  public OcDeleteChannelByUrl200Response() { 
  }

  public OcDeleteChannelByUrl200Response anyOf(String anyOf) {
    
    this.anyOf = anyOf;
    return this;
  }

   /**
   * Get anyOf
   * @return anyOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAnyOf() {
    return anyOf;
  }


  public void setAnyOf(String anyOf) {
    this.anyOf = anyOf;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcDeleteChannelByUrl200Response ocDeleteChannelByUrl200Response = (OcDeleteChannelByUrl200Response) o;
    return Objects.equals(this.anyOf, ocDeleteChannelByUrl200Response.anyOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcDeleteChannelByUrl200Response {\n");
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
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
    openapiFields.add("anyOf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OcDeleteChannelByUrl200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OcDeleteChannelByUrl200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OcDeleteChannelByUrl200Response is not found in the empty JSON string", OcDeleteChannelByUrl200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OcDeleteChannelByUrl200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OcDeleteChannelByUrl200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("anyOf") != null && !jsonObj.get("anyOf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `anyOf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("anyOf").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OcDeleteChannelByUrl200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OcDeleteChannelByUrl200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OcDeleteChannelByUrl200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OcDeleteChannelByUrl200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<OcDeleteChannelByUrl200Response>() {
           @Override
           public void write(JsonWriter out, OcDeleteChannelByUrl200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OcDeleteChannelByUrl200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OcDeleteChannelByUrl200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OcDeleteChannelByUrl200Response
  * @throws IOException if the JSON string is invalid with respect to OcDeleteChannelByUrl200Response
  */
  public static OcDeleteChannelByUrl200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OcDeleteChannelByUrl200Response.class);
  }

 /**
  * Convert an instance of OcDeleteChannelByUrl200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
