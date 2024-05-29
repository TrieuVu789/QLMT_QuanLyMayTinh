public class tesst {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(11,01,2023);
        Ngay ngay2 = new Ngay(11,01,2023);
        Ngay ngay3 = new Ngay(12,01,2023);

        QuocGia qg1 = new QuocGia("VNA","VietNam");
        QuocGia qg2 = new QuocGia("VN3","Anh");
        QuocGia qg3 = new QuocGia("VN2A","Phap");

        HangSanXuat h1 = new HangSanXuat("Acer",qg1);
        HangSanXuat h2 = new HangSanXuat("Asus",qg2);
        HangSanXuat h3 = new HangSanXuat("HP",qg3);

        MayTinh may1 = new MayTinh(h1,ngay1,10000,0);
        MayTinh may2 = new MayTinh(h2,ngay2,90000,10);
        MayTinh may3 = new MayTinh(h3,ngay3,12000,9);

        System.out.println("Kiem Tra Gia May:");
        System.out.println("May 1 va may 2: " +may1.kiemTraGiaThapHon(may2));
        System.out.println("May 3 va may 2: " +may3.kiemTraGiaThapHon(may2));
        System.out.println("May 1 va may 3: " +may1.kiemTraGiaThapHon(may3));

        System.out.println("In ten quoc gia san xuat may tinh: ");
        System.out.println("May 1:" + may1.layTenQuocGia());
        System.out.println("May 2:" + may2.layTenQuocGia());
        System.out.println("May 3:" + may3.layTenQuocGia());
    }
}
