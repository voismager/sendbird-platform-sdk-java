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
 * UpdateChannelMetacounterData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T07:39:00.941714+01:00[Europe/London]")
public class UpdateChannelMetacounterData {
  public static final String SERIALIZED_NAME_METACOUNTER = "metacounter";
  @SerializedName(SERIALIZED_NAME_METACOUNTER)
  private String metacounter;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_UPSERT = "upsert";
  @SerializedName(SERIALIZED_NAME_UPSERT)
  private Boolean upsert;

  public UpdateChannelMetacounterData() { 
  }

  public UpdateChannelMetacounterData metacounter(String metacounter) {
    
    this.metacounter = metacounter;
    return this;
  }

   /**
   * Specifies a &#x60;JSON&#x60; object that stores key-value items. The key must not have a comma (,) and its length is limited to 128 characters. The value must be an integer. This property can have up to 5 items.
   * @return metacounter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a `JSON` object that stores key-value items. The key must not have a comma (,) and its length is limited to 128 characters. The value must be an integer. This property can have up to 5 items.")

  public String getMetacounter() {
    return metacounter;
  }


  public void setMetacounter(String metacounter) {
    this.metacounter = metacounter;
  }


  public UpdateChannelMetacounterData mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Specifies how to calculate the item value of the metacounter. Acceptable values are increase, decrease, and set. If set to increase, increments the item value of the metacounter by the value specified in the metacounter property, while decrease decrements. set sets the item value to the specified value exactly. (Default: set)
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies how to calculate the item value of the metacounter. Acceptable values are increase, decrease, and set. If set to increase, increments the item value of the metacounter by the value specified in the metacounter property, while decrease decrements. set sets the item value to the specified value exactly. (Default: set)")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  public UpdateChannelMetacounterData upsert(Boolean upsert) {
    
    this.upsert = upsert;
    return this;
  }

   /**
   * Get upsert
   * @return upsert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    UpdateChannelMetacounterData updateChannelMetacounterData = (UpdateChannelMetacounterData) o;
    return Objects.equals(this.metacounter, updateChannelMetacounterData.metacounter) &&
        Objects.equals(this.mode, updateChannelMetacounterData.mode) &&
        Objects.equals(this.upsert, updateChannelMetacounterData.upsert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metacounter, mode, upsert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChannelMetacounterData {\n");
    sb.append("    metacounter: ").append(toIndentedString(metacounter)).append("\n");
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

