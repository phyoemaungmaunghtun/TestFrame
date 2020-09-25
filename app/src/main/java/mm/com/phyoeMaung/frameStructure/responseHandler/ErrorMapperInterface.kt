package mm.com.phyoeMaung.frameStructure.responseHandler

interface ErrorMapperInterface {
    fun getErrorString(errorId: Int): String
    val errorsMap: Map<Int, String>
}