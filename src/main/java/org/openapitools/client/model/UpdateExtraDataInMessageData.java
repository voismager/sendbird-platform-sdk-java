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

/**
 * UpdateExtraDataInMessageData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-05T15:12:57.551715+01:00[Europe/London]")
public class UpdateExtraDataInMessageData {
  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private String channelType;

  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private Integer messageId;

  public static final String SERIALIZED_NAME_SORTED_METAARRAY = "sorted_metaarray";
  @SerializedName(SERIALIZED_NAME_SORTED_METAARRAY)
  private String sortedMetaarray;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_UPSERT = "upsert";
  @SerializedName(SERIALIZED_NAME_UPSERT)
  private Boolean upsert;

  public UpdateExtraDataInMessageData() { 
  }

  public UpdateExtraDataInMessageData channelType(String channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * Specifies the type of the channel. Either open_channels or group_channels.
   * @return channelType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the type of the channel. Either open_channels or group_channels.")

  public String getChannelType() {
    return channelType;
  }


  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public UpdateExtraDataInMessageData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the target channel.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the target channel.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public UpdateExtraDataInMessageData messageId(Integer messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Specifies the unique ID of the message to update key-values items.
   * @return messageId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the message to update key-values items.")

  public Integer getMessageId() {
    return messageId;
  }


  public void setMessageId(Integer messageId) {
    this.messageId = messageId;
  }


  public UpdateExtraDataInMessageData sortedMetaarray(String sortedMetaarray) {
    
    this.sortedMetaarray = sortedMetaarray;
    return this;
  }

   /**
   * Specifies a &#x60;JSON&#x60; object of one or more key-values items which store additional message information. Each item consists of a key and the values in an array. Items are saved and will be returned in the exact order they&#39;ve been specified.
   * @return sortedMetaarray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a `JSON` object of one or more key-values items which store additional message information. Each item consists of a key and the values in an array. Items are saved and will be returned in the exact order they've been specified.")

  public String getSortedMetaarray() {
    return sortedMetaarray;
  }


  public void setSortedMetaarray(String sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
  }


  public UpdateExtraDataInMessageData mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Determines whether to add the specified values in the items or remove the specified values from the existing items. Acceptable values are limited to add and remove. If set to add, the specified values are added only when they are different from the existing values. If set to remove, the specified values are removed only when they have the corresponding ones in the existing values.
   * @return mode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to add the specified values in the items or remove the specified values from the existing items. Acceptable values are limited to add and remove. If set to add, the specified values are added only when they are different from the existing values. If set to remove, the specified values are removed only when they have the corresponding ones in the existing values.")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  public UpdateExtraDataInMessageData upsert(Boolean upsert) {
    
    this.upsert = upsert;
    return this;
  }

   /**
   * Determines whether to add new items in addition to updating existing items. If true, new key-values items are added when there are no items with the keys. The existing items are updated with new values when there are already items with the keys. If false, only the items of which keys match the ones you specify are updated with new values. (Default: false)
   * @return upsert
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to add new items in addition to updating existing items. If true, new key-values items are added when there are no items with the keys. The existing items are updated with new values when there are already items with the keys. If false, only the items of which keys match the ones you specify are updated with new values. (Default: false)")

  public Boolean getUpsert() {
    return upsert;
  }


  public void setUpsert(Boolean upsert) {
    this.upsert = upsert;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateExtraDataInMessageData updateExtraDataInMessageData = (UpdateExtraDataInMessageData) o;
    return Objects.equals(this.channelType, updateExtraDataInMessageData.channelType) &&
        Objects.equals(this.channelUrl, updateExtraDataInMessageData.channelUrl) &&
        Objects.equals(this.messageId, updateExtraDataInMessageData.messageId) &&
        Objects.equals(this.sortedMetaarray, updateExtraDataInMessageData.sortedMetaarray) &&
        Objects.equals(this.mode, updateExtraDataInMessageData.mode) &&
        Objects.equals(this.upsert, updateExtraDataInMessageData.upsert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelType, channelUrl, messageId, sortedMetaarray, mode, upsert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateExtraDataInMessageData {\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    sortedMetaarray: ").append(toIndentedString(sortedMetaarray)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    upsert: ").append(toIndentedString(upsert)).append("\n");
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

}

