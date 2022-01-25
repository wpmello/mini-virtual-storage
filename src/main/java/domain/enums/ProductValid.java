package domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductValid {

    PERISHABLE("Perecível"),
    NON_PERISHABLE("Não perecível");

    private final String description;
}
