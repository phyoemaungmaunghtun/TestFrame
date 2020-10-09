package mm.com.phyoeMaung.frameStructure.response_handler

interface ErrorMapperInterface {
    fun getErrorString(errorId: Int): String
    val errorsMap: Map<Int, String>
}