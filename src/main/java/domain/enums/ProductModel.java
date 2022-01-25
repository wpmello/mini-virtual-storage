package domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductModel {

    TV("TV"),
    CELLPHONE("Cellphone"),
    VIDEO_GAME("Video game"),
    COMPUTER("Computer");

    private final String description;
}
