package org.obrii.mit.dp2021.fit;

import java.util.List;

public abstract class Human implements IPeople {

    private String name;
    private String phone;
    private String haircut;
    private IHaircutsService service;

    public Human() {
    }

    public Human(IHaircutsService service) {
        this.service = service;
    }

    public Human(String name, String phone, String haircut, IHaircutsService service) {
        this.name = name;
        this.phone = phone;
        this.haircut = haircut;
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getHaircut() {
        return haircut;
    }

    @Override
    public String getSex() {
        return "trap";
    }

    @Override
    public List<IHaircut> getHaircuts() {
        return service.getHaircuts();
    }
}
