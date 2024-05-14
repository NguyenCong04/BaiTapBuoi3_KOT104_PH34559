package congntph34559.fpoly.exercisesessionthreeapplication.ExerciseEight

class LoanSlip(
    hoTen: String,
    tuoi: Int,
    lop: String,
    var maPm: String,
    var ngayMuon: Int,
    var hanTra: Int,
    var soHieu: Int
) : Student(hoTen, tuoi, lop) {


    fun getThongTin(): String {

        return "Họ tên: $hoTen\n" +
                "Tuổi: $tuoi\n" +
                "Lớp: $lop\n" +
                "Mã phiếu: $maPm\n" +
                "Ngày mượn: $ngayMuon\n" +
                "Ngày trả: $hanTra\n" +
                "Số hiệu: $soHieu"

    }

    override fun toString(): String {
        return "Họ tên: $hoTen\n" +
                "Tuổi: $tuoi\n" +
                "Lớp: $lop\n" +
                "Mã phiếu: $maPm\n" +
                "Ngày mượn: $ngayMuon\n" +
                "Ngày trả: $hanTra\n" +
                "Số hiệu: $soHieu"
    }


}