package aifanshahran.lab5a.class_adapters_p2;

public class CAAddressAdapter extends CAAddress implements AddressValidator {

    @Override
    public boolean isValidAddress(String inp_address, String inp_zip, String inp_state) {
        return isValidCanadianAddr(inp_address, inp_zip, inp_state);
    }

}
