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
 * InlineResponse20040CreateChannelOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class InlineResponse20040CreateChannelOptions {
  public static final String SERIALIZED_NAME_DISTINCT = "distinct";
  @SerializedName(SERIALIZED_NAME_DISTINCT)
  private Boolean distinct;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COVER_URL = "cover_url";
  @SerializedName(SERIALIZED_NAME_COVER_URL)
  private String coverUrl;

  public static final String SERIALIZED_NAME_CUSTOM_TYPE = "custom_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TYPE)
  private String customType;

  public InlineResponse20040CreateChannelOptions() { 
  }

  public InlineResponse20040CreateChannelOptions distinct(Boolean distinct) {
    
    this.distinct = distinct;
    return this;
  }

   /**
   * Get distinct
   * @return distinct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDistinct() {
    return distinct;
  }


  public void setDistinct(Boolean distinct) {
    this.distinct = distinct;
  }


  public InlineResponse20040CreateChannelOptions data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public InlineResponse20040CreateChannelOptions name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse20040CreateChannelOptions coverUrl(String coverUrl) {
    
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * Get coverUrl
   * @return coverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCoverUrl() {
    return coverUrl;
  }


  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public InlineResponse20040CreateChannelOptions customType(String customType) {
    
    this.customType = customType;
    return this;
  }

   /**
   * Get customType
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomType() {
    return customType;
  }


  public void setCustomType(String customType) {
    this.customType = customType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20040CreateChannelOptions inlineResponse20040CreateChannelOptions = (InlineResponse20040CreateChannelOptions) o;
    return Objects.equals(this.distinct, inlineResponse20040CreateChannelOptions.distinct) &&
        Objects.equals(this.data, inlineResponse20040CreateChannelOptions.data) &&
        Objects.equals(this.name, inlineResponse20040CreateChannelOptions.name) &&
        Objects.equals(this.coverUrl, inlineResponse20040CreateChannelOptions.coverUrl) &&
        Objects.equals(this.customType, inlineResponse20040CreateChannelOptions.customType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distinct, data, name, coverUrl, customType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20040CreateChannelOptions {\n");
    sb.append("    distinct: ").append(toIndentedString(distinct)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
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

