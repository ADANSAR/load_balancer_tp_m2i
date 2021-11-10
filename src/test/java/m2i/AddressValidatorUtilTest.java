package m2i;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import m2i.AddressValidatorUtil;

public class AddressValidatorUtilTest {

    @Test
    public void isValidAddressTest() {
        String address = "192.168.1.1";
        assertTrue(AddressValidatorUtil.isValidAddress(address));
    }

    @Test
    public void isNotValidUsingAddressWithCharactersTest() {
        String address = "19v.168.1.1";
        assertFalse(AddressValidatorUtil.isValidAddress(address));
    }

    @Test
    public void isNotValidUsingAddressWithSymbolesTest() {
        String address = "19v.16$.1$.$1";
        assertFalse(AddressValidatorUtil.isValidAddress(address));
    }

    @Test
    public void isNotValidUsingAddressWithInvalidIntValuesTest() {
        String address = "127.0.0.999";
        assertFalse(AddressValidatorUtil.isValidAddress(address));
    }

    @Test
    public void isNotValidUsingAddressWithNegatifIntValuesTest() {
        String address = "127.-0.0.-19";
        assertFalse(AddressValidatorUtil.isValidAddress(address));
    }

    @Test
    public void isNotValidUsingAddressWithInvalidPositifIntValuesTest() {
        String address = "1270.-0.0.-19";
        assertFalse(AddressValidatorUtil.isValidAddress(address));
    }

    @Test
    public void isNotValidUsingAddressWithInvalidPartsNumberTest() {
        String address = "127.0.0";
        assertFalse(AddressValidatorUtil.isValidAddress(address));
    }

}
