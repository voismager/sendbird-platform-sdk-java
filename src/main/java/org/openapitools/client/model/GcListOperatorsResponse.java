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
import org.openapitools.client.model.SendBirdUser;

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
 * GcListOperatorsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T14:38:17.329046+01:00[Europe/London]")
public class GcListOperatorsResponse {
  public static final String SERIALIZED_NAME_OPERATORS = "operators";
  @SerializedName(SERIALIZED_NAME_OPERATORS)
  private List<SendBirdUser> operators = null;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public GcListOperatorsResponse() { 
  }

  public GcListOperatorsResponse operators(List<SendBirdUser> operators) {
    
    this.operators = operators;
    return this;
  }

  public GcListOperatorsResponse addOperatorsItem(SendBirdUser operatorsItem) {
    if (this.operators == null) {
      this.operators = new ArrayList<>();
    }
    this.operators.add(operatorsItem);
    return this;
  }

   /**
   * Get operators
   * @return operators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdUser> getOperators() {
    return operators;
  }


  public void setOperators(List<SendBirdUser> operators) {
    this.operators = operators;
  }


  public GcListOperatorsResponse next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcListOperatorsResponse gcListOperatorsResponse = (GcListOperatorsResponse) o;
    return Objects.equals(this.operators, gcListOperatorsResponse.operators) &&
        Objects.equals(this.next, gcListOperatorsResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operators, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcListOperatorsResponse {\n");
    sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
    openapiFields.add("operators");
    openapiFields.add("next");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GcListOperatorsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GcListOperatorsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GcListOperatorsResponse is not found in the empty JSON string", GcListOperatorsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GcListOperatorsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GcListOperatorsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayoperators = jsonObj.getAsJsonArray("operators");
      if (jsonArrayoperators != null) {
        // ensure the json data is an array
        if (!jsonObj.get("operators").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `operators` to be an array in the JSON string but got `%s`", jsonObj.get("operators").toString()));
        }

        // validate the optional field `operators` (array)
        for (int i = 0; i < jsonArrayoperators.size(); i++) {
          SendBirdUser.validateJsonObject(jsonArrayoperators.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("next") != null && !jsonObj.get("next").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GcListOperatorsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GcListOperatorsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GcListOperatorsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GcListOperatorsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GcListOperatorsResponse>() {
           @Override
           public void write(JsonWriter out, GcListOperatorsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GcListOperatorsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GcListOperatorsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GcListOperatorsResponse
  * @throws IOException if the JSON string is invalid with respect to GcListOperatorsResponse
  */
  public static GcListOperatorsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GcListOperatorsResponse.class);
  }

 /**
  * Convert an instance of GcListOperatorsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

