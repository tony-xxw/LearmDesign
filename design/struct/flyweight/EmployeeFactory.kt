package design.struct.flyweight


class EmployeeFactory {
    companion object {
        val MAP = mutableMapOf<String, Employee>()
    }

    fun obtainEmployee(department: String): Employee {
        var employee = MAP[department]
        if (employee == null) {
            println("创建部门经理: $department")
            employee = Manager(department).apply {
                reportContent = "$department 汇报内容为......."
                println("创建报告: $reportContent")
            }
            MAP[department] = employee
        }
        return employee
    }

}