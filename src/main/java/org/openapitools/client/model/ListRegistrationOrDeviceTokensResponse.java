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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SendBirdUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListRegistrationOrDeviceTokensResponse
 */
@JsonPropertyOrder({
  ListRegistrationOrDeviceTokensResponse.JSON_PROPERTY_TOKEN,
  ListRegistrationOrDeviceTokensResponse.JSON_PROPERTY_TOKENS,
  ListRegistrationOrDeviceTokensResponse.JSON_PROPERTY_TYPE,
  ListRegistrationOrDeviceTokensResponse.JSON_PROPERTY_USER
})
@JsonTypeName("listRegistrationOrDeviceTokensResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T11:44:36.129327+09:00[Asia/Seoul]")
public class ListRegistrationOrDeviceTokensResponse {
  public static final String JSON_PROPERTY_TOKEN = "token";
  private List<String> token = null;

  public static final String JSON_PROPERTY_TOKENS = "tokens";
  private List<String> tokens = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_USER = "user";
  private SendBirdUser user;

  public ListRegistrationOrDeviceTokensResponse() { 
  }

  public ListRegistrationOrDeviceTokensResponse token(List<String> token) {
    this.token = token;
    return this;
  }

  public ListRegistrationOrDeviceTokensResponse addTokenItem(String tokenItem) {
    if (this.token == null) {
      this.token = new ArrayList<>();
    }
    this.token.add(tokenItem);
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(List<String> token) {
    this.token = token;
  }


  public ListRegistrationOrDeviceTokensResponse tokens(List<String> tokens) {
    this.tokens = tokens;
    return this;
  }

  public ListRegistrationOrDeviceTokensResponse addTokensItem(String tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTokens() {
    return tokens;
  }


  @JsonProperty(JSON_PROPERTY_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokens(List<String> tokens) {
    this.tokens = tokens;
  }


  public ListRegistrationOrDeviceTokensResponse type(String type) {
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

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public ListRegistrationOrDeviceTokensResponse user(SendBirdUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdUser getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(SendBirdUser user) {
    this.user = user;
  }


  /**
   * Return true if this listRegistrationOrDeviceTokensResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRegistrationOrDeviceTokensResponse listRegistrationOrDeviceTokensResponse = (ListRegistrationOrDeviceTokensResponse) o;
    return Objects.equals(this.token, listRegistrationOrDeviceTokensResponse.token) &&
        Objects.equals(this.tokens, listRegistrationOrDeviceTokensResponse.tokens) &&
        Objects.equals(this.type, listRegistrationOrDeviceTokensResponse.type) &&
        Objects.equals(this.user, listRegistrationOrDeviceTokensResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, tokens, type, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRegistrationOrDeviceTokensResponse {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

