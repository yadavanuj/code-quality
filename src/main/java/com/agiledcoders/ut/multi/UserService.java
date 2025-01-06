package com.agiledcoders.ut.multi;

import java.util.Objects;

public class UserService {

    public String getUserName(String userId) {
        if (Objects.isNull(userId)) {
            throw new IllegalArgumentException("User ID must be non null");
        }

        if (userId.equals("valid")) {
            return "John Doe";
        }

        return null;
    }
}
