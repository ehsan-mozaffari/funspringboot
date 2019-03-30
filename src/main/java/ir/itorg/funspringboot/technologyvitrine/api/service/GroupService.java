package ir.itorg.funspringboot.technologyvitrine.api.service;

import ir.itorg.funspringboot.technologyvitrine.core.entity.Group;

/**
 * Product: Maskan Core Banking System
 *
 * @author e.mozaffari on 3/26/2019 at 6:06 PM Section: Deposit Management
 */

public interface GroupService {


    Group findByName(String name);

    void create(Group group);

    void delete(Group group);

}
