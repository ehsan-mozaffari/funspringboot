package ir.itorg.funspringboot.technologyvitrine.core.entity;

import javax.annotation.Nonnull;
import java.util.Objects;

/**
 * Product: Maskan Core Banking System
 *
 * @author e.mozaffari on 3/26/2019 at 7:21 PM Section: Deposit Management
 */
public class User implements Comparable<User> {

    private final String name;

    public User(String name) {
        this.name = Objects.requireNonNull(name, "name");
    }

    public String getName() {
        return name;
    }

    public int compareTo(@Nonnull User other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
