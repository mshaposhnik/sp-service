package org.appstudio.serviceprovider.service;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@ApplicationScoped
public class AccessTokenService {

    private Map<String, AccessToken> tokens = Collections.synchronizedMap(new LinkedHashMap<>());
    
    public Set<AccessToken> fetchAll() {
        return new HashSet<>(tokens.values());
    }

    public Optional<AccessToken> get(String name) {
       return Optional.ofNullable(tokens.get(name));
    }

    public void create(AccessToken accessToken) {
        tokens.put(accessToken.getName(), accessToken);
    }

    public void update(AccessToken accessToken) {
        tokens.replace(accessToken.getName(), accessToken);
    }

    public void delete(String name) {
        tokens.remove(name);
    }
}
