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
import java.io.File;
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
 * OcUpdateChannelByUrlData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class OcUpdateChannelByUrlData {
  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COVER_URL = "cover_url";
  @SerializedName(SERIALIZED_NAME_COVER_URL)
  private String coverUrl;

  public static final String SERIALIZED_NAME_COVER_FILE = "cover_file";
  @SerializedName(SERIALIZED_NAME_COVER_FILE)
  private File coverFile;

  public static final String SERIALIZED_NAME_CUSTOM_TYPE = "custom_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TYPE)
  private String customType;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_OPERATOR_IDS = "operator_ids";
  @SerializedName(SERIALIZED_NAME_OPERATOR_IDS)
  private List<String> operatorIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPERATORS = "operators";
  @SerializedName(SERIALIZED_NAME_OPERATORS)
  private List<String> operators = new ArrayList<>();

  public OcUpdateChannelByUrlData() { 
  }

  public OcUpdateChannelByUrlData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to update.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to update.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public OcUpdateChannelByUrlData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the channel topic, or the name of the channel. The length is limited to 191 characters.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the channel topic, or the name of the channel. The length is limited to 191 characters.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OcUpdateChannelByUrlData coverUrl(String coverUrl) {
    
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * Specifies the URL of the cover image. The length is limited to 2,048 characters.
   * @return coverUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the cover image. The length is limited to 2,048 characters.")

  public String getCoverUrl() {
    return coverUrl;
  }


  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public OcUpdateChannelByUrlData coverFile(File coverFile) {
    
    this.coverFile = coverFile;
    return this;
  }

   /**
   * Uploads the file for the channel cover image.
   * @return coverFile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Uploads the file for the channel cover image.")

  public File getCoverFile() {
    return coverFile;
  }


  public void setCoverFile(File coverFile) {
    this.coverFile = coverFile;
  }


  public OcUpdateChannelByUrlData customType(String customType) {
    
    this.customType = customType;
    return this;
  }

   /**
   * Specifies the custom channel type which is used for channel grouping. The length is limited to 128 characters.&lt;br /&gt;&lt;br /&gt; Custom types are also used within Sendbird&#39;s [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views.
   * @return customType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the custom channel type which is used for channel grouping. The length is limited to 128 characters.<br /><br /> Custom types are also used within Sendbird's [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views.")

  public String getCustomType() {
    return customType;
  }


  public void setCustomType(String customType) {
    this.customType = customType;
  }


  public OcUpdateChannelByUrlData data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Specifies additional channel information such as a long description of the channel or &#x60;JSON&#x60; formatted string.
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies additional channel information such as a long description of the channel or `JSON` formatted string.")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public OcUpdateChannelByUrlData operatorIds(List<String> operatorIds) {
    
    this.operatorIds = operatorIds;
    return this;
  }

  public OcUpdateChannelByUrlData addOperatorIdsItem(String operatorIdsItem) {
    this.operatorIds.add(operatorIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more user IDs to register as operators of the channel. The maximum allowed number of operators per channel is 100. Operators can delete any messages in the channel, and can also receive all messages that have been throttled.&lt;br/&gt;&lt;br/&gt;  Operators cannot view messages that have been [moderated by](/docs/chat/v3/platform-api/guides/filter-and-moderation) the domain filter or profanity filter. Only the sender will be notified that the message has been blocked.
   * @return operatorIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more user IDs to register as operators of the channel. The maximum allowed number of operators per channel is 100. Operators can delete any messages in the channel, and can also receive all messages that have been throttled.<br/><br/>  Operators cannot view messages that have been [moderated by](/docs/chat/v3/platform-api/guides/filter-and-moderation) the domain filter or profanity filter. Only the sender will be notified that the message has been blocked.")

  public List<String> getOperatorIds() {
    return operatorIds;
  }


  public void setOperatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
  }


  public OcUpdateChannelByUrlData operators(List<String> operators) {
    
    this.operators = operators;
    return this;
  }

  public OcUpdateChannelByUrlData addOperatorsItem(String operatorsItem) {
    this.operators.add(operatorsItem);
    return this;
  }

   /**
   * (Deprecated) Specifies the string IDs of the users registered as channel operators. Operators can delete any messages in the channel, and can also receive all messages that have been throttled.
   * @return operators
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "(Deprecated) Specifies the string IDs of the users registered as channel operators. Operators can delete any messages in the channel, and can also receive all messages that have been throttled.")

  public List<String> getOperators() {
    return operators;
  }


  public void setOperators(List<String> operators) {
    this.operators = operators;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcUpdateChannelByUrlData ocUpdateChannelByUrlData = (OcUpdateChannelByUrlData) o;
    return Objects.equals(this.channelUrl, ocUpdateChannelByUrlData.channelUrl) &&
        Objects.equals(this.name, ocUpdateChannelByUrlData.name) &&
        Objects.equals(this.coverUrl, ocUpdateChannelByUrlData.coverUrl) &&
        Objects.equals(this.coverFile, ocUpdateChannelByUrlData.coverFile) &&
        Objects.equals(this.customType, ocUpdateChannelByUrlData.customType) &&
        Objects.equals(this.data, ocUpdateChannelByUrlData.data) &&
        Objects.equals(this.operatorIds, ocUpdateChannelByUrlData.operatorIds) &&
        Objects.equals(this.operators, ocUpdateChannelByUrlData.operators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, name, coverUrl, coverFile, customType, data, operatorIds, operators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcUpdateChannelByUrlData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    coverFile: ").append(toIndentedString(coverFile)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    operatorIds: ").append(toIndentedString(operatorIds)).append("\n");
    sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
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
    openapiFields.add("channel_url");
    openapiFields.add("name");
    openapiFields.add("cover_url");
    openapiFields.add("cover_file");
    openapiFields.add("custom_type");
    openapiFields.add("data");
    openapiFields.add("operator_ids");
    openapiFields.add("operators");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel_url");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("cover_url");
    openapiRequiredFields.add("cover_file");
    openapiRequiredFields.add("custom_type");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("operator_ids");
    openapiRequiredFields.add("operators");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OcUpdateChannelByUrlData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OcUpdateChannelByUrlData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OcUpdateChannelByUrlData is not found in the empty JSON string", OcUpdateChannelByUrlData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OcUpdateChannelByUrlData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OcUpdateChannelByUrlData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OcUpdateChannelByUrlData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("channel_url") != null && !jsonObj.get("channel_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_url").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("cover_url") != null && !jsonObj.get("cover_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cover_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cover_url").toString()));
      }
      if (jsonObj.get("custom_type") != null && !jsonObj.get("custom_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_type").toString()));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("operator_ids") != null && !jsonObj.get("operator_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator_ids` to be an array in the JSON string but got `%s`", jsonObj.get("operator_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("operators") != null && !jsonObj.get("operators").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operators` to be an array in the JSON string but got `%s`", jsonObj.get("operators").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OcUpdateChannelByUrlData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OcUpdateChannelByUrlData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OcUpdateChannelByUrlData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OcUpdateChannelByUrlData.class));

       return (TypeAdapter<T>) new TypeAdapter<OcUpdateChannelByUrlData>() {
           @Override
           public void write(JsonWriter out, OcUpdateChannelByUrlData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OcUpdateChannelByUrlData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OcUpdateChannelByUrlData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OcUpdateChannelByUrlData
  * @throws IOException if the JSON string is invalid with respect to OcUpdateChannelByUrlData
  */
  public static OcUpdateChannelByUrlData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OcUpdateChannelByUrlData.class);
  }

 /**
  * Convert an instance of OcUpdateChannelByUrlData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

