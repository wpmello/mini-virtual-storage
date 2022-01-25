package domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Enum criado para auxiliar a criação de um estoque

@Getter
@AllArgsConstructor
public enum ProductModel {

    TV("TV"),
    CELLPHONE("Cellphone"),
    VIDEO_GAME("Video game"),
    COMPUTER("Computer");

    private final String description;
}
