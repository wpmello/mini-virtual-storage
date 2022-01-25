package domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductType {

    CAN("Lata"),
    BOTTLE("Garrafa");

    private final String description;
}
