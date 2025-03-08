package com.example.ph56146_tranthingan;

public class KhachHangService {

//    public List<KhachHang> timKiem(String maKH){
//
//        if (maKH == null || maKH.equalsIgnoreCase("")){
//            throw new IllegalArgumentException("Giá trị tên nhập vào không được trống");
//        }
//        list.add(new KhachHang("NV001", "Truong", 20, "truong@gmail.com", "0325765908"));
//        List<KhachHang> list1 = new ArrayList<>();
//
//        for (KhachHang kh : list){
//            if (kh.getMaKH().equalsIgnoreCase(maKH)){
//                list1.add(kh);
//            }
//        }
//        return list1;
//    }



//    private List<NhanVien> list = new ArrayList<>();
//
//    public NhanVienService() {
//        list.add(new NhanVien("nv01", "Nhân viên 01", 18, 250000, 1, "Phòng ban 01"));
//        list.add(new NhanVien("nv02", "Nhân viên 02", 28, 550000, 5, "Phòng ban 02"));
//    }
//
//    public boolean update(NhanVien nhanVien) {
//
//        if (nhanVien.getMaNV() == null || nhanVien.getMaNV().trim().isEmpty()) {
//            throw new IllegalArgumentException("Mã nhân viên không được bỏ trống");
//        }
//
//        Optional<NhanVien> getNV = list.stream().filter(o -> o.getMaNV().equalsIgnoreCase(nhanVien.getMaNV())).findFirst();
//
//        if (getNV.isEmpty()) {
//            throw new NullPointerException("Không tìm thấy nhân viên");
//        }
//
//        if (nhanVien.getTen() == null || nhanVien.getTen().trim().isEmpty()) {
//            throw new IllegalArgumentException("Tên nhân viên không được bỏ trống");
//        }
//
//        if (nhanVien.getTuoi() < 18 || nhanVien.getTuoi() > 120) {
//            throw new IllegalArgumentException("Tuổi không hợp lệ");
//        }
//
//        if (nhanVien.getLuong() < 0) {
//            throw new IllegalArgumentException("Lương không hợp lệ");
//        }
//
//        if (nhanVien.getSoNamLamViec() < 0) {
//            throw new IllegalArgumentException("Số năm làm việc không hợp lệ");
//        }
//
//        if (nhanVien.getPhongBan() == null || nhanVien.getPhongBan().trim().isEmpty()) {
//            throw new IllegalArgumentException("Phòng ban không được bỏ trống");
//        }
//
//        NhanVien o = getNV.get();
//        o.setTen(nhanVien.getTen());
//        o.setTuoi(nhanVien.getTuoi());
//        o.setLuong(nhanVien.getLuong());
//        o.setSoNamLamViec(nhanVien.getSoNamLamViec());
//        o.setPhongBan(nhanVien.getPhongBan());
//
//        return true;
//    }
//
//    public NhanVien get(String maNV) {
//        return list.stream().filter(o -> o.getMaNV().equalsIgnoreCase(maNV)).findFirst().orElse(null);
//    }
//
//    public List<NhanVien> getAll() {
//        return list;
//    }











//    private List<Person> listPerson = new ArrayList<>();
//
//    public String themPerson(Person person){
//        if(person.getSalary()<= 0 || person.getSalary() > 200000000){
//            throw new IllegalArgumentException("Luong nhan vien phai lon hon 0 va nho hon 200000000") ;
//
//        }else if(person.getId().isEmpty()
//                || person.getName().isEmpty()
//                || person.getDepartment().isEmpty()
//                || person.getAge()<= 0){
//            throw new IllegalArgumentException("Cac truong ko dc de trong") ;
//        }else{
//            listPerson.add(person);
//            return "Them thanh cong";
//        }
//    }
}
