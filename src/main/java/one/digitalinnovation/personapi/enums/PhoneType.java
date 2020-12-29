package one.digitalinnovation.personapi.enums;


import lombok.Getter;

@Getter

public enum PhoneType {

         MOBILE("Mobile"),
         HOME("Home"),
         COMMERCIAL("Commercial");

    private final String description;

    PhoneType(String description) {
        this.description = description;
    }
}
