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
 * GcUpdateChannelByUrlData
 */
@JsonPropertyOrder({
  GcUpdateChannelByUrlData.JSON_PROPERTY_CHANNEL_URL,
  GcUpdateChannelByUrlData.JSON_PROPERTY_NAME,
  GcUpdateChannelByUrlData.JSON_PROPERTY_COVER_URL,
  GcUpdateChannelByUrlData.JSON_PROPERTY_COVER_FILE,
  GcUpdateChannelByUrlData.JSON_PROPERTY_CUSTOM_TYPE,
  GcUpdateChannelByUrlData.JSON_PROPERTY_DATA,
  GcUpdateChannelByUrlData.JSON_PROPERTY_IS_DISTINCT,
  GcUpdateChannelByUrlData.JSON_PROPERTY_IS_PUBLIC,
  GcUpdateChannelByUrlData.JSON_PROPERTY_ACCESS_CODE,
  GcUpdateChannelByUrlData.JSON_PROPERTY_OPERATOR_IDS
})
@JsonTypeName("gcUpdateChannelByUrlData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T13:07:19.585435+09:00[Asia/Seoul]")
public class GcUpdateChannelByUrlData {
  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_COVER_URL = "cover_url";
  private String coverUrl;

  public static final String JSON_PROPERTY_COVER_FILE = "cover_file";
  private File coverFile;

  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_IS_DISTINCT = "is_distinct";
  private Boolean isDistinct;

  public static final String JSON_PROPERTY_IS_PUBLIC = "is_public";
  private Boolean isPublic;

  public static final String JSON_PROPERTY_ACCESS_CODE = "access_code";
  private String accessCode;

  public static final String JSON_PROPERTY_OPERATOR_IDS = "operator_ids";
  private List<String> operatorIds = new ArrayList<>();

  public GcUpdateChannelByUrlData() { 
  }

  public GcUpdateChannelByUrlData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to update.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to update.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelUrl() {
    return channelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcUpdateChannelByUrlData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the channel, or the channel topic. The length is limited to 191 characters.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of the channel, or the channel topic. The length is limited to 191 characters.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public GcUpdateChannelByUrlData coverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * Specifies the unique URL of the cover image. The length is limited to 2,048 characters.
   * @return coverUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique URL of the cover image. The length is limited to 2,048 characters.")
  @JsonProperty(JSON_PROPERTY_COVER_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCoverUrl() {
    return coverUrl;
  }


  @JsonProperty(JSON_PROPERTY_COVER_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public GcUpdateChannelByUrlData coverFile(File coverFile) {
    this.coverFile = coverFile;
    return this;
  }

   /**
   * Uploads the cover image file for the channel.
   * @return coverFile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Uploads the cover image file for the channel.")
  @JsonProperty(JSON_PROPERTY_COVER_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public File getCoverFile() {
    return coverFile;
  }


  @JsonProperty(JSON_PROPERTY_COVER_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCoverFile(File coverFile) {
    this.coverFile = coverFile;
  }


  public GcUpdateChannelByUrlData customType(String customType) {
    this.customType = customType;
    return this;
  }

   /**
   * Specifies the custom channel type which is used for channel grouping. The length is limited to 128 characters.&lt;br /&gt;&lt;br /&gt; Custom types are also used within Sendbird&#39;s [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views.
   * @return customType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the custom channel type which is used for channel grouping. The length is limited to 128 characters.<br /><br /> Custom types are also used within Sendbird's [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCustomType() {
    return customType;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomType(String customType) {
    this.customType = customType;
  }


  public GcUpdateChannelByUrlData data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Specifies additional channel information such as a long description of the channel or &#x60;JSON&#x60; formatted string.
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies additional channel information such as a long description of the channel or `JSON` formatted string.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(String data) {
    this.data = data;
  }


  public GcUpdateChannelByUrlData isDistinct(Boolean isDistinct) {
    this.isDistinct = isDistinct;
    return this;
  }

   /**
   * Determines whether to reuse an existing channel or create a new channel. If set to true, returns a channel with the current channel members users or creates a new channel if no match is found. Sendbird server can also use the custom channel type in the custom_type property if specified along with the users to return the corresponding channel. If set to false, Sendbird server always creates a new channel with a combination of the users as well as the channel custom type if specified. (Default: false)&lt;br /&gt;&lt;br /&gt; Under this property, Sendbird server does not distinguish channels based on other properties such as channel URL or channel name.
   * @return isDistinct
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to reuse an existing channel or create a new channel. If set to true, returns a channel with the current channel members users or creates a new channel if no match is found. Sendbird server can also use the custom channel type in the custom_type property if specified along with the users to return the corresponding channel. If set to false, Sendbird server always creates a new channel with a combination of the users as well as the channel custom type if specified. (Default: false)<br /><br /> Under this property, Sendbird server does not distinguish channels based on other properties such as channel URL or channel name.")
  @JsonProperty(JSON_PROPERTY_IS_DISTINCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsDistinct() {
    return isDistinct;
  }


  @JsonProperty(JSON_PROPERTY_IS_DISTINCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsDistinct(Boolean isDistinct) {
    this.isDistinct = isDistinct;
  }


  public GcUpdateChannelByUrlData isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Determines whether to allow a user to join the channel without an invitation. (Default: false)
   * @return isPublic
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to allow a user to join the channel without an invitation. (Default: false)")
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public GcUpdateChannelByUrlData accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * This property can be used only when the channel operator wants to set an access code for a public group channel. If specified, the is_access_code_required property of the channel resource is then set to true, and the channel begins to require the specified access code to a user who attempts to join.
   * @return accessCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This property can be used only when the channel operator wants to set an access code for a public group channel. If specified, the is_access_code_required property of the channel resource is then set to true, and the channel begins to require the specified access code to a user who attempts to join.")
  @JsonProperty(JSON_PROPERTY_ACCESS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccessCode() {
    return accessCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }


  public GcUpdateChannelByUrlData operatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
    return this;
  }

  public GcUpdateChannelByUrlData addOperatorIdsItem(String operatorIdsItem) {
    this.operatorIds.add(operatorIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of users to register as operators of the channel. If the operators are not members of the channel yet, they need an [invitation](#2-invite-as-members) to [join](#2-join-a-channel) a privte group channel while they don&#39;t need any to join a [public](#-3-private-vs-public) group channel. The maximum allowed number of operators per channel is 100.
   * @return operatorIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more IDs of users to register as operators of the channel. If the operators are not members of the channel yet, they need an [invitation](#2-invite-as-members) to [join](#2-join-a-channel) a privte group channel while they don't need any to join a [public](#-3-private-vs-public) group channel. The maximum allowed number of operators per channel is 100.")
  @JsonProperty(JSON_PROPERTY_OPERATOR_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getOperatorIds() {
    return operatorIds;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
  }


  /**
   * Return true if this gcUpdateChannelByUrlData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcUpdateChannelByUrlData gcUpdateChannelByUrlData = (GcUpdateChannelByUrlData) o;
    return Objects.equals(this.channelUrl, gcUpdateChannelByUrlData.channelUrl) &&
        Objects.equals(this.name, gcUpdateChannelByUrlData.name) &&
        Objects.equals(this.coverUrl, gcUpdateChannelByUrlData.coverUrl) &&
        Objects.equals(this.coverFile, gcUpdateChannelByUrlData.coverFile) &&
        Objects.equals(this.customType, gcUpdateChannelByUrlData.customType) &&
        Objects.equals(this.data, gcUpdateChannelByUrlData.data) &&
        Objects.equals(this.isDistinct, gcUpdateChannelByUrlData.isDistinct) &&
        Objects.equals(this.isPublic, gcUpdateChannelByUrlData.isPublic) &&
        Objects.equals(this.accessCode, gcUpdateChannelByUrlData.accessCode) &&
        Objects.equals(this.operatorIds, gcUpdateChannelByUrlData.operatorIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, name, coverUrl, coverFile, customType, data, isDistinct, isPublic, accessCode, operatorIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcUpdateChannelByUrlData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    coverFile: ").append(toIndentedString(coverFile)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isDistinct: ").append(toIndentedString(isDistinct)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    operatorIds: ").append(toIndentedString(operatorIds)).append("\n");
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

