package ir.itorg.funspringboot.technologyvitrine.core.entity;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import static java.util.Objects.requireNonNull;

/**
 * Product: Maskan Core Banking System
 *
 * @author e.mozaffari on 3/26/2019 at 6:28 PM Section: Deposit Management
 */
@ParametersAreNonnullByDefault
public class Group implements Comparable<Group>{
    private final String name;

    public Group(String name) {
        this.name = requireNonNull(name, "name is null");
    }

    public String getName() {
        return name;
    }

    public int compareTo(@Nonnull Group other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }

}
