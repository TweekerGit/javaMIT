package org.obrii.mit.dp2021.fit;

public class Male extends Human {

    public Male() {
        super(new MaleHaircutsService());
    }

    public Male(String name, String phone, String haircut) {
        super(name, phone, haircut, new MaleHaircutsService());
    }

    @Override
    public String getSex() {
        return "Male";
    }
}
