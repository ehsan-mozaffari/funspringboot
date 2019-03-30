package ir.itorg.funspringboot.technologyvitrine.memory;

import ir.itorg.funspringboot.technologyvitrine.api.service.MembershipService;
import ir.itorg.funspringboot.technologyvitrine.core.entity.Group;
import ir.itorg.funspringboot.technologyvitrine.core.entity.User;

import java.util.Collection;

/**
 * Product: Maskan Core Banking System
 *
 * @author e.mozaffari on 3/27/2019 at 1:39 PM Section: Deposit Management
 */
public class MemoryMembershipService implements MembershipService {


    @Override
    public void addUserToGroup(User user, Group group) {
        
    }

    @Override
    public void addGroupToGroup(Group child, Group parent) {

    }

    @Override
    public boolean isUserInGroup(User user, Group group) {
        return false;
    }

    @Override
    public boolean isGroupInGroup(Group child, Group parent) {
        return false;
    }

    @Override
    public Collection<User> getUsersInGroup(Group group) {
        return null;
    }

    @Override
    public void removeUserFromGroup(User user, Group group) {

    }

    @Override
    public void removeGroupFromGroup(Group child, Group parent) {

    }
}
