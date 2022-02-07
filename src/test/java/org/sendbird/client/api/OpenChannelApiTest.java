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


package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.openapitools.client.model.InlineResponse20030;
import org.openapitools.client.model.InlineResponse20031;
import org.openapitools.client.model.InlineResponse20032;
import org.openapitools.client.model.InlineResponse20033;
import org.openapitools.client.model.InlineResponse20033BannedList;
import org.openapitools.client.model.InlineResponse20034;
import org.openapitools.client.model.InlineResponse20035;
import org.openapitools.client.model.OcBanUserData;
import org.openapitools.client.model.OcCreateChannelData;
import org.openapitools.client.model.OcFreezeChannelData;
import org.openapitools.client.model.OcMuteUserData;
import org.openapitools.client.model.OcRegisterOperatorsData;
import org.openapitools.client.model.OcUpdateBanByIdData;
import org.openapitools.client.model.OcUpdateChannelByUrlData;
import org.openapitools.client.model.SendBirdOpenChannel;
import org.openapitools.client.model.SendBirdUser;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OpenChannelApi
 */
@Ignore
public class OpenChannelApiTest {

    private final OpenChannelApi api = new OpenChannelApi();

    
    /**
     * Ban a user
     *
     * ## Ban a user  Bans a user from an open channel. A banned user is immediately expelled from a channel and allowed to participate in the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-ban-a-user ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocBanUserTest() throws ApiException {
        String channelUrl = null;
        String apiToken = null;
        OcBanUserData ocBanUserData = null;
                InlineResponse20033BannedList response = api.ocBanUser(channelUrl, apiToken, ocBanUserData);
        // TODO: test validations
    }
    
    /**
     * Cancel the registration of operators
     *
     * ## Cancel the registration of operators  Cancels the registration of operators from an open channel but leave them as participants.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-cancel-the-registration-of-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to cancel the registration of operators.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocCancelTheRegistrationOfOperatorsTest() throws ApiException {
        String channelUrl = null;
        List<String> operatorIds = null;
        String apiToken = null;
        Boolean deleteAll = null;
                api.ocCancelTheRegistrationOfOperators(channelUrl, operatorIds, apiToken, deleteAll);
        // TODO: test validations
    }
    
    /**
     * Create a channel
     *
     * ## Create a channel  Creates an open channel.  &gt;__Note__: Classic open channels created before the deprecation date of March 2021 will maintain their original form and functions. However, new applications created after December 15, 2020, will be able to create dynamic partitioning open channels only.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocCreateChannelTest() throws ApiException {
        String apiToken = null;
        OcCreateChannelData ocCreateChannelData = null;
                SendBirdOpenChannel response = api.ocCreateChannel(apiToken, ocCreateChannelData);
        // TODO: test validations
    }
    
    /**
     * Delete a channel
     *
     * ## Delete a channel  Deletes an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-delete-a-channel ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocDeleteChannelByUrlTest() throws ApiException {
        String channelUrl = null;
        String apiToken = null;
                api.ocDeleteChannelByUrl(channelUrl, apiToken);
        // TODO: test validations
    }
    
    /**
     * Freeze a channel
     *
     * ## Freeze a channel  Freezes or unfreezes an open channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-freeze-a-channel ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocFreezeChannelTest() throws ApiException {
        String channelUrl = null;
        String apiToken = null;
        OcFreezeChannelData ocFreezeChannelData = null;
                SendBirdOpenChannel response = api.ocFreezeChannel(channelUrl, apiToken, ocFreezeChannelData);
        // TODO: test validations
    }
    
    /**
     * List banned users
     *
     * ## List banned users  Retrieves a list of banned users from a specific open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocListBannedUsersTest() throws ApiException {
        String channelUrl = null;
        String apiToken = null;
        String token = null;
        Integer limit = null;
                InlineResponse20033 response = api.ocListBannedUsers(channelUrl, apiToken, token, limit);
        // TODO: test validations
    }
    
    /**
     * List channels
     *
     * ## List channels  Retrieves a list of open channels. You can query the list using various parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-channels ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocListChannelsTest() throws ApiException {
        String apiToken = null;
        String token = null;
        Integer limit = null;
        String customTypes = null;
        String nameContains = null;
        String urlContains = null;
        Boolean showFrozen = null;
        Boolean showMetadata = null;
        String customType = null;
                InlineResponse20030 response = api.ocListChannels(apiToken, token, limit, customTypes, nameContains, urlContains, showFrozen, showMetadata, customType);
        // TODO: test validations
    }
    
    /**
     * List muted users
     *
     * ## List muted users  Retrieves a list of muted users in the channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocListMutedUsersTest() throws ApiException {
        String channelUrl = null;
        String apiToken = null;
        String token = null;
        Integer limit = null;
                InlineResponse20031 response = api.ocListMutedUsers(channelUrl, apiToken, token, limit);
        // TODO: test validations
    }
    
    /**
     * List operators
     *
     * ## List operators  Retrieves a list of operators of an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of operators.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocListOperatorsTest() throws ApiException {
        String channelUrl = null;
        String apiToken = null;
        String token = null;
        Integer limit = null;
                InlineResponse20034 response = api.ocListOperators(channelUrl, apiToken, token, limit);
        // TODO: test validations
    }
    
    /**
     * List participants
     *
     * ## List participants  Retrieves a list of the participants of an open channel. A participant refers to a user who has entered the open channel and is currently online.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-participants ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of participants in.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocListParticipantsTest() throws ApiException {
        String channelUrl = null;
        String apiToken = null;
        String token = null;
        Integer limit = null;
                InlineResponse20032 response = api.ocListParticipants(channelUrl, apiToken, token, limit);
        // TODO: test validations
    }
    
    /**
     * Mute a user
     *
     * ## Mute a user  Mutes a user in the channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-mute-a-user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocMuteUserTest() throws ApiException {
        String channelUrl = null;
        String apiToken = null;
        OcMuteUserData ocMuteUserData = null;
                SendBirdOpenChannel response = api.ocMuteUser(channelUrl, apiToken, ocMuteUserData);
        // TODO: test validations
    }
    
    /**
     * Register operators
     *
     * ## Register operators  Registers one or more operators to an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-register-operators ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocRegisterOperatorsTest() throws ApiException {
        String channelUrl = null;
        String apiToken = null;
        OcRegisterOperatorsData ocRegisterOperatorsData = null;
                api.ocRegisterOperators(channelUrl, apiToken, ocRegisterOperatorsData);
        // TODO: test validations
    }
    
    /**
     * Unban a user
     *
     * ## Unban a user  Unbans a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unban-a-user ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocUnbanUserByIdTest() throws ApiException {
        String channelUrl = null;
        String bannedUserId = null;
        String apiToken = null;
                api.ocUnbanUserById(channelUrl, bannedUserId, apiToken);
        // TODO: test validations
    }
    
    /**
     * Unmute a user
     *
     * ## Unmute a user  Unmutes a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unmute-a-user ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocUnmuteUserByIdTest() throws ApiException {
        String channelUrl = null;
        String mutedUserId = null;
        String apiToken = null;
                api.ocUnmuteUserById(channelUrl, mutedUserId, apiToken);
        // TODO: test validations
    }
    
    /**
     * Update a ban
     *
     * ## Update a ban  Updates details of a ban imposed on a user. You can change the length of a ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-ban ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocUpdateBanByIdTest() throws ApiException {
        String channelUrl = null;
        String bannedUserId = null;
        String apiToken = null;
        OcUpdateBanByIdData ocUpdateBanByIdData = null;
                SendBirdUser response = api.ocUpdateBanById(channelUrl, bannedUserId, apiToken, ocUpdateBanByIdData);
        // TODO: test validations
    }
    
    /**
     * Update a channel
     *
     * ## Update a channel  Updates information on an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-channel ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocUpdateChannelByUrlTest() throws ApiException {
        String channelUrl = null;
        String apiToken = null;
        OcUpdateChannelByUrlData ocUpdateChannelByUrlData = null;
                SendBirdOpenChannel response = api.ocUpdateChannelByUrl(channelUrl, apiToken, ocUpdateChannelByUrlData);
        // TODO: test validations
    }
    
    /**
     * View a ban
     *
     * ## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-ban ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocViewBanByIdTest() throws ApiException {
        String channelUrl = null;
        String bannedUserId = null;
        String apiToken = null;
                SendBirdUser response = api.ocViewBanById(channelUrl, bannedUserId, apiToken);
        // TODO: test validations
    }
    
    /**
     * View a channel
     *
     * ## View a channel  Retrieves information on a specific open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-channel ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocViewChannelByUrlTest() throws ApiException {
        String channelUrl = null;
        String apiToken = null;
                SendBirdOpenChannel response = api.ocViewChannelByUrl(channelUrl, apiToken);
        // TODO: test validations
    }
    
    /**
     * View a mute
     *
     * ## View a mute  Checks if a user is muted in an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-mute ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ocViewMuteByIdTest() throws ApiException {
        String channelUrl = null;
        String mutedUserId = null;
        String apiToken = null;
                InlineResponse20035 response = api.ocViewMuteById(channelUrl, mutedUserId, apiToken);
        // TODO: test validations
    }
    
}
