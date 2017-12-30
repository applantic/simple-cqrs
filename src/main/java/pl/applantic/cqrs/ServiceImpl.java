package pl.applantic.cqrs;

class ServiceImpl implements CommandService, QueryService {
    WriteModel writeModel = new WriteModel();

    @Override
    public void command() {
        writeModel.setValue(100);
    }

    @Override
    public ReadModel query() {
        return new ReadModel(writeModel);
    }
}
