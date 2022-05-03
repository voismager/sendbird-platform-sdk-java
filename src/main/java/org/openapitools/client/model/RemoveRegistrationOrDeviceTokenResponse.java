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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SendBirdUser;

/**
 * RemoveRegistrationOrDeviceTokenResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T07:39:00.941714+01:00[Europe/London]")
public class RemoveRegistrationOrDeviceTokenResponse {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private List<String> token = null;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private SendBirdUser user;

  public RemoveRegistrationOrDeviceTokenResponse() { 
  }

  public RemoveRegistrationOrDeviceTokenResponse token(List<String> token) {
    
    this.token = token;
    return this;
  }

  public RemoveRegistrationOrDeviceTokenResponse addTokenItem(String tokenItem) {
    if (this.token == null) {
      this.token = new ArrayList<String>();
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

  public List<String> getToken() {
    return token;
  }


  public void setToken(List<String> token) {
    this.token = token;
  }


  public RemoveRegistrationOrDeviceTokenResponse user(SendBirdUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdUser getUser() {
    return user;
  }


  public void setUser(SendBirdUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveRegistrationOrDeviceTokenResponse removeRegistrationOrDeviceTokenResponse = (RemoveRegistrationOrDeviceTokenResponse) o;
    return Objects.equals(this.token, removeRegistrationOrDeviceTokenResponse.token) &&
        Objects.equals(this.user, removeRegistrationOrDeviceTokenResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveRegistrationOrDeviceTokenResponse {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

