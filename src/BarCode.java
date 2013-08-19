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
        ean13.setData("479123456789");
        try {
//            issn.drawBarcode("Java Graphics2D object");
//            issn.setResolution(1000);
//            isbn.drawBarcode("/home/malith/malithBarCodeISBN.jpg");
            issn.drawBarcode("/home/malith/malithBarCodeISSN.jpg");
            ean13.setAutoResize(true);
            ean13.setBarcodeWidth(220);
            ean13.setBarcodeHeight(75);
            ean13.drawBarcode("/home/malith/malithBarCodeEAN13.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}