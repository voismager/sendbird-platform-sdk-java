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
import org.openapitools.client.model.CreateBotData;
import org.openapitools.client.model.CreateBotResponse;
import org.openapitools.client.model.JoinChannelsData;
import org.openapitools.client.model.JoinChannelsResponse;
import org.openapitools.client.model.ListBotsResponse;
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendBotSMessageData;
import org.openapitools.client.model.UpdateBotByIdData;
import org.openapitools.client.model.UpdateBotByIdResponse;
import org.openapitools.client.model.ViewBotByIdResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BotApi
 */
public class BotApiTest {

    private final BotApi api = new BotApi();

    /**
     * Create a bot
     *
     * ## Create a bot  Creates a new bot within the application. Creating a bot is similar to creating a normal user, except that a callback URL is specified in order for the bot to receive events.  &gt; __Note__: The bot must [join](#2-join-channels) a group channel first to interact with users. In group channels, you can invite a bot through the [invite as members](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-invite-as-members) action instead.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-create-a-bot
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBotTest() throws ApiException {
        //String apiToken = null;
        //CreateBotData createBotData = null;
        //CreateBotResponse response = api.createBot(apiToken, createBotData);
        // TODO: test validations
    }

    /**
     * Delete a bot
     *
     * ## Delete a bot  Deletes a bot from an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-delete-a-bot ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteBotByIdTest() throws ApiException {
        //String apiToken = null;
        //String botUserid = null;
        //Object response = api.deleteBotById(apiToken, botUserid);
        // TODO: test validations
    }

    /**
     * Join channels
     *
     * ## Join channels  Makes a bot join one or more channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-join-channels ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void joinChannelsTest() throws ApiException {
        //String apiToken = null;
        //String botUserid = null;
        //JoinChannelsData joinChannelsData = null;
        //JoinChannelsResponse response = api.joinChannels(apiToken, botUserid, joinChannelsData);
        // TODO: test validations
    }

    /**
     * Leave channels - When leaving all channels
     *
     * ## Leave channels  Makes a bot leave one or more group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-leave-channels ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void leaveChannelsTest() throws ApiException {
        //String apiToken = null;
        //String botUserid = null;
        //String channelUrl = null;
        //api.leaveChannels(apiToken, botUserid, channelUrl);
        // TODO: test validations
    }

    /**
     * Leave channels - When leaving a channel by its channel URL
     *
     * ## Leave channels  Makes a bot leave one or more group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-leave-channels ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void leaveChannelsByUrlTest() throws ApiException {
        //String apiToken = null;
        //String botUserid = null;
        //String channelUrl = null;
        //Object response = api.leaveChannelsByUrl(apiToken, botUserid, channelUrl);
        // TODO: test validations
    }

    /**
     * List bots
     *
     * ## List bots  Retrieves a list of all bots within an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-list-bots ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBotsTest() throws ApiException {
        //String apiToken = null;
        //String token = null;
        //Integer limit = null;
        //ListBotsResponse response = api.listBots(apiToken, token, limit);
        // TODO: test validations
    }

    /**
     * Send a bot&#39;s message
     *
     * ## Send a bot&#39;s message  Sends a bot&#39;s message to a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-send-a-bot-s-message ----------------------------   &#x60;bot_userid&#x60;      Type: string      Description: Specifies the ID of the bot to send a message.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendBotsMessageTest() throws ApiException {
        //String apiToken = null;
        //String botUserid = null;
        //SendBotSMessageData sendBotSMessageData = null;
        //SendBirdMessageResponse response = api.sendBotsMessage(apiToken, botUserid, sendBotSMessageData);
        // TODO: test validations
    }

    /**
     * Update a bot
     *
     * ## Update a bot  Updates information on a bot.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-update-a-bot ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBotByIdTest() throws ApiException {
        //String apiToken = null;
        //String botUserid = null;
        //UpdateBotByIdData updateBotByIdData = null;
        //UpdateBotByIdResponse response = api.updateBotById(apiToken, botUserid, updateBotByIdData);
        // TODO: test validations
    }

    /**
     * View a bot
     *
     * ## View a bot  Retrieves information on a bot.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-view-a-bot ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewBotByIdTest() throws ApiException {
        //String apiToken = null;
        //String botUserid = null;
        //ViewBotByIdResponse response = api.viewBotById(apiToken, botUserid);
        // TODO: test validations
    }

}
