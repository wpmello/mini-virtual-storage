package domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Enum criado para auxiliar a criação de um estoque

@Getter
@AllArgsConstructor
public enum ProductValid {

    PERISHABLE("Perecível"),
    NON_PERISHABLE("Não perecível");

    private final String description;
}
