package pl.applantic.cqrs;

class CommandServiceImpl implements CommandService {

    private Database database;

    public CommandServiceImpl(Database database) {
        this.database = database;
    }

    @Override
    public void command() {
        database.getWriteModel().setValue(100);
    }
}
