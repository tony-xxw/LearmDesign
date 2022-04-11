package design.struct.composite

fun main() {
    val linuxCourse = Course("Linux", 11.0)
    val windowCourse = Course("Window", 9.0)

    val javaCourseCatalog = CourseCatalog("Java课程",2)
    val java1 = Course("Java1", 10.0)
    val java2 = Course("Java2", 11.0)
    val javaDesign = Course("java design", 12.0)

    javaCourseCatalog.add(java1)
    javaCourseCatalog.add(java2)
    javaCourseCatalog.add(javaDesign)

    val mainCourseCatalog = CourseCatalog("主目录",1)
    mainCourseCatalog.add(linuxCourse)
    mainCourseCatalog.add(windowCourse)
    mainCourseCatalog.add(javaCourseCatalog)

    mainCourseCatalog.print()
}