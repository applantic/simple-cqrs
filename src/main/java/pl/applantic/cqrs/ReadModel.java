package pl.applantic.cqrs;

class ReadModel {
    private String value;

    ReadModel(WriteModel model) {
        value = String.valueOf(model.getValue());
    }

    public String getValue() {
        return value;
    }
}
