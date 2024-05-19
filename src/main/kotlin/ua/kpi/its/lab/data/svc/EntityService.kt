package ua.kpi.its.lab.data.svc

import ua.kpi.its.lab.data.entity.Hospital
import ua.kpi.its.lab.data.entity.Pills

interface HospitalService {
    fun create(hospital: Hospital): Hospital
    fun retrieve(id: Long): Hospital?
    fun update(hospital: Hospital): Hospital
    fun delete(id: Long)
}

interface PillsService {
    fun create(scientificArticle: Pills): Pills
    fun retrieve(id: Long): Pills?
    fun update(pills: Pills): Pills
    fun delete(id: Long)
}