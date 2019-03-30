package ir.itorg.funspringboot.technologyvitrine.core.service;

import ir.itorg.funspringboot.technologyvitrine.api.service.GroupService;
import ir.itorg.funspringboot.technologyvitrine.api.service.MembershipService;
import ir.itorg.funspringboot.technologyvitrine.api.service.UserService;

/**
 * Product: Maskan Core Banking System
 *
 * @author e.mozaffari on 3/27/2019 at 10:50 AM Section: Deposit Management
 */
public interface Services {

    GroupService getGroupService();

    UserService getUserService();

    MembershipService getMembershipService();
}
