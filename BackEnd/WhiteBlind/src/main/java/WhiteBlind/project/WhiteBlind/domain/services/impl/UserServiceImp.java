package WhiteBlind.project.WhiteBlind.domain.services.impl;

import WhiteBlind.project.WhiteBlind.domain.entities.UserEntity;
import WhiteBlind.project.WhiteBlind.domain.models.User;
import WhiteBlind.project.WhiteBlind.domain.repositories.UserRepository;
import WhiteBlind.project.WhiteBlind.domain.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {

    UserRepository userRepository;
    ModelMapper modelMapper;

    public UserServiceImp(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<User> getAllUsers() {

        List<UserEntity> userEntity = userRepository.findAll();
        List<User> users = userEntity.stream().map(entity -> modelMapper.map(entity, User.class))
                .collect(Collectors.toList());

        return users;
    }
}
