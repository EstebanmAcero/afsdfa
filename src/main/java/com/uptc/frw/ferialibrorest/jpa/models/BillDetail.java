package com.uptc.frw.ferialibrorest.jpa.models;

import jakarta.persistence.*;

@Entity
@Table (name= "DETALLES_COMPRA")
public class BillDetail {
    @Id
    @Column ( name = "ID_DETALLE")
    private long id;
    @Column ( name = "ID_COMPRA", insertable=false, updatable=false)
    private long billId;
    @Column ( name = "ID_LIBRO", insertable=false, updatable=false)
    private long bookId;
    @Column ( name = "CANTIDAD")
    private long quantity;
    @ManyToOne
    @JoinColumn (name ="ID_COMPRA")
    private Bill billDetail;
    @ManyToOne
    @JoinColumn (name ="ID_LIBRO")
    private Book bookDetail;

    public BillDetail() {
    }

    public Book getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(Book bookDetail) {
        this.bookDetail = bookDetail;
    }

    public Bill getBillDetail() {
        return billDetail;
    }

    public void setBillDetail(Bill billDetail) {
        this.billDetail = billDetail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BillDetail{" +
                "id=" + id +
                ", billId=" + billId +
                ", bookId=" + bookId +
                ", quantity=" + quantity +
                '}';
    }
}
