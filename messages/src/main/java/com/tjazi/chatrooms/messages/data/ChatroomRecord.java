package com.tjazi.chatrooms.messages.data;

import java.util.UUID;

/**
 * Created by Krzysztof Wasiak on 17/03/2016.
 */

/**
 * Single record describing chatroom
 */
public class ChatroomRecord {

    private String chatroomName;
    private UUID chatroomUuid;
    private UserRecord chatroomOwner;

    public String getChatroomName() {
        return chatroomName;
    }

    public void setChatroomName(String chatroomName) {
        this.chatroomName = chatroomName;
    }

    public UUID getChatroomUuid() {
        return chatroomUuid;
    }

    public void setChatroomUuid(UUID chatroomUuid) {
        this.chatroomUuid = chatroomUuid;
    }

    public UserRecord getChatroomOwner() {
        return chatroomOwner;
    }

    public void setChatroomOwnerUuid(UserRecord chatroomOwner) {
        this.chatroomOwner = chatroomOwner;
    }
}
