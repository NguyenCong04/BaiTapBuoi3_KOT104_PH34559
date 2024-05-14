package congntph34559.fpoly.exercisesessionthreeapplication.ExerciseSeven

class TeacherManager(
    hoTen: String,
    tuoi: Int,
    queQuan: String,
    maGv: String,
    val luongCung: Float,
    val luongThuong: Float,
    val tienPhat: Float,
//    var luongThuc: Float,
) :
    Personal(hoTen, tuoi, queQuan, maGv) {


    fun tinhLuong(): Float {
        return (luongCung + luongThuong) - tienPhat
    }

    fun getThongTin(): String {
        return "Họ tên: $hoTen \n" +
                "Tuổi: $tuoi \n" +
                "Quê quán: $queQuan \n" +
                "Mã Gv: $maGv\n" +
                "Lương cứng: $luongCung\n" +
                "Lương thưởng: $luongThuong\n" +
                "Tiền phạt: $tienPhat\n" +
                "Lương thực: ${tinhLuong()}"
    }

    override fun toString(): String {
        return "Họ tên: $hoTen\n" +
                "Tuổi: $tuoi\n" +
                "Quê quán: $queQuan\n" +
                "Mã Gv: $maGv\n" +
                "Lương cứng: $luongCung\n" +
                "Lương thưởng: $luongThuong\n" +
                "Tiền phạt: $tienPhat\n" +
                "Lương thực: ${tinhLuong()}"
    }


}