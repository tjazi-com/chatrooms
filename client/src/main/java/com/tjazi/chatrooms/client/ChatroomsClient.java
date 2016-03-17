package com.tjazi.chatrooms.client;

import com.tjazi.chatrooms.messages.data.ChatroomRecord;

import java.util.List;
import java.util.UUID;

/**
 * Created by Krzysztof Wasiak on 17/03/2016.
 */
public interface ChatroomsClient {

    /**
     * Create chatroom with the given name and set owner for given user UUID
     * @param chatroomName
     * @param ownerUuid
     * @return UUID of the created chatroom
     */
    UUID createChatroom(String chatroomName, UUID ownerUuid);

    /**
     * Delete existing chatroom
     * @param chatroomUuid UUID of the chatroom
     */
    void deleteChatroom(UUID chatroomUuid);

    /**
     * Add new user to the given chatroom
     * @param targetChatroomUuid Chatroom UUID
     * @param userUuid User UUID
     */
    void addUserToChatroom(UUID targetChatroomUuid, UUID userUuid);

    /**
     * Delete user from chatroom
     * @param chatroomUuid Chatroom UUID
     * @param userUuid User UUID
     */
    void deleteUserFromChatroom(UUID chatroomUuid, UUID userUuid);

    /**
     * Get list of all users registered in the given chatroom
     * @param chatroomUuid Chatroom UUID
     * @return List of chatrooms, which user is member of
     */
    List<ChatroomRecord> getUsersForChatroom(UUID chatroomUuid);

    /**
     * Find UUID of the chatroom by its name
     * @param chatroomName Name of the chatroom
     * @return Chatroom UUID
     */
    ChatroomRecord findChatroomByName(String chatroomName);






}
