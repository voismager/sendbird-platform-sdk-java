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
import java.math.BigDecimal;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.SendBirdUser;

/**
 * GcBanUserResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T11:00:21.022543+01:00[Europe/London]")
public class GcBanUserResponse {
  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private SendBirdUser user;

  public static final String SERIALIZED_NAME_START_AT = "start_at";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private BigDecimal startAt;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private BigDecimal endAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private InlineResponse2001 metadata;

  public static final String SERIALIZED_NAME_NEXT_URL = "next_url";
  @SerializedName(SERIALIZED_NAME_NEXT_URL)
  private String nextUrl;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profile_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public static final String SERIALIZED_NAME_REQUIRE_AUTH_FOR_PROFILE_IMAGE = "require_auth_for_profile_image";
  @SerializedName(SERIALIZED_NAME_REQUIRE_AUTH_FOR_PROFILE_IMAGE)
  private Boolean requireAuthForProfileImage;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public GcBanUserResponse() { 
  }

  public GcBanUserResponse user(SendBirdUser user) {
    
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


  public GcBanUserResponse startAt(BigDecimal startAt) {
    
    this.startAt = startAt;
    return this;
  }

   /**
   * Get startAt
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getStartAt() {
    return startAt;
  }


  public void setStartAt(BigDecimal startAt) {
    this.startAt = startAt;
  }


  public GcBanUserResponse endAt(BigDecimal endAt) {
    
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEndAt() {
    return endAt;
  }


  public void setEndAt(BigDecimal endAt) {
    this.endAt = endAt;
  }


  public GcBanUserResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GcBanUserResponse metadata(InlineResponse2001 metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse2001 getMetadata() {
    return metadata;
  }


  public void setMetadata(InlineResponse2001 metadata) {
    this.metadata = metadata;
  }


  public GcBanUserResponse nextUrl(String nextUrl) {
    
    this.nextUrl = nextUrl;
    return this;
  }

   /**
   * Get nextUrl
   * @return nextUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextUrl() {
    return nextUrl;
  }


  public void setNextUrl(String nextUrl) {
    this.nextUrl = nextUrl;
  }


  public GcBanUserResponse nickname(String nickname) {
    
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


  public GcBanUserResponse profileUrl(String profileUrl) {
    
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


  public GcBanUserResponse requireAuthForProfileImage(Boolean requireAuthForProfileImage) {
    
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


  public GcBanUserResponse userId(String userId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcBanUserResponse gcBanUserResponse = (GcBanUserResponse) o;
    return Objects.equals(this.user, gcBanUserResponse.user) &&
        Objects.equals(this.startAt, gcBanUserResponse.startAt) &&
        Objects.equals(this.endAt, gcBanUserResponse.endAt) &&
        Objects.equals(this.description, gcBanUserResponse.description) &&
        Objects.equals(this.metadata, gcBanUserResponse.metadata) &&
        Objects.equals(this.nextUrl, gcBanUserResponse.nextUrl) &&
        Objects.equals(this.nickname, gcBanUserResponse.nickname) &&
        Objects.equals(this.profileUrl, gcBanUserResponse.profileUrl) &&
        Objects.equals(this.requireAuthForProfileImage, gcBanUserResponse.requireAuthForProfileImage) &&
        Objects.equals(this.userId, gcBanUserResponse.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, startAt, endAt, description, metadata, nextUrl, nickname, profileUrl, requireAuthForProfileImage, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcBanUserResponse {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    nextUrl: ").append(toIndentedString(nextUrl)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    requireAuthForProfileImage: ").append(toIndentedString(requireAuthForProfileImage)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

