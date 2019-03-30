package ir.itorg.funspringboot.technologyvitrine.api.service;

import ir.itorg.funspringboot.technologyvitrine.core.entity.Group;
import ir.itorg.funspringboot.technologyvitrine.core.entity.User;

import java.util.Collection;

/**
 * Product: Maskan Core Banking System
 *
 * @author e.mozaffari on 3/27/2019 at 11:03 AM Section: Deposit Management
 */
public interface MembershipService {

    void addUserToGroup(User user, Group group);

    void addGroupToGroup(Group child, Group parent);

    boolean isUserInGroup(User user, Group group);

    boolean isGroupInGroup(Group child, Group parent);

    Collection<User> getUsersInGroup(Group group);

    void removeUserFromGroup(User user, Group group);

    void removeGroupFromGroup(Group child, Group parent);
}