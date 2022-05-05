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
 * UseDefaultEmojisData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-05T15:12:57.551715+01:00[Europe/London]")
public class UseDefaultEmojisData {
  public static final String SERIALIZED_NAME_USE_DEFAULT_EMOJI = "use_default_emoji";
  @SerializedName(SERIALIZED_NAME_USE_DEFAULT_EMOJI)
  private Boolean useDefaultEmoji;

  public UseDefaultEmojisData() { 
  }

  public UseDefaultEmojisData useDefaultEmoji(Boolean useDefaultEmoji) {
    
    this.useDefaultEmoji = useDefaultEmoji;
    return this;
  }

   /**
   * Determines whether to use the 7 default emojis initially provided.
   * @return useDefaultEmoji
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to use the 7 default emojis initially provided.")

  public Boolean getUseDefaultEmoji() {
    return useDefaultEmoji;
  }


  public void setUseDefaultEmoji(Boolean useDefaultEmoji) {
    this.useDefaultEmoji = useDefaultEmoji;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseDefaultEmojisData useDefaultEmojisData = (UseDefaultEmojisData) o;
    return Objects.equals(this.useDefaultEmoji, useDefaultEmojisData.useDefaultEmoji);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useDefaultEmoji);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UseDefaultEmojisData {\n");
    sb.append("    useDefaultEmoji: ").append(toIndentedString(useDefaultEmoji)).append("\n");
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

