package com.nhandn.shop.mapper;

import com.nhandn.shop.dto.UserDTO;
import com.nhandn.shop.mapper.help.CycleAvoidingMappingContext;
import com.nhandn.shop.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper extends AbstractMapper<UserDTO, User> {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({@Mapping(target = "role", ignore = true)})
    UserDTO toDto(User entity, CycleAvoidingMappingContext context);
}
