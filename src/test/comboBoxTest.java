package test;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;

public class comboBoxTest {

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Text text;

    ObservableList<String> list;

    @FXML
    private void initialize() {
        list = FXCollections.observableArrayList(" very same", "different", "same");

        comboBox.setItems(list);
    }

    @FXML
    void updateText(ActionEvent event) {
        text.setText(comboBox.getValue());
    }

}
