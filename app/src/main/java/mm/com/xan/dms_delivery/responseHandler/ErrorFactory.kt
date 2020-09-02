package mm.com.xan.dms_delivery.responseHandler

interface ErrorFactory {
    fun getError(errorCode: Int): Error
}