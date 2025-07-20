package henrique.igor.library_system.dtos.user.input;

import henrique.igor.library_system.enums.UserRole;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateUserInputDTO {

    @NotBlank
    @Schema(example = "Igor Henrique", requiredMode = Schema.RequiredMode.REQUIRED)
    @Size(max = 255)
    private String name;

    @NotBlank
    @Schema(example = "igor@gmail.com", requiredMode = Schema.RequiredMode.REQUIRED)
    @Email
    private String email;

    @NotBlank
    @Schema(example = "p4ssw0rd", requiredMode = Schema.RequiredMode.REQUIRED)
    private String password;

    @NotBlank
    @Schema(example = "ADMISTRATOR", requiredMode = Schema.RequiredMode.REQUIRED)
    private UserRole role;
}
