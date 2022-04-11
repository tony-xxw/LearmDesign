package design.struct.facade


class PointGift(val name: String)

class QualifyService {

    fun checkGift(pointGift: PointGift): Boolean {
        println("${pointGift.name}具有资格")
        return true
    }
}

class PointsPaymentService() {

    fun checkPayments(pointGift: PointGift): Boolean {
        println("${pointGift.name}满足积分")
        return true
    }
}

class ShippingService() {
    fun checkShipping(pointGift: PointGift) {
        println("${pointGift.name}开始物流运送")
    }
}

class FacadeService() {
    private val qualifyService = QualifyService()
    private val pointsPaymentService = PointsPaymentService()
    private val shippingService = ShippingService()

    fun giftExchange(pointGift: PointGift) {

        if (qualifyService.checkGift(pointGift)) {
            if (pointsPaymentService.checkPayments(pointGift)) {
                shippingService.checkShipping(pointGift)
            }
        }
    }
}

fun main() {
    FacadeService().giftExchange(PointGift("Java设计模式课程 "))
}