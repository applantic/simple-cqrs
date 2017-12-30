package pl.applantic.cqrs;

class CommandServiceImpl implements CommandService {
    WriteModel writeModel = new WriteModel();

    @Override
    public void command() {
        writeModel.setValue(100);
    }
}
