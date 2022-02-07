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
import org.openapitools.client.model.InlineResponse20047UserMetadata;

/**
 * InlineResponse20047User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class InlineResponse20047User {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profile_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private InlineResponse20047UserMetadata metadata;

  public InlineResponse20047User() { 
  }

  public InlineResponse20047User userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public InlineResponse20047User nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public InlineResponse20047User profileUrl(String profileUrl) {
    
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * Get profileUrl
   * @return profileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfileUrl() {
    return profileUrl;
  }


  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public InlineResponse20047User metadata(InlineResponse20047UserMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20047UserMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(InlineResponse20047UserMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20047User inlineResponse20047User = (InlineResponse20047User) o;
    return Objects.equals(this.userId, inlineResponse20047User.userId) &&
        Objects.equals(this.nickname, inlineResponse20047User.nickname) &&
        Objects.equals(this.profileUrl, inlineResponse20047User.profileUrl) &&
        Objects.equals(this.metadata, inlineResponse20047User.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, nickname, profileUrl, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20047User {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

