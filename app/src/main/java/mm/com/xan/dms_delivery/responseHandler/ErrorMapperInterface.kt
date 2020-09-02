package mm.com.xan.dms_delivery.responseHandler

interface ErrorMapperInterface {
    fun getErrorString(errorId: Int): String
    val errorsMap: Map<Int, String>
}