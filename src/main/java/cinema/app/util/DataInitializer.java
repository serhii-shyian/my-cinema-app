package cinema.app.util;

import cinema.app.model.Role;
import cinema.app.model.User;
import cinema.app.service.RoleService;
import cinema.app.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);

        User john = new User();
        john.setEmail("john@me.com");
        john.setPassword("12345678");
        john.setRoles(Set.of(adminRole));
        userService.add(john);
        User emma = new User();
        emma.setEmail("emma@me.com");
        emma.setPassword("87654321");
        emma.setRoles(Set.of(userRole));
        userService.add(emma);
    }
}
