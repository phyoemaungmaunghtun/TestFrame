package mm.com.xan.dms_shopping.responseHandler

interface ErrorFactory {
    fun getError(errorCode: Int): Error
}