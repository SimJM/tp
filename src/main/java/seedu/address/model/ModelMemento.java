package seedu.address.model;

public class ModelMemento {
    Model modelState;

    public Model getModel() {
        return this.modelState;
    }

    public void setModel(Model newModelState) {
        this.modelState = newModelState;
    }
}
