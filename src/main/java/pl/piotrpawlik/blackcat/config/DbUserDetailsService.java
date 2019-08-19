package pl.piotrpawlik.blackcat.config;

        import java.util.Collections;

        import org.springframework.security.core.userdetails.UserDetails;
        import org.springframework.security.core.userdetails.UserDetailsService;
        import org.springframework.security.core.userdetails.UsernameNotFoundException;
        import org.springframework.stereotype.Component;
        import pl.piotrpawlik.blackcat.users.User;
        import pl.piotrpawlik.blackcat.users.UserReposytory;

@Component
class DbUserDetailsService implements UserDetailsService {
  
    private final UserReposytory userReposytory;
    private Long userId;

    public DbUserDetailsService(UserReposytory userReposytory) {
        this.userReposytory = userReposytory;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userReposytory.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid username"));


        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(),
                Collections.emptyList());
    }
}
