package pl.applantic.cqrs;

interface CommandService {
    void command();
    ReadModel query();
}
