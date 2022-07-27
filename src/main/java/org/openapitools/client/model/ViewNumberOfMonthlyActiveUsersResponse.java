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
 * ViewNumberOfMonthlyActiveUsersResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class ViewNumberOfMonthlyActiveUsersResponse {
  public static final String SERIALIZED_NAME_MAU = "mau";
  @SerializedName(SERIALIZED_NAME_MAU)
  private BigDecimal mau;

  public ViewNumberOfMonthlyActiveUsersResponse() { 
  }

  public ViewNumberOfMonthlyActiveUsersResponse mau(BigDecimal mau) {
    
    this.mau = mau;
    return this;
  }

   /**
   * Get mau
   * @return mau
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMau() {
    return mau;
  }


  public void setMau(BigDecimal mau) {
    this.mau = mau;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewNumberOfMonthlyActiveUsersResponse viewNumberOfMonthlyActiveUsersResponse = (ViewNumberOfMonthlyActiveUsersResponse) o;
    return Objects.equals(this.mau, viewNumberOfMonthlyActiveUsersResponse.mau);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mau);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewNumberOfMonthlyActiveUsersResponse {\n");
    sb.append("    mau: ").append(toIndentedString(mau)).append("\n");
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
    openapiFields.add("mau");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ViewNumberOfMonthlyActiveUsersResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ViewNumberOfMonthlyActiveUsersResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViewNumberOfMonthlyActiveUsersResponse is not found in the empty JSON string", ViewNumberOfMonthlyActiveUsersResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ViewNumberOfMonthlyActiveUsersResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ViewNumberOfMonthlyActiveUsersResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViewNumberOfMonthlyActiveUsersResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViewNumberOfMonthlyActiveUsersResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViewNumberOfMonthlyActiveUsersResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViewNumberOfMonthlyActiveUsersResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ViewNumberOfMonthlyActiveUsersResponse>() {
           @Override
           public void write(JsonWriter out, ViewNumberOfMonthlyActiveUsersResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ViewNumberOfMonthlyActiveUsersResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ViewNumberOfMonthlyActiveUsersResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ViewNumberOfMonthlyActiveUsersResponse
  * @throws IOException if the JSON string is invalid with respect to ViewNumberOfMonthlyActiveUsersResponse
  */
  public static ViewNumberOfMonthlyActiveUsersResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViewNumberOfMonthlyActiveUsersResponse.class);
  }

 /**
  * Convert an instance of ViewNumberOfMonthlyActiveUsersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

