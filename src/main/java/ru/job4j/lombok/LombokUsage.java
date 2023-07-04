package ru.job4j.lombok;

public class LombokUsage {
    public static void main(String[] args) {
        var bird = new BirdData();
        bird.setAge(1);
        System.out.println(bird);
        System.out.println(new Category(1).getId());

        Role role = Role.of()
                .id(1)
                .name("ADMIN")
                .accessBy("create")
                .accessBy("update")
                .accessBy("read")
                .accessBy("delete")
                .build();
        System.out.println(role);

        Permission permission = Permission.builder()
                .id(1)
                .name("name")
                .rules("rule1")
                .rules("rule2")
                .build();
        System.out.println(permission);
    }
}
