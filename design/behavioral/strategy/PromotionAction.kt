package design.behavioral.strategy

class PromotionAction(val promotionStrategy: PromotionStrategy) {

    fun executePromotion() {
        promotionStrategy.doPromotion()
    }
}