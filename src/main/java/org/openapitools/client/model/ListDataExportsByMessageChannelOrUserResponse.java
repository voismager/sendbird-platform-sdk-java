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
import org.openapitools.client.model.ListDataExportsByMessageChannelOrUserResponseExportedDataInner;

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
 * ListDataExportsByMessageChannelOrUserResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class ListDataExportsByMessageChannelOrUserResponse {
  public static final String SERIALIZED_NAME_EXPORTED_DATA = "exported_data";
  @SerializedName(SERIALIZED_NAME_EXPORTED_DATA)
  private List<ListDataExportsByMessageChannelOrUserResponseExportedDataInner> exportedData = null;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public ListDataExportsByMessageChannelOrUserResponse() { 
  }

  public ListDataExportsByMessageChannelOrUserResponse exportedData(List<ListDataExportsByMessageChannelOrUserResponseExportedDataInner> exportedData) {
    
    this.exportedData = exportedData;
    return this;
  }

  public ListDataExportsByMessageChannelOrUserResponse addExportedDataItem(ListDataExportsByMessageChannelOrUserResponseExportedDataInner exportedDataItem) {
    if (this.exportedData == null) {
      this.exportedData = new ArrayList<>();
    }
    this.exportedData.add(exportedDataItem);
    return this;
  }

   /**
   * Get exportedData
   * @return exportedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ListDataExportsByMessageChannelOrUserResponseExportedDataInner> getExportedData() {
    return exportedData;
  }


  public void setExportedData(List<ListDataExportsByMessageChannelOrUserResponseExportedDataInner> exportedData) {
    this.exportedData = exportedData;
  }


  public ListDataExportsByMessageChannelOrUserResponse next(String next) {
    
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
    ListDataExportsByMessageChannelOrUserResponse listDataExportsByMessageChannelOrUserResponse = (ListDataExportsByMessageChannelOrUserResponse) o;
    return Objects.equals(this.exportedData, listDataExportsByMessageChannelOrUserResponse.exportedData) &&
        Objects.equals(this.next, listDataExportsByMessageChannelOrUserResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportedData, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDataExportsByMessageChannelOrUserResponse {\n");
    sb.append("    exportedData: ").append(toIndentedString(exportedData)).append("\n");
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
    openapiFields.add("exported_data");
    openapiFields.add("next");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListDataExportsByMessageChannelOrUserResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListDataExportsByMessageChannelOrUserResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListDataExportsByMessageChannelOrUserResponse is not found in the empty JSON string", ListDataExportsByMessageChannelOrUserResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListDataExportsByMessageChannelOrUserResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListDataExportsByMessageChannelOrUserResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayexportedData = jsonObj.getAsJsonArray("exported_data");
      if (jsonArrayexportedData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("exported_data").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `exported_data` to be an array in the JSON string but got `%s`", jsonObj.get("exported_data").toString()));
        }

        // validate the optional field `exported_data` (array)
        for (int i = 0; i < jsonArrayexportedData.size(); i++) {
          ListDataExportsByMessageChannelOrUserResponseExportedDataInner.validateJsonObject(jsonArrayexportedData.get(i).getAsJsonObject());
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
       if (!ListDataExportsByMessageChannelOrUserResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListDataExportsByMessageChannelOrUserResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListDataExportsByMessageChannelOrUserResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListDataExportsByMessageChannelOrUserResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListDataExportsByMessageChannelOrUserResponse>() {
           @Override
           public void write(JsonWriter out, ListDataExportsByMessageChannelOrUserResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListDataExportsByMessageChannelOrUserResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListDataExportsByMessageChannelOrUserResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListDataExportsByMessageChannelOrUserResponse
  * @throws IOException if the JSON string is invalid with respect to ListDataExportsByMessageChannelOrUserResponse
  */
  public static ListDataExportsByMessageChannelOrUserResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListDataExportsByMessageChannelOrUserResponse.class);
  }

 /**
  * Convert an instance of ListDataExportsByMessageChannelOrUserResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

