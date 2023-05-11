package cinema.app.service;

import cinema.app.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
