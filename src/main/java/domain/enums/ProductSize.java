package domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductSize {

    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String description;
}
