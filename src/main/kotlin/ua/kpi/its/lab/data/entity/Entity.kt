package ua.kpi.its.lab.data.entity

import jakarta.persistence.*
import java.util.*


@Entity
data class Hospital(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    val name: String,
    val address: String,
    val profile: String,
    val OpenDate: Date,
    val NumDepart: String,
    val NumPlace: String,
    val Child: Boolean,

    ) : Comparable<Hospital> {
    override fun compareTo(other: Hospital): Int {
        val nameComparison = name.compareTo(other.name)
        return if (nameComparison != 0) nameComparison else id.compareTo(other.id)
    }
}

@Entity
data class Pills(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    val name: String,
    val medform: String,
    val manufacturer: String,
    val dateManufacture: Date,
    val shelfLife: String,
    val price: String,
    val presciptionrequired: Boolean,

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    val hospital: Hospital?
)