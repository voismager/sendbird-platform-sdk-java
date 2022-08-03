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
 * GcMarkAllMessagesAsDeliveredResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T14:38:17.329046+01:00[Europe/London]")
public class GcMarkAllMessagesAsDeliveredResponse {
  public static final String SERIALIZED_NAME_TS = "ts";
  @SerializedName(SERIALIZED_NAME_TS)
  private BigDecimal ts;

  public GcMarkAllMessagesAsDeliveredResponse() { 
  }

  public GcMarkAllMessagesAsDeliveredResponse ts(BigDecimal ts) {
    
    this.ts = ts;
    return this;
  }

   /**
   * Get ts
   * @return ts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTs() {
    return ts;
  }


  public void setTs(BigDecimal ts) {
    this.ts = ts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcMarkAllMessagesAsDeliveredResponse gcMarkAllMessagesAsDeliveredResponse = (GcMarkAllMessagesAsDeliveredResponse) o;
    return Objects.equals(this.ts, gcMarkAllMessagesAsDeliveredResponse.ts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcMarkAllMessagesAsDeliveredResponse {\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
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
    openapiFields.add("ts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GcMarkAllMessagesAsDeliveredResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GcMarkAllMessagesAsDeliveredResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GcMarkAllMessagesAsDeliveredResponse is not found in the empty JSON string", GcMarkAllMessagesAsDeliveredResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GcMarkAllMessagesAsDeliveredResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GcMarkAllMessagesAsDeliveredResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GcMarkAllMessagesAsDeliveredResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GcMarkAllMessagesAsDeliveredResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GcMarkAllMessagesAsDeliveredResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GcMarkAllMessagesAsDeliveredResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GcMarkAllMessagesAsDeliveredResponse>() {
           @Override
           public void write(JsonWriter out, GcMarkAllMessagesAsDeliveredResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GcMarkAllMessagesAsDeliveredResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GcMarkAllMessagesAsDeliveredResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GcMarkAllMessagesAsDeliveredResponse
  * @throws IOException if the JSON string is invalid with respect to GcMarkAllMessagesAsDeliveredResponse
  */
  public static GcMarkAllMessagesAsDeliveredResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GcMarkAllMessagesAsDeliveredResponse.class);
  }

 /**
  * Convert an instance of GcMarkAllMessagesAsDeliveredResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

