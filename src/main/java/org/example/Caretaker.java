package org.example;
import java.util.ArrayList;
import java.util.List;

class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    public void adicionarMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getUltimoMemento() {
        if (mementos.isEmpty()) {
            return null;
        }
        return mementos.get(mementos.size() - 1);
    }
}