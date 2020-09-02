package mm.com.xan.dms_shopping.responseHandler

interface ErrorMapperInterface {
    fun getErrorString(errorId: Int): String
    val errorsMap: Map<Int, String>
}