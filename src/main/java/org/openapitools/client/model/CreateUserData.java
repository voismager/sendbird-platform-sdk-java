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
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * CreateUserData
 */
@JsonPropertyOrder({
  CreateUserData.JSON_PROPERTY_USER_ID,
  CreateUserData.JSON_PROPERTY_NICKNAME,
  CreateUserData.JSON_PROPERTY_PROFILE_URL,
  CreateUserData.JSON_PROPERTY_PROFILE_FILE,
  CreateUserData.JSON_PROPERTY_ISSUE_ACCESS_TOKEN,
  CreateUserData.JSON_PROPERTY_DISCOVERY_KEYS,
  CreateUserData.JSON_PROPERTY_METADATA
})
@JsonTypeName("createUserData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class CreateUserData {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_NICKNAME = "nickname";
  private String nickname;

  public static final String JSON_PROPERTY_PROFILE_URL = "profile_url";
  private String profileUrl;

  public static final String JSON_PROPERTY_PROFILE_FILE = "profile_file";
  private File profileFile;

  public static final String JSON_PROPERTY_ISSUE_ACCESS_TOKEN = "issue_access_token";
  private Boolean issueAccessToken;

  public static final String JSON_PROPERTY_DISCOVERY_KEYS = "discovery_keys";
  private List<String> discoveryKeys = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public CreateUserData() { 
  }

  public CreateUserData userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies a user&#39;s unique ID, which is used to sign into the Sendbird service. The length is limited to 80 characters.&lt;br /&gt;&lt;br /&gt; Do not use PII (Personally Identifiable Information) of your service, such as user email address, legal name or phone number.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a user's unique ID, which is used to sign into the Sendbird service. The length is limited to 80 characters.<br /><br /> Do not use PII (Personally Identifiable Information) of your service, such as user email address, legal name or phone number.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public CreateUserData nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Specifies a nickname for a new user. The length is limited to 80 characters.
   * @return nickname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a nickname for a new user. The length is limited to 80 characters.")
  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNickname() {
    return nickname;
  }


  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public CreateUserData profileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * Specifies the URL of the user&#39;s profile image. If left empty, no profile image is set for the user. The length is limited to 2,048 characters.&lt;br /&gt;&lt;br /&gt; The [domain filter](/docs/chat/v3/platform-api/guides/filter-and-moderation#2-domain-filter) filters out the request if the value of this property matches the filter&#39;s domain set.
   * @return profileUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the user's profile image. If left empty, no profile image is set for the user. The length is limited to 2,048 characters.<br /><br /> The [domain filter](/docs/chat/v3/platform-api/guides/filter-and-moderation#2-domain-filter) filters out the request if the value of this property matches the filter's domain set.")
  @JsonProperty(JSON_PROPERTY_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProfileUrl() {
    return profileUrl;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public CreateUserData profileFile(File profileFile) {
    this.profileFile = profileFile;
    return this;
  }

   /**
   * Uploads the file of the user&#39;s profile image. An acceptable image is limited to &#x60;JPG&#x60; (.jpg), &#x60;JPEG&#x60; (.jpeg), or &#x60;PNG&#x60; (.png) file of up to 25 MB.
   * @return profileFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uploads the file of the user's profile image. An acceptable image is limited to `JPG` (.jpg), `JPEG` (.jpeg), or `PNG` (.png) file of up to 25 MB.")
  @JsonProperty(JSON_PROPERTY_PROFILE_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public File getProfileFile() {
    return profileFile;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileFile(File profileFile) {
    this.profileFile = profileFile;
  }


  public CreateUserData issueAccessToken(Boolean issueAccessToken) {
    this.issueAccessToken = issueAccessToken;
    return this;
  }

   /**
   * Determines whether to create an access token for the user. If true, an opaque string token is issued and provided upon creation, which should be passed whenever the user logs in. If false, an access token is not required when the user logs in. (Default: false)
   * @return issueAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to create an access token for the user. If true, an opaque string token is issued and provided upon creation, which should be passed whenever the user logs in. If false, an access token is not required when the user logs in. (Default: false)")
  @JsonProperty(JSON_PROPERTY_ISSUE_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIssueAccessToken() {
    return issueAccessToken;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueAccessToken(Boolean issueAccessToken) {
    this.issueAccessToken = issueAccessToken;
  }


  public CreateUserData discoveryKeys(List<String> discoveryKeys) {
    this.discoveryKeys = discoveryKeys;
    return this;
  }

  public CreateUserData addDiscoveryKeysItem(String discoveryKeysItem) {
    if (this.discoveryKeys == null) {
      this.discoveryKeys = new ArrayList<>();
    }
    this.discoveryKeys.add(discoveryKeysItem);
    return this;
  }

   /**
   * Specifies an array of unique keys of the user which is provided to Sendbird server for discovering friends. By using the keys, the server can identify and match the user with other users.
   * @return discoveryKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of unique keys of the user which is provided to Sendbird server for discovering friends. By using the keys, the server can identify and match the user with other users.")
  @JsonProperty(JSON_PROPERTY_DISCOVERY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDiscoveryKeys() {
    return discoveryKeys;
  }


  @JsonProperty(JSON_PROPERTY_DISCOVERY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscoveryKeys(List<String> discoveryKeys) {
    this.discoveryKeys = discoveryKeys;
  }


  public CreateUserData metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Specifies a &#x60;JSON&#x60; object to store key-value items for additional user information such as phone number, email or a long description of the user. The key must not have a comma (,) and its length is limited to 128 characters. The value must be a string and its length is limited to 190 characters. This property can have up to 5 items.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a `JSON` object to store key-value items for additional user information such as phone number, email or a long description of the user. The key must not have a comma (,) and its length is limited to 128 characters. The value must be a string and its length is limited to 190 characters. This property can have up to 5 items.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  /**
   * Return true if this createUserData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserData createUserData = (CreateUserData) o;
    return Objects.equals(this.userId, createUserData.userId) &&
        Objects.equals(this.nickname, createUserData.nickname) &&
        Objects.equals(this.profileUrl, createUserData.profileUrl) &&
        Objects.equals(this.profileFile, createUserData.profileFile) &&
        Objects.equals(this.issueAccessToken, createUserData.issueAccessToken) &&
        Objects.equals(this.discoveryKeys, createUserData.discoveryKeys) &&
        Objects.equals(this.metadata, createUserData.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, nickname, profileUrl, profileFile, issueAccessToken, discoveryKeys, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserData {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    profileFile: ").append(toIndentedString(profileFile)).append("\n");
    sb.append("    issueAccessToken: ").append(toIndentedString(issueAccessToken)).append("\n");
    sb.append("    discoveryKeys: ").append(toIndentedString(discoveryKeys)).append("\n");
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

