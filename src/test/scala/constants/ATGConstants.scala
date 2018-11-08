package constants

object ATGConstants {
  final val AddToCartEndPoint = "/v1/cart/item/addItemToOrder"
  final val FetchCartItemsEndPoint = "/v1/cart/items"
  final val FetchOrderSummaryEndPoint = "/v1/cart/summary"
  final val GetGCShippingAddressEndPoint = "/v1/giftcard/shipping"
  final val Action = "Action"
  final val AddToCartAction = "QuickView.addToCart"
  final val SkuId = "skuId"
  final val SkuIdTemplate = "${skuId}"
  final val Quantity = "quantity"
  final val QuantityTemplate = "${quantity}"
  final val ProductId = "productId"
  final val ProductIdTemplate ="${productId}"
  final val Accept = "Accept"
  final val ApplicationJson = "application/json"
  final val Success = "success"
  final val StatusJsonElement = "$.status"
}
