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
import org.openapitools.client.model.UpdateExtraDataInMessageResponseSortedMetaarrayInner;

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
 * UpdateExtraDataInMessageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class UpdateExtraDataInMessageResponse {
  public static final String SERIALIZED_NAME_SORTED_METAARRAY = "sorted_metaarray";
  @SerializedName(SERIALIZED_NAME_SORTED_METAARRAY)
  private List<UpdateExtraDataInMessageResponseSortedMetaarrayInner> sortedMetaarray = null;

  public UpdateExtraDataInMessageResponse() { 
  }

  public UpdateExtraDataInMessageResponse sortedMetaarray(List<UpdateExtraDataInMessageResponseSortedMetaarrayInner> sortedMetaarray) {
    
    this.sortedMetaarray = sortedMetaarray;
    return this;
  }

  public UpdateExtraDataInMessageResponse addSortedMetaarrayItem(UpdateExtraDataInMessageResponseSortedMetaarrayInner sortedMetaarrayItem) {
    if (this.sortedMetaarray == null) {
      this.sortedMetaarray = new ArrayList<>();
    }
    this.sortedMetaarray.add(sortedMetaarrayItem);
    return this;
  }

   /**
   * Get sortedMetaarray
   * @return sortedMetaarray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UpdateExtraDataInMessageResponseSortedMetaarrayInner> getSortedMetaarray() {
    return sortedMetaarray;
  }


  public void setSortedMetaarray(List<UpdateExtraDataInMessageResponseSortedMetaarrayInner> sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateExtraDataInMessageResponse updateExtraDataInMessageResponse = (UpdateExtraDataInMessageResponse) o;
    return Objects.equals(this.sortedMetaarray, updateExtraDataInMessageResponse.sortedMetaarray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortedMetaarray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateExtraDataInMessageResponse {\n");
    sb.append("    sortedMetaarray: ").append(toIndentedString(sortedMetaarray)).append("\n");
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
    openapiFields.add("sorted_metaarray");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateExtraDataInMessageResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateExtraDataInMessageResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateExtraDataInMessageResponse is not found in the empty JSON string", UpdateExtraDataInMessageResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateExtraDataInMessageResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateExtraDataInMessageResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraysortedMetaarray = jsonObj.getAsJsonArray("sorted_metaarray");
      if (jsonArraysortedMetaarray != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sorted_metaarray").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sorted_metaarray` to be an array in the JSON string but got `%s`", jsonObj.get("sorted_metaarray").toString()));
        }

        // validate the optional field `sorted_metaarray` (array)
        for (int i = 0; i < jsonArraysortedMetaarray.size(); i++) {
          UpdateExtraDataInMessageResponseSortedMetaarrayInner.validateJsonObject(jsonArraysortedMetaarray.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateExtraDataInMessageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateExtraDataInMessageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateExtraDataInMessageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateExtraDataInMessageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateExtraDataInMessageResponse>() {
           @Override
           public void write(JsonWriter out, UpdateExtraDataInMessageResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateExtraDataInMessageResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateExtraDataInMessageResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateExtraDataInMessageResponse
  * @throws IOException if the JSON string is invalid with respect to UpdateExtraDataInMessageResponse
  */
  public static UpdateExtraDataInMessageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateExtraDataInMessageResponse.class);
  }

 /**
  * Convert an instance of UpdateExtraDataInMessageResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

