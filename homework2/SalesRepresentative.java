
public class SalesRepresentative {

    public String sellerName;
    public int nrSales;
    public int cotaPerSale;

    public SalesRepresentative(String sellerName, int nrSales, int cotaPerSale) {
        this.sellerName = sellerName;
        this.nrSales = nrSales;
        this.cotaPerSale = cotaPerSale;
    }

    public int getProd() {
        return nrSales * cotaPerSale;
    }

    public String totalSales(){
        return sellerName +" has " + nrSales + " sales with a quota of " + cotaPerSale +"$. He has achieved " + getProd() +"$ worth of sales.";
    }

}

