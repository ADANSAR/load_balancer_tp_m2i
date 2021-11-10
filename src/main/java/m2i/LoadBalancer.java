package m2i;

import java.util.HashSet;
import java.util.Set;

public class LoadBalancer {

    private Set<String> addresses = new HashSet<String>(10);

    public LoadBalancer() {
        // empty for now
    }

    /**
     * @param addresses
     */
    public LoadBalancer(Set<String> addresses) {
        super();
        this.addresses = addresses;
    }

    /**
     * @return the addresses
     */
    public Set<String> getAddresses() {
        return addresses;
    }

    /**
     * @param addresses
     *            the addresses to set
     */
    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(String address) {
        if (address.length() < 10 && AddressValidatorUtil.isValidAddress(address)) {
            addresses.add(address);
        }
    }
}
