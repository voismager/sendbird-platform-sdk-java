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
import org.openapitools.client.model.ChooseWhichEventsToSubscribeToResponseWebhook;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ChooseWhichEventsToSubscribeToResponse
 */
@JsonPropertyOrder({
  ChooseWhichEventsToSubscribeToResponse.JSON_PROPERTY_WEBHOOK
})
@JsonTypeName("chooseWhichEventsToSubscribeToResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T11:44:36.129327+09:00[Asia/Seoul]")
public class ChooseWhichEventsToSubscribeToResponse {
  public static final String JSON_PROPERTY_WEBHOOK = "webhook";
  private ChooseWhichEventsToSubscribeToResponseWebhook webhook;

  public ChooseWhichEventsToSubscribeToResponse() { 
  }

  public ChooseWhichEventsToSubscribeToResponse webhook(ChooseWhichEventsToSubscribeToResponseWebhook webhook) {
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEBHOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChooseWhichEventsToSubscribeToResponseWebhook getWebhook() {
    return webhook;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhook(ChooseWhichEventsToSubscribeToResponseWebhook webhook) {
    this.webhook = webhook;
  }


  /**
   * Return true if this chooseWhichEventsToSubscribeToResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChooseWhichEventsToSubscribeToResponse chooseWhichEventsToSubscribeToResponse = (ChooseWhichEventsToSubscribeToResponse) o;
    return Objects.equals(this.webhook, chooseWhichEventsToSubscribeToResponse.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChooseWhichEventsToSubscribeToResponse {\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

