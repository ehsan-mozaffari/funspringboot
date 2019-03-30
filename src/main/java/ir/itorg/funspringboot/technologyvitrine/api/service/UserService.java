package ir.itorg.funspringboot.technologyvitrine.api.service;

import ir.itorg.funspringboot.technologyvitrine.core.entity.User;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Product: Maskan Core Banking System
 *
 * @author e.mozaffari on 3/26/2019 at 7:23 PM Section: Deposit Management
 */
@ParametersAreNonnullByDefault
public interface UserService {

    @Nullable
    User findByName(String name);

    void create(User user);

    void delete(User user);

}
