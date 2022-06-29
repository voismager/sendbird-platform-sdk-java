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
import org.openapitools.client.model.GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner;

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
 * GetDetailedOpenStatusOfAnnouncementByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T14:16:58.424760+01:00[Europe/London]")
public class GetDetailedOpenStatusOfAnnouncementByIdResponse {
  public static final String SERIALIZED_NAME_OPEN_STATUS = "open_status";
  @SerializedName(SERIALIZED_NAME_OPEN_STATUS)
  private List<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner> openStatus = null;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public GetDetailedOpenStatusOfAnnouncementByIdResponse() { 
  }

  public GetDetailedOpenStatusOfAnnouncementByIdResponse openStatus(List<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner> openStatus) {
    
    this.openStatus = openStatus;
    return this;
  }

  public GetDetailedOpenStatusOfAnnouncementByIdResponse addOpenStatusItem(GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner openStatusItem) {
    if (this.openStatus == null) {
      this.openStatus = new ArrayList<>();
    }
    this.openStatus.add(openStatusItem);
    return this;
  }

   /**
   * Get openStatus
   * @return openStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner> getOpenStatus() {
    return openStatus;
  }


  public void setOpenStatus(List<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner> openStatus) {
    this.openStatus = openStatus;
  }


  public GetDetailedOpenStatusOfAnnouncementByIdResponse next(String next) {
    
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
    GetDetailedOpenStatusOfAnnouncementByIdResponse getDetailedOpenStatusOfAnnouncementByIdResponse = (GetDetailedOpenStatusOfAnnouncementByIdResponse) o;
    return Objects.equals(this.openStatus, getDetailedOpenStatusOfAnnouncementByIdResponse.openStatus) &&
        Objects.equals(this.next, getDetailedOpenStatusOfAnnouncementByIdResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openStatus, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDetailedOpenStatusOfAnnouncementByIdResponse {\n");
    sb.append("    openStatus: ").append(toIndentedString(openStatus)).append("\n");
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
    openapiFields.add("open_status");
    openapiFields.add("next");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetDetailedOpenStatusOfAnnouncementByIdResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetDetailedOpenStatusOfAnnouncementByIdResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDetailedOpenStatusOfAnnouncementByIdResponse is not found in the empty JSON string", GetDetailedOpenStatusOfAnnouncementByIdResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetDetailedOpenStatusOfAnnouncementByIdResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDetailedOpenStatusOfAnnouncementByIdResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayopenStatus = jsonObj.getAsJsonArray("open_status");
      if (jsonArrayopenStatus != null) {
        // ensure the json data is an array
        if (!jsonObj.get("open_status").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `open_status` to be an array in the JSON string but got `%s`", jsonObj.get("open_status").toString()));
        }

        // validate the optional field `open_status` (array)
        for (int i = 0; i < jsonArrayopenStatus.size(); i++) {
          GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.validateJsonObject(jsonArrayopenStatus.get(i).getAsJsonObject());
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
       if (!GetDetailedOpenStatusOfAnnouncementByIdResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDetailedOpenStatusOfAnnouncementByIdResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDetailedOpenStatusOfAnnouncementByIdResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDetailedOpenStatusOfAnnouncementByIdResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDetailedOpenStatusOfAnnouncementByIdResponse>() {
           @Override
           public void write(JsonWriter out, GetDetailedOpenStatusOfAnnouncementByIdResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDetailedOpenStatusOfAnnouncementByIdResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDetailedOpenStatusOfAnnouncementByIdResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDetailedOpenStatusOfAnnouncementByIdResponse
  * @throws IOException if the JSON string is invalid with respect to GetDetailedOpenStatusOfAnnouncementByIdResponse
  */
  public static GetDetailedOpenStatusOfAnnouncementByIdResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDetailedOpenStatusOfAnnouncementByIdResponse.class);
  }

 /**
  * Convert an instance of GetDetailedOpenStatusOfAnnouncementByIdResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

