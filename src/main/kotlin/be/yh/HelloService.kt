package be.yh

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class HelloService {
    @Autowired
    lateinit var helloRepository: HelloRepository

    @Value("\${environment}")
    lateinit var environment: String

    fun getLatestEntry() = "Environment = $environment; Message : ${helloRepository.getRepositoryEntry()}"

    fun getAll() = helloRepository.getAll()
}
