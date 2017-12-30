package pl.applantic.cqrs;

class ServiceImpl implements Service{
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
