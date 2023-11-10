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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * V3PollsPollIdVotePutRequest
 */
@JsonPropertyOrder({
  V3PollsPollIdVotePutRequest.JSON_PROPERTY_USER_ID,
  V3PollsPollIdVotePutRequest.JSON_PROPERTY_OPTION_IDS
})
@JsonTypeName("_v3_polls__poll_id__vote_put_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class V3PollsPollIdVotePutRequest {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_OPTION_IDS = "option_ids";
  private List<Integer> optionIds = null;

  public V3PollsPollIdVotePutRequest() { 
  }

  public V3PollsPollIdVotePutRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the unique ID of a user who casts or cancels a vote.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the unique ID of a user who casts or cancels a vote.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public V3PollsPollIdVotePutRequest optionIds(List<Integer> optionIds) {
    this.optionIds = optionIds;
    return this;
  }

  public V3PollsPollIdVotePutRequest addOptionIdsItem(Integer optionIdsItem) {
    if (this.optionIds == null) {
      this.optionIds = new ArrayList<>();
    }
    this.optionIds.add(optionIdsItem);
    return this;
  }

   /**
   * Specifies the array of option IDs to cast or cancel votes. For example, if a user had voted for both Option 1 and Option 2 in a poll, you can specify this property&#39;s value as [1,2]. If the user wants to cancel the vote for Option 2 but keep the vote for Option 1, the value should be specified as [1]. If the user wants to cancel the votes for both poll options, the value should be specified as [].
   * @return optionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the array of option IDs to cast or cancel votes. For example, if a user had voted for both Option 1 and Option 2 in a poll, you can specify this property's value as [1,2]. If the user wants to cancel the vote for Option 2 but keep the vote for Option 1, the value should be specified as [1]. If the user wants to cancel the votes for both poll options, the value should be specified as [].")
  @JsonProperty(JSON_PROPERTY_OPTION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getOptionIds() {
    return optionIds;
  }


  @JsonProperty(JSON_PROPERTY_OPTION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionIds(List<Integer> optionIds) {
    this.optionIds = optionIds;
  }


  /**
   * Return true if this _v3_polls__poll_id__vote_put_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3PollsPollIdVotePutRequest v3PollsPollIdVotePutRequest = (V3PollsPollIdVotePutRequest) o;
    return Objects.equals(this.userId, v3PollsPollIdVotePutRequest.userId) &&
        Objects.equals(this.optionIds, v3PollsPollIdVotePutRequest.optionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, optionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3PollsPollIdVotePutRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    optionIds: ").append(toIndentedString(optionIds)).append("\n");
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
