package design.strategy

import kotlin.system.exitProcess

class PromotionAction(val promotionStrategy: PromotionStrategy) {

    fun executePromotion() {
        promotionStrategy.doPromotion()
    }
}