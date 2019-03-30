package ir.itorg.funspringboot.technologyvitrine.memory;

import ir.itorg.funspringboot.technologyvitrine.api.service.UserService;
import ir.itorg.funspringboot.technologyvitrine.core.entity.User;

import javax.annotation.Nullable;

/**
 * Product: Maskan Core Banking System
 *
 * @author e.mozaffari on 3/30/2019 at 9:15 AM Section: Deposit Management
 */
public class MemoryUserService implements UserService {


    @Nullable
    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public void create(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
