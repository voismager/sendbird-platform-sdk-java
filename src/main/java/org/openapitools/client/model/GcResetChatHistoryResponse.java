/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GcResetChatHistoryResponse
 */
@JsonPropertyOrder({
  GcResetChatHistoryResponse.JSON_PROPERTY_TS_MESSAGE_OFFSET
})
@JsonTypeName("gcResetChatHistoryResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class GcResetChatHistoryResponse {
  public static final String JSON_PROPERTY_TS_MESSAGE_OFFSET = "ts_message_offset";
  private BigDecimal tsMessageOffset;

  public GcResetChatHistoryResponse() { 
  }

  public GcResetChatHistoryResponse tsMessageOffset(BigDecimal tsMessageOffset) {
    this.tsMessageOffset = tsMessageOffset;
    return this;
  }

   /**
   * Get tsMessageOffset
   * @return tsMessageOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TS_MESSAGE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTsMessageOffset() {
    return tsMessageOffset;
  }


  @JsonProperty(JSON_PROPERTY_TS_MESSAGE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTsMessageOffset(BigDecimal tsMessageOffset) {
    this.tsMessageOffset = tsMessageOffset;
  }


  /**
   * Return true if this gcResetChatHistoryResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcResetChatHistoryResponse gcResetChatHistoryResponse = (GcResetChatHistoryResponse) o;
    return Objects.equals(this.tsMessageOffset, gcResetChatHistoryResponse.tsMessageOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tsMessageOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcResetChatHistoryResponse {\n");
    sb.append("    tsMessageOffset: ").append(toIndentedString(tsMessageOffset)).append("\n");
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

