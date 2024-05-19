package ua.kpi.its.lab.data

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import ua.kpi.its.lab.data.entity.Hospital
import ua.kpi.its.lab.data.entity.Pills
import ua.kpi.its.lab.data.svc.impl.HospitalServiceImpl
import ua.kpi.its.lab.data.svc.impl.PillsServiceImpl
import java.util.*

fun main() {
    val context = AnnotationConfigApplicationContext("ua.kpi.its.lab.data.config")
    val hospitalService = context.getBean(HospitalServiceImpl::class.java)
    val pillsService = context.getBean(PillsServiceImpl::class.java)

    val h1 = Hospital(
        name = "Name 1",
        address = "Shevchenka 1",
        profile = "Vitya ",
        OpenDate = Date(),
        NumDepart = "3",
        NumPlace = "15",
        Child = true
    )
    val h2 = Hospital(
        name = "Name 2",
        address = "Metalistiv 7",
        profile = "David",
        OpenDate = Date(),
        NumDepart = "4",
        NumPlace = "5",
        Child = true
    )
    val h3 = Hospital(
        name = "Name 3",
        address = "Skoropadskoho 5",
        profile = "Alina",
        OpenDate = Date(),
        NumDepart = "1",
        NumPlace = "18",
        Child = true
    )
    val h4 = Hospital(
        name = "Name 4",
        address = "Pl Sofiivska 7",
        profile = "Illya",
        OpenDate = Date(),
        NumDepart = "4",
        NumPlace = "23",
        Child = true
    )
    val h5 = Hospital(
        name = "Name 5",
        address = "Olenu Telihu 3",
        profile = "Olena",
        OpenDate = Date(),
        NumDepart = "5",
        NumPlace = "29",
        Child = true
    )

    val p1 = Pills(
        name = "Pills 1",
        medform = "Medform 1",
        manufacturer = "Darnytsa",
        dateManufacture = Date(),
        shelfLife = "10",
        price = "Author 1",
        presciptionrequired = true,
        hospital = h1
    )

    hospitalService.create(h1)
    hospitalService.create(h2)
    hospitalService.create(h3)
    hospitalService.create(h4)
    hospitalService.create(h5)
    pillsService.create(p1)

    println("Retrieved hospital: $h3")

    hospitalService.delete(4)
}