package gwt.material.design.demo.client.application.components.forms;

public class FormDto {

	Float txtFloatBox;
	Integer txtIntegerBox;
	Double txtDoubleBox;
	Long txtLongBox;

	public Float getTxtFloatBox() {
		return txtFloatBox;
	}

	public void setTxtFloatBox(Float txtFloatBox) {
		this.txtFloatBox = txtFloatBox;
	}

	public Integer getTxtIntegerBox() {
		return txtIntegerBox;
	}

	public void setTxtIntegerBox(Integer txtIntegerBox) {
		this.txtIntegerBox = txtIntegerBox;
	}

	public Double getTxtDoubleBox() {
		return txtDoubleBox;
	}

	public void setTxtDoubleBox(Double txtDoubleBox) {
		this.txtDoubleBox = txtDoubleBox;
	}

	public Long getTxtLongBox() {
		return txtLongBox;
	}

	public void setTxtLongBox(Long txtLongBox) {
		this.txtLongBox = txtLongBox;
	}

	@Override
	public String toString() {
		return "FormDto [txtFloatBox=" + txtFloatBox + ", txtIntegerBox=" + txtIntegerBox + ", txtDoubleBox="
				+ txtDoubleBox + ", txtLongBox=" + txtLongBox + "]";
	}

}
