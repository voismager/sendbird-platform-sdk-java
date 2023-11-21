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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * CreateChannelMetadataResponse
 */
@JsonPropertyOrder({
  CreateChannelMetadataResponse.JSON_PROPERTY_METADATA,
  CreateChannelMetadataResponse.JSON_PROPERTY_INCLUDE_TS
})
@JsonTypeName("createChannelMetadataResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T11:44:36.129327+09:00[Asia/Seoul]")
public class CreateChannelMetadataResponse {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_INCLUDE_TS = "include_ts";
  private BigDecimal includeTs;

  public CreateChannelMetadataResponse() { 
  }

  public CreateChannelMetadataResponse metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CreateChannelMetadataResponse putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public CreateChannelMetadataResponse includeTs(BigDecimal includeTs) {
    this.includeTs = includeTs;
    return this;
  }

   /**
   * Get includeTs
   * @return includeTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDE_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIncludeTs() {
    return includeTs;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeTs(BigDecimal includeTs) {
    this.includeTs = includeTs;
  }


  /**
   * Return true if this createChannelMetadataResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChannelMetadataResponse createChannelMetadataResponse = (CreateChannelMetadataResponse) o;
    return Objects.equals(this.metadata, createChannelMetadataResponse.metadata) &&
        Objects.equals(this.includeTs, createChannelMetadataResponse.includeTs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, includeTs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChannelMetadataResponse {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    includeTs: ").append(toIndentedString(includeTs)).append("\n");
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

