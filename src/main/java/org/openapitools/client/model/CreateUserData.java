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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.sendbird.client.JSON;

/**
 * CreateUserData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T13:37:01.045476+01:00[Europe/London]")
public class CreateUserData {
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

  public static final String SERIALIZED_NAME_DISCOVERY_KEYS = "discovery_keys";
  @SerializedName(SERIALIZED_NAME_DISCOVERY_KEYS)
  private List<String> discoveryKeys = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

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

  public String getUserId() {
    return userId;
  }


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

  public String getNickname() {
    return nickname;
  }


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

  public String getProfileUrl() {
    return profileUrl;
  }


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

  public File getProfileFile() {
    return profileFile;
  }


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

  public Boolean getIssueAccessToken() {
    return issueAccessToken;
  }


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

  public List<String> getDiscoveryKeys() {
    return discoveryKeys;
  }


  public void setDiscoveryKeys(List<String> discoveryKeys) {
    this.discoveryKeys = discoveryKeys;
  }


  public CreateUserData metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Specifies a &#x60;JSON&#x60; object to store key-value items for additional user information such as phone number, email or a long description of the user. The key must not have a comma (,) and its length is limited to 128 characters. The value must be a string and its length is limited to 190 characters. This property can have up to 5 items.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a `JSON` object to store key-value items for additional user information such as phone number, email or a long description of the user. The key must not have a comma (,) and its length is limited to 128 characters. The value must be a string and its length is limited to 190 characters. This property can have up to 5 items.")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("user_id");
    openapiFields.add("nickname");
    openapiFields.add("profile_url");
    openapiFields.add("profile_file");
    openapiFields.add("issue_access_token");
    openapiFields.add("discovery_keys");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_id");
    openapiRequiredFields.add("nickname");
    openapiRequiredFields.add("profile_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateUserData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateUserData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateUserData is not found in the empty JSON string", CreateUserData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateUserData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateUserData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateUserData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("nickname") != null && !jsonObj.get("nickname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nickname").toString()));
      }
      if (jsonObj.get("profile_url") != null && !jsonObj.get("profile_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_url").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("discovery_keys") != null && !jsonObj.get("discovery_keys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `discovery_keys` to be an array in the JSON string but got `%s`", jsonObj.get("discovery_keys").toString()));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateUserData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateUserData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateUserData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateUserData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateUserData>() {
           @Override
           public void write(JsonWriter out, CreateUserData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateUserData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateUserData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateUserData
  * @throws IOException if the JSON string is invalid with respect to CreateUserData
  */
  public static CreateUserData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateUserData.class);
  }

 /**
  * Convert an instance of CreateUserData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

