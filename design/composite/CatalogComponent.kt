package design.composite

import java.lang.UnsupportedOperationException

abstract class CatalogComponent {
    open fun add(catalogComponent: CatalogComponent) {
        throw UnsupportedOperationException("不支持添加操作")
    }

    open fun remove(catalogComponent: CatalogComponent) {
        throw UnsupportedOperationException("不支持删除操作")
    }

    open fun getName(catalogComponent: CatalogComponent): String {
        throw UnsupportedOperationException("不支持获取名字操作")
    }

    open fun getPrice(catalogComponent: CatalogComponent): Double {
        throw UnsupportedOperationException("不支持获取价格操作")
    }

    open fun print() {
        throw UnsupportedOperationException("不支持添加操作")
    }
}