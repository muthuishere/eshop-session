package sessions.graphql.eshop.dealers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dealer {
    String name;
    String location;
    Long id;
    String phone;
    String address;
    public Dealer(Long id, String name, String address, String location, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.location = location;
        this.phone = phone;
    }
}
