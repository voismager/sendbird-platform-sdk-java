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
import org.openapitools.client.model.V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * V3PollsPollIdOptionsOptionIdVotersGet200Response
 */
@JsonPropertyOrder({
  V3PollsPollIdOptionsOptionIdVotersGet200Response.JSON_PROPERTY_VOTE_COUNT,
  V3PollsPollIdOptionsOptionIdVotersGet200Response.JSON_PROPERTY_VOTERS,
  V3PollsPollIdOptionsOptionIdVotersGet200Response.JSON_PROPERTY_NEXT
})
@JsonTypeName("_v3_polls__poll_id__options__option_id__voters_get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T13:07:19.585435+09:00[Asia/Seoul]")
public class V3PollsPollIdOptionsOptionIdVotersGet200Response {
  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private Integer voteCount;

  public static final String JSON_PROPERTY_VOTERS = "voters";
  private List<V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner> voters = null;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public V3PollsPollIdOptionsOptionIdVotersGet200Response() { 
  }

  public V3PollsPollIdOptionsOptionIdVotersGet200Response voteCount(Integer voteCount) {
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVoteCount() {
    return voteCount;
  }


  @JsonProperty(JSON_PROPERTY_VOTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }


  public V3PollsPollIdOptionsOptionIdVotersGet200Response voters(List<V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner> voters) {
    this.voters = voters;
    return this;
  }

  public V3PollsPollIdOptionsOptionIdVotersGet200Response addVotersItem(V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner votersItem) {
    if (this.voters == null) {
      this.voters = new ArrayList<>();
    }
    this.voters.add(votersItem);
    return this;
  }

   /**
   * Get voters
   * @return voters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner> getVoters() {
    return voters;
  }


  @JsonProperty(JSON_PROPERTY_VOTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoters(List<V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner> voters) {
    this.voters = voters;
  }


  public V3PollsPollIdOptionsOptionIdVotersGet200Response next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(String next) {
    this.next = next;
  }


  /**
   * Return true if this _v3_polls__poll_id__options__option_id__voters_get_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3PollsPollIdOptionsOptionIdVotersGet200Response v3PollsPollIdOptionsOptionIdVotersGet200Response = (V3PollsPollIdOptionsOptionIdVotersGet200Response) o;
    return Objects.equals(this.voteCount, v3PollsPollIdOptionsOptionIdVotersGet200Response.voteCount) &&
        Objects.equals(this.voters, v3PollsPollIdOptionsOptionIdVotersGet200Response.voters) &&
        Objects.equals(this.next, v3PollsPollIdOptionsOptionIdVotersGet200Response.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voteCount, voters, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3PollsPollIdOptionsOptionIdVotersGet200Response {\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    voters: ").append(toIndentedString(voters)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

