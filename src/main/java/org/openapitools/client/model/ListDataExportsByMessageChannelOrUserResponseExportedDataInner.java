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
import org.openapitools.client.model.ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile;

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
 * ListDataExportsByMessageChannelOrUserResponseExportedDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T14:38:17.329046+01:00[Europe/London]")
public class ListDataExportsByMessageChannelOrUserResponseExportedDataInner {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_CSV_DELIMITER = "csv_delimiter";
  @SerializedName(SERIALIZED_NAME_CSV_DELIMITER)
  private String csvDelimiter;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public static final String SERIALIZED_NAME_START_TS = "start_ts";
  @SerializedName(SERIALIZED_NAME_START_TS)
  private BigDecimal startTs;

  public static final String SERIALIZED_NAME_END_TS = "end_ts";
  @SerializedName(SERIALIZED_NAME_END_TS)
  private BigDecimal endTs;

  public static final String SERIALIZED_NAME_CHANNEL_URLS = "channel_urls";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URLS)
  private List<String> channelUrls = null;

  public static final String SERIALIZED_NAME_SENDER_IDS = "sender_ids";
  @SerializedName(SERIALIZED_NAME_SENDER_IDS)
  private List<String> senderIds = null;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile _file;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<String> userIds = null;

  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner() { 
  }

  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner csvDelimiter(String csvDelimiter) {
    
    this.csvDelimiter = csvDelimiter;
    return this;
  }

   /**
   * Get csvDelimiter
   * @return csvDelimiter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCsvDelimiter() {
    return csvDelimiter;
  }


  public void setCsvDelimiter(String csvDelimiter) {
    this.csvDelimiter = csvDelimiter;
  }


  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner createdAt(BigDecimal createdAt) {
    
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


  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner startTs(BigDecimal startTs) {
    
    this.startTs = startTs;
    return this;
  }

   /**
   * Get startTs
   * @return startTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getStartTs() {
    return startTs;
  }


  public void setStartTs(BigDecimal startTs) {
    this.startTs = startTs;
  }


  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner endTs(BigDecimal endTs) {
    
    this.endTs = endTs;
    return this;
  }

   /**
   * Get endTs
   * @return endTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEndTs() {
    return endTs;
  }


  public void setEndTs(BigDecimal endTs) {
    this.endTs = endTs;
  }


  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner channelUrls(List<String> channelUrls) {
    
    this.channelUrls = channelUrls;
    return this;
  }

  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner addChannelUrlsItem(String channelUrlsItem) {
    if (this.channelUrls == null) {
      this.channelUrls = new ArrayList<>();
    }
    this.channelUrls.add(channelUrlsItem);
    return this;
  }

   /**
   * Get channelUrls
   * @return channelUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getChannelUrls() {
    return channelUrls;
  }


  public void setChannelUrls(List<String> channelUrls) {
    this.channelUrls = channelUrls;
  }


  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner senderIds(List<String> senderIds) {
    
    this.senderIds = senderIds;
    return this;
  }

  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner addSenderIdsItem(String senderIdsItem) {
    if (this.senderIds == null) {
      this.senderIds = new ArrayList<>();
    }
    this.senderIds.add(senderIdsItem);
    return this;
  }

   /**
   * Get senderIds
   * @return senderIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSenderIds() {
    return senderIds;
  }


  public void setSenderIds(List<String> senderIds) {
    this.senderIds = senderIds;
  }


  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner _file(ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile getFile() {
    return _file;
  }


  public void setFile(ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile _file) {
    this._file = _file;
  }


  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner userIds(List<String> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public ListDataExportsByMessageChannelOrUserResponseExportedDataInner addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDataExportsByMessageChannelOrUserResponseExportedDataInner listDataExportsByMessageChannelOrUserResponseExportedDataInner = (ListDataExportsByMessageChannelOrUserResponseExportedDataInner) o;
    return Objects.equals(this.requestId, listDataExportsByMessageChannelOrUserResponseExportedDataInner.requestId) &&
        Objects.equals(this.status, listDataExportsByMessageChannelOrUserResponseExportedDataInner.status) &&
        Objects.equals(this.format, listDataExportsByMessageChannelOrUserResponseExportedDataInner.format) &&
        Objects.equals(this.csvDelimiter, listDataExportsByMessageChannelOrUserResponseExportedDataInner.csvDelimiter) &&
        Objects.equals(this.timezone, listDataExportsByMessageChannelOrUserResponseExportedDataInner.timezone) &&
        Objects.equals(this.createdAt, listDataExportsByMessageChannelOrUserResponseExportedDataInner.createdAt) &&
        Objects.equals(this.startTs, listDataExportsByMessageChannelOrUserResponseExportedDataInner.startTs) &&
        Objects.equals(this.endTs, listDataExportsByMessageChannelOrUserResponseExportedDataInner.endTs) &&
        Objects.equals(this.channelUrls, listDataExportsByMessageChannelOrUserResponseExportedDataInner.channelUrls) &&
        Objects.equals(this.senderIds, listDataExportsByMessageChannelOrUserResponseExportedDataInner.senderIds) &&
        Objects.equals(this._file, listDataExportsByMessageChannelOrUserResponseExportedDataInner._file) &&
        Objects.equals(this.userIds, listDataExportsByMessageChannelOrUserResponseExportedDataInner.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, status, format, csvDelimiter, timezone, createdAt, startTs, endTs, channelUrls, senderIds, _file, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDataExportsByMessageChannelOrUserResponseExportedDataInner {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    csvDelimiter: ").append(toIndentedString(csvDelimiter)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
    sb.append("    senderIds: ").append(toIndentedString(senderIds)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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
    openapiFields.add("request_id");
    openapiFields.add("status");
    openapiFields.add("format");
    openapiFields.add("csv_delimiter");
    openapiFields.add("timezone");
    openapiFields.add("created_at");
    openapiFields.add("start_ts");
    openapiFields.add("end_ts");
    openapiFields.add("channel_urls");
    openapiFields.add("sender_ids");
    openapiFields.add("file");
    openapiFields.add("user_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListDataExportsByMessageChannelOrUserResponseExportedDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListDataExportsByMessageChannelOrUserResponseExportedDataInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListDataExportsByMessageChannelOrUserResponseExportedDataInner is not found in the empty JSON string", ListDataExportsByMessageChannelOrUserResponseExportedDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListDataExportsByMessageChannelOrUserResponseExportedDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListDataExportsByMessageChannelOrUserResponseExportedDataInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("request_id") != null && !jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("format") != null && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if (jsonObj.get("csv_delimiter") != null && !jsonObj.get("csv_delimiter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csv_delimiter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csv_delimiter").toString()));
      }
      if (jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("channel_urls") != null && !jsonObj.get("channel_urls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_urls` to be an array in the JSON string but got `%s`", jsonObj.get("channel_urls").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("sender_ids") != null && !jsonObj.get("sender_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender_ids` to be an array in the JSON string but got `%s`", jsonObj.get("sender_ids").toString()));
      }
      // validate the optional field `file`
      if (jsonObj.getAsJsonObject("file") != null) {
        ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile.validateJsonObject(jsonObj.getAsJsonObject("file"));
      }
      // ensure the json data is an array
      if (jsonObj.get("user_ids") != null && !jsonObj.get("user_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_ids` to be an array in the JSON string but got `%s`", jsonObj.get("user_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListDataExportsByMessageChannelOrUserResponseExportedDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListDataExportsByMessageChannelOrUserResponseExportedDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListDataExportsByMessageChannelOrUserResponseExportedDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListDataExportsByMessageChannelOrUserResponseExportedDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListDataExportsByMessageChannelOrUserResponseExportedDataInner>() {
           @Override
           public void write(JsonWriter out, ListDataExportsByMessageChannelOrUserResponseExportedDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListDataExportsByMessageChannelOrUserResponseExportedDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListDataExportsByMessageChannelOrUserResponseExportedDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListDataExportsByMessageChannelOrUserResponseExportedDataInner
  * @throws IOException if the JSON string is invalid with respect to ListDataExportsByMessageChannelOrUserResponseExportedDataInner
  */
  public static ListDataExportsByMessageChannelOrUserResponseExportedDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListDataExportsByMessageChannelOrUserResponseExportedDataInner.class);
  }

 /**
  * Convert an instance of ListDataExportsByMessageChannelOrUserResponseExportedDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

