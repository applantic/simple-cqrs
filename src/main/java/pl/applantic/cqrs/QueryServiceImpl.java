package pl.applantic.cqrs;

class QueryServiceImpl implements QueryService{
    private Database database;

    @Override
    public ReadModel query() {
        WriteModel writeModel = database.getWriteModel();
        return new ReadModel().mapFrom(writeModel);
    }
}
