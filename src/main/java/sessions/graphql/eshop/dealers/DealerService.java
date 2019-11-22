package sessions.graphql.eshop.dealers;

import org.springframework.stereotype.Service;
import sessions.graphql.eshop.mockgenerators.DealerDataGenerator;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class DealerService {

    List<Dealer> dealers = new ArrayList<>();

    @PostConstruct
    public void init(){
        dealers = DealerDataGenerator.generate();
    }


    public List<Dealer> getAll(){
        return dealers;
    }
}
