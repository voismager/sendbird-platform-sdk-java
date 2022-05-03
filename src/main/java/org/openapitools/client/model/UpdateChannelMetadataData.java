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
 * UpdateChannelMetadataData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T07:39:00.941714+01:00[Europe/London]")
public class UpdateChannelMetadataData {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_UPSERT = "upsert";
  @SerializedName(SERIALIZED_NAME_UPSERT)
  private Boolean upsert;

  public UpdateChannelMetadataData() { 
  }

  public UpdateChannelMetadataData metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Specifies a &#x60;JSON&#x60; object which has key-value items to update. A key can&#39;t contain a comma (,) and its length is limited to 128 characters. A value must be a string and its length is limited to 190 characters. This property can have up to 5 items.
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a `JSON` object which has key-value items to update. A key can't contain a comma (,) and its length is limited to 128 characters. A value must be a string and its length is limited to 190 characters. This property can have up to 5 items.")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public UpdateChannelMetadataData upsert(Boolean upsert) {
    
    this.upsert = upsert;
    return this;
  }

   /**
   * Get upsert
   * @return upsert
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

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
    UpdateChannelMetadataData updateChannelMetadataData = (UpdateChannelMetadataData) o;
    return Objects.equals(this.metadata, updateChannelMetadataData.metadata) &&
        Objects.equals(this.upsert, updateChannelMetadataData.upsert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, upsert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChannelMetadataData {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

