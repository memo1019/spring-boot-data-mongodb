package org.ada.school.service;
import org.ada.school.dto.UserDto;
import org.ada.school.model.User;
import org.ada.school.repository.UserDocument;
import org.ada.school.repository.UserRepository;
import org.ada.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class UserServiceMongoDB implements UserService
{

    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }

    @Override
    public User create( User user )
    {
        UserDocument userDocument =  new UserDocument(user.getId(), user.getName(), user.getEmail(), user.getLastName(), user.getCreatedAt());
        userRepository.save(userDocument);
        return user;
    }

    @Override
    public User findById( String id )
    {
        return null;
    }

    @Override
    public List<User> all()
    {
        return null;
    }

    @Override
    public boolean deleteById( String id )
    {
        return false;
    }

    @Override
    public User update(UserDto userDto, String id )
    {
        return null;
    }

    @Override
    public List<User> findUsersWithNameOrLastNameLike(String queryText) {
        return null;
    }

    @Override
    public List<User> findUsersCreatedAfter(Date startDate) {
        return null;
    }
}