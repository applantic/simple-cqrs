package pl.applantic.cqrs;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


@Test
public class QueryServiceTest {

    @Test
    public void shouldReturnViewObject() {
        //given
        WriteModel writeModel = new WriteModel();
        writeModel.setValue(98);
        Database database = new Database(writeModel);
        QueryService queryService = new QueryServiceImpl(database);
        //when
        ReadModel result = queryService.query();
        //then
        assertThat(result.getValue()).isEqualTo("98");
    }
}
