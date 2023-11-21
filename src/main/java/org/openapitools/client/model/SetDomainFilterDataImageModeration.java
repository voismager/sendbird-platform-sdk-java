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
import org.openapitools.client.model.SetDomainFilterDataImageModerationLimits;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SetDomainFilterDataImageModeration
 */
@JsonPropertyOrder({
  SetDomainFilterDataImageModeration.JSON_PROPERTY_TYPE,
  SetDomainFilterDataImageModeration.JSON_PROPERTY_SOFT_BLOCK,
  SetDomainFilterDataImageModeration.JSON_PROPERTY_LIMITS,
  SetDomainFilterDataImageModeration.JSON_PROPERTY_CHECK_URLS
})
@JsonTypeName("setDomainFilterData_image_moderation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T11:44:36.129327+09:00[Asia/Seoul]")
public class SetDomainFilterDataImageModeration {
  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_SOFT_BLOCK = "soft_block";
  private Boolean softBlock;

  public static final String JSON_PROPERTY_LIMITS = "limits";
  private SetDomainFilterDataImageModerationLimits limits;

  public static final String JSON_PROPERTY_CHECK_URLS = "check_urls";
  private Boolean checkUrls;

  public SetDomainFilterDataImageModeration() { 
  }

  public SetDomainFilterDataImageModeration type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Integer type) {
    this.type = type;
  }


  public SetDomainFilterDataImageModeration softBlock(Boolean softBlock) {
    this.softBlock = softBlock;
    return this;
  }

   /**
   * Get softBlock
   * @return softBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOFT_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSoftBlock() {
    return softBlock;
  }


  @JsonProperty(JSON_PROPERTY_SOFT_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftBlock(Boolean softBlock) {
    this.softBlock = softBlock;
  }


  public SetDomainFilterDataImageModeration limits(SetDomainFilterDataImageModerationLimits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SetDomainFilterDataImageModerationLimits getLimits() {
    return limits;
  }


  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimits(SetDomainFilterDataImageModerationLimits limits) {
    this.limits = limits;
  }


  public SetDomainFilterDataImageModeration checkUrls(Boolean checkUrls) {
    this.checkUrls = checkUrls;
    return this;
  }

   /**
   * Get checkUrls
   * @return checkUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHECK_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCheckUrls() {
    return checkUrls;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckUrls(Boolean checkUrls) {
    this.checkUrls = checkUrls;
  }


  /**
   * Return true if this setDomainFilterData_image_moderation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDomainFilterDataImageModeration setDomainFilterDataImageModeration = (SetDomainFilterDataImageModeration) o;
    return Objects.equals(this.type, setDomainFilterDataImageModeration.type) &&
        Objects.equals(this.softBlock, setDomainFilterDataImageModeration.softBlock) &&
        Objects.equals(this.limits, setDomainFilterDataImageModeration.limits) &&
        Objects.equals(this.checkUrls, setDomainFilterDataImageModeration.checkUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, softBlock, limits, checkUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDomainFilterDataImageModeration {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    softBlock: ").append(toIndentedString(softBlock)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    checkUrls: ").append(toIndentedString(checkUrls)).append("\n");
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

