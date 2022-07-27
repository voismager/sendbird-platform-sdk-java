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
 * RetrieveAdvancedAnalyticsMetricsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class RetrieveAdvancedAnalyticsMetricsResponse {
  public static final String SERIALIZED_NAME_SEGMENTS = "segments";
  @SerializedName(SERIALIZED_NAME_SEGMENTS)
  private String segments;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private String channelType;

  public static final String SERIALIZED_NAME_CUSTOM_CHANNEL_TYPE = "custom_channel_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_CHANNEL_TYPE)
  private String customChannelType;

  public static final String SERIALIZED_NAME_CUSTOM_MESSAGE_TYPE = "custom_message_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_MESSAGE_TYPE)
  private String customMessageType;

  public RetrieveAdvancedAnalyticsMetricsResponse() { 
  }

  public RetrieveAdvancedAnalyticsMetricsResponse segments(String segments) {
    
    this.segments = segments;
    return this;
  }

   /**
   * Get segments
   * @return segments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSegments() {
    return segments;
  }


  public void setSegments(String segments) {
    this.segments = segments;
  }


  public RetrieveAdvancedAnalyticsMetricsResponse date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public RetrieveAdvancedAnalyticsMetricsResponse value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public RetrieveAdvancedAnalyticsMetricsResponse channelType(String channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * Get channelType
   * @return channelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelType() {
    return channelType;
  }


  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public RetrieveAdvancedAnalyticsMetricsResponse customChannelType(String customChannelType) {
    
    this.customChannelType = customChannelType;
    return this;
  }

   /**
   * Get customChannelType
   * @return customChannelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomChannelType() {
    return customChannelType;
  }


  public void setCustomChannelType(String customChannelType) {
    this.customChannelType = customChannelType;
  }


  public RetrieveAdvancedAnalyticsMetricsResponse customMessageType(String customMessageType) {
    
    this.customMessageType = customMessageType;
    return this;
  }

   /**
   * Get customMessageType
   * @return customMessageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomMessageType() {
    return customMessageType;
  }


  public void setCustomMessageType(String customMessageType) {
    this.customMessageType = customMessageType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAdvancedAnalyticsMetricsResponse retrieveAdvancedAnalyticsMetricsResponse = (RetrieveAdvancedAnalyticsMetricsResponse) o;
    return Objects.equals(this.segments, retrieveAdvancedAnalyticsMetricsResponse.segments) &&
        Objects.equals(this.date, retrieveAdvancedAnalyticsMetricsResponse.date) &&
        Objects.equals(this.value, retrieveAdvancedAnalyticsMetricsResponse.value) &&
        Objects.equals(this.channelType, retrieveAdvancedAnalyticsMetricsResponse.channelType) &&
        Objects.equals(this.customChannelType, retrieveAdvancedAnalyticsMetricsResponse.customChannelType) &&
        Objects.equals(this.customMessageType, retrieveAdvancedAnalyticsMetricsResponse.customMessageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segments, date, value, channelType, customChannelType, customMessageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAdvancedAnalyticsMetricsResponse {\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    customChannelType: ").append(toIndentedString(customChannelType)).append("\n");
    sb.append("    customMessageType: ").append(toIndentedString(customMessageType)).append("\n");
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
    openapiFields.add("segments");
    openapiFields.add("date");
    openapiFields.add("value");
    openapiFields.add("channel_type");
    openapiFields.add("custom_channel_type");
    openapiFields.add("custom_message_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveAdvancedAnalyticsMetricsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RetrieveAdvancedAnalyticsMetricsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveAdvancedAnalyticsMetricsResponse is not found in the empty JSON string", RetrieveAdvancedAnalyticsMetricsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveAdvancedAnalyticsMetricsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveAdvancedAnalyticsMetricsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("segments") != null && !jsonObj.get("segments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `segments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("segments").toString()));
      }
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if (jsonObj.get("channel_type") != null && !jsonObj.get("channel_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_type").toString()));
      }
      if (jsonObj.get("custom_channel_type") != null && !jsonObj.get("custom_channel_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_channel_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_channel_type").toString()));
      }
      if (jsonObj.get("custom_message_type") != null && !jsonObj.get("custom_message_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_message_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_message_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveAdvancedAnalyticsMetricsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveAdvancedAnalyticsMetricsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveAdvancedAnalyticsMetricsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveAdvancedAnalyticsMetricsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveAdvancedAnalyticsMetricsResponse>() {
           @Override
           public void write(JsonWriter out, RetrieveAdvancedAnalyticsMetricsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveAdvancedAnalyticsMetricsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveAdvancedAnalyticsMetricsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveAdvancedAnalyticsMetricsResponse
  * @throws IOException if the JSON string is invalid with respect to RetrieveAdvancedAnalyticsMetricsResponse
  */
  public static RetrieveAdvancedAnalyticsMetricsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveAdvancedAnalyticsMetricsResponse.class);
  }

 /**
  * Convert an instance of RetrieveAdvancedAnalyticsMetricsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

