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
 * RevokeSecondaryApiTokenByTokenResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T14:38:17.329046+01:00[Europe/London]")
public class RevokeSecondaryApiTokenByTokenResponse {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public RevokeSecondaryApiTokenByTokenResponse() { 
  }

  public RevokeSecondaryApiTokenByTokenResponse token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public RevokeSecondaryApiTokenByTokenResponse createdAt(BigDecimal createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokeSecondaryApiTokenByTokenResponse revokeSecondaryApiTokenByTokenResponse = (RevokeSecondaryApiTokenByTokenResponse) o;
    return Objects.equals(this.token, revokeSecondaryApiTokenByTokenResponse.token) &&
        Objects.equals(this.createdAt, revokeSecondaryApiTokenByTokenResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokeSecondaryApiTokenByTokenResponse {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("token");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RevokeSecondaryApiTokenByTokenResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RevokeSecondaryApiTokenByTokenResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RevokeSecondaryApiTokenByTokenResponse is not found in the empty JSON string", RevokeSecondaryApiTokenByTokenResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RevokeSecondaryApiTokenByTokenResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RevokeSecondaryApiTokenByTokenResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("token") != null && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RevokeSecondaryApiTokenByTokenResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RevokeSecondaryApiTokenByTokenResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RevokeSecondaryApiTokenByTokenResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RevokeSecondaryApiTokenByTokenResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RevokeSecondaryApiTokenByTokenResponse>() {
           @Override
           public void write(JsonWriter out, RevokeSecondaryApiTokenByTokenResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RevokeSecondaryApiTokenByTokenResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RevokeSecondaryApiTokenByTokenResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RevokeSecondaryApiTokenByTokenResponse
  * @throws IOException if the JSON string is invalid with respect to RevokeSecondaryApiTokenByTokenResponse
  */
  public static RevokeSecondaryApiTokenByTokenResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RevokeSecondaryApiTokenByTokenResponse.class);
  }

 /**
  * Convert an instance of RevokeSecondaryApiTokenByTokenResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

