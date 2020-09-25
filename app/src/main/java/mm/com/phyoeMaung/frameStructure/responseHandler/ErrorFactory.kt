package mm.com.phyoeMaung.frameStructure.responseHandler

interface ErrorFactory {
    fun getError(errorCode: Int): Error
}