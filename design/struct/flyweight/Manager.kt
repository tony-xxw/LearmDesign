package design.struct.flyweight

class Manager(val department: String, var reportContent: String = "") : Employee {

    override fun report() {
        println("报告部门: ${department}报告内容: $reportContent")
    }
}