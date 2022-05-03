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
 * SendBirdGroupChannelCreatedBy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T07:39:00.941714+01:00[Europe/London]")
public class SendBirdGroupChannelCreatedBy {
  public static final String SERIALIZED_NAME_REQUIRE_AUTH_FOR_PROFILE_IMAGE = "require_auth_for_profile_image";
  @SerializedName(SERIALIZED_NAME_REQUIRE_AUTH_FOR_PROFILE_IMAGE)
  private Boolean requireAuthForProfileImage;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profile_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public SendBirdGroupChannelCreatedBy() { 
  }

  public SendBirdGroupChannelCreatedBy requireAuthForProfileImage(Boolean requireAuthForProfileImage) {
    
    this.requireAuthForProfileImage = requireAuthForProfileImage;
    return this;
  }

   /**
   * Get requireAuthForProfileImage
   * @return requireAuthForProfileImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequireAuthForProfileImage() {
    return requireAuthForProfileImage;
  }


  public void setRequireAuthForProfileImage(Boolean requireAuthForProfileImage) {
    this.requireAuthForProfileImage = requireAuthForProfileImage;
  }


  public SendBirdGroupChannelCreatedBy nickname(String nickname) {
    
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


  public SendBirdGroupChannelCreatedBy userId(String userId) {
    
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


  public SendBirdGroupChannelCreatedBy profileUrl(String profileUrl) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdGroupChannelCreatedBy sendBirdGroupChannelCreatedBy = (SendBirdGroupChannelCreatedBy) o;
    return Objects.equals(this.requireAuthForProfileImage, sendBirdGroupChannelCreatedBy.requireAuthForProfileImage) &&
        Objects.equals(this.nickname, sendBirdGroupChannelCreatedBy.nickname) &&
        Objects.equals(this.userId, sendBirdGroupChannelCreatedBy.userId) &&
        Objects.equals(this.profileUrl, sendBirdGroupChannelCreatedBy.profileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requireAuthForProfileImage, nickname, userId, profileUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdGroupChannelCreatedBy {\n");
    sb.append("    requireAuthForProfileImage: ").append(toIndentedString(requireAuthForProfileImage)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
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

