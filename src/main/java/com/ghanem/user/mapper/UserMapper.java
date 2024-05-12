package com.ghanem.user.mapper;

import com.ghanem.user.entity.User;
import com.ghanem.user.model.UserRequest;
import com.ghanem.user.model.UserResponse;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface UserMapper {
    UserResponse toUserResponse(User destination);
    User toUser(UserRequest request);
}