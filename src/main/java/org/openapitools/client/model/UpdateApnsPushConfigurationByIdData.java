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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * UpdateApnsPushConfigurationByIdData
 */
@JsonPropertyOrder({
  UpdateApnsPushConfigurationByIdData.JSON_PROPERTY_PROVIDER_ID,
  UpdateApnsPushConfigurationByIdData.JSON_PROPERTY_APNS_CERT,
  UpdateApnsPushConfigurationByIdData.JSON_PROPERTY_APNS_CERT_ENV_TYPE,
  UpdateApnsPushConfigurationByIdData.JSON_PROPERTY_APNS_CERT_PASSWORD,
  UpdateApnsPushConfigurationByIdData.JSON_PROPERTY_HAS_UNREAD_COUNT_BADGE,
  UpdateApnsPushConfigurationByIdData.JSON_PROPERTY_CONTENT_AVAILABLE,
  UpdateApnsPushConfigurationByIdData.JSON_PROPERTY_MUTABLE_CONTENT,
  UpdateApnsPushConfigurationByIdData.JSON_PROPERTY_PUSH_SOUND,
  UpdateApnsPushConfigurationByIdData.JSON_PROPERTY_APNS_TYPE
})
@JsonTypeName("updateApnsPushConfigurationByIdData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class UpdateApnsPushConfigurationByIdData {
  public static final String JSON_PROPERTY_PROVIDER_ID = "provider_id";
  private String providerId;

  public static final String JSON_PROPERTY_APNS_CERT = "apns_cert";
  private File apnsCert;

  public static final String JSON_PROPERTY_APNS_CERT_ENV_TYPE = "apns_cert_env_type";
  private String apnsCertEnvType;

  public static final String JSON_PROPERTY_APNS_CERT_PASSWORD = "apns_cert_password";
  private String apnsCertPassword;

  public static final String JSON_PROPERTY_HAS_UNREAD_COUNT_BADGE = "has_unread_count_badge";
  private Boolean hasUnreadCountBadge;

  public static final String JSON_PROPERTY_CONTENT_AVAILABLE = "content_available";
  private Boolean contentAvailable;

  public static final String JSON_PROPERTY_MUTABLE_CONTENT = "mutable_content";
  private Boolean mutableContent;

  public static final String JSON_PROPERTY_PUSH_SOUND = "push_sound";
  private String pushSound;

  public static final String JSON_PROPERTY_APNS_TYPE = "apns_type";
  private String apnsType;

  public UpdateApnsPushConfigurationByIdData() { 
  }

  public UpdateApnsPushConfigurationByIdData providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Specifies the provider ID of the push configuration to update.
   * @return providerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the provider ID of the push configuration to update.")
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProviderId() {
    return providerId;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }


  public UpdateApnsPushConfigurationByIdData apnsCert(File apnsCert) {
    this.apnsCert = apnsCert;
    return this;
  }

   /**
   * In a form of the &#x60;multipart/form-data&#x60; content type, specifies a [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) file of which type is either development or production. Sendbird server scans the content of the file, finds out the certificate type, and then registers the file as the corresponding type. If you upload a wrong file, you will receive an error. You should specify either this property or the apns_type below to inform the server of which certificate type to update.
   * @return apnsCert
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "In a form of the `multipart/form-data` content type, specifies a [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) file of which type is either development or production. Sendbird server scans the content of the file, finds out the certificate type, and then registers the file as the corresponding type. If you upload a wrong file, you will receive an error. You should specify either this property or the apns_type below to inform the server of which certificate type to update.")
  @JsonProperty(JSON_PROPERTY_APNS_CERT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public File getApnsCert() {
    return apnsCert;
  }


  @JsonProperty(JSON_PROPERTY_APNS_CERT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApnsCert(File apnsCert) {
    this.apnsCert = apnsCert;
  }


  public UpdateApnsPushConfigurationByIdData apnsCertEnvType(String apnsCertEnvType) {
    this.apnsCertEnvType = apnsCertEnvType;
    return this;
  }

   /**
   * Specifies the certificate type of the [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) file. Acceptable values are development and production. You should specify either this property or the apns_cert above to inform the server of which certificate type to update.
   * @return apnsCertEnvType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the certificate type of the [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) file. Acceptable values are development and production. You should specify either this property or the apns_cert above to inform the server of which certificate type to update.")
  @JsonProperty(JSON_PROPERTY_APNS_CERT_ENV_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApnsCertEnvType() {
    return apnsCertEnvType;
  }


  @JsonProperty(JSON_PROPERTY_APNS_CERT_ENV_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApnsCertEnvType(String apnsCertEnvType) {
    this.apnsCertEnvType = apnsCertEnvType;
  }


  public UpdateApnsPushConfigurationByIdData apnsCertPassword(String apnsCertPassword) {
    this.apnsCertPassword = apnsCertPassword;
    return this;
  }

   /**
   * Specifies the password of the cerfificate file which has been set during the [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) export.
   * @return apnsCertPassword
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the password of the cerfificate file which has been set during the [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) export.")
  @JsonProperty(JSON_PROPERTY_APNS_CERT_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApnsCertPassword() {
    return apnsCertPassword;
  }


  @JsonProperty(JSON_PROPERTY_APNS_CERT_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApnsCertPassword(String apnsCertPassword) {
    this.apnsCertPassword = apnsCertPassword;
  }


  public UpdateApnsPushConfigurationByIdData hasUnreadCountBadge(Boolean hasUnreadCountBadge) {
    this.hasUnreadCountBadge = hasUnreadCountBadge;
    return this;
  }

   /**
   * Determines whether to badge your client app&#39;s icon with the number of a user&#39;s unread messages. (Default: true)
   * @return hasUnreadCountBadge
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to badge your client app's icon with the number of a user's unread messages. (Default: true)")
  @JsonProperty(JSON_PROPERTY_HAS_UNREAD_COUNT_BADGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasUnreadCountBadge() {
    return hasUnreadCountBadge;
  }


  @JsonProperty(JSON_PROPERTY_HAS_UNREAD_COUNT_BADGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasUnreadCountBadge(Boolean hasUnreadCountBadge) {
    this.hasUnreadCountBadge = hasUnreadCountBadge;
  }


  public UpdateApnsPushConfigurationByIdData contentAvailable(Boolean contentAvailable) {
    this.contentAvailable = contentAvailable;
    return this;
  }

   /**
   * Determines for your client app whether to perform a silent background update on a user&#39;s device. For more information, see the Apple Developer Documentation&#39;s [Pushing Updates to Your App Silently](https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_updates_to_your_app_silently). (Default: false)
   * @return contentAvailable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines for your client app whether to perform a silent background update on a user's device. For more information, see the Apple Developer Documentation's [Pushing Updates to Your App Silently](https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_updates_to_your_app_silently). (Default: false)")
  @JsonProperty(JSON_PROPERTY_CONTENT_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getContentAvailable() {
    return contentAvailable;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContentAvailable(Boolean contentAvailable) {
    this.contentAvailable = contentAvailable;
  }


  public UpdateApnsPushConfigurationByIdData mutableContent(Boolean mutableContent) {
    this.mutableContent = mutableContent;
    return this;
  }

   /**
   * Determines for your client app whether or not to modify the payload of a push notification before it is displayed on a user&#39;s device. For more information, see the Apple Developer Documentation&#39;s [Modifying Content in Newly Delivered Notifications](https://developer.apple.com/documentation/usernotifications/modifying_content_in_newly_delivered_notifications). (Default: false)
   * @return mutableContent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines for your client app whether or not to modify the payload of a push notification before it is displayed on a user's device. For more information, see the Apple Developer Documentation's [Modifying Content in Newly Delivered Notifications](https://developer.apple.com/documentation/usernotifications/modifying_content_in_newly_delivered_notifications). (Default: false)")
  @JsonProperty(JSON_PROPERTY_MUTABLE_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getMutableContent() {
    return mutableContent;
  }


  @JsonProperty(JSON_PROPERTY_MUTABLE_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMutableContent(Boolean mutableContent) {
    this.mutableContent = mutableContent;
  }


  public UpdateApnsPushConfigurationByIdData pushSound(String pushSound) {
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file can be in the app&#39;s main bundle or in the &#x60;Library/Sounds&#x60; folder of the app&#39;s data container.
   * @return pushSound
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file can be in the app's main bundle or in the `Library/Sounds` folder of the app's data container.")
  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPushSound() {
    return pushSound;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  public UpdateApnsPushConfigurationByIdData apnsType(String apnsType) {
    this.apnsType = apnsType;
    return this;
  }

   /**
   * (Deprecated)  Specifies the certificate type of the [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) file. Acceptable values are development and production. You should specify either this property or the apns_cert above to inform the server of which certificate type to update.
   * @return apnsType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "(Deprecated)  Specifies the certificate type of the [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) file. Acceptable values are development and production. You should specify either this property or the apns_cert above to inform the server of which certificate type to update.")
  @JsonProperty(JSON_PROPERTY_APNS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApnsType() {
    return apnsType;
  }


  @JsonProperty(JSON_PROPERTY_APNS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApnsType(String apnsType) {
    this.apnsType = apnsType;
  }


  /**
   * Return true if this updateApnsPushConfigurationByIdData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateApnsPushConfigurationByIdData updateApnsPushConfigurationByIdData = (UpdateApnsPushConfigurationByIdData) o;
    return Objects.equals(this.providerId, updateApnsPushConfigurationByIdData.providerId) &&
        Objects.equals(this.apnsCert, updateApnsPushConfigurationByIdData.apnsCert) &&
        Objects.equals(this.apnsCertEnvType, updateApnsPushConfigurationByIdData.apnsCertEnvType) &&
        Objects.equals(this.apnsCertPassword, updateApnsPushConfigurationByIdData.apnsCertPassword) &&
        Objects.equals(this.hasUnreadCountBadge, updateApnsPushConfigurationByIdData.hasUnreadCountBadge) &&
        Objects.equals(this.contentAvailable, updateApnsPushConfigurationByIdData.contentAvailable) &&
        Objects.equals(this.mutableContent, updateApnsPushConfigurationByIdData.mutableContent) &&
        Objects.equals(this.pushSound, updateApnsPushConfigurationByIdData.pushSound) &&
        Objects.equals(this.apnsType, updateApnsPushConfigurationByIdData.apnsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, apnsCert, apnsCertEnvType, apnsCertPassword, hasUnreadCountBadge, contentAvailable, mutableContent, pushSound, apnsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateApnsPushConfigurationByIdData {\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    apnsCert: ").append(toIndentedString(apnsCert)).append("\n");
    sb.append("    apnsCertEnvType: ").append(toIndentedString(apnsCertEnvType)).append("\n");
    sb.append("    apnsCertPassword: ").append(toIndentedString(apnsCertPassword)).append("\n");
    sb.append("    hasUnreadCountBadge: ").append(toIndentedString(hasUnreadCountBadge)).append("\n");
    sb.append("    contentAvailable: ").append(toIndentedString(contentAvailable)).append("\n");
    sb.append("    mutableContent: ").append(toIndentedString(mutableContent)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
    sb.append("    apnsType: ").append(toIndentedString(apnsType)).append("\n");
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

