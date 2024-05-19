package ua.kpi.its.lab.data.svc.impl

import org.springframework.stereotype.Service
import ua.kpi.its.lab.data.entity.Hospital
import ua.kpi.its.lab.data.entity.Pills
import ua.kpi.its.lab.data.repo.HospitalRepository
import ua.kpi.its.lab.data.repo.PillsRepository
import ua.kpi.its.lab.data.svc.HospitalService
import ua.kpi.its.lab.data.svc.PillsService

@Service
class HospitalServiceImpl(private val repo: HospitalRepository) : HospitalService {
    override fun create(hospital: Hospital) = repo.save(hospital)
    override fun retrieve(id: Long) = repo.findById(id).orElse(null)
    override fun update(hospital: Hospital) = repo.save(hospital)
    override fun delete(id: Long) = repo.deleteById(id)
}

@Service
class PillsServiceImpl(private val repo: PillsRepository) : PillsService {
    override fun create(pills: Pills) = repo.save(pills)
    override fun retrieve(id: Long) = repo.findById(id).orElse(null)
    override fun update(pills: Pills) = repo.save(pills)
    override fun delete(id: Long) = repo.deleteById(id)
}