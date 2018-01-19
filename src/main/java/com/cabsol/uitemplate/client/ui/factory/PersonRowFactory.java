package com.cabsol.uitemplate.client.ui.factory;

import com.cabsol.uitemplate.shared.model.Person;
import gwt.material.design.client.data.DataView;
import gwt.material.design.client.data.component.RowComponent;
import gwt.material.design.client.data.factory.RowComponentFactory;

public class PersonRowFactory extends RowComponentFactory<Person> {

    @Override
    public RowComponent<Person> generate(DataView dataView, Person model) {
        return super.generate(dataView, model);
    }

    @Override
    public String getCategory(Person model) {
        return super.getCategory(model);
    }
}
