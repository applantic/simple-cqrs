package pl.applantic.cqrs;

interface Service {
    void command();
    ReadModel query();
}
