package pacientes.api.domain.users;

public record RegisterDTO(String login, String password, UserRole role) {
}
