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
import org.openapitools.client.model.ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner
 */
@JsonPropertyOrder({
  ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner.JSON_PROPERTY_TEMPLATE_NAME,
  ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner.JSON_PROPERTY_TEMPLATE
})
@JsonTypeName("listPushNotificationContentTemplatesResponse_push_message_templates_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T12:28:02.899+09:00[Asia/Seoul]")
public class ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner {
  public static final String JSON_PROPERTY_TEMPLATE_NAME = "template_name";
  private String templateName;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate template;

  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner() { 
  }

  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTemplateName() {
    return templateName;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner template(ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplate(ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate template) {
    this.template = template;
  }


  /**
   * Return true if this listPushNotificationContentTemplatesResponse_push_message_templates_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner listPushNotificationContentTemplatesResponsePushMessageTemplatesInner = (ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner) o;
    return Objects.equals(this.templateName, listPushNotificationContentTemplatesResponsePushMessageTemplatesInner.templateName) &&
        Objects.equals(this.template, listPushNotificationContentTemplatesResponsePushMessageTemplatesInner.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateName, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner {\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

