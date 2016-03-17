package com.tjazi.chatrooms.client;

import com.tjazi.chatrooms.messages.data.ChatroomRecord;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by Krzysztof Wasiak on 17/03/2016.
 */
@Service
@Primary
@Profile("!mock")
public class ChatroomsClientImpl implements ChatroomsClient {

    public UUID createChatroom(String chatroomName, UUID ownerUuid) {
        return null;
    }

    public void deleteChatroom(UUID chatroomUuid) {

    }

    public void addUserToChatroom(UUID targetChatroomUuid, UUID userUuid) {

    }

    public void deleteUserFromChatroom(UUID chatroomUuid, UUID userUuid) {

    }

    public List<ChatroomRecord> getUsersForChatroom(UUID chatroomUuid) {
        return null;
    }

    public ChatroomRecord findChatroomByName(String chatroomName) {
        return null;
    }
}
