package ru.job4j.tracker;

import java.util.List;

public class FindNameActions implements UserAction {
    private final Output out;

    public FindNameActions(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Item by name";
    }

    @Override
    public boolean execute(Input input, Store memTracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        List<Item> items = memTracker.findByName(name);
        if ((items.size() > 0)) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Заявка с именем: " + name + " не найдены.");
        }
        return true;
    }
}