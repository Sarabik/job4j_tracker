package ru.job4j.tracker;

public class DeleteManyItems implements UserAction {
    private final Output out;

    public DeleteManyItems(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete many items";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        for (int i = 1; i <= 10000; i++) {
            tracker.delete(i);
            out.println(String.format("Заявка id%s удалена успешно.", i));
        }
        return true;
    }
}
