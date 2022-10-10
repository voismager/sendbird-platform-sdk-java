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
import org.openapitools.client.model.Function;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SBObject
 */
@JsonPropertyOrder({
  SBObject.JSON_PROPERTY_CONSTRUCTOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
public class SBObject {
  public static final String JSON_PROPERTY_CONSTRUCTOR = "constructor";
  private Function constructor;

  public SBObject() { 
  }

  public SBObject constructor(Function constructor) {
    this.constructor = constructor;
    return this;
  }

   /**
   * Get constructor
   * @return constructor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSTRUCTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Function getConstructor() {
    return constructor;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRUCTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstructor(Function constructor) {
    this.constructor = constructor;
  }


  /**
   * Return true if this SBObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SBObject sbObject = (SBObject) o;
    return Objects.equals(this.constructor, sbObject.constructor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constructor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SBObject {\n");
    sb.append("    constructor: ").append(toIndentedString(constructor)).append("\n");
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

