package henrique.igor.library_system.mappers.user;

import henrique.igor.library_system.dtos.user.input.CreateUserInputDTO;
import henrique.igor.library_system.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserStructMapper {
    User toEntity(CreateUserInputDTO dto);
}
