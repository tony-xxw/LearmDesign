package design.behavioral.strategy

class EmptyPromotionStrategy : PromotionStrategy {
    override fun doPromotion() {
        println("没有优惠")
    }

}