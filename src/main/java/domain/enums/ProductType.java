package domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Enum criado para auxiliar a criação de um estoque

@Getter
@AllArgsConstructor
public enum ProductType {

    CAN("Lata"),
    BOTTLE("Garrafa");

    private final String description;
}
