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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UpdateUserByIdData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T11:00:21.022543+01:00[Europe/London]")
public class UpdateUserByIdData {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profile_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public static final String SERIALIZED_NAME_PROFILE_FILE = "profile_file";
  @SerializedName(SERIALIZED_NAME_PROFILE_FILE)
  private File profileFile;

  public static final String SERIALIZED_NAME_ISSUE_ACCESS_TOKEN = "issue_access_token";
  @SerializedName(SERIALIZED_NAME_ISSUE_ACCESS_TOKEN)
  private Boolean issueAccessToken;

  public static final String SERIALIZED_NAME_ISSUE_SESSION_TOKEN = "issue_session_token";
  @SerializedName(SERIALIZED_NAME_ISSUE_SESSION_TOKEN)
  private Boolean issueSessionToken;

  public static final String SERIALIZED_NAME_SESSION_TOKEN_EXPIRES_AT = "session_token_expires_at";
  @SerializedName(SERIALIZED_NAME_SESSION_TOKEN_EXPIRES_AT)
  private Integer sessionTokenExpiresAt;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_LAST_SEEN_AT = "last_seen_at";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN_AT)
  private Integer lastSeenAt;

  public static final String SERIALIZED_NAME_DISCOVERY_KEYS = "discovery_keys";
  @SerializedName(SERIALIZED_NAME_DISCOVERY_KEYS)
  private List<String> discoveryKeys = null;

  public static final String SERIALIZED_NAME_PREFERRED_LANGUAGES = "preferred_languages";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LANGUAGES)
  private List<String> preferredLanguages = null;

  public static final String SERIALIZED_NAME_LEAVE_ALL_WHEN_DEACTIVATED = "leave_all_when_deactivated";
  @SerializedName(SERIALIZED_NAME_LEAVE_ALL_WHEN_DEACTIVATED)
  private Boolean leaveAllWhenDeactivated;

  public UpdateUserByIdData() { 
  }

  public UpdateUserByIdData userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the unique ID of the user to update.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the user to update.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public UpdateUserByIdData nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Specifies the user&#39;s nickname. The length is limited to 80 characters.
   * @return nickname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the user's nickname. The length is limited to 80 characters.")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public UpdateUserByIdData profileUrl(String profileUrl) {
    
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * Specifies the URL of the user&#39;s profile image. The length is limited to 2,048 characters.&lt;br /&gt;&lt;br /&gt; The [domain filter](/docs/chat/v3/platform-api/guides/filter-and-moderation#2-domain-filter) filters out the request if the value of this property matches the filter&#39;s domain set.
   * @return profileUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the user's profile image. The length is limited to 2,048 characters.<br /><br /> The [domain filter](/docs/chat/v3/platform-api/guides/filter-and-moderation#2-domain-filter) filters out the request if the value of this property matches the filter's domain set.")

  public String getProfileUrl() {
    return profileUrl;
  }


  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public UpdateUserByIdData profileFile(File profileFile) {
    
    this.profileFile = profileFile;
    return this;
  }

   /**
   * Uploads the file of the user&#39;s profile image. An acceptable image is limited to &#x60;JPG&#x60; (.jpg), &#x60;JPEG&#x60; (.jpeg), or &#x60;PNG&#x60; (.png) file of up to 25 MB.
   * @return profileFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uploads the file of the user's profile image. An acceptable image is limited to `JPG` (.jpg), `JPEG` (.jpeg), or `PNG` (.png) file of up to 25 MB.")

  public File getProfileFile() {
    return profileFile;
  }


  public void setProfileFile(File profileFile) {
    this.profileFile = profileFile;
  }


  public UpdateUserByIdData issueAccessToken(Boolean issueAccessToken) {
    
    this.issueAccessToken = issueAccessToken;
    return this;
  }

   /**
   * Determines whether to revoke the existing access token and create a new one for the user. If true, an opaque string token is issued and provided upon creation, which should be passed whenever the user logs in. If false, an access token is not required when the user logs in. (Default: false)
   * @return issueAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to revoke the existing access token and create a new one for the user. If true, an opaque string token is issued and provided upon creation, which should be passed whenever the user logs in. If false, an access token is not required when the user logs in. (Default: false)")

  public Boolean getIssueAccessToken() {
    return issueAccessToken;
  }


  public void setIssueAccessToken(Boolean issueAccessToken) {
    this.issueAccessToken = issueAccessToken;
  }


  public UpdateUserByIdData issueSessionToken(Boolean issueSessionToken) {
    
    this.issueSessionToken = issueSessionToken;
    return this;
  }

   /**
   * Determines whether to add a new session token for the user. If true, an opaque string token is issued and provided upon creation, which should be passed whenever the user logs in. If false, a session token is not required when the user logs in. (Default: false)
   * @return issueSessionToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to add a new session token for the user. If true, an opaque string token is issued and provided upon creation, which should be passed whenever the user logs in. If false, a session token is not required when the user logs in. (Default: false)")

  public Boolean getIssueSessionToken() {
    return issueSessionToken;
  }


  public void setIssueSessionToken(Boolean issueSessionToken) {
    this.issueSessionToken = issueSessionToken;
  }


  public UpdateUserByIdData sessionTokenExpiresAt(Integer sessionTokenExpiresAt) {
    
    this.sessionTokenExpiresAt = sessionTokenExpiresAt;
    return this;
  }

   /**
   * Specifies the time for the issued session token to expire in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. The length should be 13. If not specified and the issue_session_token property above is true, the value of this property is set to the sum of the current timestamp and 604800000 by default, which indicates that the token will be valid for the next 7 days starting from the current timestamp.
   * @return sessionTokenExpiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time for the issued session token to expire in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. The length should be 13. If not specified and the issue_session_token property above is true, the value of this property is set to the sum of the current timestamp and 604800000 by default, which indicates that the token will be valid for the next 7 days starting from the current timestamp.")

  public Integer getSessionTokenExpiresAt() {
    return sessionTokenExpiresAt;
  }


  public void setSessionTokenExpiresAt(Integer sessionTokenExpiresAt) {
    this.sessionTokenExpiresAt = sessionTokenExpiresAt;
  }


  public UpdateUserByIdData isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Determines whether to activate or deactivate the user within the application.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to activate or deactivate the user within the application.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public UpdateUserByIdData lastSeenAt(Integer lastSeenAt) {
    
    this.lastSeenAt = lastSeenAt;
    return this;
  }

   /**
   * Specifies the time when the user goes offline, to indicate when they were last online, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format.
   * @return lastSeenAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time when the user goes offline, to indicate when they were last online, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format.")

  public Integer getLastSeenAt() {
    return lastSeenAt;
  }


  public void setLastSeenAt(Integer lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
  }


  public UpdateUserByIdData discoveryKeys(List<String> discoveryKeys) {
    
    this.discoveryKeys = discoveryKeys;
    return this;
  }

  public UpdateUserByIdData addDiscoveryKeysItem(String discoveryKeysItem) {
    if (this.discoveryKeys == null) {
      this.discoveryKeys = new ArrayList<String>();
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

  public List<String> getDiscoveryKeys() {
    return discoveryKeys;
  }


  public void setDiscoveryKeys(List<String> discoveryKeys) {
    this.discoveryKeys = discoveryKeys;
  }


  public UpdateUserByIdData preferredLanguages(List<String> preferredLanguages) {
    
    this.preferredLanguages = preferredLanguages;
    return this;
  }

  public UpdateUserByIdData addPreferredLanguagesItem(String preferredLanguagesItem) {
    if (this.preferredLanguages == null) {
      this.preferredLanguages = new ArrayList<String>();
    }
    this.preferredLanguages.add(preferredLanguagesItem);
    return this;
  }

   /**
   * Specifies an array of one or more [language codes](/docs/chat/v3/platform-api/guides/miscellaneous#2-language-codes-for-auto-translation) to translate notification messages to preferred languages. Up to 4 languages can be set for the user. If messages are sent in one of the preferred languages, notification messages won&#39;t be translated. If messages are sent in a language other than the preferred languages, notification messages will be translated into the first language in the array. In addition, the messages translated into other preferred languages will be provided in the &#x60;sendbird&#x60; property of a notification message payload.
   * @return preferredLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more [language codes](/docs/chat/v3/platform-api/guides/miscellaneous#2-language-codes-for-auto-translation) to translate notification messages to preferred languages. Up to 4 languages can be set for the user. If messages are sent in one of the preferred languages, notification messages won't be translated. If messages are sent in a language other than the preferred languages, notification messages will be translated into the first language in the array. In addition, the messages translated into other preferred languages will be provided in the `sendbird` property of a notification message payload.")

  public List<String> getPreferredLanguages() {
    return preferredLanguages;
  }


  public void setPreferredLanguages(List<String> preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
  }


  public UpdateUserByIdData leaveAllWhenDeactivated(Boolean leaveAllWhenDeactivated) {
    
    this.leaveAllWhenDeactivated = leaveAllWhenDeactivated;
    return this;
  }

   /**
   * Determines whether the user leaves all joined group channels upon deactivation. Note that this value is true by default. Use in conjunction with the is_active property above.
   * @return leaveAllWhenDeactivated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether the user leaves all joined group channels upon deactivation. Note that this value is true by default. Use in conjunction with the is_active property above.")

  public Boolean getLeaveAllWhenDeactivated() {
    return leaveAllWhenDeactivated;
  }


  public void setLeaveAllWhenDeactivated(Boolean leaveAllWhenDeactivated) {
    this.leaveAllWhenDeactivated = leaveAllWhenDeactivated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserByIdData updateUserByIdData = (UpdateUserByIdData) o;
    return Objects.equals(this.userId, updateUserByIdData.userId) &&
        Objects.equals(this.nickname, updateUserByIdData.nickname) &&
        Objects.equals(this.profileUrl, updateUserByIdData.profileUrl) &&
        Objects.equals(this.profileFile, updateUserByIdData.profileFile) &&
        Objects.equals(this.issueAccessToken, updateUserByIdData.issueAccessToken) &&
        Objects.equals(this.issueSessionToken, updateUserByIdData.issueSessionToken) &&
        Objects.equals(this.sessionTokenExpiresAt, updateUserByIdData.sessionTokenExpiresAt) &&
        Objects.equals(this.isActive, updateUserByIdData.isActive) &&
        Objects.equals(this.lastSeenAt, updateUserByIdData.lastSeenAt) &&
        Objects.equals(this.discoveryKeys, updateUserByIdData.discoveryKeys) &&
        Objects.equals(this.preferredLanguages, updateUserByIdData.preferredLanguages) &&
        Objects.equals(this.leaveAllWhenDeactivated, updateUserByIdData.leaveAllWhenDeactivated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, nickname, profileUrl, profileFile, issueAccessToken, issueSessionToken, sessionTokenExpiresAt, isActive, lastSeenAt, discoveryKeys, preferredLanguages, leaveAllWhenDeactivated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserByIdData {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    profileFile: ").append(toIndentedString(profileFile)).append("\n");
    sb.append("    issueAccessToken: ").append(toIndentedString(issueAccessToken)).append("\n");
    sb.append("    issueSessionToken: ").append(toIndentedString(issueSessionToken)).append("\n");
    sb.append("    sessionTokenExpiresAt: ").append(toIndentedString(sessionTokenExpiresAt)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
    sb.append("    discoveryKeys: ").append(toIndentedString(discoveryKeys)).append("\n");
    sb.append("    preferredLanguages: ").append(toIndentedString(preferredLanguages)).append("\n");
    sb.append("    leaveAllWhenDeactivated: ").append(toIndentedString(leaveAllWhenDeactivated)).append("\n");
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

