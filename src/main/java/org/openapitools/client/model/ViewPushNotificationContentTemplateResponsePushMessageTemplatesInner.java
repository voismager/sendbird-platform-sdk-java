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
 * ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner
 */
@JsonPropertyOrder({
  ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner.JSON_PROPERTY_TEMPLATE_NAME,
  ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner.JSON_PROPERTY_TEMPLATE,
  ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner.JSON_PROPERTY_PUSH_MESSAGE_PREVIEW
})
@JsonTypeName("viewPushNotificationContentTemplateResponse_push_message_templates_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
public class ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner {
  public static final String JSON_PROPERTY_TEMPLATE_NAME = "template_name";
  private String templateName;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate template;

  public static final String JSON_PROPERTY_PUSH_MESSAGE_PREVIEW = "push_message_preview";
  private ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate pushMessagePreview;

  public ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner() { 
  }

  public ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner templateName(String templateName) {
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


  public ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner template(ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate template) {
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


  public ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner pushMessagePreview(ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate pushMessagePreview) {
    this.pushMessagePreview = pushMessagePreview;
    return this;
  }

   /**
   * Get pushMessagePreview
   * @return pushMessagePreview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_MESSAGE_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate getPushMessagePreview() {
    return pushMessagePreview;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_MESSAGE_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushMessagePreview(ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate pushMessagePreview) {
    this.pushMessagePreview = pushMessagePreview;
  }


  /**
   * Return true if this viewPushNotificationContentTemplateResponse_push_message_templates_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner viewPushNotificationContentTemplateResponsePushMessageTemplatesInner = (ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner) o;
    return Objects.equals(this.templateName, viewPushNotificationContentTemplateResponsePushMessageTemplatesInner.templateName) &&
        Objects.equals(this.template, viewPushNotificationContentTemplateResponsePushMessageTemplatesInner.template) &&
        Objects.equals(this.pushMessagePreview, viewPushNotificationContentTemplateResponsePushMessageTemplatesInner.pushMessagePreview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateName, template, pushMessagePreview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner {\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    pushMessagePreview: ").append(toIndentedString(pushMessagePreview)).append("\n");
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

