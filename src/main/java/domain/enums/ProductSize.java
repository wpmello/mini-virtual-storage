package domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Enum criado para auxiliar a criação de um estoque

@Getter
@AllArgsConstructor
public enum ProductSize {

    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String description;
}
