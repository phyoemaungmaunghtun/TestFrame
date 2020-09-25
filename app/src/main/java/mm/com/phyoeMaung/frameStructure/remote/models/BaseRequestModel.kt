package mm.com.phyoeMaung.frameStructure.remote.models
 abstract class BaseRequestModel(
     open val ClientVersion:String,
     open val DeviceOS:String,
     open var DeviceModel: String,
     open var DeviceID: String
)