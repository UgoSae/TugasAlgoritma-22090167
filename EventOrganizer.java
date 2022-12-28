public class EventOrganizer {


    // M. Yugo Cahyo F 1C
    // 22090167

    private String CustId;

    private String CustName;

    private String CustAddr;

    private String CustEmail;

    private int CustPhone;

    public String getCustId() {
        return CustId;
    }
    public void setCustid(String custid) {
        CustId = custid;
    }
    public String getCustName() {
        return CustName;
    }
    public void setCustName(String custname){
        CustName = custname;
    }
    public String getCustAddr(){
        return CustAddr;
    }
    public void setCustAddr(String custaddr){
        CustAddr = custaddr;
    }
    public String getCustEmail(){
        return CustEmail;
    }
    public void setCustemail(String custemail){
        CustEmail = custemail;
    }
    public int getCustphone(){
        return CustPhone;
    }
    public void setCustphone(int custphone){
        CustPhone = custphone;
    }

    public EventOrganizer {

    }

    public eventorganizer(String inputid, String inputnama, String inputalamat, String inputemail, int inputnohp){
    }

    public eventorganizer(String CustId, String CustName, String CustAddr, String CustEmail, int CustPhone){
        CustId = CustId;
        CustName = CustName;
        CustAddr = CustAddr;
        CustEmail = CustEmail;
        CustPhone = CustPhone;
    }

    public void PrintGuests(EventOrganizer[]tamu){
        System.out.println("Daftar Tamu");
        for(int index = 0; index < tamu.length; index++) {
            System.out.println(" ------tamu "+ (index+1) + "------");
            System.out.println(" nama ID: " + getCustId());
            System.out.println("Nama anda : " + getCustName());
            System.out.println("Alamat anda : " + getCustAddr());
            System.out.println("Email anda : " + getCustEmail());
            System.out.println(" no telephon : " + getCustphone());
        }
    }
}
