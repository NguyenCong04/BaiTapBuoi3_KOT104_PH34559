package congntph34559.fpoly.exercisesessionthreeapplication.ExerciseEight

var listPm = mutableListOf<LoanSlip>()

fun getListPm() {
    for (pm in listPm) {
        println(pm.getThongTin())
        println("----------------------------------")


    }
}

fun themPhieuMuon() {

    var hoTen: String = ""
    var tuoi: Int = 0
    var lop: String = ""
    var maPm: String = ""
    var ngayMuon: Int = 0
    var hanTra: Int = 0
    var soHieu: Int = 0


    var s: String?

    while (true) {

        print("Mời nhập tên học sinh: ")
        s = readLine()
        if (s != null && s.toString() != "") {
            hoTen = s.toString()
            break
        } else {
            println("Tên học sinh không hợp lệ !")
        }

    }

    while (true) {

        try {
            print("Mời nhập tuổi học sinh: ")
            s = readLine()
            if (s != null && s.toInt() > 0) {
                tuoi = s.toInt()
                break
            }
        } catch (e: NumberFormatException) {
            println("Tuổi phải là số dương!")
        }


    }

    while (true) {

        print("Mời nhập lớp học: ")
        s = readLine()
        if (s != null && s.toString() != "") {
            lop = s.toString()
            break
        } else {
            println("Mời nhập lại lớp học !")
        }

    }

    while (true) {

        print("Mời nhập mã phiếu mượn: ")
        s = readLine()
        if (s != null && s.toString() != "") {
            maPm = s.toString()
            break
        } else {
            println("Mời nhập lại mã phiếu !")
        }

    }
    while (true) {

        try {
            print("Mời nhập ngày mượn: ")
            s = readLine()
            if (s != null && s.toInt() > 0) {
                ngayMuon = s.toInt()
                break
            }
        } catch (e: NumberFormatException) {
            println("Ngày mượn phải là số !")
        }


    }
    while (true) {

        try {
            print("Mời nhập hạn trả: ")
            s = readLine()
            if (s != null && s.toInt() > 0) {
                hanTra = s.toInt()
                break
            }

        } catch (e: NumberFormatException) {
            println("Hạn trả phải là số")
        }

    }
    while (true) {

        try {
            print("Mời nhập số hiệu sách: ")
            s = readLine()
            if (s != null && s.toInt() > 0) {
                soHieu = s.toInt()
                break
            }
        } catch (e: NumberFormatException) {
            println("Số hiệu sách phải là số !")
        }

    }

    listPm.add(LoanSlip(hoTen, tuoi, lop, maPm, ngayMuon, hanTra, soHieu))
    println("Thêm thành công !")


}

fun xoaPhieuMuon() {

    var maPm: String = ""
    var pm: LoanSlip? = null

    print("Mời nhập mã phiếu mượn cần xóa: ")
    var s = readLine()
    if (s != null && s.toString() != "") maPm = s.toString()

    for (pmFor in listPm) {
        if (pmFor.maPm == maPm) {
            pm = pmFor
        }
    }
    if (pm == null) {

        println("Phiếu mượn không tồn tại")

    } else {
        listPm.remove(pm)
        println("Xóa thành công !")
    }


}


fun menu2() {
    println("-------------------Menu-------------------")
    println("---1.Danh sách phiếu mượn              ---")
    println("---2.Thêm phiếu mượn                   ---")
    println("---3.Xóa phiếu mượn                    ---")
    println("---4.Thoát                             ---")
    println("-------------------Menu-------------------")
}

fun case(obj: Any) {

    when (obj) {

        1 -> {

            println("Bạn chọn chức năng xem danh sách phiếu mượn")
            println("-------------------------------------------")
            getListPm()
        }

        2 -> {

            println("Bạn chọn chức năng thêm phiếu mượn")
            println("----------------------------------")
            themPhieuMuon()

        }

        3 -> {

            println("Bạn chọn chức năng xóa phiếu mượn")
            println("---------------------------------")
            xoaPhieuMuon()
        }

        else -> println("Mời chọn chức năng từ 1-> 4")
    }


}


fun main() {

    while (true) {

        try {
            var index: Int = 0
            menu2()
            print("Mời chọn chức năng từ 1->4: ")
            var s = readLine()
            if (s != null && s.toInt() > 0) {
                index = s.toInt()
            } else {
                print("Mời chọn chức năng")
            }

            if (index == 4) {
                println("Bạn chọn thoát chương trình")
                break
            } else {
                case(index)
            }


        } catch (e: NumberFormatException) {
            println("Mời chọn chức năng")
        }


    }


}