package aifanshahran.lab5a.class_adapters_p2;

public class USAddress implements AddressValidator{

    @Override
    public boolean isValidAddress(String inp_address, String inp_zip, String inp_state) {
        if(inp_address.trim().length() < 10)
            return false;
        if(inp_zip.trim().length()<5)
            return false;
        if(inp_zip.trim().length()>10)
            return false;
        if(inp_state.trim().length() !=2)
            return false;
        return true;
    }

}
