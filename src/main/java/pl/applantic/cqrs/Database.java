package pl.applantic.cqrs;

class Database {
    private WriteModel writeModel = new WriteModel();

    public Database(WriteModel writeModel) {
        this.writeModel = writeModel;
    }

    public WriteModel getWriteModel() {
        return writeModel;
    }
}
