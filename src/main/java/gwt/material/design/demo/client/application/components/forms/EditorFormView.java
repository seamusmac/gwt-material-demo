package gwt.material.design.demo.client.application.components.forms;

import javax.inject.Inject;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import gwt.material.design.client.ui.MaterialDoubleBox;
import gwt.material.design.client.ui.MaterialFloatBox;
import gwt.material.design.client.ui.MaterialIntegerBox;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialLongBox;

public class EditorFormView extends ViewImpl implements EditorFormPresenter.MyView, Editor<FormDto> {
    interface Binder extends UiBinder<Widget, EditorFormView> {
    }

    public interface Driver extends SimpleBeanEditorDriver<FormDto, EditorFormView> {
	}

    @UiField MaterialFloatBox txtFloatBox;
    @UiField MaterialIntegerBox txtIntegerBox;
    @UiField MaterialDoubleBox txtDoubleBox;
    @UiField MaterialLongBox txtLongBox;
    @UiField MaterialLabel values;

    Driver driver;
    
    @Inject
    EditorFormView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        driver = GWT.create(Driver.class);
		driver.initialize(this);
		driver.edit(new FormDto());
        txtFloatBox.setValue(1000.25f);
        txtIntegerBox.setValue(10);
        txtDoubleBox.setValue(9999.90);
        txtLongBox.setValue((long) 1000.00);
    }

    @UiHandler("flushButton")
    void onClick(ClickEvent e) {
        FormDto formDto = driver.flush();
        values.setText(formDto.toString());
    }
    
}
