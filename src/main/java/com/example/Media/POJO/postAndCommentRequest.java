package com.example.Media.POJO;


import jakarta.persistence.*;

@Entity
@Table(name = "postAndCommentRequest")
public class postAndCommentRequest {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "requestId")
    private int requestId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
}
