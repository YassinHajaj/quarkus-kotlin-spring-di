package be.yh

import org.springframework.stereotype.Repository
import java.time.LocalDateTime.now

@Repository
class HelloRepository {
    private val strings = mutableListOf<String>()
    fun getRepositoryEntry() = "Latest ${strings.add("Element. TS : ${now()}")}"
    fun getAll() = strings
}
