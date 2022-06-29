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
 * GcUpdateChannelByUrlData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T14:16:58.424760+01:00[Europe/London]")
public class GcUpdateChannelByUrlData {
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

  public static final String SERIALIZED_NAME_IS_DISTINCT = "is_distinct";
  @SerializedName(SERIALIZED_NAME_IS_DISTINCT)
  private Boolean isDistinct;

  public static final String SERIALIZED_NAME_IS_PUBLIC = "is_public";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC)
  private Boolean isPublic;

  public static final String SERIALIZED_NAME_ACCESS_CODE = "access_code";
  @SerializedName(SERIALIZED_NAME_ACCESS_CODE)
  private String accessCode;

  public static final String SERIALIZED_NAME_OPERATOR_IDS = "operator_ids";
  @SerializedName(SERIALIZED_NAME_OPERATOR_IDS)
  private List<Integer> operatorIds = new ArrayList<>();

  public GcUpdateChannelByUrlData() { 
  }

  public GcUpdateChannelByUrlData channelUrl(String channelUrl) {
    
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


  public GcUpdateChannelByUrlData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the channel, or the channel topic. The length is limited to 191 characters.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of the channel, or the channel topic. The length is limited to 191 characters.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GcUpdateChannelByUrlData coverUrl(String coverUrl) {
    
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * Specifies the unique URL of the cover image. The length is limited to 2,048 characters.
   * @return coverUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique URL of the cover image. The length is limited to 2,048 characters.")

  public String getCoverUrl() {
    return coverUrl;
  }


  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public GcUpdateChannelByUrlData coverFile(File coverFile) {
    
    this.coverFile = coverFile;
    return this;
  }

   /**
   * Uploads the cover image file for the channel.
   * @return coverFile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Uploads the cover image file for the channel.")

  public File getCoverFile() {
    return coverFile;
  }


  public void setCoverFile(File coverFile) {
    this.coverFile = coverFile;
  }


  public GcUpdateChannelByUrlData customType(String customType) {
    
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


  public GcUpdateChannelByUrlData data(String data) {
    
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


  public GcUpdateChannelByUrlData isDistinct(Boolean isDistinct) {
    
    this.isDistinct = isDistinct;
    return this;
  }

   /**
   * Determines whether to reuse an existing channel or create a new channel. If set to true, returns a channel with the current channel members users or creates a new channel if no match is found. Sendbird server can also use the custom channel type in the custom_type property if specified along with the users to return the corresponding channel. If set to false, Sendbird server always creates a new channel with a combination of the users as well as the channel custom type if specified. (Default: false)&lt;br /&gt;&lt;br /&gt; Under this property, Sendbird server does not distinguish channels based on other properties such as channel URL or channel name.
   * @return isDistinct
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to reuse an existing channel or create a new channel. If set to true, returns a channel with the current channel members users or creates a new channel if no match is found. Sendbird server can also use the custom channel type in the custom_type property if specified along with the users to return the corresponding channel. If set to false, Sendbird server always creates a new channel with a combination of the users as well as the channel custom type if specified. (Default: false)<br /><br /> Under this property, Sendbird server does not distinguish channels based on other properties such as channel URL or channel name.")

  public Boolean getIsDistinct() {
    return isDistinct;
  }


  public void setIsDistinct(Boolean isDistinct) {
    this.isDistinct = isDistinct;
  }


  public GcUpdateChannelByUrlData isPublic(Boolean isPublic) {
    
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Determines whether to allow a user to join the channel without an invitation. (Default: false)
   * @return isPublic
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to allow a user to join the channel without an invitation. (Default: false)")

  public Boolean getIsPublic() {
    return isPublic;
  }


  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public GcUpdateChannelByUrlData accessCode(String accessCode) {
    
    this.accessCode = accessCode;
    return this;
  }

   /**
   * This property can be used only when the channel operator wants to set an access code for a public group channel. If specified, the is_access_code_required property of the channel resource is then set to true, and the channel begins to require the specified access code to a user who attempts to join.
   * @return accessCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This property can be used only when the channel operator wants to set an access code for a public group channel. If specified, the is_access_code_required property of the channel resource is then set to true, and the channel begins to require the specified access code to a user who attempts to join.")

  public String getAccessCode() {
    return accessCode;
  }


  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }


  public GcUpdateChannelByUrlData operatorIds(List<Integer> operatorIds) {
    
    this.operatorIds = operatorIds;
    return this;
  }

  public GcUpdateChannelByUrlData addOperatorIdsItem(Integer operatorIdsItem) {
    this.operatorIds.add(operatorIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of users to register as operators of the channel. If the operators are not members of the channel yet, they need an [invitation](#2-invite-as-members) to [join](#2-join-a-channel) a privte group channel while they don&#39;t need any to join a [public](#-3-private-vs-public) group channel. The maximum allowed number of operators per channel is 100.
   * @return operatorIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more IDs of users to register as operators of the channel. If the operators are not members of the channel yet, they need an [invitation](#2-invite-as-members) to [join](#2-join-a-channel) a privte group channel while they don't need any to join a [public](#-3-private-vs-public) group channel. The maximum allowed number of operators per channel is 100.")

  public List<Integer> getOperatorIds() {
    return operatorIds;
  }


  public void setOperatorIds(List<Integer> operatorIds) {
    this.operatorIds = operatorIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcUpdateChannelByUrlData gcUpdateChannelByUrlData = (GcUpdateChannelByUrlData) o;
    return Objects.equals(this.channelUrl, gcUpdateChannelByUrlData.channelUrl) &&
        Objects.equals(this.name, gcUpdateChannelByUrlData.name) &&
        Objects.equals(this.coverUrl, gcUpdateChannelByUrlData.coverUrl) &&
        Objects.equals(this.coverFile, gcUpdateChannelByUrlData.coverFile) &&
        Objects.equals(this.customType, gcUpdateChannelByUrlData.customType) &&
        Objects.equals(this.data, gcUpdateChannelByUrlData.data) &&
        Objects.equals(this.isDistinct, gcUpdateChannelByUrlData.isDistinct) &&
        Objects.equals(this.isPublic, gcUpdateChannelByUrlData.isPublic) &&
        Objects.equals(this.accessCode, gcUpdateChannelByUrlData.accessCode) &&
        Objects.equals(this.operatorIds, gcUpdateChannelByUrlData.operatorIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, name, coverUrl, coverFile, customType, data, isDistinct, isPublic, accessCode, operatorIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcUpdateChannelByUrlData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    coverFile: ").append(toIndentedString(coverFile)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isDistinct: ").append(toIndentedString(isDistinct)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    operatorIds: ").append(toIndentedString(operatorIds)).append("\n");
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
    openapiFields.add("is_distinct");
    openapiFields.add("is_public");
    openapiFields.add("access_code");
    openapiFields.add("operator_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel_url");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("cover_url");
    openapiRequiredFields.add("cover_file");
    openapiRequiredFields.add("custom_type");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("is_distinct");
    openapiRequiredFields.add("is_public");
    openapiRequiredFields.add("access_code");
    openapiRequiredFields.add("operator_ids");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GcUpdateChannelByUrlData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GcUpdateChannelByUrlData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GcUpdateChannelByUrlData is not found in the empty JSON string", GcUpdateChannelByUrlData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GcUpdateChannelByUrlData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GcUpdateChannelByUrlData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GcUpdateChannelByUrlData.openapiRequiredFields) {
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
      if (jsonObj.get("access_code") != null && !jsonObj.get("access_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_code").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("operator_ids") != null && !jsonObj.get("operator_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator_ids` to be an array in the JSON string but got `%s`", jsonObj.get("operator_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GcUpdateChannelByUrlData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GcUpdateChannelByUrlData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GcUpdateChannelByUrlData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GcUpdateChannelByUrlData.class));

       return (TypeAdapter<T>) new TypeAdapter<GcUpdateChannelByUrlData>() {
           @Override
           public void write(JsonWriter out, GcUpdateChannelByUrlData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GcUpdateChannelByUrlData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GcUpdateChannelByUrlData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GcUpdateChannelByUrlData
  * @throws IOException if the JSON string is invalid with respect to GcUpdateChannelByUrlData
  */
  public static GcUpdateChannelByUrlData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GcUpdateChannelByUrlData.class);
  }

 /**
  * Convert an instance of GcUpdateChannelByUrlData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

