package org.sterl.jee.vaadin.dashboard;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.cdi.CDIUI;
import org.vaadin.cdiviewmenu.ViewMenuUI;
import com.vaadin.server.VaadinRequest;

@CDIUI("")
@Theme("apptheme")
@Title("JEE-Vaadin-Dashboard")
public class MainUI extends ViewMenuUI {
    static final String APP_NAME = "JEE-Vaadin-Dashboard";

    @Override
    public void init(VaadinRequest request) {
	super.init(request);
    }    
}



