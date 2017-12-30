package pl.applantic.cqrs;

public class QueryServiceImpl implements QueryService{

    @Override
    public ReadModel query() {
        return new ReadModel(new WriteModel());
    }
}
