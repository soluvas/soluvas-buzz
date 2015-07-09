package org.soluvas.buzz.core;

/**
 * Scope of UserSearch, used by {@link AutoLikeRule}.
 * Created by ceefour on 7/10/15.
 */
public enum UserSearchScope {
    /**
     * Search public status messages.
     */
    EVERYONE,
    /**
     * Only search from followed users/friends.
     */
    FOLLOWED,
    /**
     * Only search from followers/subscribers.
     */
    FOLLOWER,
    /**
     * Search from private/direct messages.
     */
    PRIVATE_MESSAGE,
    /**
     * Search from specific user(s).
     */
    USER,
    /**
     * Search from specific list(s).
     */
    LIST
}
