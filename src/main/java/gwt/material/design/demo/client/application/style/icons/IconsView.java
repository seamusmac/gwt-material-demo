package gwt.material.design.demo.client.application.style.icons;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class IconsView extends ViewImpl implements IconsPresenter.MyView {
    interface Binder extends UiBinder<Widget, IconsView> {
    }

    @Inject
    IconsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
