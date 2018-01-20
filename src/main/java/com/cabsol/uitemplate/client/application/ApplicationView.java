/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.cabsol.uitemplate.client.application;

import javax.inject.Inject;

import com.cabsol.uitemplate.client.ui.factory.PersonRowFactory;
import com.cabsol.uitemplate.shared.model.Person;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.client.ui.table.MaterialDataTable;
import gwt.material.design.client.ui.table.cell.TextColumn;

import java.util.List;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {

    @UiField
    MaterialDataTable table;

    @Override
    public void setPersons(List<Person> persons) {
        table.setRowData(0, persons);
    }

    interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @Inject
    ApplicationView(
            Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        initTable();
    }

    private void initTable() {
        table.setRowFactory(new PersonRowFactory());

        table.addColumn(new TextColumn<Person>() {
            @Override
            public String getValue(Person person) {
                return person.getId() + "";
            }
        }, "ID");

        table.addColumn(new TextColumn<Person>() {
            @Override
            public String getValue(Person person) {
                return person.getFirstName();
            }
        }, "First Name");

        table.addColumn(new TextColumn<Person>() {
            @Override
            public String getValue(Person person) {
                return person.getLastName();
            }
        }, "Last Name");

    }


}
