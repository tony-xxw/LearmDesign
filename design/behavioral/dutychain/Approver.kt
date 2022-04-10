package design.behavioral.dutychain

import sun.security.krb5.internal.APRep

abstract class Approver {
    protected var approver: Approver? = null

    fun setNextApprover(approver: Approver) {
        this.approver = approver
    }

    abstract fun handle(course: Course)
}