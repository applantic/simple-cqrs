package pl.applantic.cqrs;

class ReadModel {
    private String value;

    public String getValue() {
        return value;
    }

    ReadModel mapFrom(WriteModel writeModel){
        this.value = String.valueOf(writeModel.getValue());
        return this;
    }
}
