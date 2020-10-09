package mm.com.phyoeMaung.frameStructure.response_handler

interface ErrorFactory {
    fun getError(errorCode: Int): Error
}