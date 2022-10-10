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


package org.sendbird.client.api;

import org.sendbird.client.*;
import org.sendbird.client.auth.*;
import org.openapitools.client.model.AddApnsPushConfigurationData;
import org.openapitools.client.model.AddApnsPushConfigurationResponse;
import org.openapitools.client.model.AddFcmPushConfigurationData;
import org.openapitools.client.model.AddFcmPushConfigurationResponse;
import org.openapitools.client.model.AddHmsPushConfigurationData;
import org.openapitools.client.model.AddHmsPushConfigurationResponse;
import org.openapitools.client.model.AddIpToWhitelistData;
import org.openapitools.client.model.AddIpToWhitelistResponse;
import org.openapitools.client.model.BanUsersInChannelsWithCustomChannelTypeData;
import org.openapitools.client.model.CustomTypeListBannedUsersResponse;
import org.openapitools.client.model.DeleteAllowedIpsFromWhitelistResponse;
import org.openapitools.client.model.DeleteApnsCertificateByIdResponse;
import org.openapitools.client.model.GenerateSecondaryApiTokenData;
import org.openapitools.client.model.GenerateSecondaryApiTokenResponse;
import org.openapitools.client.model.ListMutedUsersInChannelsWithCustomChannelType200Response;
import org.openapitools.client.model.ListPushConfigurationsResponse;
import org.openapitools.client.model.ListPushNotificationContentTemplatesResponse;
import org.openapitools.client.model.ListSecondaryApiTokensResponse;
import org.openapitools.client.model.MuteUsersInChannelsWithCustomChannelTypeData;
import org.openapitools.client.model.RemovePushConfigurationByIdResponse;
import org.openapitools.client.model.RetrieveIpWhitelistResponse;
import org.openapitools.client.model.RevokeSecondaryApiTokenByTokenResponse;
import org.openapitools.client.model.SendBirdChannelResponse;
import org.openapitools.client.model.SetDomainFilterData;
import org.openapitools.client.model.UpdateApnsPushConfigurationByIdData;
import org.openapitools.client.model.UpdateApnsPushConfigurationByIdResponse;
import org.openapitools.client.model.UpdateDefaultChannelInvitationPreferenceData;
import org.openapitools.client.model.UpdateDefaultChannelInvitationPreferenceResponse;
import org.openapitools.client.model.UpdateFcmPushConfigurationByIdData;
import org.openapitools.client.model.UpdateFcmPushConfigurationByIdResponse;
import org.openapitools.client.model.UpdateHmsPushConfigurationByIdData;
import org.openapitools.client.model.UpdateHmsPushConfigurationByIdResponse;
import org.openapitools.client.model.UpdatePushNotificationContentTemplateData;
import org.openapitools.client.model.UpdatePushNotificationContentTemplateResponse;
import org.openapitools.client.model.ViewDefaultChannelInvitationPreferenceResponse;
import org.openapitools.client.model.ViewPushConfigurationByIdResponse;
import org.openapitools.client.model.ViewPushNotificationContentTemplateResponse;
import org.openapitools.client.model.ViewSecondaryApiTokenByTokenResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationApi
 */
public class ApplicationApiTest {

    private final ApplicationApi api = new ApplicationApi();

    /**
     * Add an APNs push configuration
     *
     * ## Add an APNs push configuration  Registers an APNs (Apple Push Notification service) push configuration for your client app. To send push notifications to iOS devices, your should first register the APNs push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  &gt; __Note__: To upload a [.p12](https://sendbird.com/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) certificate file to Sendbird server, you should send a [Multipart request](https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api#2-headers-3-multipart-requests).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-apns-push-configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addApnsPushConfigurationTest() throws ApiException {
        //String apiToken = null;
        //AddApnsPushConfigurationData addApnsPushConfigurationData = null;
        //AddApnsPushConfigurationResponse response = api.addApnsPushConfiguration(apiToken, addApnsPushConfigurationData);
        // TODO: test validations
    }

    /**
     * Add a FCM push configuration
     *
     * ## Add a FCM push configuration  Registers a FCM (Firebase Cloud Messaging) push configuration for your client app. To send push notifications to Android devices, you should first register the FCM push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-a-fcm-push-configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addFcmPushConfigurationTest() throws ApiException {
        //String apiToken = null;
        //AddFcmPushConfigurationData addFcmPushConfigurationData = null;
        //AddFcmPushConfigurationResponse response = api.addFcmPushConfiguration(apiToken, addFcmPushConfigurationData);
        // TODO: test validations
    }

    /**
     * Add an HMS push configuration
     *
     * ## Add an HMS push configuration  Registers an HMS (Huawei Mobile Services) push configuration for your client app. To send push notifications to Android devices for HMS, you should first register the HMS push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-hms-push-configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addHmsPushConfigurationTest() throws ApiException {
        //String apiToken = null;
        //AddHmsPushConfigurationData addHmsPushConfigurationData = null;
        //AddHmsPushConfigurationResponse response = api.addHmsPushConfiguration(apiToken, addHmsPushConfigurationData);
        // TODO: test validations
    }

    /**
     * Add an IP to a whitelist
     *
     * ## Add an IP to a whitelist  Adds IP addresses and ranges to your Sendbird application settings. Both currently added and any previously added IPs are granted API access. You can configure the IP whitelist under Settings &gt; Security &gt; Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-ip-to-a-whitelist
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addIpToWhitelistTest() throws ApiException {
        //String apiToken = null;
        //AddIpToWhitelistData addIpToWhitelistData = null;
        //AddIpToWhitelistResponse response = api.addIpToWhitelist(apiToken, addIpToWhitelistData);
        // TODO: test validations
    }

    /**
     * Ban users in channels with a custom channel type
     *
     * ## Ban specified users in channels with a custom channel type at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void banUsersInChannelsWithCustomChannelTypeTest() throws ApiException {
        //String apiToken = null;
        //String customType = null;
        //BanUsersInChannelsWithCustomChannelTypeData banUsersInChannelsWithCustomChannelTypeData = null;
        //Object response = api.banUsersInChannelsWithCustomChannelType(apiToken, customType, banUsersInChannelsWithCustomChannelTypeData);
        // TODO: test validations
    }

    /**
     * Delete allowed IPs from a whitelist
     *
     * ## Delete allowed IPs from a whitelist  Deletes allowed IPs from the whitelist by specifying their IP addresses or ranges. You can configure the IP whitelist under Settings &gt; Security &gt; Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-delete-allowed-ips-from-a-whitelist
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAllowedIpsFromWhitelistTest() throws ApiException {
        //String apiToken = null;
        //List<String> ipWhitelistAddresses = null;
        //DeleteAllowedIpsFromWhitelistResponse response = api.deleteAllowedIpsFromWhitelist(apiToken, ipWhitelistAddresses);
        // TODO: test validations
    }

    /**
     * Delete an APNs certificate
     *
     * ## Delete an APNs certificate  Deletes a specific APNs certificate.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-delete-an-apns-certificate ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteApnsCertificateByIdTest() throws ApiException {
        //String apiToken = null;
        //String providerId = null;
        //DeleteApnsCertificateByIdResponse response = api.deleteApnsCertificateById(apiToken, providerId);
        // TODO: test validations
    }

    /**
     * Generate a secondary API token
     *
     * ## Generate a secondary API token  Generates a new secondary API token.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-generate-a-secondary-api-token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateSecondaryApiTokenTest() throws ApiException {
        //String apiToken = null;
        //GenerateSecondaryApiTokenData generateSecondaryApiTokenData = null;
        //GenerateSecondaryApiTokenResponse response = api.generateSecondaryApiToken(apiToken, generateSecondaryApiTokenData);
        // TODO: test validations
    }

    /**
     * List banned users in channels with a custom channel type
     *
     * ## Retrieves a list of users banned from channels with the specified custom channel type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBannedUsersInChannelsWithCustomChannelTypeTest() throws ApiException {
        //String apiToken = null;
        //String customType = null;
        //String token = null;
        //Integer limit = null;
        //CustomTypeListBannedUsersResponse response = api.listBannedUsersInChannelsWithCustomChannelType(apiToken, customType, token, limit);
        // TODO: test validations
    }

    /**
     * List muted users in channels with a custom channel type
     *
     * ## Retrieves a list of the muted users in channels with a custom channel type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMutedUsersInChannelsWithCustomChannelTypeTest() throws ApiException {
        //String apiToken = null;
        //String customType = null;
        //String token = null;
        //Integer limit = null;
        //ListMutedUsersInChannelsWithCustomChannelType200Response response = api.listMutedUsersInChannelsWithCustomChannelType(apiToken, customType, token, limit);
        // TODO: test validations
    }

    /**
     * List push configurations
     *
     * ## List push configurations  Retrieves a list of an application&#39;s registered push configurations.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-push-configurations ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPushConfigurationsTest() throws ApiException {
        //String apiToken = null;
        //String pushType = null;
        //ListPushConfigurationsResponse response = api.listPushConfigurations(apiToken, pushType);
        // TODO: test validations
    }

    /**
     * List push notification content templates
     *
     * ## List push notification content templates  Retrieves a list of push notification content templates of an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-push-notification-content-templates
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPushNotificationContentTemplatesTest() throws ApiException {
        //String apiToken = null;
        //ListPushNotificationContentTemplatesResponse response = api.listPushNotificationContentTemplates(apiToken);
        // TODO: test validations
    }

    /**
     * List secondary API tokens
     *
     * ## List secondary API tokens  Retrieves a list of secondary API tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-secondary-api-tokens
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSecondaryApiTokensTest() throws ApiException {
        //String apiToken = null;
        //ListSecondaryApiTokensResponse response = api.listSecondaryApiTokens(apiToken);
        // TODO: test validations
    }

    /**
     * Mute users in channels with a custom channel type
     *
     * ## Mutes specified users in channels with a custom channel type at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void muteUsersInChannelsWithCustomChannelTypeTest() throws ApiException {
        //String apiToken = null;
        //String customType = null;
        //MuteUsersInChannelsWithCustomChannelTypeData muteUsersInChannelsWithCustomChannelTypeData = null;
        //Object response = api.muteUsersInChannelsWithCustomChannelType(apiToken, customType, muteUsersInChannelsWithCustomChannelTypeData);
        // TODO: test validations
    }

    /**
     * Remove a push configuration
     *
     * ## Remove a push configuration  Removes a specific push configuration from an application. The type of a push configuration is either &#x60;fcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-remove-a-push-configuration ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removePushConfigurationByIdTest() throws ApiException {
        //String apiToken = null;
        //String pushType = null;
        //String providerId = null;
        //RemovePushConfigurationByIdResponse response = api.removePushConfigurationById(apiToken, pushType, providerId);
        // TODO: test validations
    }

    /**
     * Retrieve an IP whitelist
     *
     * ## Retrieve an IP whitelist  Retrieves a list of all the IP ranges and addresses that have access to your Sendbird application. This list is called an IP whitelist and its addresses are granted API access when the IP whitelist API enables [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notations.  If you specify which IP addresses or ranges to include in the whitelist, any unlisted foreign IP addresses will be denied access. If you don&#39;t specify any IP address or range to include in the whitelist, all IP addresses will be granted API access. You can configure the IP whitelist under Settings &gt; Security &gt; Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-retrieve-an-ip-whitelist
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveIpWhitelistTest() throws ApiException {
        //String apiToken = null;
        //RetrieveIpWhitelistResponse response = api.retrieveIpWhitelist(apiToken);
        // TODO: test validations
    }

    /**
     * Revoke a secondary API token
     *
     * ## Revoke a secondary API token  Revokes a secondary API token.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-revoke-a-secondary-api-token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeSecondaryApiTokenByTokenTest() throws ApiException {
        //String apiToken = null;
        //String apiToken2 = null;
        //RevokeSecondaryApiTokenByTokenResponse response = api.revokeSecondaryApiTokenByToken(apiToken, apiToken2);
        // TODO: test validations
    }

    /**
     * Message moderation
     *
     * ## 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setDomainFilterTest() throws ApiException {
        //String apiToken = null;
        //String customType = null;
        //SetDomainFilterData setDomainFilterData = null;
        //SendBirdChannelResponse response = api.setDomainFilter(apiToken, customType, setDomainFilterData);
        // TODO: test validations
    }

    /**
     * Unban users in channels with a custom channel type
     *
     * ## Unban specified users in channels with a custom channel type at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unbanUsersInChannelsWithCustomChannelTypeTest() throws ApiException {
        //String apiToken = null;
        //String customType = null;
        //List<String> userIds = null;
        //Object response = api.unbanUsersInChannelsWithCustomChannelType(apiToken, customType, userIds);
        // TODO: test validations
    }

    /**
     * Unmute users in channels with a custom channel type
     *
     * ## Unmute specified users in channels with a custom channel type at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unmuteUsersInChannelsWithCustomChannelTypeTest() throws ApiException {
        //String apiToken = null;
        //String customType = null;
        //List<String> userIds = null;
        //Object response = api.unmuteUsersInChannelsWithCustomChannelType(apiToken, customType, userIds);
        // TODO: test validations
    }

    /**
     * Update an APNs push configuration
     *
     * ## Update an APNs push configuration  Updates a specific APNs (Apple Push Notification service) push configuration for your client app. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  &gt; __Note__: If your HTTP request body contains a [.p12](https://sendbird.com/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) certificate file to upload to Sendbird server, you should send a [Multipart request](https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api#2-headers-3-multipart-requests) .  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-an-apns-push-configuration ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateApnsPushConfigurationByIdTest() throws ApiException {
        //String apiToken = null;
        //String providerId = null;
        //UpdateApnsPushConfigurationByIdData updateApnsPushConfigurationByIdData = null;
        //UpdateApnsPushConfigurationByIdResponse response = api.updateApnsPushConfigurationById(apiToken, providerId, updateApnsPushConfigurationByIdData);
        // TODO: test validations
    }

    /**
     * Update default channel invitation preference
     *
     * ## Update default channel invitation preference  Updates the default channel invitation preference of an application.  &gt; __Note__: Using the [update channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action, you can update the value of a specific user&#39;s channel invitation preference, which can be set individually by user.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDefaultChannelInvitationPreferenceTest() throws ApiException {
        //String apiToken = null;
        //UpdateDefaultChannelInvitationPreferenceData updateDefaultChannelInvitationPreferenceData = null;
        //UpdateDefaultChannelInvitationPreferenceResponse response = api.updateDefaultChannelInvitationPreference(apiToken, updateDefaultChannelInvitationPreferenceData);
        // TODO: test validations
    }

    /**
     * Update a FCM push configuration
     *
     * ## Update a FCM push configuration  Updates a specific FCM (Firebase Cloud Messaging) push configuration for your client app. You can also update the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-a-fcm-push-configuration ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateFcmPushConfigurationByIdTest() throws ApiException {
        //String apiToken = null;
        //String providerId = null;
        //UpdateFcmPushConfigurationByIdData updateFcmPushConfigurationByIdData = null;
        //UpdateFcmPushConfigurationByIdResponse response = api.updateFcmPushConfigurationById(apiToken, providerId, updateFcmPushConfigurationByIdData);
        // TODO: test validations
    }

    /**
     * Update an HMS push configuration
     *
     * ## Update an HMS push configuration  Updates a specific HMS (Huawei Mobile Services) push configuration for your client app. You can also update the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-an-hms-push-configuration ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateHmsPushConfigurationByIdTest() throws ApiException {
        //String apiToken = null;
        //String providerId = null;
        //UpdateHmsPushConfigurationByIdData updateHmsPushConfigurationByIdData = null;
        //UpdateHmsPushConfigurationByIdResponse response = api.updateHmsPushConfigurationById(apiToken, providerId, updateHmsPushConfigurationByIdData);
        // TODO: test validations
    }

    /**
     * Update a push notification content template
     *
     * ## Update a push notification content template  Updates a specific push notification content template of an application. The name of a content template is either &#x60;default&#x60; or &#x60;alternative&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-a-push-notification-content-template ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePushNotificationContentTemplateTest() throws ApiException {
        //String apiToken = null;
        //String templateName = null;
        //UpdatePushNotificationContentTemplateData updatePushNotificationContentTemplateData = null;
        //UpdatePushNotificationContentTemplateResponse response = api.updatePushNotificationContentTemplate(apiToken, templateName, updatePushNotificationContentTemplateData);
        // TODO: test validations
    }

    /**
     * View default channel invitation preference
     *
     * ## View default channel invitation preference  Retrieves the default channel invitation preference of an application.  &gt; __Note__: Using the [view channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-channel-invitation-preference) action, you can retrieve the value of a specific user&#39;s channel invitation preference, which can be set individually by user.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-default-channel-invitation-preference
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewDefaultChannelInvitationPreferenceTest() throws ApiException {
        //String apiToken = null;
        //ViewDefaultChannelInvitationPreferenceResponse response = api.viewDefaultChannelInvitationPreference(apiToken);
        // TODO: test validations
    }

    /**
     * View a push configuration
     *
     * ## View a push configuration  Retrieves a specific push configuration of an application. The type of a push configuration is either &#x60;fcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-push-configuration ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewPushConfigurationByIdTest() throws ApiException {
        //String apiToken = null;
        //String pushType = null;
        //String providerId = null;
        //ViewPushConfigurationByIdResponse response = api.viewPushConfigurationById(apiToken, pushType, providerId);
        // TODO: test validations
    }

    /**
     * View a push notification content template
     *
     * ## View a push notification content template  Retrieves information on a specific push notification content templates of an application. The name of a content template is either &#x60;default&#x60; or &#x60;alternative&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-push-notification-content-template ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewPushNotificationContentTemplateTest() throws ApiException {
        //String apiToken = null;
        //String templateName = null;
        //ViewPushNotificationContentTemplateResponse response = api.viewPushNotificationContentTemplate(apiToken, templateName);
        // TODO: test validations
    }

    /**
     * View a secondary API token
     *
     * ## View a secondary API token  Retrieves the information on a secondary API token.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-secondary-api-token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewSecondaryApiTokenByTokenTest() throws ApiException {
        //String apiToken = null;
        //String apiToken2 = null;
        //ViewSecondaryApiTokenByTokenResponse response = api.viewSecondaryApiTokenByToken(apiToken, apiToken2);
        // TODO: test validations
    }

}
