package pl.applantic.cqrs;

class QueryServiceImpl implements QueryService{
    private Database database;

    QueryServiceImpl(Database database) {
        this.database = database;
    }

    @Override
    public ReadModel query() {
        WriteModel writeModel = database.getWriteModel();
        return new ReadModel().mapFrom(writeModel);
    }
}
