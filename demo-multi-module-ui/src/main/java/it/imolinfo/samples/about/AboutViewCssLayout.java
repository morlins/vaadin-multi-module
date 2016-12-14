package it.imolinfo.samples.about;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.Version;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by morlins on 14/12/16.
 */
public class AboutViewCssLayout extends VerticalLayout implements View {

    public static final String VIEW_NAME = "AboutViewCssLayout";

    public AboutViewCssLayout() {
//        CustomLayout aboutContent = new CustomLayout("aboutview");
        CssLayout aboutContent = new CssLayout();
        aboutContent.setStyleName("about-content");

        // you can add Vaadin components in predefined slots in the custom
        // layout
        Label label =new Label(FontAwesome.INFO_CIRCLE.getHtml()
                + " This application is using Vaadin 1"
                + Version.getFullVersion(), ContentMode.HTML);
        label.setWidth(null);
        aboutContent.addComponent(
                label);
        label =new Label(FontAwesome.INFO_CIRCLE.getHtml()
                + " This application is using Vaadin 2"
                + Version.getFullVersion(), ContentMode.HTML);
        label.setWidth(null);
        aboutContent.addComponent(
              label);
        label =new Label(FontAwesome.INFO_CIRCLE.getHtml()
                + " This application is using Vaadin 3"
                + Version.getFullVersion(), ContentMode.HTML);
        label.setWidth(null);
        aboutContent.addComponent(
             label);

        setSizeFull();
        setStyleName("about-view");
        addComponent(aboutContent);
        setComponentAlignment(aboutContent, Alignment.MIDDLE_CENTER);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }

}
