package mm.com.xan.dms_shopping.remote.models
 abstract class BaseRequestModel(
     open val ClientVersion:String,
     open val DeviceOS:String,
     open var DeviceModel: String,
     open var DeviceID: String
)