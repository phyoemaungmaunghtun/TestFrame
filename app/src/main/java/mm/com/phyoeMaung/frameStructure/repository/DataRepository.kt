package mm.com.phyoeMaung.frameStructure.repository

import androidx.lifecycle.LiveData
import mm.com.phyoeMaung.frameStructure.local.Database.EmployeeEntity
import mm.com.phyoeMaung.frameStructure.local.LocalData
import mm.com.phyoeMaung.frameStructure.local.LocalDataSource
import mm.com.phyoeMaung.frameStructure.remote.RemoteData
import mm.com.phyoeMaung.frameStructure.remote.RemoteDataSource
import javax.inject.Inject

class DataRepository @Inject constructor(private val remoteRepository: RemoteData, private val localRepository: LocalData) : RemoteDataSource,LocalDataSource {
    /**
     * Network request
     */
    override suspend fun requestNews() = remoteRepository.requestNews()


    /**
     * Database request
     */

    override suspend fun insertAttendList(EmployeeEntity: EmployeeEntity) = localRepository.insertAttendList(EmployeeEntity)
    override fun getAttendanceList(): LiveData<MutableList<EmployeeEntity>> = localRepository.getAttendanceList()
}