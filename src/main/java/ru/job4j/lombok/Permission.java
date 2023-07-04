package ru.job4j.lombok;

import lombok.*;

import java.util.List;

@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
public class Permission {
    @EqualsAndHashCode.Include
    private int id;

    private String name;

    @Singular("addRule")
    private List<String> rules;
}
