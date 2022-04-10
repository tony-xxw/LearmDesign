package design.behavioral.strategy

class PromotionStrategyFactory private constructor() {


    companion object {
        val PROMOTION_STRATEGY_MAP = mapOf<String, PromotionStrategy>().apply {
            PromotionStrategyKey.FANXIAN to FanxianPromotionStrategy()
            PromotionStrategyKey.MANJIAN to MainJianPromotionStrategy()
            PromotionStrategyKey.lIJIAN to LijianPromotionStrategy()
        }

        fun getPromotionStrategy(key: String): PromotionStrategy {
            return PROMOTION_STRATEGY_MAP[key] ?: EmptyPromotionStrategy()
        }
    }
}

enum class PromotionStrategyKey(val key: String) {
    lIJIAN("lijian"), MANJIAN("manjian"), FANXIAN("fanxian")
}