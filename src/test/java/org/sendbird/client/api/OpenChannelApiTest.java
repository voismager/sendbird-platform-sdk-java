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
import org.openapitools.client.model.OcCreateChannelData;
import org.openapitools.client.model.OcDeleteChannelByUrl200Response;
import org.openapitools.client.model.OcListChannelsResponse;
import org.openapitools.client.model.OcListOperatorsResponse;
import org.openapitools.client.model.OcListParticipantsResponse;
import org.openapitools.client.model.OcRegisterOperatorsData;
import org.openapitools.client.model.OcUpdateChannelByUrlData;
import org.openapitools.client.model.SendBirdOpenChannel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OpenChannelApi
 */
public class OpenChannelApiTest {

    private final OpenChannelApi api = new OpenChannelApi();

    /**
     * Cancel the registration of operators
     *
     * ## Cancel the registration of operators  Cancels the registration of operators from an open channel but leave them as participants.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-cancel-the-registration-of-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to cancel the registration of operators.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocCancelTheRegistrationOfOperatorsTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //List<String> operatorIds = null;
        //Boolean deleteAll = null;
        //api.ocCancelTheRegistrationOfOperators(apiToken, channelUrl, operatorIds, deleteAll);
        // TODO: test validations
    }

    /**
     * Create a channel
     *
     * ## Create a channel  Creates an open channel.  &gt;__Note__: Classic open channels created before the deprecation date of March 2021 will maintain their original form and functions. However, new applications created after December 15, 2020, will be able to create dynamic partitioning open channels only.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocCreateChannelTest() throws ApiException {
        //String apiToken = null;
        //OcCreateChannelData ocCreateChannelData = null;
        //SendBirdOpenChannel response = api.ocCreateChannel(apiToken, ocCreateChannelData);
        // TODO: test validations
    }

    /**
     * Delete a channel
     *
     * ## Delete a channel  Deletes an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-delete-a-channel ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocDeleteChannelByUrlTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //OcDeleteChannelByUrl200Response response = api.ocDeleteChannelByUrl(apiToken, channelUrl);
        // TODO: test validations
    }

    /**
     * List channels
     *
     * ## List channels  Retrieves a list of open channels. You can query the list using various parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-channels ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocListChannelsTest() throws ApiException {
        //String apiToken = null;
        //String token = null;
        //Integer limit = null;
        //String customTypes = null;
        //String nameContains = null;
        //String urlContains = null;
        //Boolean showFrozen = null;
        //Boolean showMetadata = null;
        //String customType = null;
        //OcListChannelsResponse response = api.ocListChannels(apiToken, token, limit, customTypes, nameContains, urlContains, showFrozen, showMetadata, customType);
        // TODO: test validations
    }

    /**
     * List operators
     *
     * ## List operators  Retrieves a list of operators of an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of operators.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocListOperatorsTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String token = null;
        //Integer limit = null;
        //OcListOperatorsResponse response = api.ocListOperators(apiToken, channelUrl, token, limit);
        // TODO: test validations
    }

    /**
     * List participants
     *
     * ## List participants  Retrieves a list of the participants of an open channel. A participant refers to a user who has entered the open channel and is currently online.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-participants ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of participants in.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocListParticipantsTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String token = null;
        //Integer limit = null;
        //OcListParticipantsResponse response = api.ocListParticipants(apiToken, channelUrl, token, limit);
        // TODO: test validations
    }

    /**
     * Register operators
     *
     * ## Register operators  Registers one or more operators to an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-register-operators ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocRegisterOperatorsTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //OcRegisterOperatorsData ocRegisterOperatorsData = null;
        //OcDeleteChannelByUrl200Response response = api.ocRegisterOperators(apiToken, channelUrl, ocRegisterOperatorsData);
        // TODO: test validations
    }

    /**
     * Update a channel
     *
     * ## Update a channel  Updates information on an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-channel ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocUpdateChannelByUrlTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //OcUpdateChannelByUrlData ocUpdateChannelByUrlData = null;
        //SendBirdOpenChannel response = api.ocUpdateChannelByUrl(apiToken, channelUrl, ocUpdateChannelByUrlData);
        // TODO: test validations
    }

    /**
     * View a channel
     *
     * ## View a channel  Retrieves information on a specific open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-channel ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocViewChannelByUrlTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //SendBirdOpenChannel response = api.ocViewChannelByUrl(apiToken, channelUrl);
        // TODO: test validations
    }

}
