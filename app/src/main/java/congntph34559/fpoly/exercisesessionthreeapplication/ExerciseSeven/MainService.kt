package congntph34559.fpoly.exercisesessionthreeapplication.ExerciseSeven

import androidx.core.view.ContentInfoCompat.Flags

var list = mutableListOf<TeacherManager>()


fun getListGv() {
    for (gv in list) {
        println(gv.getThongTin())
        println("----------")
    }
}

fun menu() {

    println("----------------------Menu--------------------")
    println("---1. Danh sách giảng viên                 ---")
    println("---2. Thêm thông tin giảng viên            ---")
    println("---3. Xóa giảng viên theo mã               ---")
    println("---4. Thoát                                ---")
    println("----------------------------------------------")

}

fun themGv() {

    var hoTen: String = ""
    var tuoi: Int = 0
    var queQuan: String = ""
    var maGv: String = ""
    var luongCung: Float = 0f
    var luongThuong: Float = 0f
    var tienPhat: Float = 0f
    var s: String?

    while (true) {
        print("Mời nhập tên gv: ")
        s = readLine()
        if (s != null && s.toString() != "") {
            hoTen = s.toString()
            break
        } else {
            println("Tên không hợp lệ !")
        }

    }

    while (true) {
        try {
            print("Mời nhập tuổi: ")
            s = readLine();
            if (s != null && s.toInt() > 0) {
                tuoi = s.toInt()
                break
            }
        } catch (e: NumberFormatException) {
            println("Tuổi phải là số")
        }

    }

    while (true) {

        print("Mời nhập tên quê quán: ")
        s = readLine();
        if (s != null && s.toString() != "") {
            queQuan = s.toString()
            break
        } else {
            println("Quê quán không hợp lệ !")
        }
    }
    while (true) {

        print("Mời nhập tên mã gv: ")
        s = readLine();
        if (s != null && s.toString() != "") {
            maGv = s.toString()
            break
        } else {
            println("Mã giảng viên không hợp lệ !")
        }
    }
    while (true) {
        try {

            print("Mời nhập lương cứng: ")
            s = readLine();
            if (s != null && s.toFloat() > 0) {
                luongCung = s.toFloat()
                break
            }
        } catch (e: NumberFormatException) {
            println("Lương phải là số !")
        }

    }
    while (true) {

        try {
            print("Mời nhập lương thưởng: ")
            s = readLine();
            if (s != null) {
                luongThuong = s.toFloat()
                break
            }
        } catch (e: NumberFormatException) {
            println("Lương phải là số !")
        }

    }
    while (true) {
        try {
            print("Mời nhập tiền phạt: ")
            s = readLine();
            if (s != null) {
                tienPhat = s.toFloat()
                break
            }
        } catch (e: NumberFormatException) {
            println("Tiền phạt phải là số !")
        }

    }

    list.add(TeacherManager(hoTen, tuoi, queQuan, maGv, luongCung, luongThuong, tienPhat))
    println("Thêm thành công !!!")


}

fun xoaGv() {
    var maGv: String = ""
    var remoGv: TeacherManager? = null

    while (true) {

        print("Mời nhập mã gv cần xóa: ")
        var s = readLine()
        if (s != null && s.toString() != "") {
            maGv = s.toString()
            break
        } else {
            println("Mã giảng viên không được để trống")

        }
    }

    for (gv in list) {
        if (gv.maGv == maGv) {
            remoGv = gv
            break
        }
    }

    if (remoGv == null) {
        println("Giảng viên không tồn tại !")
    } else {
        list.remove(remoGv)
        println("Xóa thành công !")
    }


}


fun caseOne(obj: Any) {
    when (obj) {

        1 -> {
            println("Bạn chọn chức năng xem danh sách giảng viên")
            println("-------------------------------------------")
            getListGv()
        }

        2 -> {
            println("Bạn chọn chức năng thêm giảng viên")
            println("----------------------------------")
            themGv()

        }

        3 -> {
            println("Bạn chọn chức năng xóa giảng viên")
            println("---------------------------------")
            xoaGv()

        }

        else -> println("Mời chọn các chức năng từ 1->4")


    }
}


fun main() {
    var gv1: TeacherManager = TeacherManager(
        "Nguyễn Nam", 20, "Hà Nội", "PH12",
        20000f, 20000f, 0f
    )
    list.add(gv1)
    while (true) {

        try {
            menu()
            var index: Int = 0
            print("Mời chọn chức năng từ 1 -> 4: ")
            val s = readLine()
            if (s != null) {
                if (s.toInt() == 4) {
                    break
                } else {
                    index = s.toInt()
                    caseOne(index)
                }
            }
        } catch (e: NumberFormatException) {
            println("Mời chọn chức năng")
        }


    }


}