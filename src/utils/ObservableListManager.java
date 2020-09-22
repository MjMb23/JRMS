package utils;

import javafx.collections.ObservableList;

public class ObservableListManager {
    private ObservableList<?> observableList;

    public ObservableListManager(ObservableList<?> observableList) {
        this.observableList = observableList;
    }

    public ObservableList<?> getObservableList() {
        return observableList;
    }
}
