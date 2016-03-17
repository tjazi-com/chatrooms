package com.tjazi.chatrooms.messages.data;

/**
 * Created by Krzysztof Wasiak on 17/03/2016.
 */

import java.util.List;
import java.util.UUID;

/**
 * Extended (detailed) version of the chatroom record
 */
public class ChatroomRecordEx {

    private String chatroomName;
    private UUID chatroomUuid;
    private UUID chatroomOwnerUuid;
    private List<UserRecord> chatroomUsers;

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

    public UUID getChatroomOwnerUuid() {
        return chatroomOwnerUuid;
    }

    public void setChatroomOwnerUuid(UUID chatroomOwnerUuid) {
        this.chatroomOwnerUuid = chatroomOwnerUuid;
    }

    public List<UserRecord> getChatroomUsers() {
        return chatroomUsers;
    }

    public void setChatroomUsers(List<UserRecord> chatroomUsers) {
        this.chatroomUsers = chatroomUsers;
    }
}
