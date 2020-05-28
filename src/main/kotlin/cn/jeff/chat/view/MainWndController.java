package cn.jeff.chat.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainWndController {

	public static MainWndController instance;
	public MainWnd kt;
	public Label label01;
	public Button btn01;

	public MainWndController() {
		instance = this;
	}

	public void btn01Click() {
		kt.btn01Click();
	}

}
