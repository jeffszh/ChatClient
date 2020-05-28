package cn.jeff.chat.view

import javafx.beans.property.SimpleStringProperty
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import tornadofx.*

class MainWnd : View("J&J 畅言聊天") {

	override val root: Parent = FXMLLoader.load(javaClass.getResource("/views/MainWnd.fxml"))
	private val controller = MainWndController.instance
	private val label01Text = SimpleStringProperty("字符串")

	init {
		controller.kt = this
		controller.label01.bind(label01Text)
	}

	fun btn01Click() {
		label01Text.value = "很好！"
	}

}
