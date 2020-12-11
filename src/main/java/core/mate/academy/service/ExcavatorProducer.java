package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final Excavator FIRST = new Excavator();
    private static final Excavator SECOND = new Excavator();
    private static final Excavator THIRD = new Excavator();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(FIRST);
        excavators.add(SECOND);
        excavators.add(THIRD);
        return excavators;
    }
}
