import com.onbarcode.barcode.EAN13;
import com.onbarcode.barcode.ISBN;
import com.onbarcode.barcode.ISSN;

public class BarCode {

    public static void main(String[] ar) {

        ISSN issn = new ISSN();
        ISBN isbn = new ISBN();
        EAN13 ean13 = new EAN13();
        issn.setData("123456789");
        isbn.setData("123456789");
        ean13.setData("000123456789");
        try {
            issn.drawBarcode("Java Graphics2D object");
            issn.drawBarcode("/home/malith/malithBarCodeISSN.jpg");
            isbn.drawBarcode("/home/malith/malithBarCodeISBN.jpg");
            ean13.drawBarcode("/home/malith/malithBarCodeEAN13.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}