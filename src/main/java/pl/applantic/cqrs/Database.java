package pl.applantic.cqrs;

class Database {
    private WriteModel writeModel = new WriteModel();

    public WriteModel getWriteModel() {
        return writeModel;
    }
}
