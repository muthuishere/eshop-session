package sessions.graphql.eshop.dealers;

import sessions.graphql.eshop.mockgenerators.DealerDataGenerator;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class DealerService {

    List<Dealer> dealers = new ArrayList<>();

    @PostConstruct
    public void init(){
        dealers = DealerDataGenerator.generate();
    }
}
