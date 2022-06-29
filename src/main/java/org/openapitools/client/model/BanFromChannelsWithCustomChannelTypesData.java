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
 * BanFromChannelsWithCustomChannelTypesData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T14:16:58.424760+01:00[Europe/London]")
public class BanFromChannelsWithCustomChannelTypesData {
  public static final String SERIALIZED_NAME_CHANNEL_CUSTOM_TYPES = "channel_custom_types";
  @SerializedName(SERIALIZED_NAME_CHANNEL_CUSTOM_TYPES)
  private List<String> channelCustomTypes = new ArrayList<>();

  public BanFromChannelsWithCustomChannelTypesData() { 
  }

  public BanFromChannelsWithCustomChannelTypesData channelCustomTypes(List<String> channelCustomTypes) {
    
    this.channelCustomTypes = channelCustomTypes;
    return this;
  }

  public BanFromChannelsWithCustomChannelTypesData addChannelCustomTypesItem(String channelCustomTypesItem) {
    this.channelCustomTypes.add(channelCustomTypesItem);
    return this;
  }

   /**
   * Specifies an array of one or more custom channel types, in order to ban the user from channels with the channel types. The user is permanently banned unless unbanned (10 years, technically).
   * @return channelCustomTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more custom channel types, in order to ban the user from channels with the channel types. The user is permanently banned unless unbanned (10 years, technically).")

  public List<String> getChannelCustomTypes() {
    return channelCustomTypes;
  }


  public void setChannelCustomTypes(List<String> channelCustomTypes) {
    this.channelCustomTypes = channelCustomTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BanFromChannelsWithCustomChannelTypesData banFromChannelsWithCustomChannelTypesData = (BanFromChannelsWithCustomChannelTypesData) o;
    return Objects.equals(this.channelCustomTypes, banFromChannelsWithCustomChannelTypesData.channelCustomTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelCustomTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BanFromChannelsWithCustomChannelTypesData {\n");
    sb.append("    channelCustomTypes: ").append(toIndentedString(channelCustomTypes)).append("\n");
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
    openapiFields.add("channel_custom_types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel_custom_types");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BanFromChannelsWithCustomChannelTypesData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BanFromChannelsWithCustomChannelTypesData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BanFromChannelsWithCustomChannelTypesData is not found in the empty JSON string", BanFromChannelsWithCustomChannelTypesData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BanFromChannelsWithCustomChannelTypesData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BanFromChannelsWithCustomChannelTypesData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BanFromChannelsWithCustomChannelTypesData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("channel_custom_types") != null && !jsonObj.get("channel_custom_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_custom_types` to be an array in the JSON string but got `%s`", jsonObj.get("channel_custom_types").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BanFromChannelsWithCustomChannelTypesData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BanFromChannelsWithCustomChannelTypesData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BanFromChannelsWithCustomChannelTypesData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BanFromChannelsWithCustomChannelTypesData.class));

       return (TypeAdapter<T>) new TypeAdapter<BanFromChannelsWithCustomChannelTypesData>() {
           @Override
           public void write(JsonWriter out, BanFromChannelsWithCustomChannelTypesData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BanFromChannelsWithCustomChannelTypesData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BanFromChannelsWithCustomChannelTypesData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BanFromChannelsWithCustomChannelTypesData
  * @throws IOException if the JSON string is invalid with respect to BanFromChannelsWithCustomChannelTypesData
  */
  public static BanFromChannelsWithCustomChannelTypesData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BanFromChannelsWithCustomChannelTypesData.class);
  }

 /**
  * Convert an instance of BanFromChannelsWithCustomChannelTypesData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

