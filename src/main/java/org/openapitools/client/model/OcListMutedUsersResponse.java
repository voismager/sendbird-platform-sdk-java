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
 * OcListMutedUsersResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T14:16:58.424760+01:00[Europe/London]")
public class OcListMutedUsersResponse {
  public static final String SERIALIZED_NAME_MUTED_LIST = "muted_list";
  @SerializedName(SERIALIZED_NAME_MUTED_LIST)
  private List<SendBirdUser> mutedList = null;

  public static final String SERIALIZED_NAME_TOTAL_MUTE_COUNT = "total_mute_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_MUTE_COUNT)
  private BigDecimal totalMuteCount;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public OcListMutedUsersResponse() { 
  }

  public OcListMutedUsersResponse mutedList(List<SendBirdUser> mutedList) {
    
    this.mutedList = mutedList;
    return this;
  }

  public OcListMutedUsersResponse addMutedListItem(SendBirdUser mutedListItem) {
    if (this.mutedList == null) {
      this.mutedList = new ArrayList<>();
    }
    this.mutedList.add(mutedListItem);
    return this;
  }

   /**
   * Get mutedList
   * @return mutedList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdUser> getMutedList() {
    return mutedList;
  }


  public void setMutedList(List<SendBirdUser> mutedList) {
    this.mutedList = mutedList;
  }


  public OcListMutedUsersResponse totalMuteCount(BigDecimal totalMuteCount) {
    
    this.totalMuteCount = totalMuteCount;
    return this;
  }

   /**
   * Get totalMuteCount
   * @return totalMuteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalMuteCount() {
    return totalMuteCount;
  }


  public void setTotalMuteCount(BigDecimal totalMuteCount) {
    this.totalMuteCount = totalMuteCount;
  }


  public OcListMutedUsersResponse next(String next) {
    
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
    OcListMutedUsersResponse ocListMutedUsersResponse = (OcListMutedUsersResponse) o;
    return Objects.equals(this.mutedList, ocListMutedUsersResponse.mutedList) &&
        Objects.equals(this.totalMuteCount, ocListMutedUsersResponse.totalMuteCount) &&
        Objects.equals(this.next, ocListMutedUsersResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mutedList, totalMuteCount, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcListMutedUsersResponse {\n");
    sb.append("    mutedList: ").append(toIndentedString(mutedList)).append("\n");
    sb.append("    totalMuteCount: ").append(toIndentedString(totalMuteCount)).append("\n");
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
    openapiFields.add("muted_list");
    openapiFields.add("total_mute_count");
    openapiFields.add("next");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OcListMutedUsersResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OcListMutedUsersResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OcListMutedUsersResponse is not found in the empty JSON string", OcListMutedUsersResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OcListMutedUsersResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OcListMutedUsersResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraymutedList = jsonObj.getAsJsonArray("muted_list");
      if (jsonArraymutedList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("muted_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `muted_list` to be an array in the JSON string but got `%s`", jsonObj.get("muted_list").toString()));
        }

        // validate the optional field `muted_list` (array)
        for (int i = 0; i < jsonArraymutedList.size(); i++) {
          SendBirdUser.validateJsonObject(jsonArraymutedList.get(i).getAsJsonObject());
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
       if (!OcListMutedUsersResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OcListMutedUsersResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OcListMutedUsersResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OcListMutedUsersResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OcListMutedUsersResponse>() {
           @Override
           public void write(JsonWriter out, OcListMutedUsersResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OcListMutedUsersResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OcListMutedUsersResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OcListMutedUsersResponse
  * @throws IOException if the JSON string is invalid with respect to OcListMutedUsersResponse
  */
  public static OcListMutedUsersResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OcListMutedUsersResponse.class);
  }

 /**
  * Convert an instance of OcListMutedUsersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

