package com.tjazi.chatrooms.messages.data;

import java.util.UUID;

/**
 * Created by Krzysztof Wasiak on 17/03/2016.
 */

/**
 * Basic information about user
 */
public class UserRecord {

    private UUID userUuid;
    private String userName;

    public UUID getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(UUID userUuid) {
        this.userUuid = userUuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
