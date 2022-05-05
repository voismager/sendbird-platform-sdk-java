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

/**
 * AddApnsPushConfigurationData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-05T15:12:57.551715+01:00[Europe/London]")
public class AddApnsPushConfigurationData {
  public static final String SERIALIZED_NAME_APNS_CERT = "apns_cert";
  @SerializedName(SERIALIZED_NAME_APNS_CERT)
  private File apnsCert;

  public static final String SERIALIZED_NAME_APNS_CERT_ENV_TYPE = "apns_cert_env_type";
  @SerializedName(SERIALIZED_NAME_APNS_CERT_ENV_TYPE)
  private String apnsCertEnvType;

  public static final String SERIALIZED_NAME_APNS_CERT_PASSWORD = "apns_cert_password";
  @SerializedName(SERIALIZED_NAME_APNS_CERT_PASSWORD)
  private String apnsCertPassword;

  public static final String SERIALIZED_NAME_HAS_UNREAD_COUNT_BADGE = "has_unread_count_badge";
  @SerializedName(SERIALIZED_NAME_HAS_UNREAD_COUNT_BADGE)
  private Boolean hasUnreadCountBadge;

  public static final String SERIALIZED_NAME_CONTENT_AVAILABLE = "content_available";
  @SerializedName(SERIALIZED_NAME_CONTENT_AVAILABLE)
  private Boolean contentAvailable;

  public static final String SERIALIZED_NAME_MUTABLE_CONTENT = "mutable_content";
  @SerializedName(SERIALIZED_NAME_MUTABLE_CONTENT)
  private Boolean mutableContent;

  public static final String SERIALIZED_NAME_PUSH_SOUND = "push_sound";
  @SerializedName(SERIALIZED_NAME_PUSH_SOUND)
  private String pushSound;

  public static final String SERIALIZED_NAME_APNS_TYPE = "apns_type";
  @SerializedName(SERIALIZED_NAME_APNS_TYPE)
  private String apnsType;

  public AddApnsPushConfigurationData() { 
  }

  public AddApnsPushConfigurationData apnsCert(File apnsCert) {
    
    this.apnsCert = apnsCert;
    return this;
  }

   /**
   * In a form of the &#x60;multipart/form-data&#x60; content type, specifies a [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) file of which type is either development or production. Sendbird server scans the content of the file, finds out the certificate type, and then registers the file as the corresponding type. If you upload a wrong file, you will receive an error.
   * @return apnsCert
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "In a form of the `multipart/form-data` content type, specifies a [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) file of which type is either development or production. Sendbird server scans the content of the file, finds out the certificate type, and then registers the file as the corresponding type. If you upload a wrong file, you will receive an error.")

  public File getApnsCert() {
    return apnsCert;
  }


  public void setApnsCert(File apnsCert) {
    this.apnsCert = apnsCert;
  }


  public AddApnsPushConfigurationData apnsCertEnvType(String apnsCertEnvType) {
    
    this.apnsCertEnvType = apnsCertEnvType;
    return this;
  }

   /**
   * Specifies the certificate type of the [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) file. Acceptable values are development and production. There is no need to specify this property when the apns_cert above is specified.
   * @return apnsCertEnvType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the certificate type of the [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) file. Acceptable values are development and production. There is no need to specify this property when the apns_cert above is specified.")

  public String getApnsCertEnvType() {
    return apnsCertEnvType;
  }


  public void setApnsCertEnvType(String apnsCertEnvType) {
    this.apnsCertEnvType = apnsCertEnvType;
  }


  public AddApnsPushConfigurationData apnsCertPassword(String apnsCertPassword) {
    
    this.apnsCertPassword = apnsCertPassword;
    return this;
  }

   /**
   * Specifies the password of the cerfificate file which has been set during the [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) export.
   * @return apnsCertPassword
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the password of the cerfificate file which has been set during the [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) export.")

  public String getApnsCertPassword() {
    return apnsCertPassword;
  }


  public void setApnsCertPassword(String apnsCertPassword) {
    this.apnsCertPassword = apnsCertPassword;
  }


  public AddApnsPushConfigurationData hasUnreadCountBadge(Boolean hasUnreadCountBadge) {
    
    this.hasUnreadCountBadge = hasUnreadCountBadge;
    return this;
  }

   /**
   * Determines whether to badge your client app&#39;s icon with the number of a user&#39;s unread messages. (Default: true)
   * @return hasUnreadCountBadge
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to badge your client app's icon with the number of a user's unread messages. (Default: true)")

  public Boolean getHasUnreadCountBadge() {
    return hasUnreadCountBadge;
  }


  public void setHasUnreadCountBadge(Boolean hasUnreadCountBadge) {
    this.hasUnreadCountBadge = hasUnreadCountBadge;
  }


  public AddApnsPushConfigurationData contentAvailable(Boolean contentAvailable) {
    
    this.contentAvailable = contentAvailable;
    return this;
  }

   /**
   * Determines for your client app whether to perform a silent background update on a user&#39;s device. For more information, see the Apple Developer Documentation&#39;s [Pushing Updates to Your App Silently](https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_updates_to_your_app_silently). (Default: false)
   * @return contentAvailable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines for your client app whether to perform a silent background update on a user's device. For more information, see the Apple Developer Documentation's [Pushing Updates to Your App Silently](https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_updates_to_your_app_silently). (Default: false)")

  public Boolean getContentAvailable() {
    return contentAvailable;
  }


  public void setContentAvailable(Boolean contentAvailable) {
    this.contentAvailable = contentAvailable;
  }


  public AddApnsPushConfigurationData mutableContent(Boolean mutableContent) {
    
    this.mutableContent = mutableContent;
    return this;
  }

   /**
   * Determines for your client app whether or not to modify the payload of a push notification before it is displayed on a user&#39;s device. For more information, see the Apple Developer Documentation&#39;s [Modifying Content in Newly Delivered Notifications](https://developer.apple.com/documentation/usernotifications/modifying_content_in_newly_delivered_notifications). (Default: false)
   * @return mutableContent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines for your client app whether or not to modify the payload of a push notification before it is displayed on a user's device. For more information, see the Apple Developer Documentation's [Modifying Content in Newly Delivered Notifications](https://developer.apple.com/documentation/usernotifications/modifying_content_in_newly_delivered_notifications). (Default: false)")

  public Boolean getMutableContent() {
    return mutableContent;
  }


  public void setMutableContent(Boolean mutableContent) {
    this.mutableContent = mutableContent;
  }


  public AddApnsPushConfigurationData pushSound(String pushSound) {
    
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file can be in the app&#39;s main bundle or in the &#x60;Library/Sounds&#x60; folder of the app&#39;s data container.
   * @return pushSound
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file can be in the app's main bundle or in the `Library/Sounds` folder of the app's data container.")

  public String getPushSound() {
    return pushSound;
  }


  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  public AddApnsPushConfigurationData apnsType(String apnsType) {
    
    this.apnsType = apnsType;
    return this;
  }

   /**
   * (Deprecated)  Specifies the certificate type of the [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) file. Acceptable values are development and production. You should specify either this property or the apns_cert above to inform the server of which certificate type to update.
   * @return apnsType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "(Deprecated)  Specifies the certificate type of the [.p12](/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) file. Acceptable values are development and production. You should specify either this property or the apns_cert above to inform the server of which certificate type to update.")

  public String getApnsType() {
    return apnsType;
  }


  public void setApnsType(String apnsType) {
    this.apnsType = apnsType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddApnsPushConfigurationData addApnsPushConfigurationData = (AddApnsPushConfigurationData) o;
    return Objects.equals(this.apnsCert, addApnsPushConfigurationData.apnsCert) &&
        Objects.equals(this.apnsCertEnvType, addApnsPushConfigurationData.apnsCertEnvType) &&
        Objects.equals(this.apnsCertPassword, addApnsPushConfigurationData.apnsCertPassword) &&
        Objects.equals(this.hasUnreadCountBadge, addApnsPushConfigurationData.hasUnreadCountBadge) &&
        Objects.equals(this.contentAvailable, addApnsPushConfigurationData.contentAvailable) &&
        Objects.equals(this.mutableContent, addApnsPushConfigurationData.mutableContent) &&
        Objects.equals(this.pushSound, addApnsPushConfigurationData.pushSound) &&
        Objects.equals(this.apnsType, addApnsPushConfigurationData.apnsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apnsCert, apnsCertEnvType, apnsCertPassword, hasUnreadCountBadge, contentAvailable, mutableContent, pushSound, apnsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddApnsPushConfigurationData {\n");
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

