package com.dateme.api.dao;

import com.dateme.core.Profile;

import java.util.List;
import java.util.Optional;

public interface DateMeDAO {

    public Profile createUser(Profile profile);
    public Optional<Profile> getUser(String email);
    public Profile updateUser(Profile profile);
    public Optional<Profile> deleteUser(String email);

    public List<Profile> findMostCompatible(Profile profile, int count);

}
