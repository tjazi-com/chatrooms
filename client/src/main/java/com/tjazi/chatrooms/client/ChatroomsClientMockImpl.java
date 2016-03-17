package com.tjazi.chatrooms.client;

import com.tjazi.chatrooms.messages.data.ChatroomRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by Krzysztof Wasiak on 17/03/2016.
 */

/**
 * This is mock implementation of the chatroom client
 */
@Service
@Primary
@Profile("mock")
public class ChatroomsClientMockImpl implements ChatroomsClient {

    private final Logger log = LoggerFactory.getLogger(ChatroomsClientMockImpl.class);

    public ChatroomsClientMockImpl() {
        log.info("[!!!ChatroomsClientMockImpl!!!].Creating ChatroomsClientMockImpl...");
    }

    public UUID createChatroom(String chatroomName, UUID ownerUuid) {

        log.info("[!!!ChatroomsClientMockImpl!!!].createChatroom(chatroomName={}, ownerUuid={})", chatroomName, ownerUuid);
        return UUID.randomUUID();
    }

    public void deleteChatroom(UUID chatroomUuid) {
        log.info("[!!!ChatroomsClientMockImpl!!!].deleteChatroom(chatroomUuid={})", chatroomUuid);
    }

    public void addUserToChatroom(UUID targetChatroomUuid, UUID userUuid) {
        log.info("[!!!ChatroomsClientMockImpl!!!].addUserToChatroom(targetChatroomUuid={}, userUuid={})",
                targetChatroomUuid, userUuid);
    }

    public void deleteUserFromChatroom(UUID chatroomUuid, UUID userUuid) {
        log.info("[!!!ChatroomsClientMockImpl!!!].deleteUserFromChatroom(chatroomUuid={}, userUuid={})",
                chatroomUuid, userUuid);
    }

    public List<ChatroomRecord> getUsersForChatroom(UUID chatroomUuid) {
        log.info("[!!!ChatroomsClientMockImpl!!!].getUsersForChatroom(chatroomUuid={})", chatroomUuid);
        return null;
    }

    public ChatroomRecord findChatroomByName(String chatroomName) {
        log.info("[!!!ChatroomsClientMockImpl!!!].findChatroomByName(chatroomName={})", chatroomName);
        return null;
    }
}
