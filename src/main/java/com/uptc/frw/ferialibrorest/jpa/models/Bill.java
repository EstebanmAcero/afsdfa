package com.uptc.frw.ferialibrorest.jpa.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table ( name = "COMPRAS")
public class Bill {
    @Id
    @Column (name = "ID_COMPRA")
    private long id;
    @Column (name = "FECHA")
    private Date date;
    @Column (name = "ID_PERSONA", insertable = false, updatable = false)// este atributo es de sola lectura no de asignacion
    private long personId;
    @ManyToOne
    @JoinColumn (name = "ID_PERSONA")
    private Person person;
    @OneToMany(mappedBy = "billDetail")
    @JsonIgnore
    private List<BillDetail> bill;

    public Bill() {
    }

    public List<BillDetail> getBill() {
        return bill;
    }

    public void setBill(List<BillDetail> bill) {
        this.bill = bill;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", personId='" + personId + '\'' +
                ", date=" + date +
                '}';
    }
}
