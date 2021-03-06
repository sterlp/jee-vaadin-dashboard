package org.sterl.jee.vaadin.dashboard.view;

import com.vaadin.cdi.CDIView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import javax.annotation.PostConstruct;
import org.vaadin.cdiviewmenu.ViewMenuItem;
import org.vaadin.viritin.label.RichText;
import org.vaadin.viritin.layouts.MVerticalLayout;


@CDIView("")
@ViewMenuItem(order = ViewMenuItem.BEGINNING)
public class StartView extends MVerticalLayout implements View {

    @PostConstruct
    public void initComponent() {
        addComponents(
                new RichText().withMarkDownResource("/welcome.md")
        );

    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }

}
