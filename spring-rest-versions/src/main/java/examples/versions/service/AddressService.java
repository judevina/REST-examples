package examples.versions.service;

import examples.versions.domain.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private Address address;

    public Address load() {
        return address;
    }

    public void save(final Address address) {
        this.address = address;
    }
}
